package com.wll.beans.brand;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Arrays;
import java.util.Date;

/**
 * 总公司品牌 cent_brand_info
 *
 * @author zmx
 * @date 2019-06-25
 */
public class BrandInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    private String brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 品牌英文名
     */
    private String englishName;
    /**
     *
     */
    private String brandImage;
    /**
     * 注册号
     */
    private String registration;
    /**
     * 品牌所有人
     */
    private String brandOwner;
    /**
     * 1:中国/0:港澳台或其他国家
     */
    private int statu;

    private int status;

    /**
     * 品牌类型:0 公用 1私有
     */
    private Integer typ;

    /**
     *
     */
    private Date created;
    /**
     *
     */
    private Date updated;
    /**
     *
     */
    private Integer synch;

    private String brandFamilyName;

    private String[] classIds;

    private String retServerUrl;

    public String getRetServerUrl() {
        return retServerUrl;
    }

    public void setRetServerUrl(String retServerUrl) {
        this.retServerUrl = retServerUrl;
    }

    private String classNames;
    /**
     * 品牌ids
     */
    private String brandIds;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRegistration() {
        return registration;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getBrandOwner() {
        return brandOwner;
    }

    public void setBrandOwner(String brandOwner) {
        this.brandOwner = brandOwner;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public String getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(String brandIds) {
        this.brandIds = brandIds;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getClassNames() {
        return classNames;
    }

    public void setClassNames(String classNames) {
        this.classNames = classNames;
    }

    public String[] getClassIds() {
        return classIds;
    }

    public void setClassIds(String[] classIds) {
        this.classIds = classIds;
    }

    public String getBrandFamilyName() {
        return brandFamilyName;
    }

    public void setBrandFamilyName(String brandFamilyName) {
        this.brandFamilyName = brandFamilyName;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setTyp(Integer typ) {
        this.typ = typ;
    }

    public Integer getTyp() {
        return typ;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreated() {
        return created;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getUpdated() {
        return updated;
    }

    public void setSynch(Integer synch) {
        this.synch = synch;
    }

    public Integer getSynch() {
        return synch;
    }

    @Override
    public String toString() {
        return "BrandInfo{" +
                "brandId='" + brandId + '\'' +
                ", brandName='" + brandName + '\'' +
                ", englishName='" + englishName + '\'' +
                ", brandImage='" + brandImage + '\'' +
                ", registration='" + registration + '\'' +
                ", brandOwner='" + brandOwner + '\'' +
                ", statu=" + statu +
                ", status=" + status +
                ", typ=" + typ +
                ", created=" + created +
                ", updated=" + updated +
                ", synch=" + synch +
                ", brandFamilyName='" + brandFamilyName + '\'' +
                ", classIds=" + Arrays.toString(classIds) +
                ", retServerUrl='" + retServerUrl + '\'' +
                ", classNames='" + classNames + '\'' +
                ", brandIds='" + brandIds + '\'' +
                '}';
    }
}
