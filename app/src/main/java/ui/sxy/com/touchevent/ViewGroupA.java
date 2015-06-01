package ui.sxy.com.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by sunxy
 * on 15/5/30.
 */
public class ViewGroupA extends LinearLayout {
    public ViewGroupA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupA(Context context) {
        super(context);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("TAG","ViewGroupA---dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("TAG","ViewGroupA---onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("TAG","ViewGroupA---onTouchEvent");
        return super.onTouchEvent(event);
    }

}
