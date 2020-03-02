package com.raphaowl.lolser.client.riotgames.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecommendedDTO {

    private String champion;
    private String title;
    private String map;
    private String mode;
    private String type;
    private String customTag;
    private int sortrank;
    private boolean extensionPage;
    private boolean useObviousCheckmark;
    // private || customPanel;
    // falta um monte de coisas aqui
}
