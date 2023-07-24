package com.example.log_in_retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API_interface {

    @FormUrlEncoded
    @POST("Login.php")
    Call<Model_Login_User>
    singUpUser(
            @Field("email")String email,
            @Field("password")String password);
}
