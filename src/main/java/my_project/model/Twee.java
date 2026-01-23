package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Twee extends GraphicalObject {
    public Twee(){}

    public void draw(DrawTool drawtool){
        drawtool.setCurrentColor(139,69,19,255);
        drawtool.drawFilledRectangle(580,450,60,160);
        drawtool.setCurrentColor(34,139,34,255);
        drawtool.drawFilledPolygon(520,450 ,700,450 ,700,400 ,640,400 ,640,350 ,580,350 ,580,400, 520,400);
    }
}
