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
public class ViewGroupB  extends LinearLayout {
    public ViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupB(Context context) {
        super(context);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("TAG", "ViewGroupB---dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("TAG","ViewGroupB---onInterceptTouchEvent");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("TAG","ViewGroupB---onTouchEvent");
        return super.onTouchEvent(event);
        //return true;
    }

}
