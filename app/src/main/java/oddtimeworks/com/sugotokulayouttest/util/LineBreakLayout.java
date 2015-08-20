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

        if (count > 0) {
            int max = MeasureSpec.getSize(widthMeasureSpec);
            View pline = this.getChildAt(0);
            View prev = this.getChildAt(0);

            prev.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);

            int currentTotal = pline.getMeasuredWidth();

            for(int i = 1; i < count; i++) {
                View child = this.getChildAt(i);
                child.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
                int width = child.getMeasuredWidth();

                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) child.getLayoutParams();

                if(max > currentTotal + width) {
                    currentTotal += width;

                    layoutParams.addRule(RelativeLayout.ALIGN_TOP, prev.getId());
                    layoutParams.addRule(RelativeLayout.RIGHT_OF, prev.getId());
                }else{
                    layoutParams.addRule(RelativeLayout.BELOW, pline.getId());
                    layoutParams.addRule(RelativeLayout.ALIGN_LEFT, pline.getId());

                    pline = child;
                    currentTotal = pline.getMeasuredWidth();
                }
                prev = child;
            }
        }

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
