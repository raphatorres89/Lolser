package com.raphaowl.lolser.api.rest.v1.response.mapper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.raphaowl.lolser.api.rest.v1.response.SpellResponse;
import com.raphaowl.lolser.client.riotgames.response.SpellDTO;

public class SpellResponseMapper {
    public static SpellResponse from(SpellDTO spellDTO) {
        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .convertValue(spellDTO, SpellResponse.class);
    }
}
