package com.example.registrationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.sql.Connection;

public class RegisterActivity extends AppCompatActivity {
  public static   String namee , email ;
    EditText txtuser,txtpass,txtname,txtemail,txtpassconfirm;
    RadioButton rdmale;
    Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

            txtuser=findViewById(R.id.txtuser);
            txtpass=findViewById(R.id.txtpass);
            txtname=findViewById(R.id.txtname);
            txtemail=findViewById(R.id.txtemail);
        txtpassconfirm=findViewById(R.id.txtpassconfirm);

            btnsave=findViewById(R.id.btnregister);
            btnsave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(txtuser.getText().toString().isEmpty())
                    {
                        txtuser.setError("Please enter username");
                        txtuser.requestFocus();
                    }
                    else {
                        if (txtpass.getText().toString().isEmpty()) {
                            txtpass.setError("Please enter password");
                            txtpass.requestFocus();
                        }

                        //else { if (txtuser.getText().toString())



                        else {
                            String em = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
                            if (txtemail.getText().toString().matches(em) == false) {
                                txtemail.setError("Invaild email User@domain example@xxx.xxx");
                                txtemail.requestFocus();
                            } else {
                                    if (txtpassconfirm.getText().toString().matches(String.valueOf(txtpass.getText())) == false) {
                                        txtpassconfirm.setError(" The Password isn't matched ");
                                        txtpassconfirm.requestFocus();
                                    }

                                    else
                                    {
                                         namee = txtname.getText().toString();
                                        email = txtemail.getText().toString();
                                        startActivity(new Intent(RegisterActivity.this,MainActivity.class));
                                    }




                                    /*else {

                                        String msg = db.RunDML("insert into Parent values (N'" + txtuser.getText() + "',N'" + txtpass.getText() + "',N'" + txtname.getText() + "','" + txtemail.getText() + "','" + g + "',N'" + txtqul.getText() + "','" + txtphone.getText() + "',N'" + txtjob.getText() + "','" + txtbdate.getText() + "','"+MapsActivity.lat+"','"+MapsActivity.lang+"')");
                                        if (msg.equals("Ok")) {
                                            AlertDialog.Builder m = new AlertDialog.Builder(RegisterActivity.this)
                                                    .setTitle("registeration")
                                                    .setMessage("User has been created done")
                                                    .setIcon(R.drawable.logo)
                                                    .setPositiveButton("Thanks", null);
                                            m.create().show();
                                        } else if (msg.contains("PK_Parents")) {
                                            AlertDialog.Builder m = new AlertDialog.Builder(RegisterActivity.this)
                                                    .setTitle("registeration")
                                                    .setMessage("Username is exist")
                                                    .setIcon(R.drawable.logo)
                                                    .setPositiveButton("Try again", null);
                                            m.create().show();
                                        } else
                                            Toast.makeText(RegisterActivity.this, "" + msg, Toast.LENGTH_SHORT).show();

                                    }
                                }



             */
                                }

                            }


                        }

                    }});}}

