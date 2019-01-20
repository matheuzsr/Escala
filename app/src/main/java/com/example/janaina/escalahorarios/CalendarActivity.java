package com.example.janaina.escalahorarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class CalendarActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        //calendarView = (CalendarView) findViewById(R.id.calendarView);
            //calendarView.set


        //Calendar c = Calendar.getInstance();
        //c.set(2019,1,17);
        //long ordDia;
        //ordDia = c.getTimeInMillis()/86400000;

    }
}
