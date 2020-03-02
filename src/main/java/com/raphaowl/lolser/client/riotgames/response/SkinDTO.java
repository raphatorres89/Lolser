package com.raphaowl.lolser.client.riotgames.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SkinDTO {
    private String id;
    private int num;
    private String name;
    private boolean chromas;
}
