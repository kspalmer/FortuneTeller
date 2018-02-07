package imageSupport;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
/**
 * This is the class that creates the graphical user interface for the Alex(3) team's
 * Fortune Teller application.
 * @author Karen Palmer
 */
public class GUI extends JFrame 
{
	private JFrame f;
	private ImageIcon picture  = new ImageIcon("randomPics/fortuneImage.png");
	private ImageIcon quotePic = new ImageIcon("randomPics/quoteImage.png");
	private JPanel buttonPanel;
	private JButton rune;
	private JButton stone;
	private JButton quote;
	private JButton astro;
	private JLabel label;
	private JPanel imagePanel;
	private JTextArea fortuneText;
	int index = 0;
	SetUpArrays     threeArrays = new SetUpArrays();
	SetUpRuneArray  runeImages  = new SetUpRuneArray();
	SetUpStoneArray stoneImages = new SetUpStoneArray();
	SetUpAstroArray astroImages = new SetUpAstroArray();

	public GUI()
	{
		super("The Fortune Teller");
		f = new JFrame("The Fortune Teller");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(675,400);
		f.setLocationRelativeTo(null);
		f.setBackground(Color.BLACK);
		f.setVisible(true);
		setLayout (new FlowLayout());

		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		buttonPanel.setBorder(BorderFactory.createLineBorder (Color.blue, 12));
		rune = new JButton ("Rune Fortune");
		buttonPanel.add(rune);
		stone = new JButton ("Stone Fortune");
		buttonPanel.add(stone);
		quote = new JButton ("Words of Wisdom");
		buttonPanel.add(quote);
		astro = new JButton ("Astro Signs");
		buttonPanel.add(astro);

		f.add(buttonPanel, BorderLayout.NORTH);

		imagePanel = new JPanel();
		imagePanel.setSize(75, 100);
		imagePanel.setBackground(Color.BLACK);
		imagePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 12));
		label = new JLabel();
		label.setIcon(picture);
		imagePanel.add(label);
		f.add(imagePanel, BorderLayout.WEST);

		JPanel fortune = new JPanel();
		fortuneText = new JTextArea(6,42);
		fortuneText.setEditable(false);
		fortuneText.setLineWrap(true);
		fortuneText.setWrapStyleWord(true);
		fortuneText.setBackground(Color.WHITE);
		fortuneText.setBorder(BorderFactory.createLineBorder (Color.black, 12));
		fortuneText.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		fortuneText.setText("       Welcome to the Fortune Teller. \n\n       Click "
				+ "on a button at the top to get started.");
		fortune.add(fortuneText);
		f.add(fortuneText, BorderLayout.CENTER);

		f.setVisible(true);

		HandlerClass handler = new HandlerClass();
		rune.addActionListener(handler);
		stone.addActionListener(handler);
		quote.addActionListener(handler);
		astro.addActionListener(handler);

	}

	/**
	 * For the Fortune Teller app, this is where the requested screen is created 
	 * in response to clicking on one of the buttons at the top of the jpanel.
	 * 
	 * @author Karen Palmer
	 *
	 */
	private class HandlerClass implements ActionListener
	{
		String whatToWrite;
		public void actionPerformed(ActionEvent event)
		{
			if (event.getActionCommand().equals("Rune Fortune"))
			{
				index = (int) (25 * Math.random());
				whatToWrite = "\n    " + threeArrays.getRunesInfo(index).getRuneName() + 
						" - \n\n    " + threeArrays.getRunesInfo(index).getRuneMean(); 
				fortuneText.setText(whatToWrite);
				fortuneText.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
				fortuneText.setBackground(Color.PINK);
				label.setIcon(runeImages.getRunePic(index));
				imagePanel.add(label);				
				f.add(imagePanel, BorderLayout.WEST);

			}
			else if (event.getActionCommand().equals("Stone Fortune"))
			{
				index = (int) (25 * Math.random());
				whatToWrite = "\n    " + threeArrays.getStonesInfo(index).getStoneName() + 
						" " + threeArrays.getStonesInfo(index).getStoneMean(); 
				fortuneText.setText(whatToWrite);
				fortuneText.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 18));
				fortuneText.setBackground(Color.GRAY);
				label.setIcon(stoneImages.getStonePic(index));
				imagePanel.add(label);				
				f.add(imagePanel, BorderLayout.WEST);
			}
			else if (event.getActionCommand().equals("Words of Wisdom"))
			{
				index = (int) (25 * Math.random());
				whatToWrite = "\n    " + threeArrays.getQuotesInfo(index).getQuoteAuthor() + 
						" said \n\n       " + threeArrays.getQuotesInfo(index).getQuote(); 
				fortuneText.setText(whatToWrite);
				fortuneText.setFont(new Font("Lucida Blackletter", Font.PLAIN, 18));
				fortuneText.setBackground(Color.LIGHT_GRAY);
				label.setIcon(quotePic);
				imagePanel.add(label);				
				f.add(imagePanel, BorderLayout.WEST);
			}
			else if (event.getActionCommand().equals("Astro Signs"))
			{
				index = (int) (12 * Math.random());
				whatToWrite = "\n    " + threeArrays.getAstroInfo(index).getAstroName() + 
						" characteristics \n\n"
						+ threeArrays.getAstroInfo(index).getAstroLikes() + "\n" 
						+ threeArrays.getAstroInfo(index).getAstroDislikes() + "\n" 
						+ threeArrays.getAstroInfo(index).getAstroStrengths() + "\n" 
						+ threeArrays.getAstroInfo(index).getAstroWeaknesses() + "\n" ; 
				fortuneText.setText(whatToWrite);
				fortuneText.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				fortuneText.setBackground(Color.ORANGE);
				label.setIcon(astroImages.getAstroPic(index));
				imagePanel.add(label);				
				f.add(imagePanel, BorderLayout.WEST);
			}
		}
	}

}
