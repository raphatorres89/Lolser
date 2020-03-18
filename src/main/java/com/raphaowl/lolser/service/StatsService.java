package com.raphaowl.lolser.service;

import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;

import java.util.List;

public interface StatsService {

    List<ChampionDTO> getBestChampionsByStatsPerLevel(String statsName, Integer level) throws NoSuchFieldException;
}
