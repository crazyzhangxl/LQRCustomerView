package com.lqr.customerview.widget.practice4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.lqr.customerview.R;


public class PracticeCameraRotateFixedView extends View {

    Camera camera = new Camera();
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;
    Point p1 = new Point(200, 200);
    Point p2 = new Point(600, 200);

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.maps);
    }

    public PracticeCameraRotateFixedView(Context context) {
        this(context, null);
    }

    public PracticeCameraRotateFixedView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PracticeCameraRotateFixedView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        camera.save();
        canvas.translate((p1.x + bitmap.getWidth() / 2), (p1.y + bitmap.getHeight() / 2));
        camera.rotateX(30);
        camera.applyToCanvas(canvas);
        canvas.translate(-(p1.x + bitmap.getWidth() / 2), -(p1.y + bitmap.getHeight() / 2));
        canvas.drawBitmap(bitmap, p1.x, p1.y, paint);
        camera.restore();
        canvas.restore();

        canvas.save();
        camera.save();
        canvas.translate((p2.x + bitmap.getWidth() / 2), (p2.y + bitmap.getHeight() / 2));
        camera.rotateY(30);
        camera.applyToCanvas(canvas);
        canvas.translate(-(p2.x + bitmap.getWidth() / 2), -(p2.y + bitmap.getHeight() / 2));
        canvas.drawBitmap(bitmap, p2.x, p2.y, paint);
        camera.restore();
        canvas.restore();

    }
}
