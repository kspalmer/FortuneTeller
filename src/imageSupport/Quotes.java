package imageSupport;

/**
 * The Quotes class
 * Instance made up of two String fields: quoteAuthor and quote
 * @author Karen Palmer
 *
 */
public class Quotes 
{
	private String quoteAuthor;
	private String quote;

	// a default constructor
	Quotes() 
	{
		quoteAuthor = "No Author Yet";
		quote       = "To Be or not To Be";
	}

	// specified constructor
	Quotes(String a, String q)
	{
		quoteAuthor = a;
		quote       = q;
	}

	// construct an object from an object (copy constructor)
	Quotes(Quotes newQuote)
	{
		quoteAuthor = newQuote.quoteAuthor;
		quote       = newQuote.quote;
	}

	/**
	 * Updater method
	 * @param a - String input with the Quote Author
	 */
	public void setQuoteAuthor(String a)  { quoteAuthor = a; }
	
	/**
	 * Accessor method
	 * @return - String of the Quote Author
	 */
	public String getQuoteAuthor()        { return quoteAuthor; }

	/**
	 * Updater method
	 * @param q - String input with the Quote
	 */
	public void setQuote(String q)        { quote = q; }

	/**
	 * Accessor method
	 * @return - String of the Quote
	 */
	public String getQuote()                 { return quote; }

	/**
	 * Compares two Quotes objects
	 * @param obj - Quote object input
	 * @return - boolean - true if objects match, false if objects do not match
	 */
	public boolean equals(Object obj) 
	{
		Quotes other = (Quotes) obj;
		if (!quoteAuthor.equals(other.quoteAuthor))
			return false;
		if (!quote.equals(other.quote))
			return false;
		return true;
	}

	/**
	 * Create a deep copy of a Quotes object
	 * @param obj - a Quotes object
	 * @return - a copy of the Quotes object
	 */
	public Object copy(Object obj) 
	{
		Quotes other = (Quotes) obj;
		other.quoteAuthor  = quoteAuthor;
		other.quote        = quote;
		return other;
	}


}
