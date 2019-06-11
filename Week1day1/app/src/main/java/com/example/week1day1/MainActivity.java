package com.example.week1day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showcar=findViewById(R.id.showcar);

    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case 111:
                if (data==null) break;
                Bundle bundle = data.getExtras();
                if (bundle==null)break;
                Car car=bundle.getParcelable("car");
                if (car==null) break;
                showcar.setText(car.toString());

                break;

        }
    }

    public void Register_a_Car(View v){
        Intent intent=new Intent(this,CarResgisterationActivity.class);
        startActivityForResult(intent, 111);
    }

}
