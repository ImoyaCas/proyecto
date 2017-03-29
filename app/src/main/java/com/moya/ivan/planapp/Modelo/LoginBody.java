package com.moya.ivan.planapp.Modelo;

import com.google.gson.annotations.SerializedName;


/**
 * Created by ivan on 29/3/17.
 * Objeto plano Java para representar el cuerpo de la petición POST
 */

public class LoginBody {
    @SerializedName("id")
    private String email;
    private String password;

    public LoginBody(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
