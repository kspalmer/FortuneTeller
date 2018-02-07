package imageSupport;

/**
 * The Astro class
 * Instance made up of five String fields: 
 *    astroName       - the sign name
 *    astroLikes      - Likes associated with the sign
 *    astroDislikes   - Dislikes associated with the sign
 *    astroStrengths  - Strengths associated with the sign
 *    astroWeaknesses - Weaknesses associated with the sign
 * @author Karen Palmer
 *
 */
public class Astro 
{
	private String astroName;
	private String astroLikes;
	private String astroDislikes;
	private String astroStrengths;
	private String astroWeaknesses;

	// a default constructor
	Astro() 
	{
		astroName       = "No Astro";
		astroLikes      = "N/A";
		astroDislikes   = "N/A";
		astroStrengths  = "N/A";
		astroWeaknesses = "N/A";
	}

	// specified constructor
	Astro(String a, String s, String w, String l, String d)
	{
		astroName        = a;
		astroStrengths   = s;
		astroWeaknesses  = w;
		astroLikes       = l;
		astroDislikes    = d;
	}

	// construct an object from an object (copy constructor)
	Astro(Astro newAstro)
	{
		astroName        = newAstro.astroName;
		astroLikes       = newAstro.astroLikes;
		astroDislikes    = newAstro.astroDislikes;
		astroStrengths   = newAstro.astroStrengths;
		astroWeaknesses  = newAstro.astroWeaknesses;
	}

	/**
	 * Updater method
	 * @param a - String input with the sign name
	 */
	public void setAstroName(String a)         { astroName  = a; }
	
	/**
	 * Accessor method
	 * @return - String of the sign name
	 */
	public String getAstroName()               { return astroName; }

	/**
	 * Updater method
	 * @param l - String input with the Likes associated with the sign
	 */
	public void setAstroLikes(String l)        { astroLikes  = l; }
	
	/**
	 * Accessor method
	 * @return - String of the Likes associated with the sign
	 */
	public String getAstroLikes()              { return astroLikes; }

	/**
	 * Updater method
	 * @param d - String input with the Dislikes associated with the sign
	 */
	public void setAstroDislikes(String d)     { astroDislikes  = d; }
	
	/**
	 * Accessor method
	 * @return - String of the Dislikes associated with the sign
	 */
	public String getAstroDislikes()           { return astroDislikes; }

	/**
	 * Updater method
	 * @param s - String input with the Strengths associated with the sign
	 */
	public void setAstroStrengths(String s)    { astroStrengths  = s; }
	
	/**
	 * Accessor method
	 * @return - String of the Strengths associated with the sign
	 */
	public String getAstroStrengths()          { return astroStrengths; }

	/**
	 * Updater method
	 * @param a - String input with the Weaknesses associated with the sign
	 */
	public void setAstroWeaknesses(String w)   { astroWeaknesses  = w; }
	
	/**
	 * Accessor method
	 * @return - String of the Weaknesses associated with the sign
	 */
	public String getAstroWeaknesses()         { return astroWeaknesses; }

	/**
	 * Compares two Astro objects
	 * @param obj - Astro object input
	 * @return - boolean - true if objects match, false if objects do not match
	 */
	public boolean equals(Object obj) 
	{
		Astro other = (Astro) obj;
		if (!astroName.equals(other.astroName))
			return false;
		if (!astroLikes.equals(other.astroLikes))
			return false;
		if (!astroDislikes.equals(other.astroDislikes))
			return false;
		if (!astroStrengths.equals(other.astroStrengths))
			return false;
		if (!astroWeaknesses.equals(other.astroWeaknesses))
			return false;
		return true;
	}

	/**
	 * Create a deep copy of an Astro object
	 * @param obj - an Astro object
	 * @return - a copy of the Astro object
	 */
	public Object copy(Object obj) 
	{
		Astro other = (Astro) obj;
		other.astroName        = astroName;
		other.astroLikes       = astroLikes;
		other.astroDislikes    = astroDislikes;
		other.astroStrengths   = astroStrengths;
		other.astroWeaknesses  = astroWeaknesses;
		return other;
	}

}
