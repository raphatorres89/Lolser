package com.raphaowl.lolser.client.riotgames;

import com.raphaowl.lolser.client.riotgames.response.ChampionDTO;
import com.raphaowl.lolser.client.riotgames.response.StaticResponseBody;
import com.raphaowl.lolser.client.riotgames.response.StaticResponseBodyStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ChampionClientTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ChampionClient championClient;

    private String allUrl = "http://localhost:8080/champions.json";
    private String byNameUrl = "http://localhost:8080/garen.json";

    @BeforeEach
    public void setUp() {
        ReflectionTestUtils.setField(championClient, "allUrl", allUrl);
        ReflectionTestUtils.setField(championClient, "byNameUrl", byNameUrl);
    }

    @Test
    public void whenCallFindAll_thenFindAll() {
        when(restTemplate.getForObject(eq(allUrl), eq(StaticResponseBody.class)))
                .thenReturn(StaticResponseBodyStub.valid());

        List<ChampionDTO> response = championClient.findAll();

        assertNotNull(response);
        contractTest(response.get(0));
    }

    @Test
    public void whenCallFindAll_thenThrowException() {
        when(restTemplate.getForObject(eq(allUrl), eq(StaticResponseBody.class)))
                .thenThrow(new RestClientException("error"));

        assertThrows(RestClientException.class, () -> championClient.findAll());
    }

    @Test
    public void givenValidName_whenCallFindByName_thenFindByName() {
        String name = "Garen";

        when(restTemplate.getForObject(eq(byNameUrl), eq(StaticResponseBody.class)))
                .thenReturn(StaticResponseBodyStub.valid());

        ChampionDTO response = championClient.findByName(name);

        contractTest(response);
    }

    @Test
    public void givenInvalidName_whenCallFindByName_thenThrowException() {
        String invalidName = "Garem";

        when(restTemplate.getForObject(eq(byNameUrl), eq(StaticResponseBody.class)))
                .thenThrow(new RestClientException("error"));

        assertThrows(RestClientException.class, () -> championClient.findByName(invalidName));
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
