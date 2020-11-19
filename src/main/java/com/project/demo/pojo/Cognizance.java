package com.project.demo.pojo;

public class Cognizance {
    private Integer cognizanceId;
    /**
     * 劳模id
     */
    private String cognizanceHoner;
    /**
     *劳模荣誉称号
     */
    private String cognizanceSort;
    /**
     *劳模系统分类
     */
    private String cognizanceAttribute;
    /**
     *劳模社会属性
     */
    private String cognizanceStatus;
    /**
     *劳模认定状态
     **/
    private String cognizanceCall;
    /**
     *劳模调动状态
     */


    public Integer getCognizanceId() {
        return cognizanceId;
    }

    public void setCognizanceId(Integer cognizanceId) {
        this.cognizanceId = cognizanceId;
    }

    public String getCognizanceHoner() {
        return cognizanceHoner;
    }

    public void setCognizanceHoner(String cognizanceHoner) {
        this.cognizanceHoner = cognizanceHoner;
    }

    public String getCognizanceSort() {
        return cognizanceSort;
    }

    public void setCognizanceSort(String cognizanceSort) {
        this.cognizanceSort = cognizanceSort;
    }

    public String getCognizanceAttribute() {
        return cognizanceAttribute;
    }

    public void setCognizanceAttribute(String cognizanceAttribute) {
        this.cognizanceAttribute = cognizanceAttribute;
    }

    public String getCognizanceStatus() {
        return cognizanceStatus;
    }

    public void setCognizanceStatus(String cognizanceStatus) {
        this.cognizanceStatus = cognizanceStatus;
    }

    public String getCognizanceCall() {
        return cognizanceCall;
    }

    public void setCognizanceCall(String cognizanceCall) {
        this.cognizanceCall = cognizanceCall;
    }


    @Override
    public String toString() {
        return "Cognizance{" +
                "id=" + cognizanceId +
                ", honer='" + cognizanceHoner + '\'' +
                ", sort='" + cognizanceSort + '\'' +
                ", attribute='" + cognizanceAttribute + '\'' +
                ", status='" + cognizanceStatus + '\'' +
                ", call='" + cognizanceCall + '\'' +
                '}';
    }
}
