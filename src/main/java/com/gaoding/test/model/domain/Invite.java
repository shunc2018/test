package com.sample;


public class Invite {

  private long id;
  private long teamId;
  private String code;
  private java.sql.Timestamp expiredTime;
  private long type;
  private long inviterId;
  private java.sql.Timestamp gmtCreate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getTeamId() {
    return teamId;
  }

  public void setTeamId(long teamId) {
    this.teamId = teamId;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public java.sql.Timestamp getExpiredTime() {
    return expiredTime;
  }

  public void setExpiredTime(java.sql.Timestamp expiredTime) {
    this.expiredTime = expiredTime;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public long getInviterId() {
    return inviterId;
  }

  public void setInviterId(long inviterId) {
    this.inviterId = inviterId;
  }


  public java.sql.Timestamp getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(java.sql.Timestamp gmtCreate) {
    this.gmtCreate = gmtCreate;
  }

}
