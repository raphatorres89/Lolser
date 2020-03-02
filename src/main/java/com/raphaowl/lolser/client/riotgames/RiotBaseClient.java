package com.raphaowl.lolser.client.riotgames;

import com.raphaowl.lolser.client.riotgames.response.SummonerDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RiotBaseClient {

    @Value("${riotgames.token}")
    private String token;
    @Value("${riotgames.basePath}")
    private String basePath;

    private RestTemplate restTemplate = new RestTemplate();

    public SummonerDTO getByName(String summonersName) {
        String url = String.format(basePath.concat("/summoner/v4/summoners/by-name/%s"), summonersName);
        HttpEntity<String> entity = new HttpEntity<>(getHeaders());
        return restTemplate.exchange(url, HttpMethod.GET, entity, SummonerDTO.class).getBody();
    }

    public HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Riot-Token", token);
        headers.add("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8");
        return headers;
    }

}
