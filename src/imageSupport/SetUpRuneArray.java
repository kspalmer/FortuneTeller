package imageSupport;

import java.util.ArrayList;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SetUpRuneArray extends ArrayList<ImageIcon> {

	private ImageIcon rune01, rune02, rune03, rune04, rune05, rune06, rune07, rune08, rune09, 
	rune10, rune11, rune12, rune13, rune14, rune15, rune16, rune17, rune18, rune19, 
	rune20, rune21, rune22, rune23, rune24, rune25;
	public ArrayList<ImageIcon> runesArray = new ArrayList<ImageIcon>(25); 


	public SetUpRuneArray()
	{
		this.setUpRuneArray();
	}

	public ArrayList<ImageIcon> setUpRuneArray()
	{
		rune01 = new ImageIcon("runes/rune01.gif");
		rune02 = new ImageIcon("runes/rune02.gif");
		rune03 = new ImageIcon("runes/rune03.gif");
		rune04 = new ImageIcon("runes/rune04.gif");
		rune05 = new ImageIcon("runes/rune05.gif");
		rune06 = new ImageIcon("runes/rune06.gif");
		rune07 = new ImageIcon("runes/rune07.gif");
		rune08 = new ImageIcon("runes/rune08.gif");
		rune09 = new ImageIcon("runes/rune09.gif");
		rune10 = new ImageIcon("runes/rune10.gif");
		rune11 = new ImageIcon("runes/rune11.gif");
		rune12 = new ImageIcon("runes/rune12.gif");
		rune13 = new ImageIcon("runes/rune13.gif");
		rune14 = new ImageIcon("runes/rune14.gif");
		rune15 = new ImageIcon("runes/rune15.gif");
		rune16 = new ImageIcon("runes/rune16.gif");
		rune17 = new ImageIcon("runes/rune17.gif");
		rune18 = new ImageIcon("runes/rune18.gif");
		rune19 = new ImageIcon("runes/rune19.gif");
		rune20 = new ImageIcon("runes/rune20.gif");
		rune21 = new ImageIcon("runes/rune21.gif");
		rune22 = new ImageIcon("runes/rune22.gif");
		rune23 = new ImageIcon("runes/rune23.gif");
		rune24 = new ImageIcon("runes/rune24.gif");
		rune25 = new ImageIcon("runes/rune25.gif");
		runesArray.add(rune01);
		runesArray.add(rune02);
		runesArray.add(rune03);
		runesArray.add(rune04);
		runesArray.add(rune05);
		runesArray.add(rune06);
		runesArray.add(rune07);
		runesArray.add(rune08);
		runesArray.add(rune09);
		runesArray.add(rune10);
		runesArray.add(rune11);
		runesArray.add(rune12);
		runesArray.add(rune13);
		runesArray.add(rune14);
		runesArray.add(rune15);
		runesArray.add(rune16);
		runesArray.add(rune17);
		runesArray.add(rune18);
		runesArray.add(rune19);
		runesArray.add(rune20);
		runesArray.add(rune21);
		runesArray.add(rune22);
		runesArray.add(rune23);
		runesArray.add(rune24);
		runesArray.add(rune25);
		return runesArray;
	}
	public ImageIcon getRunePic(int index) {
		return runesArray.get(index);
	}
}
