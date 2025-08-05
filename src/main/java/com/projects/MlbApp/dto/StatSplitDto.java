package com.projects.MlbApp.dto;

import lombok.Data;

@Data
public class StatSplitDto {
    private String season;
    private StatLineDto stat;
    private TeamDto team;
    private PlayerDto player;
}
