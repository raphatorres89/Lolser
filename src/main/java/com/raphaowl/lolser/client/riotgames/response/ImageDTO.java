package com.raphaowl.lolser.client.riotgames.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ImageDTO {
    private String full;
    private String sprite;
    private String group;
    private int x;
    private int y;
    private int w;
    private int h;
}
