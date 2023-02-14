package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    DBHelper d=new DBHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt=findViewById(R.id.textView);
        Button surah=findViewById(R.id.surah);
        Button parah=findViewById(R.id.para);
        DBHelper d=new DBHelper(this);

        File database = getApplicationContext().getDatabasePath(d.db_name);
        if(database.exists()==false) {
            d.getReadableDatabase();
            //Copy db
            if(copyDatabase(this)) {
              //  Toast.makeText(this, "Copy database succes", Toast.LENGTH_LONG).show();
            } else {

                Toast.makeText(this, "Copy data error", Toast.LENGTH_LONG).show();
                return;
            }
        }
        surah.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
            startActivity(intent);
        });

        parah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });



    }
    private boolean copyDatabase(Context context) {
        try {

            InputStream inputStream = context.getAssets().open(d.db_name);
            Toast.makeText(context, inputStream.toString(), Toast.LENGTH_SHORT).show();
            String outFileName = d.dbLoc + d.db_name;
            OutputStream outputStream = new FileOutputStream(outFileName);
            byte[]buff = new byte[1024];
            int length = 0;
            //Toast.makeText(context, "db copied", Toast.LENGTH_LONG).show();
            while ((length = inputStream.read(buff)) > 0) {
                outputStream.write(buff, 0, length);
            }
            outputStream.flush();
            outputStream.close();

            Log.w("MainActivity","DB copied");
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}