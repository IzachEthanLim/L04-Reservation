package sg.edu.rp.c346.id22022448.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.AccessibilityButtonController;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView name;
    TextView Num;
    TextView people;
    DatePicker date;
    TimePicker time;
    CheckBox smoke;
    Button makeRSV;
    Button reset;
    TextView RSVinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}