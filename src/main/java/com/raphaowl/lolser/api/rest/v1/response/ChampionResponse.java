package com.raphaowl.lolser.api.rest.v1.response;

import com.raphaowl.lolser.client.riotgames.response.InfoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChampionResponse {

    private String name;
    private String title;
    private String lore;
    private List<String> allytips;
    private List<String> enemytips;
    private List<String> tags;
    private String partype;
    private InfoDTO info;

}
