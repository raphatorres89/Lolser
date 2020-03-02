package com.raphaowl.lolser.client.riotgames.response;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChampionDTO {

    private String id;
    private String key;
    private String name;
    private String title;
    private ImageDTO image;
    private List<SkinDTO> skins;
    private String lore;
    private String blurb;
    private List<String> allytips;
    private List<String> enemytips;
    private List<String> tags;
    private String partype;
    private InfoDTO info;
    private StatsDTO stats;
    private List<SpellDTO> spells;
    private PassiveDTO passive;
    private List<RecommendedDTO> recommended;
}
