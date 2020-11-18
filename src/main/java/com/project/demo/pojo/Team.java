package com.project.demo.pojo;

public class Team {
    //先进集体id 用于查询先进集体
    private int teamId;
    //先进集体名称
    private String teamName;
    //先进集体的荣誉称号
    private String teamHonor;

    public Team() {
    }

    public Team(int teamId, String teamName, String teamHonor) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamHonor = teamHonor;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamHonor() {
        return teamHonor;
    }

    public void setTeamHonor(String teamHonor) {
        this.teamHonor = teamHonor;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team_id=" + teamId +
                ", team_name='" + teamName + '\'' +
                ", team_honor='" + teamHonor + '\'' +
                '}';
    }
}
