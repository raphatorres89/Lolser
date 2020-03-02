package com.raphaowl.lolser.api.rest.v1.response.converter;

import com.raphaowl.lolser.client.riotgames.response.SpellDTO;
import com.raphaowl.lolser.client.riotgames.response.VarDTO;
import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

@Slf4j
public class TooltipConverter {

    public static SpellDTO convertAll(SpellDTO spellDTO) {
        String tooltip = spellDTO.getTooltip();
        for (int i = 0; i < 10; i++) {
            String eKey = String.format("e%d", i);
            String aKey = String.format("a%d", i);
            String fKey = String.format("f%d", i);

            if (tooltip.contains(eKey)) {
                tooltip = tooltip.replace(eKey, spellDTO.getEffectBurn().get(i));
            }
            if (tooltip.contains(aKey)) {
                tooltip = convertFromVars(tooltip, aKey, spellDTO.getVars());
            }
            if (tooltip.contains(fKey)) {
                tooltip = convertFromVars(tooltip, fKey, spellDTO.getVars());
            }
        }
        tooltip = cleanInterpolation(tooltip);
        spellDTO.setTooltip(tooltip);
        return spellDTO;
    }

    private static String convertFromVars(String tooltip, String aKey, List<VarDTO> vars) {
        Optional<VarDTO> var = vars.stream()
                .filter(varDTO -> varDTO.getKey().equals(aKey))
                .findFirst();
        if (var.isPresent()) {
            tooltip = tooltip.replace(
                    aKey,
                    String.format("%s de %s", new DecimalFormat("#%").format(var.get().getCoeff()), var.get().getLink()));
        } else {
            tooltip = tooltip.replace(
                    aKey, "(?)");
        }
        return tooltip;
    }

    private static String cleanInterpolation(String tooltip) {
        tooltip = tooltip.replace("{{ ", "");
        tooltip = tooltip.replace(" }}", "");
        return tooltip;
    }

}
