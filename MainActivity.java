package com.ptit.rollcall.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.ptit.rollcall.R;

import com.ptit.rollcall.common.checkSocket;


public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST_CI = 1;
    public static final int TEXT_REQUEST_MNG = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
//        databaseAccess.open();
//        Log.e("tag","ok");
//        Log.e("infor", "onCreate: "+  databaseAccess.getMember());
//        databaseAccess.close();
//        InputStream inputStream;
//        try  {
//            inputStream = getResources().openRawResource(R.drawable.a);
//            Log.e("check", "onCreate: " + inputStream.available());
//            byte[] image=new byte[inputStream.available()];
//            inputStream.read(image);
//            String code= Base64.encodeToString(image,1);
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    InetAddress serverAddr = null;
//                    try {
//                        serverAddr = InetAddress.getByName("192.168.1.11");
//                    } catch (UnknownHostException e) {
//                        e.printStackTrace();
//                    }
//
//                    try {
//                        Socket socket = new Socket("192.169.1.11", 8888);
//                    }catch(IOException e){
//                        e.printStackTrace();
//                    }
//
//                }
//            }).run();
        checkSocket.check();


//            Socket socket= null;
//            try {
//                socket = IO.socket("https://192.168.1.11:8888");
//                socket.connect();
//
//                socket.close();
//            } catch (URISyntaxException e) {
//                e.printStackTrace();
//            }
//            OutputStream out=socket.getOutputStream();
//            out.write(image);
//            Log.d("ok", "onCreate: send successfull");

//        }catch (IOException e) {
//            Log.e("check", "onCreate: no" );
//            e.printStackTrace();
//
//        }



    }

    public void launchCheckin(View view) {
        Intent intent = new Intent(this, ActivityCheckin.class);
        startActivityForResult(intent, TEXT_REQUEST_CI);
    }

    public void launchManager(View view) {
        Intent intent = new Intent(this, ActivityManager.class);
        startActivityForResult(intent, TEXT_REQUEST_MNG);
    }
}
