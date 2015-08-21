package oddtimeworks.com.sugotokulayouttest;

import oddtimeworks.com.sugotokulayouttest.util.LineBreakLayout;
import oddtimeworks.com.sugotokulayouttest.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fullscreen);

        initialize();
    }

    private void initialize() {
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.frameLayout);
        LineBreakLayout lineBreakLayout = new LineBreakLayout(getApplicationContext());

        lineBreakLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));

        frameLayout.addView(lineBreakLayout);

    }

}
