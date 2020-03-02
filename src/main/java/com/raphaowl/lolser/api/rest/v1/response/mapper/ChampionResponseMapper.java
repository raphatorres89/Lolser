package com.raphaowl.lolser.api.rest.v1.response.mapper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.raphaowl.lolser.api.rest.v1.response.ChampionResponse;
import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;

public class ChampionResponseMapper {
    public static ChampionResponse from(ChampionDTO championDTO) {
        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .convertValue(championDTO, ChampionResponse.class);
    }
}
