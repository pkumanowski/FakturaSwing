import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;

public class Okno extends JFrame {
	Kontrahent kontrahent;
	private JList<Faktura> lista;
	
	
	public Okno(int w, int h, String title, Kontrahent k) {
		kontrahent = k;
		setSize(w, h);
		setTitle(title);
		
		JComponent pk = przygotujPanelKontrahenta();
		pk.setPreferredSize(new Dimension(w/2, h));
		pk.setBackground(Color.YELLOW);
		JComponent pf = przygotujPanelFaktur(w/2,h);
		//ps.setPreferredSize(new Dimension(w/2, h));
		pf.setBackground(Color.RED);
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(pk);
		getContentPane().add(pf);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
