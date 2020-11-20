package com.project.demo.pojo;

public class Cognizance {
    private Integer id;
    /**
     * 劳模id
     */
    private String honer;
    /**
     *劳模荣誉称号
     */
    private String sort;
    /**
     *劳模系统分类
     */
    private String attribute;
    /**
     *劳模社会属性
     */
    private String status;
    /**
     *劳模认定状态
     **/
    private String call;
    /**
     *劳模调动状态
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoner() {
        return honer;
    }

    public void setHoner(String honer) {
        this.honer = honer;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "Cognizance{" +
                "id=" + id +
                ", honer='" + honer + '\'' +
                ", sort='" + sort + '\'' +
                ", attribute='" + attribute + '\'' +
                ", status='" + status + '\'' +
                ", call='" + call + '\'' +
                '}';
    }
}
