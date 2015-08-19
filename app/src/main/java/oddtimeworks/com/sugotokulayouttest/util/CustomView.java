package oddtimeworks.com.sugotokulayouttest.util;

import android.app.ActionBar;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by takeuchichikara on 15/08/19.
 */
public class CustomView extends View {

    private static final int WIDTH_WIDE = 360;
    private static final int WIDTH_NORMAL = 180;
    private static final int WIDTH_THIN = 120;

    private static final int HEIGHT_NORMAL = 200;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, int size) {
        super(context);

        setLayoutParams(createParam(size));
    }

    private LinearLayout.LayoutParams createParam(int size){

        LinearLayout.LayoutParams param = null;

        switch (size) {
            case 1:
                param = new LinearLayout.LayoutParams(WIDTH_WIDE, HEIGHT_NORMAL);
            case 2:
                param = new LinearLayout.LayoutParams(WIDTH_NORMAL, HEIGHT_NORMAL);
            case 3:
                param = new LinearLayout.LayoutParams(WIDTH_THIN, HEIGHT_NORMAL);
        }

        return param;
    }
}
