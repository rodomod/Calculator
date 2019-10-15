package defaults.panel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Main {
    private JFrame fr;
    public Main() {
	fr=new JFrame("Java'21'");
	fr.setSize(257,397);
	fr.add(new Panel());
	fr.setLocationRelativeTo(null);
	fr.setResizable(false);
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.setVisible(true);
    }
public static void main(String[]args) {
    SwingUtilities.invokeLater(new Runnable() { 
	@Override
	public void run() {
	    new Main();
	}
    });
}
}
