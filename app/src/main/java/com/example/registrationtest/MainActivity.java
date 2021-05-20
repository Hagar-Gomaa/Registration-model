package com.example.registrationtest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EmployeesAdapter EmployeesAdapter;
    private ArrayList<employees_Items> employees_Items=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




            recyclerView=findViewById(R.id.employeesRecycle);


                employees_Items.add(new employees_Items( RegisterActivity.namee, RegisterActivity.email,"user"));


            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
            EmployeesAdapter=new EmployeesAdapter(this, employees_Items) {
                @NonNull
                @Override
                public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                    return super.onCreateViewHolder(parent, viewType);
                }
            };
            recyclerView.setAdapter(EmployeesAdapter);




        }


}