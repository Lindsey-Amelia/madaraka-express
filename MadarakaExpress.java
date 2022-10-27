/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author allan
 */
public class MadarakaExpress extends MIDlet {

    private TextBox myTextBox;
    private Display myDisplay;

    public MadarakaExpress(){
        myTextBox = new TextBox("BOOK KR MADARAKA","1.Intercounty 8:00Am\n2.Nairobi -MSA express\n3.Mombasa - NRB express\n4.Suswa train\nHelpLine :070938**88\n 00: Main Menu\n 000: Exit\n \n_________________",1000, TextField.ANY);
        myDisplay = Display.getDisplay(this);
    }
    public void startApp() {
        myDisplay.setCurrent(myTextBox);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
