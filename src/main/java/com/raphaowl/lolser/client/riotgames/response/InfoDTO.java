package com.raphaowl.lolser.client.riotgames.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InfoDTO {
    private Integer attack;
    private Integer defense;
    private Integer magic;
    private Integer difficulty;
}
