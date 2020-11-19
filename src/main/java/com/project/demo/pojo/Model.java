package com.project.demo.pojo;

/**
 * @author wj
 * @name 王杰
 * @time 2020/11/18 18:00
 */

import java.util.Date;

/**
 *该类用来审核劳模
 */
public class Model {
    /**
     *劳模的id
     */
    private Integer modelId;
    /**
     * 劳模的状态：
     *         1.新上报认定
     *         2.取消称号
     *         3.死亡或者离职
     *         4。调动
     */
    private String modelStatus;
    /**
     *劳模的的待遇：
     *        1:享受全国劳动模范待遇
     *        2:享受省、部级劳动模范待遇
     *        3:不能享受全国劳动模范待遇
     *        4:不能享受省、部级劳动模范待遇四种。
     */
    private String modelTreatment;

    /**
     * 劳模死亡时间
     */
    private Date modelDeathDate;

    public Integer getModelId() {
        return modelId;
    }

    public Date getModelDeathDate() {
        return modelDeathDate;
    }

    public void setModelDeathDate(Date modelDeathDate) {
        this.modelDeathDate = modelDeathDate;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelStatus() {
        return modelStatus;
    }

    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    public String getModelTreatment() {
        return modelTreatment;
    }

    public void setModelTreatment(String modelTreatment) {
        this.modelTreatment = modelTreatment;
    }
}
