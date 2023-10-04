package marcoborderlayout;
import javax.swing.JFrame;

/**
 *
 * @author maryse
 */
public class DemoBorderLayout {

    public static void main(String args[]) {
        MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
        marcoBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBorderLayout.setSize(375, 200); // establece el tamaño del marco
        marcoBorderLayout.setVisible(true); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase DemoBorderLayout
