package com.raphaowl.lolser.client.riotgames.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SpellDTO {

    private String id;
    private String name;
    private String description;
    private String tooltip;
    private LeveltipDTO leveltip;
    private int maxrank;
    private List<Integer> cooldown;
    private String cooldownBurn;
    private List<Integer> cost;
    private String costBurn;
    // private Datavalues datavalues
    private List<Integer[]> effect;
    private List<String> effectBurn;
    private List<VarDTO> vars;
    private String costType;
    private String maxammo;
    private List<Integer> range;
    private String rangeBurn;
    private ImageDTO image;
    private String resource;

}
