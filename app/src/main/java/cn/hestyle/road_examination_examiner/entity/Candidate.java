package cn.hestyle.road_examination_examiner.entity;

import java.io.Serializable;

public class Candidate implements Serializable {
    /**id*/
    private String id;
    /**驾校*/
    private String driverSchool;
    /**头像*/
    private String photoPath;
    /**姓名*/
    private String name;
    /**年龄*/
    private Integer age;
    /**性别*/
    private String gender;
    /**电话号码*/
    private String phoneNumber;
    /**是否删除，0未删除，1已删除*/
    private Integer isDel;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverSchool() {
        return driverSchool;
    }

    public void setDriverSchool(String driverSchool) {
        this.driverSchool = driverSchool;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id='" + id + '\'' +
                ", driverSchool='" + driverSchool + '\'' +
                ", photoPath='" + photoPath + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isDel=" + isDel +
                '}';
    }
}
