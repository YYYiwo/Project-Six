package com.project.demo.service.impl;

import com.project.demo.mapper.ModelMapper;
import com.project.demo.pojo.Model;
import com.project.demo.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {
    @Autowired private ModelMapper mapper;
    @Override
    public void insertModel(Model model) {
        mapper.insertModel(model);
    }

    @Override
    public void remove(Integer modelId) {
        mapper.remove(modelId);
    }

    @Override
    public void edit(Model model) {
        mapper.edit(model);
    }

    @Override
    public Model findByModelId(int modelId) {
        return mapper.findByModelId(modelId);
    }

    @Override
    public Model findByModelStatus(String modelStatus) {
        return mapper.findByModelStatus(modelStatus);
    }

    @Override
    public Model findByModelTreatment(String modelTreatment) {
        return mapper.findByModelTreatment(modelTreatment);
    }

    @Override
    public List<Model> findAll() {
        return mapper.findAll();
    }
}
