package com.lockedMe.assessment;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileSorting {

	protected void fileNameDisp() {
		
		
		// Enter the required directory  eg. "C:\\Newfolder\\"
		File fileDir = new File("C:\\Merin\\");
		if (fileDir.isDirectory()) {
			List<String> listFile = Arrays.asList(fileDir.list());
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting the file names in ascending order");
			System.out.println(" ");
			for (String s : listFile) {
				System.out.println("\t \t"+s);
			}
		} else {
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}

	}
}
