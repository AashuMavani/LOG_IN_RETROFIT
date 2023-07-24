package com.example.log_in_retrofit;

public class Model_Login_User {
    int connection;
    int result;

    public int getConnection() {
        return connection;
    }

    public void setConnection(int connection) {
        this.connection = connection;
    }

    public int getResult() {
        return result;
    }



    public void setResult(int result) {
        this.result = result;
    }
    @Override
    public String toString() {
        return "Model_Register_User{" +
                "connection=" + connection +
                ", result=" + result +
                '}';
    }


}
