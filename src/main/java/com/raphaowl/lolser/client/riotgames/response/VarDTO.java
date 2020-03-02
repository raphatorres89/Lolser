package com.raphaowl.lolser.client.riotgames.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VarDTO {
    private String key;
    private String link;
    private Double coeff;
}
