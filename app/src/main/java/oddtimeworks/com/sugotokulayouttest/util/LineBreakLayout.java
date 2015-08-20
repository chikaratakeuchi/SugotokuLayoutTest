package oddtimeworks.com.sugotokulayouttest.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by Chikara Takeuchi on 2015/08/20.
 * 参照サイト：http://blog.choilabo.com/20140130/340
 */
public class LineBreakLayout extends RelativeLayout {

    public LineBreakLayout(Context context) {
        super(context);
    }

    public LineBreakLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LineBreakLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void addView(View child) {
        super.addView(child);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int count = getChildCount();


    }
}
