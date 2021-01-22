# Assessment_1
Assessment Project Details

Project Name:       LockedMe.com
Developer:        Merin Paul full stack java developer from CompanyLockers Pvt.Ltd




Sprint 1
•	Outlining basic program flow
•	Designing welcome screen, defining the application name and developers details.
•	Displaying main menu.
•	Displaying sub-main menu of the specified file operations.
•	User interface section to get the input from the user.
•	File sorting in ascending order.
•	Exit program to close the application.
     
     
     
     Sprint 2 
•	Development of file operations including creating a file, deleting a file, searching a file.
•	Using the user input checking the file operation and displaying the result.
•	Developing option to navigate back to the main context.
•	Testing the code and debugging.
Display invalid warning and return to file operation 
Display invalid warning and return to main menu

1.	WelcomeScreen- we have displayed the application name and developer’s name.
2.	MainMenuDisplay – Main menu will display the options to select for the operation to perform.
•	Display the files in ascending order
•	File operations
•	Application close
3.	SubMenuDisplay – user interface option to select the file operation to be performed.
•	Add File to Root Directory
•	Delete File 
•	Search file from directory
•	Return to Main Menu
4.	getInput- Using Scanner class, input is obtained from the user. Here an if condition statement is used. Received input is assigned to variable x otherwise will display warning message.
5.	MainProcess – Using switch statement input is compared with different case. 
•	Case 1 – sort the files in ascending order. For this we have created a class file handle to perform file sorting.
•	Case 2- File operations including file create, file delete, and file search. Later it returns to main menu. This is performed using switch case.
•	Case 3 – Close application.


Algorithms used
For sorting files in ascending order, Collection.sort() method have been used. Java.util.collection.sort() method is present in java.util.collection class. It is used to sort the elements present in specified list of Collection in ascending order.

For creating new file java.io.File class can be used. When we initialize file object, we provide the file name and then we call createNewFile() in java.

The delete() method of java.nio.file is used to delete the user specified file if the file is present. 

Linear search method is used to search the file in the given directory. It is a very simple search algorithm. In this type of search, a sequential search is done for all files one by one. Every file is checked and if a match is found then that particular file is returned, otherwise the search continues till the end of the file collection.
User interface is provided using scanner class. 

GitHub Repository Link
https://github.com/Merin-paul/Assessment_1



Conclusion
The application can be enhanced by extending the service to read a file or write to file. Also sorting the file in different specified order can be performed.
