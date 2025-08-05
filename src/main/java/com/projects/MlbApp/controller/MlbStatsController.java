package com.projects.MlbApp.controller;

import com.projects.MlbApp.service.MlbStatsService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/mlb")
public class MlbStatsController {

    private final MlbStatsService mlbStatsService;

    public MlbStatsController(MlbStatsService mlbStatsService) {
        this.mlbStatsService = mlbStatsService;
    }

    @GetMapping("/player/{id}/stats")
    public Mono<PlayerStatsDto> getPlayerStats(@PathVariable("id") String playerId) {
        return mlbStatsService.getPlayerStats(playerId);
    }
}
