package me.cxis.forms.model;

import java.io.Serializable;
import java.util.List;

public class SubHealth implements Serializable {

    private static final long serialVersionUID = -5084951166662295156L;

    private Long id;

    private Long userId;

    private Long templateId;

    private Long formId;

    private Long userFormId;

    private String gender;

    private Integer age;

    private Integer height;

    private Integer weight;

    private String work;

    private List<String> activity;

    private Boolean physicalExam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Long getUserFormId() {
        return userFormId;
    }

    public void setUserFormId(Long userFormId) {
        this.userFormId = userFormId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public List<String> getActivity() {
        return activity;
    }

    public void setActivity(List<String> activity) {
        this.activity = activity;
    }

    public Boolean getPhysicalExam() {
        return physicalExam;
    }

    public void setPhysicalExam(Boolean physicalExam) {
        this.physicalExam = physicalExam;
    }

    @Override
    public String toString() {
        return "SubHealth{" +
                "id=" + id +
                ", userId=" + userId +
                ", templateId=" + templateId +
                ", formId=" + formId +
                ", userFormId=" + userFormId +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", work='" + work + '\'' +
                ", activity=" + activity +
                ", physicalExam=" + physicalExam +
                '}';
    }
}
