package com.example.week1day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CarResgisterationActivity extends AppCompatActivity {

    EditText yeartext;
    EditText maketext;
    EditText modeltext;
    EditText colortext;
    EditText enginetext;
    EditText transtext;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_registeration);
        yeartext=findViewById(R.id.yearText);
        maketext=findViewById(R.id.makeText);
        modeltext=findViewById(R.id.modelText);
        colortext=findViewById(R.id.colorText);
        enginetext=findViewById(R.id.engineText);
        transtext=findViewById(R.id.transText);
    }
    public void onClick(View v){
        String Year,Make,Model,Color,EngineSize,TranmissionType;
        Year=yeartext.getText().toString();
        Make=maketext.getText().toString();
        Model=modeltext.getText().toString();
        Color=colortext.getText().toString();
        EngineSize=enginetext.getText().toString();
        TranmissionType=transtext.getText().toString();
        Car car=new Car(Year,Make,Model,Color,EngineSize,TranmissionType);
        Bundle bundle=new Bundle();
        Intent intent=new Intent(CarResgisterationActivity.this,MainActivity.class);
        bundle.putParcelable("car", car);

        intent.putExtras(bundle);
        setResult(1, intent);

        finish();
    }

}
