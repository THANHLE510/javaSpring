package com.example.examspringframework.model;
import jakarta.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Member {

    @Id
    private String userId;

    private String password;
    private boolean isActive;
    @jakarta.persistence.Id
    private Long id;

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
