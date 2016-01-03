package de.cassini.jcms.plenum.bingo;

import java.io.File;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.converters.FileConverter;

public class BingoGenerator {

	// possible command line parameters
	
	@Parameter(
			names={"-f", "--file"}, 
			description="file with bingo values; if omitted, uses the built-in list", 
			converter=FileConverter.class)
	private File bingoValuesFile;
	
	@Parameter(
			names={"-l", "--layout"},
			description="file with the xslt/fop layout; if omitted, uses the built-in layout file",
			converter=FileConverter.class
			)
	private File fopFile;
	
	@Parameter(
			names={"-h", "--help"},
			help=true)
	private boolean help;
	
	@Parameter(
			names={"-n", "--number"},
			description="number of Bingo cards generated; default 10")
	private int numCards = 10;

	public BingoGenerator() {
		
	}
	
	
	public static void main(String[] args) {
		
		BingoGenerator bingo = new BingoGenerator();
		
		JCommander cliParser = new JCommander(bingo, args);

		
		
		if( bingo.help ) {
			cliParser.usage();
		}
		
		System.exit(0);
	}
}
