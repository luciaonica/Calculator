
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame{

	CalculatorFrame(){
		
		this.add(new CalculatorPanel());
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setSize(300,300);
		
	}

}