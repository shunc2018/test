package com.sample;


public class InviteRecord {

  private long id;
  private long inviteId;
  private long teamId;
  private long userId;
  private java.sql.Timestamp gmtCreate;
  private long isAudit;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getInviteId() {
    return inviteId;
  }

  public void setInviteId(long inviteId) {
    this.inviteId = inviteId;
  }


  public long getTeamId() {
    return teamId;
  }

  public void setTeamId(long teamId) {
    this.teamId = teamId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(java.sql.Timestamp gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public long getIsAudit() {
    return isAudit;
  }

  public void setIsAudit(long isAudit) {
    this.isAudit = isAudit;
  }

}
