package com.moya.ivan.planapp.Modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Objeto plano Java para representar el cuerpo de la petición POST /affiliates/login
 */
public class LoginBody {
    @SerializedName("email")
    private String userId;

    @SerializedName("password")
    private String password;

    public LoginBody(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
