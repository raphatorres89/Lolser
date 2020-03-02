package com.raphaowl.lolser.service.impl;

import com.raphaowl.lolser.client.riotgames.ChampionClient;
import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;
import com.raphaowl.lolser.service.ChampionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ChampionServiceImpl implements ChampionService {

    @Autowired
    private ChampionClient championClient;

    @Override
    public ChampionDTO findByName(String name) {
        log.info("Buscando campeão pelo nome: {}", name);
        return championClient.findByName(name);
    }

    @Override
    public List<ChampionDTO> findAll() {
        log.info("Listando todos os campeões");
        return championClient.findAll();
    }
}
