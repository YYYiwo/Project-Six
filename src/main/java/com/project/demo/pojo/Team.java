package com.project.demo.pojo;

public class Team {
    //先进集体id 用于查询先进集体
    private int team_id;
    //先进集体名称
    private String team_name;
    //先进集体的荣誉称号
    private String team_honor;

    public Team() {
    }

    public Team(int team_id, String team_name, String team_honor) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.team_honor = team_honor;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_honor() {
        return team_honor;
    }

    public void setTeam_honor(String team_honor) {
        this.team_honor = team_honor;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team_id=" + team_id +
                ", team_name='" + team_name + '\'' +
                ", team_honor='" + team_honor + '\'' +
                '}';
    }
}
