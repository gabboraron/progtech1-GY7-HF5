/*
 * Mintaprogramok/6. fejezet
 * FlowLayoutTest.java
 *
 * Angster Erzs�bet: OO tervez�s �s programoz�s, Java II. k�tet
 * 2002.09.01.
 * M�dos�tva: 2015.10.19.
 */

import java.awt.*;
import javax.swing.*;

public class FlowLayoutTest extends JFrame {
  private Container cp = getContentPane();

  public FlowLayoutTest() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("FlowLayout");
    LayoutManager lm = new FlowLayout();                   //1
    cp.setLayout(lm);                                      //2
    for (int i=1; i<=10; i++) {
      cp.add(new JTextField(5));
      cp.add(new JButton("Gomb "+i));
    }
    setSize(700,150);
    setVisible(true);
  }

  public static void main (String args[]) {
    new FlowLayoutTest();
  }
}
