package my_project.model;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import java.awt.*;


public class Cloud extends GraphicalObject {


    private double speed;
    private boolean goRight = true;
    private final double standardRadius = 50;

    public Cloud(double x, double y, double r){
        this.x = x;	//wird bereits in GraphicalObjekt deklariert
        this.y = y;	//wird bereits in GraphicalObjekt deklariert
        this.radius = r;
        speed = Math.random()*400+100;
    }

    public Cloud(double x, double y, double r, double speed){
        this.x = x;	//wird bereits in GraphicalObjekt deklariert
        this.y = y;	//wird bereits in GraphicalObjekt deklariert
        this.radius = r;
        this.speed = speed;
         //int Nummmer = (int)(Math.random()*2);
        //goRight = Nummmer >= 1;

    }


    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.lightGray);
        double r = radius;
        drawTool.drawFilledCircle(x,y,r);
        drawTool.drawFilledCircle(x+r,y+r*0.75,r);
        drawTool.drawFilledCircle(x+r*0.5,y-r*0.5,r);
        drawTool.drawFilledCircle(x+r*2,y+r*0.25,r);
        drawTool.drawFilledCircle(x+r*2.5,y+r*0.75,r);
        drawTool.drawFilledCircle(x+r*3,y,r);
    }

    @Override
    public void update(double dt) {
        double r = radius;
        if(goRight == true){
            if (x < 1200+ 2*r) {
                x = x + dt * speed*(radius/standardRadius);
                System.out.println(radius/standardRadius);
            } else {
                x = 0 - 4*r;
                y = Math.random()*500+r;
                radius = Math.random()*50 + 10;
            }
        } else {
            if (x > 0 - 2*r) {
                x = x - dt * speed*(radius/standardRadius);
            } else {
                x = 1200 + 4*r;
                y = Math.random()*500+50;
                radius = Math.random()*50 + 10;
            }
        }

    }
}

