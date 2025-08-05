package com.projects.MlbApp.dto;

import lombok.Data;

@Data
public class PlayerStatsDto {
    private int gamesPlayed;
    private int hits;
    private int homeRuns;
    private int runs;
    private int strikeOuts;

    private TeamDto team;
    private PlayerDto player;
}
