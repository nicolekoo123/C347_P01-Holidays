package sg.edu.rp.c346.id19047433.p01_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lvHolidays;
    TextView tvType;
    HolidayAdapter aa;
    ArrayList<Holiday> holidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lvHolidays = (ListView) this.findViewById(R.id.lvHolidays);
        tvType = (TextView) findViewById(R.id.tvType);

        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        tvType.setText(type);

        holidays = new ArrayList<Holiday>();

        if (type.equals("Secular")){
            holidays.add(new Holiday("New Year's Day", "year.png"));
            holidays.add(new Holiday("Labour Day", "labourday.png"));
        }else if(type.equals("Ethnic & Religion")){
            holidays.add(new Holiday("Chinese New Year", "cny.png"));
            holidays.add(new Holiday("Good Friday", "goodfriday.png"));
        }
        aa = new HolidayAdapter(this, R.layout.row, holidays);
        lvHolidays.setAdapter(aa);
    }
}