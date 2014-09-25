package hm.orz.bluefish.hellographics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
	public CustomView(Context cont) {
		super(cont);
	}

	public CustomView(Context cont, AttributeSet attr) {
		super(cont,attr);
	}

	@Override
	protected void onDraw(Canvas c){
		c.drawColor(Color.BLACK);

		Paint fill_paint = new Paint();
		fill_paint.setStyle(Paint.Style.FILL);
		fill_paint.setColor(Color.BLUE);
		c.drawRect(500f, 500f, 1000f, 1000f, fill_paint);

		fill_paint.setColor(Color.RED);
		c.drawOval(new RectF(0f, 0f, 500f, 500f), fill_paint);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
	    int widthSize = MeasureSpec.getSize(widthMeasureSpec);
	    int heightSize = MeasureSpec.getSize(heightMeasureSpec);
		setMeasuredDimension(widthSize,heightSize);
	}
}
