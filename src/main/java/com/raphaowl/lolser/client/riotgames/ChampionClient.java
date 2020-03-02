package com.raphaowl.lolser.client.riotgames;

import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;
import com.raphaowl.lolser.client.riotgames.response.StaticResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChampionClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${riotgames.static.url.champions.all}")
    private String allUrl;
    @Value("${riotgames.static.url.champions.by-name}")
    private String byNameUrl;

    public ChampionDTO findByName(String name) {
        return restTemplate.getForObject(String.format(byNameUrl, name), StaticResponseBody.class)
                .getData()
                .values()
                .iterator()
                .next();
    }

    public List<ChampionDTO> findAll() {
        return new ArrayList<>(
                restTemplate.getForObject(allUrl, StaticResponseBody.class)
                        .getData()
                        .values()
        );
    }

}
