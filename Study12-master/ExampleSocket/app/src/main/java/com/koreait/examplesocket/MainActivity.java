package com.koreait.examplesocket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    EditText et;

    TextView tv1;
    TextView tv2;

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);

        Button btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String data = et.getText().toString();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        send(data);
                    }
                }).start();
            }
        });
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        startServer();
                    }
                }).start();
            }
        });
    }

    public void printClientLog(final String data) {
        Log.d("Main", data);

        handler.post(new Runnable() {
            @Override
            public void run() {
                tv1.append(data + "\n");
            }
        });
    }

    public void printServerLog(final String data) {
        Log.d("Main", data);

        handler.post(new Runnable() {
            @Override
            public void run() {
                tv2.append(data + "\n");
            }
        });
    }

    public void startServer() {
        try{
            int portNumber = 5001;

            ServerSocket server = new ServerSocket(portNumber);
            printServerLog("???????????? : " + portNumber);
            while(true) {
                Socket socket = server.accept();
                InetAddress clientHost = socket.getLocalAddress();

                int clientPort = socket.getPort();
                printServerLog("??????????????? ????????? :" + clientHost + " : " + clientPort);

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Object obj = ois.readObject();
                printServerLog("????????? ?????? : " + obj);

                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                oos.writeObject(obj + " from server.");
                oos.flush();
                printServerLog("????????? ??????");

                socket.close();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void send(String data) {
        try {
            int portNumber = 5001;

            Socket socket = new Socket("localhost", portNumber);
            printClientLog("?????? ?????????.");

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(data);
            oos.flush(); // ????????????????????? ?????????.
            printClientLog("????????? ?????????.");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            printClientLog("??????????????? ?????? : " + ois.readObject());
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}