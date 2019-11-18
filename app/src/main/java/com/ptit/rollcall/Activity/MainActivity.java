package com.ptit.rollcall.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;


import com.ptit.rollcall.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
//        databaseAccess.open();
//        Log.e("tag","ok");
//        Log.e("infor", "onCreate: "+  databaseAccess.getMember());
//        databaseAccess.close();
        InputStream inputStream;
        try  {
            inputStream = getResources().openRawResource(R.drawable.a);
            Log.e("check", "onCreate: " + inputStream.available());
            byte[] image=new byte[inputStream.available()];
            inputStream.read(image);
            String code= Base64.encodeToString(image,1);
            Socket socket=new Socket("localhost",6789);
            
            OutputStream out=socket.getOutputStream();
            out.write(image);
            Log.d("ok", "onCreate: send successfull");
        }catch (IOException e) {
            Log.e("check", "onCreate: no" );
        }



    }

}
