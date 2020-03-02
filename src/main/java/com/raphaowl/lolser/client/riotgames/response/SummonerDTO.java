package com.raphaowl.lolser.client.riotgames.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SummonerDTO {

    private Integer profileIconId;
    private String name;
    private String puuid;
    private Integer summonerLevel;
    private String accountId;
    private String id;
    private Date revisionDate;

}
