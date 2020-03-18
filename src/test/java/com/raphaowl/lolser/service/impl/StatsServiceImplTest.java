package com.raphaowl.lolser.service.impl;

import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;
import com.raphaowl.lolser.client.riotgames.response.ChampionDTOStub;
import com.raphaowl.lolser.service.ChampionService;
import com.raphaowl.lolser.service.StatsService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class StatsServiceImplTest {

    @InjectMocks
    private StatsService statsService = new StatsServiceImpl();

    @Mock
    private ChampionService championService;

    @Test
    public void givenHpAndLevelOne_whenCompareStats_returnListOrderedByStats() throws NoSuchFieldException {
        String statsName = "hp";
        when(championService.findAll()).thenReturn(Arrays.asList(ChampionDTOStub.createGaren(), ChampionDTOStub.createWarwick()));

        List<ChampionDTO> championDTOList = statsService.getBestChampionsByStatsPerLevel(statsName, 1);

        assertNotNull(championDTOList);
        assertEquals("Garen", championDTOList.get(0).getName());
        assertEquals("Warwick", championDTOList.get(1).getName());
    }

    @Test
    public void givenMpAndLevelOne_whenCompareStatsByLevel_returnListOrderedByStats() throws NoSuchFieldException {
        String statsName = "mp";
        when(championService.findAll()).thenReturn(Arrays.asList(ChampionDTOStub.createGaren(), ChampionDTOStub.createWarwick()));

        List<ChampionDTO> championDTOList = statsService.getBestChampionsByStatsPerLevel(statsName, 1);

        assertNotNull(championDTOList);
        assertEquals("Warwick", championDTOList.get(0).getName());
        assertEquals("Garen", championDTOList.get(1).getName());
    }

    @Test
    public void givenAttackSpeedAndMaxLevel_whenCompareStatsByLevel_returnListOrderedByStats() throws NoSuchFieldException {
        String statsName = "attackspeed";
        when(championService.findAll()).thenReturn(Arrays.asList(ChampionDTOStub.createGaren(), ChampionDTOStub.createWarwick()));

        List<ChampionDTO> championDTOList = statsService.getBestChampionsByStatsPerLevel(statsName, 18);

        assertNotNull(championDTOList);
        assertEquals("Garen", championDTOList.get(0).getName());
        assertEquals("Warwick", championDTOList.get(1).getName());
    }

}
