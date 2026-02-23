package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Haus. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class House extends GraphicalObject {

    private double size;
    private Hintergrund hintergrund;

    public House(int x, int y, int size, Hintergrund hintergrund){
        this.x = x;
        this.y = y;
        this.size = size;
        this.hintergrund = hintergrund;
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(143, 20, 2,255);
        //drawTool.drawFilledRectangle(150,400,200,240); house
        drawTool.drawFilledRectangle(x,y,size,size *1.1);
        drawTool.setCurrentColor(191, 191, 191,255);

        for(int j = 0; j < 12; j = j + 1){
            for(int i = 0; i < 6; i = i + 1){
                if(j != 11)
                drawTool.drawLine(x+i*(size*0.2),y+j*(size*0.05),x+i*(size*0.2),y+j*(size*0.1)+(size*0.1));//horizontal lines
                drawTool.drawLine(x,y+j*(size*0.1),x+size,y+j*(size*0.1)); //vertical lines
            }
        }



        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledRectangle(x + (size *0.375),y + (size * 0.6),size / 4,size /2); //door
        drawTool.setCurrentColor(Color.yellow);
        drawTool.drawFilledCircle(x +(size * 0.575),y +(size *0.85),size *0.025);//doorknob
        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledRectangle(x+(size*0.025),y+(size*0.65),size*0.3,size*0.35); //windows frames
        drawTool.drawFilledRectangle(x+(size*0.65),y+(size*0.65),size*0.3,size*0.35);
        if(hintergrund.time > 1200){
            drawTool.setCurrentColor(new Color(255, 250, 165));
        } else {
            drawTool.setCurrentColor(new Color(149, 255, 223));
        }
        drawTool.drawFilledRectangle(x+(size*0.075),y+(size*0.7),size*0.20,size*0.25); //windows
        drawTool.drawFilledRectangle(x +(size*0.7),y+(size*0.7),size*0.20,size*0.25);
        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledRectangle(x+(size*0.075),y+(size*0.8),size*0.20,size*0.05);//horizontal window lines
        drawTool.drawFilledRectangle(x+(size*0.7),y+(size*0.8),size*0.20,size*0.05);
        drawTool.drawFilledRectangle(x+(size*0.15),y+(size*0.7),size*0.05,size*0.25);//vertical window lines
        drawTool.drawFilledRectangle(x+(size*0.775),y+(size*0.7),size*0.05,size*0.25);
        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledTriangle(x-(size*0.1),y+(size*0.025),x+(size*1.1),y+(size*0.025),x+(size*0.5),y-(size*0.8));//roof outline
        drawTool.setCurrentColor(191, 65, 44,255);
        drawTool.drawFilledTriangle(x-(size*0.05),y,x+(size*1.05),y,x+(size*0.5),y-(size*0.75)); //main roof
        drawTool.setCurrentColor(Color.darkGray);
        drawTool.drawFilledPolygon(x+(size*0.2),y-(size*0.75) ,x+(size*0.4),y-(size*0.75) ,x+(size*0.4),y-(size*0.5) ,x+(size*0.2),y-(size*0.25)); //chimney


        if (hintergrund.time > 1200){
            drawTool.setCurrentColor(211, 211, 111,155);
            drawTool.drawFilledRectangle(x+(size*0.075),y+(size*0.7),size*0.20,size*0.25); //windows
            drawTool.drawFilledRectangle(x +(size*0.7),y+(size*0.7),size*0.20,size*0.25);
            drawTool.drawFilledPolygon(x+(size*0.075),y+(size*0.95),x+(size*0.275),y+(size*0.95), x+(size*0.325),hintergrund.earthHeight+(size*0.25), x+(size*0.04),hintergrund.earthHeight+(size*0.25));
            drawTool.drawFilledPolygon(x +(size*0.7),y+(size*0.95), x +(size*0.9),y+(size*0.95), x +(size*0.95),hintergrund.earthHeight+(size*0.25), x +(size*0.65),hintergrund.earthHeight+(size*0.25));
        }

    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

}
