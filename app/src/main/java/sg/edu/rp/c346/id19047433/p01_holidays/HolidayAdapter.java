package sg.edu.rp.c346.id19047433.p01_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private Context context;
    private ArrayList<Holiday> holidays;
    private TextView tvHolidays;
    private ImageView ivPictures;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvHolidays = (TextView) rowView.findViewById(R.id.tv);
        // Get the ImageView object
        ivPictures = (ImageView) rowView.findViewById(R.id.iv);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentModule = holidays.get(position);
        // Set the TextView to show the food

        tvHolidays.setText(currentModule.getHoliday());
        // Set the image to star or nostar accordingly
        if(currentModule.getPicture() == "year.png") {
            ivPictures.setImageResource(R.drawable.year);
        }else if(currentModule.getPicture() == "labourday.png") {
            ivPictures.setImageResource(R.drawable.labourday);
        }else if (currentModule.getPicture() == "cny.png") {
            ivPictures.setImageResource(R.drawable.cny);
        }
        else {
            ivPictures.setImageResource(R.drawable.goodfriday);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
