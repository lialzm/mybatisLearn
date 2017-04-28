package com.catfish.entity;

/**
 * Created by A on 2017/4/27.
 */
public class UserVo {
    private Long userId;
    private String name;
    private String cardNo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
