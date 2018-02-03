package imageSupport;

import java.util.ArrayList;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SetUpStoneArray extends ArrayList<ImageIcon> {

	private ImageIcon stone01, stone02, stone03, stone04, stone05, stone06, stone07, stone08, stone09, 
	stone10, stone11, stone12, stone13, stone14, stone15, stone16, stone17, stone18, stone19, 
	stone20, stone21, stone22, stone23, stone24, stone25;
	public ArrayList<ImageIcon> stonesArray = new ArrayList<ImageIcon>(25); 


	public SetUpStoneArray()
	{
		this.setUpStoneArray();
	}

	public ArrayList<ImageIcon> setUpStoneArray()
	{
		stone01 = new ImageIcon("stones/00Amethyst.gif");
		stone02 = new ImageIcon("stones/01Aventurine.gif");
		stone03 = new ImageIcon("stones/02Aquamarine.gif");
		stone04 = new ImageIcon("stones/03Citrine.GIF");
		stone05 = new ImageIcon("stones/04Diamond.GIF");
		stone06 = new ImageIcon("stones/05Emerald.GIF");
		stone07 = new ImageIcon("stones/06Garnet.GIF");
		stone08 = new ImageIcon("stones/07Hematite.GIF");
		stone09 = new ImageIcon("stones/08Kunzite.GIF");
		stone10 = new ImageIcon("stones/09Labradorite.GIF");
		stone11 = new ImageIcon("stones/10Malachite.GIF");
		stone12 = new ImageIcon("stones/11Moonstone.GIF");
		stone13 = new ImageIcon("stones/12Obsidian.GIF");
		stone14 = new ImageIcon("stones/13Onyx.GIF");
		stone15 = new ImageIcon("stones/14Peridot.GIF");
		stone16 = new ImageIcon("stones/15Prehnite.GIF");
		stone17 = new ImageIcon("stones/16Rhodochrosite.GIF");
		stone18 = new ImageIcon("stones/17Ruby.GIF");
		stone19 = new ImageIcon("stones/18Sapphire.GIF");
		stone20 = new ImageIcon("stones/19Selenite.GIF");
		stone21 = new ImageIcon("stones/20SmokyQuartz.GIF");
		stone22 = new ImageIcon("stones/21Sodalite.GIF");
		stone23 = new ImageIcon("stones/22TigerEye.GIF");
		stone24 = new ImageIcon("stones/23Topaz.GIF");
		stone25 = new ImageIcon("stones/24Tourmaline.GIF");
		stonesArray.add(stone01);
		stonesArray.add(stone02);
		stonesArray.add(stone03);
		stonesArray.add(stone04);
		stonesArray.add(stone05);
		stonesArray.add(stone06);
		stonesArray.add(stone07);
		stonesArray.add(stone08);
		stonesArray.add(stone09);
		stonesArray.add(stone10);
		stonesArray.add(stone11);
		stonesArray.add(stone12);
		stonesArray.add(stone13);
		stonesArray.add(stone14);
		stonesArray.add(stone15);
		stonesArray.add(stone16);
		stonesArray.add(stone17);
		stonesArray.add(stone18);
		stonesArray.add(stone19);
		stonesArray.add(stone20);
		stonesArray.add(stone21);
		stonesArray.add(stone22);
		stonesArray.add(stone23);
		stonesArray.add(stone24);
		stonesArray.add(stone25);
		return stonesArray;
	}
	public ImageIcon getStonePic(int index) {
		return stonesArray.get(index);
	}
}
