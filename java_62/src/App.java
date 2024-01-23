import javax.swing.*;

public class App extends JFrame {

  JButton[] bt = new JButton[9];
  boolean xo = false;

  public App() {
    setVisible(true);
    setTitle("Jogo da Velha");
    setDefaultCloseOperation(3);
    setLayout(null);
    setBounds(500, 300, 700, 500);
    int cont = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        bt[cont] = new JButton();
        add(bt[cont]);
        bt[cont].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
        cont++;
      }
    }
    bt[0].addActionListener(
        new java.awt.event.ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
            mudar();
          }
        }
      );
  }

  public void mudar() {
    if (xo) {
      xo = false;
    } else {
      xo = true;
    }
  }

  public static void main(String[] args) throws Exception {
    new App();
  }
}
