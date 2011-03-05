import java.net.URL;
import java.io.*;
import java.net.*;

public class NonblockingCharacterIterator {
	public NonblockingCharacterIterator() {

	}
	@SuppressWarnings("deprecation")
	final static int size=1024;
	public static void
	fileUrl(String fAddress, String localFileName, String destinationDir) {
		OutputStream outStream = null;
		URLConnection  uCon = null;

		InputStream is = null;
		try {
			URL Url;
			byte[] buf;
			int ByteRead,ByteWritten=0;
			Url= new URL(fAddress);
			outStream = new BufferedOutputStream(new
					FileOutputStream(destinationDir+"\\"+localFileName));

			uCon = Url.openConnection();
			is = uCon.getInputStream();
			buf = new byte[size];
			while ((ByteRead = is.read(buf)) != -1) {
				outStream.write(buf, 0, ByteRead);
				ByteWritten += ByteRead;
			}
			System.out.println("Downloaded Successfully.");
			System.out.println("File name:\""+localFileName+ "\"\nNo ofbytes :" + ByteWritten);
			String ext = checkext(destinationDir+"\\"+localFileName);
			System.out.println("Extension is: "+ext);

			/*if(ext != "jar"){
				System.out.println("do zip stuff");
				if(ext == "zip"){
					System.out.println("do zip stuff");
					StatelessMutexAction.unzipthefile(destinationDir+"\\"+localFileName);
					
				}
			}*/
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				is.close();
				outStream.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}}}
	public static void fileDownload(String fAddress, String destinationDir)
	{

		int slashIndex =fAddress.lastIndexOf('/');
		int periodIndex =fAddress.lastIndexOf('.');

		String fileName=fAddress.substring(slashIndex + 1);

		if (periodIndex >=1 &&  slashIndex >= 0 && slashIndex < fAddress.length()-1)
		{
			fileUrl(fAddress,fileName,destinationDir);
			
		}
		else
		{
			System.err.println("path or file name.");
		}}
	
	public static boolean checkdir(String dir)
	{
	 File file=new File(dir);
	    boolean exists = file.exists();
	    if (!exists) {
	      // It returns false if File or directory does not exist
	      System.out.println("the file or directory you are searching does not exist : " + exists);
	        return false;
	    }else{
	      // It returns true if File or directory exists
	      System.out.println("the file or directory you are searching does exist : " + exists);
	      return true;
	    }
	}
	public static String checkext(String file){
	File f = new File(file);
	String name = f.getName();
	int pos = name.lastIndexOf('.');
	String ext = name.substring(pos);
	 //System.out.println(ext);
return ext;
	}
}