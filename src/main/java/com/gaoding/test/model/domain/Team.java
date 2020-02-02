package com.sample;


public class Team {

  private long id;
  private String name;
  private String avatarUrl;
  private String avatarOssKey;
  private long number;
  private long limitNumber;
  private long uploadNumber;
  private long designNumber;
  private long materialNumber;
  private long creatorId;
  private long isDeleted;
  private java.sql.Timestamp gmtCreate;
  private java.sql.Timestamp gmtModified;
  private long isAudit;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public String getAvatarOssKey() {
    return avatarOssKey;
  }

  public void setAvatarOssKey(String avatarOssKey) {
    this.avatarOssKey = avatarOssKey;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public long getLimitNumber() {
    return limitNumber;
  }

  public void setLimitNumber(long limitNumber) {
    this.limitNumber = limitNumber;
  }


  public long getUploadNumber() {
    return uploadNumber;
  }

  public void setUploadNumber(long uploadNumber) {
    this.uploadNumber = uploadNumber;
  }


  public long getDesignNumber() {
    return designNumber;
  }

  public void setDesignNumber(long designNumber) {
    this.designNumber = designNumber;
  }


  public long getMaterialNumber() {
    return materialNumber;
  }

  public void setMaterialNumber(long materialNumber) {
    this.materialNumber = materialNumber;
  }


  public long getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(long creatorId) {
    this.creatorId = creatorId;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }


  public java.sql.Timestamp getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(java.sql.Timestamp gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public java.sql.Timestamp getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(java.sql.Timestamp gmtModified) {
    this.gmtModified = gmtModified;
  }


  public long getIsAudit() {
    return isAudit;
  }

  public void setIsAudit(long isAudit) {
    this.isAudit = isAudit;
  }

}
