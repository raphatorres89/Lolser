package com.raphaowl.lolser.api.rest.v1.response.converter;

import com.raphaowl.lolser.api.rest.v1.response.converter.TooltipConverter;
import com.raphaowl.lolser.client.riotgames.response.SpellDTO;
import com.raphaowl.lolser.client.riotgames.response.VarDTO;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TooltipConverterTest {

    @Test
    public void givenE1ThenReplaceWithEffect() {
        SpellDTO spellDTO = new SpellDTO();
        spellDTO.setTooltip("Test {{ e1 }} test");
        spellDTO.setEffectBurn(Arrays.asList(null, "60/85/110/135/160"));
        spellDTO.setVars(Arrays.asList(new VarDTO("a1", "armor", 1.2)));

        TooltipConverter.convertAll(spellDTO);
        assertEquals("Test 60/85/110/135/160 test", spellDTO.getTooltip());
    }

    @Test
    public void givenE1AndE2ThenReplaceWithEffect() {
        SpellDTO spellDTO = new SpellDTO();
        spellDTO.setTooltip("Test {{ e1 }} test {{ e2 }}");
        spellDTO.setEffectBurn(Arrays.asList(null, "60/85/110/135/160", "100"));
        spellDTO.setVars(Arrays.asList(new VarDTO("a1", "armor", 1.2)));

        TooltipConverter.convertAll(spellDTO);
        assertEquals("Test 60/85/110/135/160 test 100", spellDTO.getTooltip());
    }

    @Test
    public void givenA1ReplaceWithEffect() {
        SpellDTO spellDTO = new SpellDTO();
        spellDTO.setTooltip("Test {{ a1 }}");
        spellDTO.setEffectBurn(Arrays.asList(null, "60/85/110/135/160", "100"));
        spellDTO.setVars(Arrays.asList(new VarDTO("a1", "armor", 1.2)));

        TooltipConverter.convertAll(spellDTO);
        assertEquals("Test 120% de armor", spellDTO.getTooltip());
    }

    @Test
    public void givenA1AndF1ReplaceWithEffect() {
        SpellDTO spellDTO = new SpellDTO();
        spellDTO.setTooltip("Test {{ a1 }} test {{ f1 }}");
        spellDTO.setEffectBurn(Arrays.asList(null, "60/85/110/135/160", "100"));
        spellDTO.setVars(Arrays.asList(
                new VarDTO("a1", "armor", 1.2),
                new VarDTO("f1", "defense", 0.1)));

        TooltipConverter.convertAll(spellDTO);
        assertEquals("Test 120% de armor test 10% de defense", spellDTO.getTooltip());
    }

    @Test
    public void givenA1AndInvalidValueReplaceWithEffectAndWildcard() {
        SpellDTO spellDTO = new SpellDTO();
        spellDTO.setTooltip("Test {{ a1 }} test {{ f1 }}");
        spellDTO.setEffectBurn(Arrays.asList(null, "60/85/110/135/160", "100"));
        spellDTO.setVars(Arrays.asList(new VarDTO("a1", "armor", 1.2)));

        TooltipConverter.convertAll(spellDTO);
        assertEquals("Test 120% de armor test (?)", spellDTO.getTooltip());
    }
}
