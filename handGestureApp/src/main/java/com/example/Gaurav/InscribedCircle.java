package com.example.Gaurav;

import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.imgproc.Imgproc;

public class InscribedCircle {
    public   double x,y,r;


    public InscribedCircle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public static InscribedCircle FindInscribedCircle(Mat m, double tx, double ty, double bx, double by, MatOfPoint2f c){
        double r = 0;
        double targetX = 0;
        double targetY = 0;

        for (int y = (int)ty; y < (int)by; y+=10)
        {
            for (int x = (int)tx; x < (int)bx; x+=10)
            {
                double curDist = Imgproc.pointPolygonTest(c,new Point(x,y),true);

                if (curDist > r) {
                    r = curDist;
                    targetX = x;
                    targetY = y;
                }
            }
        }
        return new InscribedCircle(targetX,targetY,r);

    }
}
