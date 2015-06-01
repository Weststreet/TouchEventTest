package ui.sxy.com.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by sunxy
 * on 15/5/30.
 */
public class ViewD extends View {
    public ViewD(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewD(Context context) {
        super(context);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("TAG", "ViewD---dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("TAG","ViewD---onTouchEvent");
        switch (event.getAction()){
            case MotionEvent.ACTION_CANCEL:
                Log.d("TAG","ViewD---onTouchEvent---ACTION_CANCEL");
                break;
        }
        return super.onTouchEvent(event);
        //return true;
    }

}
