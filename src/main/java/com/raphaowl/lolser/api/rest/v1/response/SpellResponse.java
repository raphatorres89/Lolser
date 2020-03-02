package com.raphaowl.lolser.api.rest.v1.response;

import com.raphaowl.lolser.client.riotgames.response.LeveltipDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpellResponse {
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
    private String costType;
    private String maxammo;
    private List<Integer> range;
    private String rangeBurn;
    private String resource;
}
