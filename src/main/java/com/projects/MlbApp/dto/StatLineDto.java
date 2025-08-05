package com.projects.MlbApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StatLineDto {

    @JsonProperty("gamesPlayed")
    private int gamesPlayed;

    @JsonProperty("hits")
    private int hits;

    @JsonProperty("runs")
    private int runs;

    @JsonProperty("homeRuns")
    private int homeRuns;

    @JsonProperty("avg")
    private String battingAverage;

    @JsonProperty("strikeOuts")
    private int strikeOuts;

    @JsonProperty("rbi")
    private int rbi;

    @JsonProperty("obp")
    private String onBasePercentage;

    @JsonProperty("slg")
    private String sluggingPercentage;

    @JsonProperty("ops")
    private String onBasePlusSlugging;

}
