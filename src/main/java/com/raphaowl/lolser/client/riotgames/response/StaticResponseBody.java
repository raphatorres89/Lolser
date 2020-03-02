package com.raphaowl.lolser.client.riotgames.response;

import lombok.*;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StaticResponseBody {

    private String type;
    private String format;
    private String version;
    private Map<String, ChampionDTO> data;

}
