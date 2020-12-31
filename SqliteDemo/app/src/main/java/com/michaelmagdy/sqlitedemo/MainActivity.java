package com.michaelmagdy.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText todoEdt, todoIdEdt, updatedTodoEdt;
    Button saveBtn, deleteBtn, updateBtn;
    TextView todoListTxt;

    ToDoListDBAdapter toDoListDBAdapter;
    List<Todo> todoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoEdt = findViewById(R.id.create_edt);
        todoIdEdt = findViewById(R.id.todo_id_text);
        updatedTodoEdt = findViewById(R.id.update_edt);
        saveBtn = findViewById(R.id.create_btn);
        deleteBtn = findViewById(R.id.delete_btn);
        updateBtn = findViewById(R.id.modify_btn);
        todoListTxt = findViewById(R.id.retrieve_txt);

        toDoListDBAdapter = ToDoListDBAdapter.getToDoListDBAdapterInstance(getApplicationContext());
        todoList = toDoListDBAdapter.getAllTodos();
        updateTextView();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (toDoListDBAdapter.insertNewDataInsideTable(todoEdt.getText().toString())){
                    updateTextView();
                    Toast.makeText(MainActivity.this, "data saved", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }

            }
        });

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int todoId = Integer.valueOf(todoIdEdt.getText().toString());
                toDoListDBAdapter.delete(todoId);
                updateTextView();
            }
        });

        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int todoId = Integer.valueOf(todoIdEdt.getText().toString());
                String updatedTodo = updatedTodoEdt.getText().toString();
                toDoListDBAdapter.update(todoId, updatedTodo);
                updateTextView();
            }
        });
    }

    private String getToDoListString(){

        todoList = toDoListDBAdapter.getAllTodos();
        if (todoList != null && todoList.size() > 0){
            StringBuilder stringBuilder = new StringBuilder();
            for (Todo todo : todoList){
                stringBuilder.append(todo.getId() + " . " + todo.getToDo() + "\n");
            }
            return stringBuilder.toString();
        } else {
            return "database is empty";
        }
    }

    private void updateTextView(){
        todoListTxt.setText(getToDoListString());
    }
}