package com.example.learn_android_app.CP3_Controls;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.learn_android_app.R;

public class BasicElements extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    EditText et1;
    RadioButton rb1,rb2;
    String[] numList = {"1", "2", "3"};
    int chooseNum = 0;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_basic_controls);

            //        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

            et1= findViewById(R.id.ET1);
            Button bt1 = findViewById(R.id.B1);
            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Editable text1 = et1.getText();
                    Toast.makeText(BasicElements.this,text1,Toast.LENGTH_SHORT).show();
                }
            });
            RadioGroup rg1 = findViewById(R.id.RG1  );
            rb1 = findViewById(R.id.RB1);
            rb2 = findViewById(R.id.RB2);
            rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if(checkedId == R.id.RB1){
                        et1.setText("");
                        et1.setHint(rb1.getText());
                    }else if (checkedId == R.id.RB2){
                        et1.setText("");
                        et1.setHint(rb2.getText());
                    }else{}
                }
            });
            CheckBox cb1 = findViewById(R.id.CB1    );
            cb1.setOnCheckedChangeListener(this);

            Button b2 = findViewById(R.id.B2);
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog dialog;
                    AlertDialog.Builder adb1 = new AlertDialog.Builder(BasicElements.this);
                    adb1.setTitle("Need choose"  )
                            .setIcon(  R.mipmap.ic_launcher )
//                        .setMessage( "Choose one")
                            .setSingleChoiceItems(new String[]{"a1", "a2", "a3"}, chooseNum, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    chooseNum = which;

                                }
                            })
                            //.setMultiChoiceItems(   );

                            .setPositiveButton("Sure", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    et1.setHint(numList[chooseNum]+" is Choose.");
                                    dialog.dismiss();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .create()
                            .show();

                }
            });

            Button b3 = findViewById(R.id.B3);
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog dialog;
                    AlertDialog.Builder adb1 = new AlertDialog.Builder(BasicElements.this);
                    adb1.setTitle("Need choose"  )
                            .setIcon(  R.mipmap.ic_launcher )
//                        .setMessage( "Choose one")
                            .setSingleChoiceItems(new String[]{"a1", "a2", "a3"}, chooseNum, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    chooseNum = which;

                                }
                            })
                            //.setMultiChoiceItems(   );

                            .setPositiveButton("Sure", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    et1.setHint(numList[chooseNum]+" is Choose.");
                                    dialog.dismiss();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .create()
                            .show();

                }
            });
        }

    /**
     * Called when the checked state of a compound button has changed.
     *
     * @param buttonView The compound button view whose state has changed.
     * @param isChecked  The new checked state of buttonView.
     */
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked) {
            et1.setHint(buttonView.getText());
        }
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder adb1 = new AlertDialog.Builder(this);
        adb1.setTitle("Need run?"  )
                .setIcon(  R.mipmap.ic_launcher )
                .setMessage( "comfim?")
                //.setSingleChoiceItems(  )
                //.setMultiChoiceItems(   );

                .setPositiveButton("Sure", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        BasicElements.this.finish();//shutdown activity
                    }
                })
                .setNegativeButton("Nooo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                })
                .create()
                .show();


    }


}
