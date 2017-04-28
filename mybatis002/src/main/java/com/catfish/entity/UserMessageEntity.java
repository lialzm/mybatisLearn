package com.catfish.entity;

/**
 * Created by A on 2017/4/26.
 */
public class UserMessageEntity {

    private Long id;
    private Integer thirdType;
    private String alias;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getThirdType() {
        return thirdType;
    }

    public void setThirdType(Integer thirdType) {
        this.thirdType = thirdType;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "UserMessageEntity{" +
                "id=" + id +
                ", thirdType=" + thirdType +
                ", alias='" + alias + '\'' +
                '}';
    }
}
