package com.example.apiwe;

public class ResponseClass {
    private  int Id;
    private  int UserId;
    private  String tittle;
    private  String body;

    public ResponseClass(int id, int userId, String tittle, String body) {
        Id = id;
        UserId = userId;
        this.tittle = tittle;
        this.body = body;
    }

    public int getId() {
        return Id;
    }

    public int getUserId() {
        return UserId;
    }

    public String getTittle() {
        return tittle;
    }

    public String getBody() {
        return body;
    }
}
