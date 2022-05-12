import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileOperations {
	public static void main(String aregs[]) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. createNewFile");
		System.out.println("2. renameFile");
		System.out.println("3. appendDataToFile");
		System.out.println("4. modifyDataInFile");
		System.out.println("5. readDataFromFile");
		System.out.println("6. deleteFile");
		System.out.println("7. copyFile");
		System.out.println("8. moveFile");
		System.out.println("Enter the Choice : ");
		int choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
			createNewFile();
			break;
			
		case 2:
			renameFile();
			break;
			
		case 3:
			appendDataToFile();
			break;
			
		case 4:
			modifyDataInFile();
			break;
			
		case 5:
			readDataFromFile();
			break;
			
		case 6:
			deleteFile();
			break;
			
		case 7:
			copyFile();
			break;
			
		case 8:
			moveFile();
			break;	
		
		default:
			System.out.println("None of the OPtions");
		}
		scanner.close();
	}
	
	public static void createNewFile() throws IOException
	{
		String fname = "";
		Scanner scanner = new Scanner(System.in);
		String source = "";
		try
		{
			System.out.println("Enter the File name with path : ");
			fname = scanner.nextLine();
			System.out.println("Enter Data : ");
			source = scanner.nextLine();
		}finally {
			scanner.close();
		}
		char buffer[] = new char[source.length()];
		source.getChars(0, source.length(), buffer, 0);
		FileWriter fw = null;
		try
		{
			fw = new FileWriter(fname);
			for(int i=0; i<buffer.length; i++)
			{
				fw.write(buffer[i]);
			}
			System.out.println("Data Saved");
		}catch(Exception err)
		{
			err.printStackTrace();
		}
		finally
		{
			fw.close();
		}
	}
	
	public static void renameFile() throws IOException
	{
		System.out.println("Enter the old name with path : ");
		Scanner scanner = new Scanner(System.in);
		String oldfname = scanner.nextLine();
		System.out.println("Enter the new name with path : ");
		String newfname = scanner.nextLine();
		File oldfile = new File(oldfname);
        File newfile = new File(newfname);

          if(oldfile.renameTo(newfile)) 
          {
             System.out.println("File name changed(Rename) successfully");
          } else 
          {
             System.out.println("Rename failed");
          } 
       scanner.close();
	}
	
	  public static void appendDataToFile()
	    {
		  System.out.println("Enter the path : ");
		  Scanner scanner = new Scanner(System.in);
	      String path = scanner.nextLine();
	      System.out.println("\nEnter the data : ");  
	      String text = scanner.nextLine();

	        try {
	            FileWriter fw = new FileWriter(path, true);
	            fw.append(text);
	            fw.close();
	            System.out.println("Data inserted(append) Successfully!!");
	        }
	        catch(IOException e) {
	            System.out.println("Error occured!!");
	        }
	      scanner.close();
	    }
	  
	  public static void modifyDataInFile() throws IOException
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the path : ");
		  String filePath = sc.nextLine();
	      Scanner sc1 = new Scanner(new File(filePath));
	      StringBuffer buffer = new StringBuffer();
	      while (sc1.hasNextLine()) {
	         buffer.append(sc1.nextLine()+System.lineSeparator());
	      }
	      String fileContents = buffer.toString();
	      sc1.close();
	      System.out.println("Enter the oldline : ");
	      String oldLine = sc.nextLine();
	      System.out.println("Enter the newline : ");
	      String newLine = sc.nextLine();
	      fileContents = fileContents.replaceAll(oldLine, newLine);
	      FileWriter writer = new FileWriter(filePath);
	      System.out.println("");
	      System.out.println("new data: "+fileContents);
	      writer.append(fileContents);
	      writer.flush();
	      sc.close();
	      writer.close();
	  }
	  
	  public static void readDataFromFile() throws IOException
	    {
		     try
		     
		        {
		 		System.out.println("Enter the path : ");
				Scanner scanner = new Scanner(System.in);
				String fname = scanner.nextLine();
				scanner.close();
		        File file=new File(fname);
		        BufferedReader br=new BufferedReader(new FileReader(file));
		        String reader;
		        while((reader=br.readLine())!=null)
		            System.out.println(reader);
		        	br.close();
		        }catch(Exception err) {
		            System.out.println("File not found");
		        }
	    }
	  
	  public static void deleteFile()
	    {
			System.out.println("Enter the filename with path : ");
			Scanner scanner = new Scanner(System.in);
			String fname = scanner.nextLine();
			File file= new File(fname);
			if (file.delete()) {
				System.out.println("File deleted successfully");
			}
			else {
				System.out.println("Failed to delete the file");
			}
			scanner.close();
	    }
	  
	  public static void copyFile() throws IOException
	  {
		  FileInputStream fis = null;
	      FileOutputStream fos = null;
	      try {
	    	  int c;
	    	  System.out.println("Enter the read file name with path : ");
	    	  Scanner scanner = new Scanner(System.in);
	    	  String fname = scanner.nextLine();
	    	  System.out.println("Enter the write file name with path : ");
	    	  String fname1 = scanner.nextLine();
	    	  scanner.close();
	    	  fis = new FileInputStream(fname);
	    	  fos = new FileOutputStream(fname1);
	    	  while((c=fis.read()) != 0)
	    	  {
	    		  fos.write(c);
	    	  }
	    	  System.out.println("copied the file successfully");
	      }finally
	      {
	    	 if(fis != null)
	    	 {
	    		 fis.close();
	    	 }
	    	 if(fos != null)
	    	 {
	    		 fos.close();
	    	 }
	      }
	  }
	  
	  public static void moveFile() throws IOException
	  {
		  System.out.println("Enter the file name with path (from): ");
    	  Scanner scanner = new Scanner(System.in);
    	  String fname = scanner.nextLine();
    	  System.out.println("Enter the write file name with path (to): ");
    	  String fname1 = scanner.nextLine();
		  Path temp = Files.move
				  (Path.of(fname),
						  Path.of(fname1));
			 if(temp != null)
			 {
				 System.out.println("File renamed and moved successfully");
			 }
			 else
			 {
			     System.out.println("Failed to move the file");
			 }
			 scanner.close();
	    }
}