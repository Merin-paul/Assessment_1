package com.lockedMe.assessment;

import java.io.*;
import java.util.*;

public class FileSearch2 {

	int flag;
	
	protected void SearchFile() throws IOException {
		FileSearch2 fs = new FileSearch2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file to be searched.. ");
		String name = scan.nextLine();
		fs.findFile(name, new File("C:\\Merin\\"));
	}

	public void findFile(String name, File file1) throws IOException {
		File[] list = file1.listFiles();
		if (list != null) {
			for (File file2 : list) {
				String loc = "C:\\Merin\\";
				loc = loc + name;
				File finaLoc = new File(loc);
				if ((finaLoc.compareTo(file2)) == 0) {
					this.flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("File Found");
			} else {
				System.out.println("File not Found");
			}

		}

	}

}
