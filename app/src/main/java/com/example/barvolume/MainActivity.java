package com.example.barvolume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtWidth, edtHeight, edtLenght;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtWidth=(EditText)findViewById(R.id.edt_widht);
        edtHeight=(EditText)findViewById(R.id.edt_height);
        edtLenght=(EditText)findViewById(R.id.edt_lenght);
        btnCalculate=(Button)findViewById(R.id.edt_calculate);
        tvResult=(TextView)findViewById(R.id.tv_result);
        btnCalculate.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if (v.getId()==R.id.edt_calculate){
            String lenght=edtLenght.getText().toString().trim();
            String widht=edtWidth.getText().toString().trim();
            String height=edtHeight.getText().toString().trim();
            boolean isEmptyField=false;
            if (TextUtils.isEmpty(lenght)){
                isEmptyField=true;
                edtLenght.setError("Field ini tidak boleh kosong");

            }
            if (TextUtils.isEmpty(widht)){
                isEmptyField=true;
                edtWidth.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(height)){
                isEmptyField=true;
                edtHeight.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyField){
                double l=Double.parseDouble(lenght);
                double w=Double.parseDouble(widht);
                double h=Double.parseDouble((height));
                double volume=l*w*h;
                tvResult.setText((String.valueOf(volume)));
            }

        }
    }
}
