package de.cassini.jcms.plenum.bingo;

import com.beust.jcommander.JCommander;

public class BingoGenerator {

	public static void main(String[] args) {
		
		BingoCliParams bingoParams = new BingoCliParams();
		
		JCommander cliParser = new JCommander(bingoParams, args);

		if( bingoParams.isHelp() ) {
			cliParser.usage();
		}
		
		System.exit(0);
	}
}
