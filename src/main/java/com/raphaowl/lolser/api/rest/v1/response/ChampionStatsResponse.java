package com.raphaowl.lolser.api.rest.v1.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChampionStatsResponse {

    private String name;
    private StatsResponse stats;

}
