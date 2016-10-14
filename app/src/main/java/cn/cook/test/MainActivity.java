package cn.cook.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.Date;

import cn.cook.datelibrary.DateUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date date=new Date();
        Toast.makeText(this, ""+ DateUtils.formatDateToString(date), Toast.LENGTH_SHORT).show();
    }
}
