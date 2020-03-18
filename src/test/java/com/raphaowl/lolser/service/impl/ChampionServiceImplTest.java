package com.raphaowl.lolser.service.impl;

import com.raphaowl.lolser.client.riotgames.ChampionClient;
import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;
import com.raphaowl.lolser.client.riotgames.response.ChampionDTOStub;
import com.raphaowl.lolser.service.ChampionService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestClientException;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ChampionServiceImplTest {

    @InjectMocks
    private ChampionService championService = new ChampionServiceImpl();

    @Mock
    private ChampionClient championClient;

    @Test
    public void givenValidName_whenFindByName_thenReturnValidChampion() {
        String validName = "Garen";
        when(championClient.findByName(eq(validName))).thenReturn(ChampionDTOStub.createGaren());

        ChampionDTO championDTO = championService.findByName(validName);

        contractTest(championDTO);
    }

    @Test
    public void givenInvalidName_whenFindByName_throwsException() {
        String invalidName = "Garem";
        when(championClient.findByName(eq(invalidName))).thenThrow(new RestClientException("error"));

        assertThrows(RestClientException.class, () -> championService.findByName(invalidName));
    }

    @Test
    public void whenFindAll_thenReturnValidChampionList() {
        when(championClient.findAll()).thenReturn(Collections.singletonList(ChampionDTOStub.createGaren()));

        ChampionDTO championDTO = championService.findAll().get(0);

        contractTest(championDTO);
    }

    private void contractTest(ChampionDTO championDTO) {
        assertNotNull(championDTO);
        assertEquals("Garen", championDTO.getId());
        assertEquals("Garen", championDTO.getName());
        assertEquals("86", championDTO.getKey());
        assertEquals("o Poder de Demacia", championDTO.getTitle());
        assertNotNull(championDTO.getImage());
        assertNotNull(championDTO.getLore());
        assertNotNull(championDTO.getBlurb());
        assertNotNull(championDTO.getAllytips());
        assertNotNull(championDTO.getEnemytips());
        assertNotNull(championDTO.getTags());
        assertNotNull(championDTO.getPartype());
        assertNotNull(championDTO.getInfo());
        assertNotNull(championDTO.getPassive());
    }
}
