package com.ozarci.websido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread splashThread = new Thread(){
            public void run(){
                try{
                    //mikrosaniye türünden bekleme süresi belirlenir. 2000 = 2sn
                    sleep(1500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    //bekleme süresi bittikten sonra yani 2 saniye sonra MainActivity açacak.
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        // Thread methodunu burada çağırıyoruz.
        splashThread.start();
    }
}
