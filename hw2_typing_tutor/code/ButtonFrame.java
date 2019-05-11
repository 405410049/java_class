package hw2_typing_tutor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

public class ButtonFrame extends JFrame implements KeyListener{
	private JButton [] btn;
	private final JTextArea textArea;
	private final Color init_color;
	private int cnt;
	private int press_index,last;
	private String [] btn_text;
	public ButtonFrame()
	{
		super("Typing Application");
		setResizable(false);	//將JFrame大小固定
		FlowLayout layout=new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		setLayout(layout);
		
		JLabel label=new JLabel("Type some text using you keyboard. The keys you press will be highlighted and the text will be displayed.");
		add(label);
		label=new JLabel("Note: Clicking the buttons with your mouse will not perform any action.");
		add(label);

		JPanel text_panel=new JPanel();
		FlowLayout center_layout=new FlowLayout();
		text_panel.setLayout(center_layout);
		center_layout.setAlignment(FlowLayout.CENTER);
		textArea=new JTextArea(10,62);
		textArea.setDisabledTextColor(Color.BLACK);
		text_panel.add(textArea);
		textArea.addKeyListener(this);
		add(text_panel);
		
		cnt=0;
		btn_text=new String[60];
		btn=new JButton[60];		
		btn[cnt]=new JButton("~");
		init_color=btn[0].getBackground();
		add(btn[cnt++]);
		for(int i=1;i<10;i++)
		{
			String s=Integer.toString(i);
			btn[cnt]=new JButton(s);
			add(btn[cnt++]);
		}
		btn[cnt]=new JButton("0");
		add(btn[cnt++]);
		btn[cnt]=new JButton("-");
		add(btn[cnt++]);
		btn[cnt]=new JButton("+");
		add(btn[cnt++]);
		btn[cnt]=new JButton("Backspace");
		add(btn[cnt++]);
		btn[cnt]=new JButton("Tab");
		add(btn[cnt++]);
		btn[cnt]=new JButton("Q");
		add(btn[cnt++]);
		btn[cnt]=new JButton("W");
		add(btn[cnt++]);
		btn[cnt]=new JButton("E");
		add(btn[cnt++]);
		btn[cnt]=new JButton("R");
		add(btn[cnt++]);
		btn[cnt]=new JButton("T");
		add(btn[cnt++]);
		btn[cnt]=new JButton("Y");
		add(btn[cnt++]);
		btn[cnt]=new JButton("U");
		add(btn[cnt++]);
		btn[cnt]=new JButton("I");
		add(btn[cnt++]);
		btn[cnt]=new JButton("O");
		add(btn[cnt++]);
		btn[cnt]=new JButton("P");
		add(btn[cnt++]);
		btn[cnt]=new JButton("[");
		add(btn[cnt++]);
		btn[cnt]=new JButton("]");
		add(btn[cnt++]);
		btn[cnt]=new JButton("\\");
		add(btn[cnt++]);
		btn[cnt]=new JButton("Caps");
		add(btn[cnt++]);
		btn[cnt]=new JButton("A");
		add(btn[cnt++]);
		btn[cnt]=new JButton("S");
		add(btn[cnt++]);
		btn[cnt]=new JButton("D");
		add(btn[cnt++]);
		btn[cnt]=new JButton("F");
		add(btn[cnt++]);
		btn[cnt]=new JButton("G");
		add(btn[cnt++]);
		btn[cnt]=new JButton("H");
		add(btn[cnt++]);
		btn[cnt]=new JButton("J");
		add(btn[cnt++]);
		btn[cnt]=new JButton("K");
		add(btn[cnt++]);
		btn[cnt]=new JButton("L");
		add(btn[cnt++]);
		btn[cnt]=new JButton(":");
		add(btn[cnt++]);
		btn[cnt]=new JButton("'");
		add(btn[cnt++]);
		btn[cnt]=new JButton("      Enter     ");
		add(btn[cnt++]);
		
		JPanel test=new JPanel();
		btn[cnt]=new JButton("Shift");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton("Z");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton("X");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton("C");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton("V");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton("B");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton("N");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton("M");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton(",");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton(".");
		test.add(btn[cnt++]);
		btn[cnt]=new JButton("?");
		test.add(btn[cnt++]);
		
		JPanel btn_panel=new JPanel();
		ImageIcon up=new ImageIcon(getClass().getResource("../image/up.png"));
		up.setImage(up.getImage().getScaledInstance(15,15,Image.SCALE_DEFAULT));
		btn[cnt]=new JButton(up);
		btn_text[cnt]="Up";
		test.add(btn[cnt++]);
		
		btn[cnt]=new JButton("Ctrl");
		btn_panel.add(btn[cnt++]);
		btn[cnt]=new JButton("Alt");
		btn_panel.add(btn[cnt++]);
		btn[cnt]=new JButton("                                                                                                                          ");
		btn_panel.add(btn[cnt++]);
		
		JPanel btn_panel2=new JPanel();
		ImageIcon left=new ImageIcon(getClass().getResource("../image/left.png"));
		left.setImage(left.getImage().getScaledInstance(15,15,Image.SCALE_DEFAULT));
		btn[cnt]=new JButton(left);
		btn_text[cnt]="Left";
		btn_panel2.add(btn[cnt++]);
		
		ImageIcon down=new ImageIcon(getClass().getResource("../image/down.png"));
		down.setImage(down.getImage().getScaledInstance(15,15,Image.SCALE_DEFAULT));
		btn[cnt]=new JButton(down);
		btn_text[cnt]="Down";
		btn_panel2.add(btn[cnt++]);
		
		ImageIcon right=new ImageIcon(getClass().getResource("../image/right.png"));
		right.setImage(right.getImage().getScaledInstance(15,15,Image.SCALE_DEFAULT));
		btn[cnt]=new JButton(right);
		btn_text[cnt]="Right";
		btn_panel2.add(btn[cnt++]);
		
		JPanel outer=new JPanel(new BorderLayout());
		outer.add(test,BorderLayout.NORTH);
		outer.add(btn_panel,BorderLayout.CENTER);
		outer.add(btn_panel2,BorderLayout.EAST);
		add(outer);
		
		for(int i=0;i<cnt;i++) {
			if(btn_text[i]!="Left"&&btn_text[i]!="Down"&&btn_text[i]!="Right"&&btn_text[i]!="Up")
			btn_text[i]=btn[i].getText();
			switch(btn_text[i])
			{
			case "-":
				btn_text[i]="Minus";
				break;
			case "+":
				btn_text[i]="Equals";
				break;
			case "~":
				btn_text[i]="Back Quote";
				break;
			case "[":
				btn_text[i]="Open Bracket";
				break;
			case "]":
				btn_text[i]="Close Bracket";
				break;
			case "\\":
				btn_text[i]="Back Slash";
				break;
			case "Caps":
				btn_text[i]="Caps Lock";
				break;
			case ":":
				btn_text[i]="Semicolon";
				break;
			case "'":
				btn_text[i]="Quote";
				break;
			case"      Enter     ":
				btn_text[i]="Enter";
				break;
			case ",":
				btn_text[i]="Comma";
				break;	  
			case ".":
				btn_text[i]="Period";
				break;
			case "?":
				btn_text[i]="Slash";
				break;
			case "                                                                                                                          " :
				btn_text[i]="Space";
				break;
			}	
		}
		
	}
	@Override
	public void keyPressed(KeyEvent event)
	{
		btn[last].setBackground(init_color);
		String s=KeyEvent.getKeyText(event.getKeyCode());
		for(int i=0;i<cnt;i++)
			if(s.equals(btn_text[i]))
			{
				press_index=i;
				btn[press_index].setBackground(Color.red);
				last=press_index;
				System.out.println("23");
			}
	}
	@Override
	public void keyReleased(KeyEvent event) {	
			btn[press_index].setBackground(init_color);
	}
	@Override
	public void keyTyped(KeyEvent event) {

	}
}
