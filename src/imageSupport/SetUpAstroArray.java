package imageSupport;

import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * The SetUpAstroArray class
 * 
 * This will set up an array of ImageIcon objects for use by Karen Palmer's Fortune Teller App
 * This class moves a set of Astrology Signs into an ArrayList
 * 
 * @author Karen Palmer
 *
 */
@SuppressWarnings("serial")
public class SetUpAstroArray extends ArrayList<ImageIcon> {

	private ImageIcon astro01, astro02, astro03, astro04, astro05, astro06, 
	astro07, astro08, astro09, astro10, astro11, astro12;
	public ArrayList<ImageIcon> astroArray = new ArrayList<ImageIcon>(12); 


	public SetUpAstroArray()
	{
		this.setUpAstroArray();
	}

	public ArrayList<ImageIcon> setUpAstroArray()
	{
		astro01 = new ImageIcon("astro/01aries.GIF");
		astro02 = new ImageIcon("astro/02taurus.GIF");
		astro03 = new ImageIcon("astro/03gemini.GIF");
		astro04 = new ImageIcon("astro/04cancer.GIF");
		astro05 = new ImageIcon("astro/05leo.GIF");
		astro06 = new ImageIcon("astro/06virgo.GIF");
		astro07 = new ImageIcon("astro/07libra.GIF");
		astro08 = new ImageIcon("astro/08scorpio.GIF");
		astro09 = new ImageIcon("astro/09sagittarius.GIF");
		astro10 = new ImageIcon("astro/10capricorn.GIF");
		astro11 = new ImageIcon("astro/11aquarius.GIF");
		astro12 = new ImageIcon("astro/12pisces.GIF");
		astroArray.add(astro01);
		astroArray.add(astro02);
		astroArray.add(astro03);
		astroArray.add(astro04);
		astroArray.add(astro05);
		astroArray.add(astro06);
		astroArray.add(astro07);
		astroArray.add(astro08);
		astroArray.add(astro09);
		astroArray.add(astro10);
		astroArray.add(astro11);
		astroArray.add(astro12);
		return astroArray;
	}
	
	/**
	 * Returns an ImageIcon at a specific index from the Astro Array
	 * 
	 * @param index - int indicating the requested index
	 * @return ImageIcon of the requested Astro symbol
	 */
	public ImageIcon getAstroPic(int index) {
		return astroArray.get(index);
	}
}
