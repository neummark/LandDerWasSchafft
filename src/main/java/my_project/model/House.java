package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Haus. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class House extends GraphicalObject {

    /**
     * Erzeugt ein neues Objekt der Klasse House
     */
    public House(){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.blue);
        drawTool.drawRectangle(0,0,800,829);
        drawTool.setCurrentColor(Color.green);
        drawTool.drawFilledRectangle(0,600,800,200);

        drawTool.setCurrentColor(143, 20, 2,255);
        drawTool.drawFilledRectangle(150,400,200,240); //house
        drawTool.setCurrentColor(191, 191, 191,255);

        for(int j = 0; j < 12; j = j + 1){
            for(int i = 0; i < 5; i = i + 1){
                if(j != 11) drawTool.drawLine(150+i*40,400+j*20,150+i*40,400+j*20+40);
                drawTool.drawLine(150,400+j*20,350,400+j*20);
            }
        }



        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledRectangle(225,540,50,100); //door
        drawTool.setCurrentColor(Color.yellow);
        drawTool.drawFilledCircle(265,590,5);//doorknob
        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledRectangle(155,530,60,70); //windows frames
        drawTool.drawFilledRectangle(280,530,60,70);
        drawTool.setCurrentColor(211, 211, 211,255);
        drawTool.drawFilledRectangle(165,540,40,50); //windows
        drawTool.drawFilledRectangle(290,540,40,50);
        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledRectangle(165,560,40,10);//horizontal window lines
        drawTool.drawFilledRectangle(290,560,40,10);
        drawTool.drawFilledRectangle(180,540,10,50);//vertical window lines
        drawTool.drawFilledRectangle(305,540,10,50);
        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledTriangle(130,405,370,405,250,240);//roof outline
        drawTool.setCurrentColor(191, 65, 44,255);
        drawTool.drawFilledTriangle(140,400,360,400,250,250); //main roof
        drawTool.setCurrentColor(Color.darkGray);
        drawTool.drawFilledPolygon(190,250,230,250,230,300,190,350); //chimney
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
