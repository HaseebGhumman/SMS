package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editText;
    Message msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SMS();
    }
    public void SMS( ){
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view){
                EditText phonenumber=findViewById(R.id.phone_number);
                EditText message=findViewById(R.id.message);
                String ph=phonenumber.getText().toString();
                String sms= message.getText().toString();
                SmsManager smsManager= SmsManager.getDefault();
                smsManager.sendTextMessage(ph, null, sms,null,null);
                Toast.makeText(getApplicationContext(), "MESSAGE SEND HOPEFULLY" ,Toast.LENGTH_LONG).show();
            };

        });

    }
}