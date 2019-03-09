package com.yybf.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_table")
public class User {
    @Id
    private Integer uid;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_head_img_file")
    private String userHeadImgFile;

    private String username;

    private String password;

    @Column(name = "user_create_time")
    private Date userCreateTime;

    @Column(name = "user_update_time")
    private Date userUpdateTime;

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_head_img_file
     */
    public String getUserHeadImgFile() {
        return userHeadImgFile;
    }

    /**
     * @param userHeadImgFile
     */
    public void setUserHeadImgFile(String userHeadImgFile) {
        this.userHeadImgFile = userHeadImgFile;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return user_create_time
     */
    public Date getUserCreateTime() {
        return userCreateTime;
    }

    /**
     * @param userCreateTime
     */
    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    /**
     * @return user_update_time
     */
    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    /**
     * @param userUpdateTime
     */
    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }
}