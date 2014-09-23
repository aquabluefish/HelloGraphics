package hm.orz.bluefish.hellographics;


import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;


public class HelloGraphics extends Activity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DrawView view = new DrawView(getApplication());
		setContentView(view);
	}


	class DrawView extends View {


		public DrawView(Context context) {
			super(context);
		}


		public void onDraw(Canvas c) {
			c.drawColor(Color.BLACK);

			Paint fill_paint = new Paint();
			fill_paint.setStyle(Paint.Style.FILL);
			fill_paint.setColor(Color.BLUE);
			c.drawRect(500f, 500f, 1000f, 1000f, fill_paint);


			fill_paint.setColor(Color.RED);
			c.drawOval(new RectF(0f, 0f, 500f, 500f), fill_paint);
		}


	}
}
