package fi.jamk.hawnin.myapplication;

import android.content.Context;

/**
 * Created by jmprs on 2017. 10. 21..
 */

public class Place {
    public String name;
    public String imageName;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}