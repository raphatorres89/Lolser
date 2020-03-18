package com.raphaowl.lolser.api.rest.v1;

import com.raphaowl.lolser.api.rest.v1.response.ChampionStatsResponse;
import com.raphaowl.lolser.api.rest.v1.response.mapper.ChampionStatsResponseMapper;
import com.raphaowl.lolser.service.StatsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/stats")
public class StatsApi {

    @Autowired
    private StatsService statsService;

    @GetMapping
    public List<ChampionStatsResponse> getBestChampionsByStatsPerLevel(
            @RequestParam("statsName") String statsName,
            @RequestParam(name = "level", required = false, defaultValue = "0") Integer level) throws NoSuchFieldException {

        return statsService.getBestChampionsByStatsPerLevel(statsName, level).stream()
                .map(ChampionStatsResponseMapper::from)
                .collect(Collectors.toList());
    }
}
