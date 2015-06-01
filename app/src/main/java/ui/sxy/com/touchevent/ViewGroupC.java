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
public class ViewGroupC  extends LinearLayout {
    public ViewGroupC(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupC(Context context) {
        super(context);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("TAG", "ViewGroupC---dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("TAG","ViewGroupC---onInterceptTouchEvent");
//        switch (ev.getAction()){
//            case MotionEvent.ACTION_MOVE:
//                return true;
//        }
        return super.onInterceptTouchEvent(ev);
        //return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("TAG","ViewGroupC---onTouchEvent");
        return super.onTouchEvent(event);
    }

}
