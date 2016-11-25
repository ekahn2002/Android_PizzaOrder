package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView4,textView5,textView6;
    EditText editText1, editText2, editText3;
    CheckBox checkBox;
    RadioGroup radio;
    RadioButton radioButton1, radioButton2;
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        radio=(RadioGroup)findViewById(R.id.radio);
        radioButton1=(RadioButton)findViewById(R.id.radioButton1);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        imageView=(ImageView)findViewById(R.id.imageView);
        button=(Button)findViewById(R.id.button);

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radioButton1.isChecked()){
                    imageView.setImageResource(R.drawable.picture1);
                }
                else if(radioButton2.isChecked()){
                    imageView.setImageResource(R.drawable.picture2);
                }
            }
        });

    }
}
