import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import libreriasexamen.InterfazGrapica;
public class usuario extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazGrapica interfaz = new InterfazGrapica();
                interfaz.setVisible(true);
            }
        });
    }
}

