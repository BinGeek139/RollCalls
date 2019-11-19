package com.ptit.rollcall.common;

import android.util.Log;

import java.io.IOException;
import java.net.Socket;



public class checkSocket {
    public static void check(){
        try  {
            Log.e("tat", "check: ok");
            Socket socket = new Socket("192.168.31.33", 8888);
            Log.e("tat", "check: ok");
            System.out.println("ok");
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
