package com.projects.MlbApp.dto;

import lombok.Data;

import java.util.List;

@Data
public class StatItemDto {
    private StatTypeDto type;
    private StatGroupDto group;
    private List<StatSplitDto> splits;
}
