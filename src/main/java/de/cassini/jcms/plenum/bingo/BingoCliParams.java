package de.cassini.jcms.plenum.bingo;

import java.io.File;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.converters.FileConverter;

public class BingoCliParams {

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
			description="shows this help screen",
			help=true)
	private boolean help;
	
	@Parameter(
			names={"-n", "--number"},
			description="number of Bingo cards generated")
	private int numCards = 10;

	public File getBingoValuesFile() {
		return bingoValuesFile;
	}

	public File getFopFile() {
		return fopFile;
	}

	public boolean isHelp() {
		return help;
	}

	public int getNumCards() {
		return numCards;
	}

	
}
