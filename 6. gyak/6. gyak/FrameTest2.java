/*
 * Mintaprogramok/5. fejezet
 * FrameTest2.java
 *
 * Angster Erzs�bet: OO tervez�s �s programoz�s, Java II. k�tet
 * 2002.09.01.
 * M�dos�tva: 2015.10.19.
 */

import javax.swing.*;
import java.awt.*;

class SpecFrame extends JFrame {
  // Komponensek deklar�l�sa:
  JLabel lbInfo;
  JButton btOk, btNemOk;

  // Konstruktor:
  public SpecFrame() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // C�m, poz�ci� �s m�ret megad�sa:
    setTitle("Frame-teszt");
    setBounds(100,50,300,100);

    // Tartalompanel kik�r�se:
    Container cp = getContentPane();
    // Tartalompanel elrendez�smenedzser�nek be�ll�t�sa:
    cp.setLayout(new FlowLayout());

    // Komponensek l�trehoz�sa:
    lbInfo = new JLabel("D�ntsd el:");
    btOk = new JButton("OK");
    btNemOk = new JButton("Nem OK");

    // Komponensek beilleszt�se a tartalompanelbe:
    cp.add(lbInfo);
    cp.add(btOk);
    cp.add(btNemOk);

    // A keret l�that�v� t�tele:
    setVisible(true);
  }
}

public class FrameTest2 {
  public static void main (String args[]) {
    // A komponensekkel tele keret l�trehoz�sa:
    new SpecFrame();
  } // main
} // FrameTest2
