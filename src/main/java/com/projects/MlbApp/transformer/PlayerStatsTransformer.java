package com.projects.MlbApp.transformer;


import com.projects.MlbApp.dto.PlayerStatsDto;
import com.projects.MlbApp.dto.StatLineDto;
import com.projects.MlbApp.dto.StatSplitDto;
import com.projects.MlbApp.dto.StatsApiResponse;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerStatsTransformer {

    public static List<PlayerStatsDto> trasnform(StatsApiResponse response) {
        return response.getStats().stream()
                .flatMap(statItem -> statItem.getSplits().stream())
                .map(split -> {
                    //map each split to PlayerStatsDto
                    PlayerStatsDto dto = new PlayerStatsDto();
                    //extract fields from the split object
                    StatLineDto statLine = split.getStat();

                    dto.setGamesPlayed(statLine.getGamesPlayed());
                    dto.setHits(statLine.getHits());
                    dto.setHomeRuns(statLine.getHomeRuns());
                    dto.setRuns(statLine.getRuns());
                    dto.setStrikeOuts(statLine.getStrikeOuts());

                    dto.setTeam(split.getTeam());
                    dto.setPlayer(split.getPlayer());

                    return dto;
                })
                .collect(Collectors.toList());
    }
}
