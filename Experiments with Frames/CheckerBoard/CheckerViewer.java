import javax.swing.JFrame;


public class CheckerViewer {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(425, 450);
		frame.setTitle("Hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckerComponent component = new CheckerComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}
