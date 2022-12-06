import java.awt.*;
import java.awt.event.*;
public class keyboardEventHandle extends Frame implements KeyListener  {
	
	Label label;
	TextArea textarea;
	keyboardEventHandle(){
		label = new Label();
		label.setBounds(140,60,110,20);
		
		textarea = new TextArea();
		textarea.setBounds(20, 100, 360, 280);
		textarea.addKeyListener(this);
		
		add(label);
		add(textarea);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public void keyPressed(KeyEvent e) {
		label.setText("Some Key Pressed");
	}
	public void keyReleased(KeyEvent e) {
		label.setText("Some Key Typed");
		
	}
	public void keyTyped(KeyEvent e) {
		label.setText("Some Key Typed");
		
	}
	public static void main(String[] args) {
		new keyboardEventHandle();

	}

}
