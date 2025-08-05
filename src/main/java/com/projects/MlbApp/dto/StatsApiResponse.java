package com.projects.MlbApp.dto;


import lombok.Data;
import java.util.List;

@Data
public class StatsApiResponse {
    private List<StatItemDto> stats;
}

