package com.raphaowl.lolser.service.impl;

import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;
import com.raphaowl.lolser.client.riotgames.response.StatsDTO;
import com.raphaowl.lolser.service.ChampionService;
import com.raphaowl.lolser.service.StatsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class StatsServiceImpl implements StatsService {

    @Autowired
    private ChampionService championService;

    public List<ChampionDTO> getBestChampionsByStatsPerLevel(String statsName, Integer level) throws NoSuchFieldException {
        log.info("Buscando melhores campeões no level: {}, pelo stats: {}", level, statsName);

        Field statsField = StatsDTO.class.getDeclaredField(statsName);
        Field perLevelField = StatsDTO.class.getDeclaredField(statsName + "perlevel");
        statsField.setAccessible(true);
        perLevelField.setAccessible(true);

        return championService.findAll().stream()
                .sorted(Comparator.comparing(championDTO -> compareStat((ChampionDTO) championDTO, statsField, perLevelField, level)).reversed())
                .collect(Collectors.toList());
    }

    private Double compareStat(ChampionDTO championDTO, Field statField, Field perLevelField, Integer level) {
        try {
            return ((double) statField.get(championDTO.getStats())) + ((double) perLevelField.get(championDTO.getStats()) * level);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
