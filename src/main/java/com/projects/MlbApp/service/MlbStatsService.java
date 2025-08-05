package com.projects.MlbApp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class MlbStatsService {

    private final WebClient webClient;

    public MlbStatsService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://statsapi.mlb.com/api/v1").build();
    }

    public Mono<PlayerStatsDto> getPlayerStats(String playerId) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/people/{playerId}/stats")
                        .queryParam("stats", "season")
                        .build(playerId))
                .retrieve()
                .bodyToMono(PlayerStatsDto.class);
    }


}
