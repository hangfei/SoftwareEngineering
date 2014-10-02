package edu.upenn.cis573.hwk2;

import java.util.ArrayList;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;

/**
 * Class represents the user stroke on the screen.
 * @author hangfeilin
 *
 */
public class Stroke {
    private ArrayList<Point> points = new ArrayList<Point>();
    public int yChange = 0;
    private static final int lineColor = Color.RED;
    private static final int lineWidth = 10;
    
    /**
     * Draw a stroke.
     * @param canvas
     */
    public void drawStroke(Canvas canvas) {
		// draws the stroke
    	if (points.size() > 1) {
    		for (int i = 0; i < points.size()-1; i++) {
    			int startX = points.get(i).x;
    			int stopX = points.get(i+1).x;
    			int startY = points.get(i).y;
    			int stopY = points.get(i+1).y;
    			Paint paint = new Paint();
    			paint.setColor(lineColor);
    			paint.setStrokeWidth(lineWidth);
    			canvas.drawLine(startX, startY, stopX, stopY, paint);
    		}
    	}
    }
    
    /**
     * Add a point to the points
     * @param point
     */
    public void addPoint(Point point) {
    	points.add(point);
    }
    
    /**
     * Clear the points.
     */
    public void clearPoints() {
    	points.clear();
    }
    
}
