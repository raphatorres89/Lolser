package com.raphaowl.lolser.client.riotgames.response;

import java.util.LinkedHashMap;
import java.util.Map;

public class StaticResponseBodyStub {
    public static StaticResponseBody valid() {
        return StaticResponseBody.builder()
                .format("standAloneComplex")
                .type("champion")
                .version("10.4.1")
                .data(getData())
                .build();
    }

    private static Map<String, ChampionDTO> getData() {
        Map<String, ChampionDTO> map = new LinkedHashMap<>();
        map.put("Garen", ChampionDTOStub.valid());
        return map;
    }
}
