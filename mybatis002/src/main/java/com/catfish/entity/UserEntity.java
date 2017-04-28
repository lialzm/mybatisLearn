package com.catfish.entity;

import java.util.List;

/**
 * Created by A on 2017/4/26.
 */
public class UserEntity {

    private Long id;
    private String name;
    private Integer age;
    private List<UserMessageEntity> messageEntity;
    private UserCard userCard;


    public UserCard getUserCard() {
        return userCard;
    }

    public void setUserCard(UserCard userCard) {
        this.userCard = userCard;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserMessageEntity> getMessageEntity() {
        return messageEntity;
    }

    public void setMessageEntity(List<UserMessageEntity> messageEntity) {
        this.messageEntity = messageEntity;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", messageEntity=" + messageEntity +
                ", userCard=" + userCard +
                '}';
    }
}
