package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Twee extends GraphicalObject {
    public Twee(double x,double y, double size){
        this.x=x;
        this.y=y;
        this.radius=size;
    }

    public void draw(DrawTool drawtool){
        drawtool.setCurrentColor(139,69,19,255);
        drawtool.drawFilledRectangle(/*580,450,60,160*/x,y,radius,radius *2.5);
        drawtool.setCurrentColor(new Color(0,0,0));
        drawtool.drawRectangle(x,y,radius,radius *2.5);
        drawtool.setCurrentColor(76, 187, 23,255);
        drawtool.drawFilledCircle(x+radius/2,y,radius);
        drawtool.setCurrentColor(new Color(0,0,0));
        drawtool.drawCircle(x+radius/2,y,radius);


        /*drawtool.drawFilledPolygon(520,450  ,700,450  ,700,400  ,640,400  ,640,350 ,580,350 ,580,400, 520,400 x-60,y  ,x+120,y  ,x+120,y-50  ,x+60,y-50  ,x+120,y-100 ,x+60,y-100 ,x+60,y+20, x,y-50);
        drawtool.setCurrentColor(0, 163, 108,255);                                                        //520,450   700,450   700,400     640,400      640,350
        for (int j = 0; j < 5; j = j + 1) {
            for (int i = 0; i < 5; i = i + 1) {
                drawtool.drawFilledRectangle(590 +j * 10, 355 +i * 10, 5, 8);
            }
        }
        for (int j = 0; j < 17; j = j + 1) {
            for (int i = 0; i < 4; i = i + 1) {
                drawtool.drawFilledRectangle(530 +j * 10, 405 +i * 10, 5, 8);
            }
        }


        drawtool.setCurrentColor(184,115,51,255);
        for (int j = 0; j < 4; j = j + 1) {
            for (int i = 0; i < 4; i = i + 1) {
                drawtool.drawFilledRectangle(585 +j * 15, 460 +i * 40, 5, 20);
            }
        }*/

    }
}
