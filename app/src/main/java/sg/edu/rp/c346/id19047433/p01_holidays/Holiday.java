package sg.edu.rp.c346.id19047433.p01_holidays;

import android.media.Image;

public class Holiday {
    private String holiday;
    private String picture;

    public Holiday(String holiday, String picture) {
        this.holiday = holiday;
        this.picture = picture;
    }
    public String getHoliday() {
        return holiday;
    }
    public String getPicture(){
        return picture;
    }
}
