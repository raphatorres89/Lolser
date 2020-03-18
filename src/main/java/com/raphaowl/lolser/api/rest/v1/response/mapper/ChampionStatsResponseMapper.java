package com.raphaowl.lolser.api.rest.v1.response.mapper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.raphaowl.lolser.api.rest.v1.response.ChampionStatsResponse;
import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;

public class ChampionStatsResponseMapper {
    public static ChampionStatsResponse from(ChampionDTO championDTO) {
        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .convertValue(championDTO, ChampionStatsResponse.class);
    }
}
