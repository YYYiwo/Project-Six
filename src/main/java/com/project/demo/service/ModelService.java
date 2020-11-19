package com.project.demo.service;

import com.project.demo.pojo.Model;

import java.util.List;

public interface ModelService {
    /**
     * 插入一个劳模审核
     * @param model
     */
    void insertModel(Model model);

    /**
     * 根据劳模id移除
     * @param modelId
     */
    void remove(Integer modelId);

    /**
     * 根据id修改
     * @param model
     */
    void edit(Model model);

    /**
     * 根据id查询
     * @param modelId
     * @return
     */
    Model findByModelId(int modelId);
    /**
     * 根据劳模待遇查询
     * @param modelStatus
     * @return
     */
    Model findByModelStatus(String modelStatus);

    /**
     * 根据劳模的待遇查询
     * @param modelTreatment
     * @return
     */
    Model findByModelTreatment(String modelTreatment);

    /**
     *
     * @return
     */
    List<Model> findAll();
}
