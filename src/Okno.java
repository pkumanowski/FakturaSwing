import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;

import com.owca.Stado;

public class Okno extends JFrame {
	Kontrahent kontrahent;
	private JList<Faktura> lista;
	
	
	public Okno(int w, int h, String title,Stado s) {
		stado = s;
		setSize(w, h);
		setTitle(title);
		
		JComponent po = przygotujPanelKontrahenta();
		po.setPreferredSize(new Dimension(w/2, h));
		po.setBackground(Color.YELLOW);
		JComponent ps = przygotujPanelFaktur(w/2,h);
		//ps.setPreferredSize(new Dimension(w/2, h));
		ps.setBackground(Color.RED);
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(po);
		getContentPane().add(ps);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
