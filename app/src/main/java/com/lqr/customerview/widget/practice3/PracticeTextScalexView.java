package com.lqr.customerview.widget.practice3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class PracticeTextScalexView extends View {

    public PracticeTextScalexView(Context context) {
        this(context, null);
    }

    public PracticeTextScalexView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PracticeTextScalexView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        String text = "Hello CSDN_LQR";
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setTextSize(50);
        paint.setTextScaleX(1.2f);
        canvas.drawText(text,50,100,paint);
    }
}
