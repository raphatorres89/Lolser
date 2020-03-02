package com.raphaowl.lolser.api.rest.v1;

import com.raphaowl.lolser.api.rest.v1.response.ChampionResponse;
import com.raphaowl.lolser.api.rest.v1.response.SpellResponse;
import com.raphaowl.lolser.api.rest.v1.response.StatsResponse;
import com.raphaowl.lolser.api.rest.v1.response.converter.TooltipConverter;
import com.raphaowl.lolser.api.rest.v1.response.mapper.ChampionResponseMapper;
import com.raphaowl.lolser.api.rest.v1.response.mapper.SpellResponseMapper;
import com.raphaowl.lolser.api.rest.v1.response.mapper.StatsResponseMapper;
import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;
import com.raphaowl.lolser.service.ChampionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/campeoes")
public class ChampionApi {

    @Autowired
    private ChampionService championService;

    @GetMapping
    public List<ChampionDTO> findAll() {
        return championService.findAll();
    }

    @GetMapping("/{name}")
    public ChampionResponse findByName(@PathVariable String name) {
        return ChampionResponseMapper.from(championService.findByName(name));
    }

    @GetMapping("/{name}/stats")
    public StatsResponse findStatsByName(@PathVariable String name) {
        return StatsResponseMapper.from(championService.findByName(name));
    }

    @GetMapping("/{name}/spells")
    public List<SpellResponse> findSpellsByName(@PathVariable String name) {
        return championService.findByName(name).getSpells().stream()
                .map(spellDTO -> TooltipConverter.convertAll(spellDTO))
                .map(SpellResponseMapper::from)
                .collect(Collectors.toList());
    }

}
