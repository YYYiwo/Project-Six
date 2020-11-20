package com.project.demo.service;

import com.project.demo.pojo.Team;

import java.util.List;

/**
 * 崔超
 * 先进集体Team类的service
 */
public interface TeamService {
    /**
     * 添加一个先进集体
     */
    boolean insert(Team team);

    /**
     * 删除一个先进集体
     */
    void delete(int teamId);

    /**
     * 修改先进集体信息
     */
    boolean modify(Team team);

    /**
     * 查询先进集体信息
     * 凭借id查询
     */
    Team findById(int teamId);

    /**
     * 查询先进集体
     * 凭借荣誉称号查询
     */
    Team findByHonor(String teamHonor);

    /**
     * 查询全部
     */
    List<Team> findAll();
}
