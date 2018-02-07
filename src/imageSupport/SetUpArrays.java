package imageSupport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The SetUpArrays class
 * 
 * This will set up the four arrays of objects for use by Karen Palmer's Fortune Teller App
 * This class reads eleven text files and creates three arrays of 25 entries each
 * Stones array - an array of Stones objects
 * Runes  array - an array of Runes objects
 * Quotes array - an array of Quotes objects
 * Astro  array - an array of Astro objects
 * 
 * @author Karen Palmer
 *
 */
public class SetUpArrays {

	Stones[] stonesInfo;
	Runes[]  runesInfo;
	Quotes[] quotesInfo;
	Astro[]  astroInfo;

	public SetUpArrays()
	{
		this.setUpArrays();
	}

	public void setUpArrays()

	{
		//   this logic will populate the stones array
		int stoneEntries = 0;

		// Set up the stones array
		stonesInfo = new Stones[25];
		for (int i = 0; i<25; i++)   stonesInfo[i] = new Stones();

		//   Set up to read the stone names and meanings file 
		String file1Name = "stonenames.txt";
		Scanner input1Stream = null;
		String file2Name = "stonemeans.txt";
		Scanner input2Stream = null;

		try
		{
			input1Stream = new Scanner(new File(file1Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file1Name);
			System.exit(0);
		}
		try
		{
			input2Stream = new Scanner(new File(file2Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file2Name);
			System.exit(0);
		}

		// Now that the files are valid and open, let's populate the array
		while (input1Stream.hasNextLine())
		{
			String line1 = input1Stream.nextLine();
			String line2 = input2Stream.nextLine();
			stonesInfo[stoneEntries].setStoneName(line1); 
			stonesInfo[stoneEntries].setStoneMean(line2);
			stoneEntries++;
		}
		// Let's now close the files
		input1Stream.close();
		input2Stream.close();

		//   this logic will populate the runes array
		int runeEntries = 0;

		// Set up the stones array
		runesInfo = new Runes[25];
		for (int i = 0; i<25; i++)   runesInfo[i] = new Runes();

		//   Set up to read the stone names and meanings file 
		String file3Name = "runenames.txt";
		Scanner input3Stream = null;
		String file4Name = "runemeans.txt";
		Scanner input4Stream = null;

		try
		{
			input3Stream = new Scanner(new File(file3Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file3Name);
			System.exit(0);
		}
		try
		{
			input4Stream = new Scanner(new File(file4Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file4Name);
			System.exit(0);
		}

		// Now that the files are valid and open, let's populate the array
		while (input3Stream.hasNextLine())
		{
			String line3  = input3Stream.nextLine();
			String line4  = input4Stream.nextLine();
			runesInfo[runeEntries].setRuneName(line3); 
			runesInfo[runeEntries].setRuneMean(line4);
			runeEntries++;
		}
		// Let's now close the files
		input3Stream.close();
		input4Stream.close();

		//   this logic will populate the quotes array
		int quoteEntries = 0;

		// Set up the quotes array
		quotesInfo = new Quotes[25];
		for (int i = 0; i<25; i++)   quotesInfo[i] = new Quotes();

		//   Set up to read the stone names and meanings file 
		String file5Name = "quoteauthors.txt";
		Scanner input5Stream = null;
		String file6Name = "quotes.txt";
		Scanner input6Stream = null;

		try
		{
			input5Stream = new Scanner(new File(file5Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file5Name);
			System.exit(0);
		}
		try
		{
			input6Stream = new Scanner(new File(file6Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file6Name);
			System.exit(0);
		}

		// Now that the files are valid and open, let's populate the array
		while (input5Stream.hasNextLine())
		{
			String line5 = input5Stream.nextLine();
			String line6 = input6Stream.nextLine();
			quotesInfo[quoteEntries].setQuoteAuthor(line5); 
			quotesInfo[quoteEntries].setQuote(line6);
			quoteEntries++;
		}
		// Let's now close the files
		input5Stream.close();
		input6Stream.close();

		//   this logic will populate the astro array
		int astroEntries = 0;

		// Set up the stones array
		astroInfo = new Astro[12];
		for (int i = 0; i<12; i++)   astroInfo[i] = new Astro();

		//   Set up to read the stone names and meanings file 
		String file7Name = "astronames.txt";
		Scanner input7Stream = null;
		String file8Name = "astrostrengths.txt";
		Scanner input8Stream = null;
		String file9Name = "astroweaknesses.txt";
		Scanner input9Stream = null;
		String fileaName = "astrolikes.txt";
		Scanner inputaStream = null;
		String filebName = "astrodislikes.txt";
		Scanner inputbStream = null;

		try
		{
			input7Stream = new Scanner(new File(file7Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file7Name);
			System.exit(0);
		}
		try
		{
			input8Stream = new Scanner(new File(file8Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file8Name);
			System.exit(0);
		}
		try
		{
			input9Stream = new Scanner(new File(file9Name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + file9Name);
			System.exit(0);
		}
		try
		{
			inputaStream = new Scanner(new File(fileaName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + fileaName);
			System.exit(0);
		}
		try
		{
			inputbStream = new Scanner(new File(filebName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + filebName);
			System.exit(0);
		}

		// Now that the files are valid and open, let's populate the array
		while (input7Stream.hasNextLine())
		{
			String line7  = input7Stream.nextLine();
			String line8  = input8Stream.nextLine();
			String line9  = input9Stream.nextLine();
			String linea  = inputaStream.nextLine();
			String lineb  = inputbStream.nextLine();
			astroInfo[astroEntries].setAstroName(line7); 
			astroInfo[astroEntries].setAstroLikes(line8);
			astroInfo[astroEntries].setAstroDislikes(line9);
			astroInfo[astroEntries].setAstroStrengths(linea);
			astroInfo[astroEntries].setAstroWeaknesses(lineb);
			astroEntries++;
		}
		// Let's now close the files
		input7Stream.close();
		input8Stream.close();
		input9Stream.close();
		inputaStream.close();
		inputbStream.close();

	}

	/**
	 * Returns information from a specific index from the StonesInfo Array
	 * 
	 * @param i - int indicating the requested index
	 * @return object of Stones class
	 */
	public Stones getStonesInfo(int i)
	{
		return stonesInfo[i];
	}

	/**
	 * Returns information from a specific index from the RunesInfo Array
	 * 
	 * @param i - int indicating the requested index
	 * @return object of Runes class
	 */
	public Runes getRunesInfo(int i)
	{
		return runesInfo[i];
	}

	/**
	 * Returns information from a specific index from the QuotesInfo Array
	 * 
	 * @param i - int indicating the requested index
	 * @return object of Quotes class
	 */
	public Quotes getQuotesInfo(int i)
	{
		return quotesInfo[i];
	}

	/**
	 * Returns information from a specific index from the AstroInfo Array
	 * 
	 * @param i - int indicating the requested index
	 * @return object of Astro class
	 */
	public Astro getAstroInfo(int i)
	{
		return astroInfo[i];
	}

}
