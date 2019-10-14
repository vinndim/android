package com.example.myname;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Name extends View {
    int n =10;
    float [] x = new float[n];
    float [] y = new float[n];
    float [] vx = new float[n];
    float [] vy = new float[n];

    public Name(Context context) {
        super(context);
        for (int i = 0; i<n; i++){
           x[i] = 500;
           y[i] = 500;
           vx[i] = (float) (Math.random()*6-3);
            vy[i] = (float) (Math.random()*6-3);
        }
      }

      @Override
      protected void onDraw(Canvas canvas)
      {
          Paint paint = new Paint();
          paint.setStrokeWidth(500);
          paint.setColor((Color.RED));
          paint.setStyle(Paint.Style.FILL);
          paint.setTextSize(14);
          for (int i = 0; i < n; i++) {
              canvas.drawCircle(x[i], y[i], 30, paint);
              x[i] += vx[i];
              y[i] += vy[i];
          }
          invalidate();
      }
}
