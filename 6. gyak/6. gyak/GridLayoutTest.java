/*
 * Mintaprogramok/6. fejezet
 * GridLayoutTest.java
 *
 * Angster Erzs�bet: OO tervez�s �s programoz�s, Java II. k�tet
 * 2002.09.01.
 * M�dos�tva: 2015.10.19.
 */

import java.awt.*;
import javax.swing.*;

public class GridLayoutTest extends JFrame {
  public GridLayoutTest() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("GridLayout");
    getContentPane().setBackground(Color.RED);
    getContentPane().setLayout(new GridLayout(6,2,20,10));
    for (int i=1; i<=10; i++) {
      getContentPane().add(new JButton("Gomb "+i));   //1
    }
    pack();
    setVisible(true);
  }

  public static void main (String args[]) {
    new GridLayoutTest();
  }
}

