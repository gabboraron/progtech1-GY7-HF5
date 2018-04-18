/*
 * Mintaprogramok/6. fejezet
 * BorderLayoutTest.java
 *
 * Angster Erzs�bet: OO tervez�s �s programoz�s, Java II. k�tet
 * 2002.09.01.
 * M�dos�tva: 2015.10.19.
 */

import java.awt.*;
import javax.swing.*;

class BorderLayoutTest extends JFrame {
  Container cp = getContentPane();

  public BorderLayoutTest() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("BorderLayout");
    cp.setLayout(new BorderLayout(2,1));                   //1
    cp.add(new JButton("North - �szak - Fels�"),"North");
    cp.add(new JButton("South - D�l - Als�"),"South");
    cp.add(new JButton("West - Nyugat - Bal"),"West");
    cp.add(new JButton("East - Kelet - Jobb"),"East");
    cp.add(new JButton("Center - K�z�ps�"),"Center");

    setSize(450,200);
    setVisible(true);
  }

  public static void main (String args[]) {
    new BorderLayoutTest();
  }
}
