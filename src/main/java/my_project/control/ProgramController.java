package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.model.Hintergrund;
import my_project.model.House;
import my_project.model.Twee;
import my_project.model.Gate;
import my_project.model.Cloud;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern.
 * Hinweise:
 * - Der Konstruktor sollte nicht geändert werden.
 * - Sowohl die startProgram()- als auch die updateProgram(...)-Methoden müssen vorhanden sein und ihre Signatur sollte
 *   nicht geändert werden
 * - Zusätzliche Methoden sind natürlich gar kein Problem
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private final ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    private House firstHouse; // deklariert eine Referenz für ein Objekt der Klasse House
    private Twee firstTwee, secondTwee, thirdTwee, fourthTwee, fifthTwee;
    private Hintergrund hintergrund1;
    private Gate gate1;
    private Cloud cloud1;

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen. Hier sollte also alles geregelt werden,
     * was zu diesem Zeipunkt passieren muss.
     */
    public void startProgram() {
        hintergrund1 = new Hintergrund(false);
        viewController.draw(hintergrund1);

        cloud1 = new Cloud(230,150,50);
        viewController.draw(cloud1);

        // Erstelle ein Objekt der Klasse House und initialisiere damit die Referenz house1
        firstHouse = new House();
        // Teile dem ViewController-Objekt mit, dass das House-Objekt gezeichnet werden soll
        viewController.draw(firstHouse);

        gate1 = new Gate();
        viewController.draw(gate1);

        firstTwee = new Twee(600,450,70); //520,450 (leaves
        secondTwee = new Twee(500,460,60);
        thirdTwee = new Twee(650,500,50);
        fourthTwee = new Twee(750,450,70);
        fifthTwee = new Twee(850,480,50);
        viewController.draw(firstTwee);
        viewController.draw(secondTwee);
        viewController.draw(thirdTwee);
        viewController.draw(fourthTwee);
        viewController.draw(fifthTwee);


    }

    /**
     * Diese Methode wird vom ViewController-Objekt automatisch mit jedem Frame aufgerufen (ca. 60mal pro Sekunde)
     * @param dt Zeit seit letztem Frame in Sekunden
     */
    public void updateProgram(double dt){

    }
}
