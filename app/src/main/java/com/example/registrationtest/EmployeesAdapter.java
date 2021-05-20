package com.example.registrationtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public abstract class EmployeesAdapter extends RecyclerView.Adapter<EmployeesAdapter.ViewHolder> {

public static class ViewHolder extends RecyclerView.ViewHolder{
   TextView name,email ,role;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.name);
        email = (TextView)itemView.findViewById(R.id.email);
        role = (TextView)itemView.findViewById(R.id.role);
    }
}
private Context context ;
private List<employees_Items>employees;
public EmployeesAdapter(Context c , List<employees_Items> employeesList){
this.context=c;
    employees=employeesList;

}


    @NonNull
    @Override
    public EmployeesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.employees,parent,false);

        return new
                ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeesAdapter.ViewHolder holder, int position) {
    employees_Items cc =employees.get(position);
    holder.name.setText(cc.getName());
    holder.email.setText(cc.getEmail());
        holder.role.setText(cc.getRole());

    }

    @Override
    public int getItemCount() {

        return employees.size();
    }
}
