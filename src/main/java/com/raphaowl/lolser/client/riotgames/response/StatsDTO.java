package com.raphaowl.lolser.client.riotgames.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StatsDTO {

    private Double hp;
    private Double hpperlevel;
    private Double mp;
    private Double mpperlevel;
    private Double movespeed;
    private Double armor;
    private Double armorperlevel;
    private Double spellblock;
    private Double spellblockperlevel;
    private Double attackrange;
    private Double hpregen;
    private Double hpregenperlevel;
    private Double mpregen;
    private Double mpregenperlevel;
    private Double crit;
    private Double critperlevel;
    private Double attackdamage;
    private Double attackdamageperlevel;
    private Double attackspeedperlevel;
    private Double attackspeed;

}
