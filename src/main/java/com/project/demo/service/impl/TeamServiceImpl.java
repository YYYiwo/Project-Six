package com.project.demo.service.impl;

import com.project.demo.mapper.TeamMapper;
import com.project.demo.pojo.Team;
import com.project.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 崔超
 * 先进集体Team类service的实现
 */
@Service
public class TeamServiceImpl implements TeamService{
    /**
     * 调用TeamMapper
     */
    @Autowired private TeamMapper teamMapper;

    /**
     * team的增添方法
     * @param team
     * @return
     */
    @Override
    public boolean insert(Team team) {
        return teamMapper.insert(team);
    }

    /**
     * team的删除方法
     * @param teamId
     */
    @Override
    public void delete(int teamId) {
        teamMapper.delete(teamId);
    }

    /**
     * team的修改方法
     * @param team
     * @return
     */
    @Override
    public boolean modify(Team team) {
        return teamMapper.modify(team);
    }

    /**
     * team的凭借teamId查询方法
     * @param teamId
     * @return
     */
    @Override
    public Team findById(int teamId) {
        return teamMapper.findById(teamId);
    }

    /**
     * team的凭借teamHonor查询方法
     * @param teamHonor
     * @return
     */
    @Override
    public Team findByHonor(String teamHonor) {
        return teamMapper.findByHonor(teamHonor);
    }

    @Override
    public List<Team> findAll() {
        return teamMapper.findAll();
    }

    @Override
    public Team findByName(String teamName) {
        return teamMapper.findByName(teamName);
    }
}
