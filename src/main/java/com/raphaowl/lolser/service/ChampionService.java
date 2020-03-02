package com.raphaowl.lolser.service;

import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;

import java.util.List;

public interface ChampionService {

    ChampionDTO findByName(String name);
    List<ChampionDTO> findAll();

}
