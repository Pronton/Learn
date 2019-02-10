package Main;

import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Win win = new Win();
		win.setVisible(true);
		win.setSize(400,400);
		win.setResizable(false);
		JScrollPane jSP = new JScrollPane();
		win.setLayout(null);
		win.add(jSP);
		jSP.setBounds(100, 100, 100, 100);
		JTextArea jT= new JTextArea();
		jT.setText("Sdasdasdashdashgdjahgfjhagjsfhgjhgfajshgfhf");
		jSP.setViewportView(jT);
	}

}
