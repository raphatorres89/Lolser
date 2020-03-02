package com.raphaowl.lolser.client.riotgames.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PassiveDTO {

    private String name;
    private String description;
    private ImageDTO image;

}
