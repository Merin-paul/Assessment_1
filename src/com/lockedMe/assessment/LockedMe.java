package com.lockedMe.assessment;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {
	int x;

	private void mainMenu() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"****************************************************************************************************");
		System.out.println("                    				LockedMe.com   					                              ");
		System.out.println("          				Complete File Organising solutions                                                                                ");
		System.out.println("                                                                                            ");
		System.out.println("                    					Developer   : Merin Paul                         ");
		System.out.println("                    					Designation :  Developer              ");
		System.out.println(
				"****************************************************************************************************");

	}

	private void mainMenuDisplay() {

		System.out.println("		Select any options from below ");
		System.out.println(" ");
		System.out.println("		1. Display files in ascending order from Directory ");
		System.out.println("		2. Add/Delete/Search a file from Directory ");
		System.out.println("		3. Exit Application");

	}

	private void subDisplay() {

		System.out.println("	Select 1,2 or 3 for file manipulations");
		System.out.println("	1. Add a file");
		System.out.println("	2. Delete a File ");
		System.out.println("	3. Search a file");
		System.out.println("	4. Back to Main Menu");

	}

	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("		Please Select From Options: ");
		if (scan.hasNextInt()) {
			x = scan.nextInt();
		} else {
		System.out.println(" Please enter a valid input ");
			getInput();

		}
	}

	private void mainProcess() throws IOException {
				switch (x) {
		case 1:
			FileSorting fileSort = new FileSorting();
			fileSort.fileNameDisp();
			String[] menu = null;
			main(menu);
			

		case 2:
			subProcess();

			break;
		case 3:
			closeApp();
			break;
		default:
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Please enter a valid input");
			String[] menu2 = null;
			main(menu2);
		}

	}

	private void subProcess() throws IOException {
		subDisplay();
		getInput();
		switch (x) {
		case 1:
			FileCreation createFile = new FileCreation();
			createFile.fileCreate();
			subProcess();
		case 2:
			FileDeletion fileDel = new FileDeletion();
			fileDel.delteFile();
			subProcess();
		case 3:
			FileSearch2 searchF = new FileSearch2();
			searchF.SearchFile();
			subProcess();
		case 4:
			String[] menu = null;
			main(menu);
			break;
		default:
		System.out.println(" Please enter a valid input ");
			subProcess();

		}

	}

	private void closeApp() {
		System.out.println(" Thank you for using our services-- LockedMe.com  ");
		java.lang.System.exit(0);
	}

	
	public static void main(String[] args) throws IOException {
		LockedMe disp = new LockedMe();
		disp.mainMenu();
		disp.mainMenuDisplay();
		disp.getInput();
		disp.mainProcess();
		disp.closeApp();
	}

}
