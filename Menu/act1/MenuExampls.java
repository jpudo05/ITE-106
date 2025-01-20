import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuExamples {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Menu Example");
		frame.setSize(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.add(new JMenuItem("Close"));
		
		JMenu editMenu = new JMenu ("Edit");
		editMenu.add(new JMenuItem("Undo"));
		editMenu.add(new JMenuItem("Redo"));
		editMenu.add(new JMenuItem("Cut"));
		
		JMenuBar menubar = new JMenuBar();
		menubar.add(fileMenu);
		menubar.add(editMenu);
		
		JMenuItem item = new JMenuItem("Close");
		item.addActionListener(new MenuActionListener());
		fileMenu.add(item);
		
		frame.setJMenuBar(menubar);
		frame.setVisible(true);
	}
}
