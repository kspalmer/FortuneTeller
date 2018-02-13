package imageSupport;

/**
 * The Stones class
 * Instance made up of two String fields: stoneName and stoneMean
 * @author Karen Palmer
 *
 */
public class Stones 
{
	private String stoneName;
	private String stoneMean;

	// a default constructor
	Stones() 
	{
		stoneName = "No stone";
		stoneMean = "No Meaning";
	}

	// specified constructor
	Stones(String a, String q)
	{
		stoneName = a;
		stoneMean = q;
	}

	// construct an object from an object (copy constructor)
	Stones(Stones newQuote)
	{
		stoneName = newQuote.stoneName;
		stoneMean = newQuote.stoneMean;
	}

	/**
	 * Updater method
	 * @param a - String input with the Stone Name
	 */
	public void setStoneName(String a)  { stoneName = a; }
	
	/**
	 * Accessor method
	 * @return - String of the Stone Name
	 */
	public String getStoneName()        { return stoneName; }
	
	/**
	 * Updater method
	 * @param q - String input with the Stone Meaning
	 */
	public void setStoneMean(String q)  { stoneMean = q; }
	
	/**
	 * Accessor method
	 * @return - String of the Stone Meaning
	 */
	public String getStoneMean()        { return stoneMean; }

	/**
	 * Compares two Runes objects
	 * @param obj - Runes object input
	 * @return - boolean - true if objects match, false if objects do not match
	 */
	public boolean equals(Object obj) 
	{
		Stones other = (Stones) obj;
		if (!stoneName.equals(other.stoneName))
			return false;
		if (!stoneMean.equals(other.stoneMean))
			return false;
		return true;
	}

	/**
	 * Create a deep copy of a Runes object
	 * @param obj - a Runes object
	 * @return - a copy of the Runes object
	 */
	public Object copy(Object obj) 
	{
		Stones other = (Stones) obj;
		other.stoneName  = stoneName;
		other.stoneMean  = stoneMean;
		return other;
	}

}
