package com.michaelmagdy.sqlitedemo;

public class Todo {

    long id;
    String toDo;

    Todo(long id, String toDo){
        this.id = id;
        this.toDo = toDo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }
}
