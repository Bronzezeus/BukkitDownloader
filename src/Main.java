import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import org.yaml.snakeyaml.Yaml;
//import org.yaml.snakeyaml.Util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
//import junit.framework.TestCase;

public class Main {

	private JFrame frmBukkitDownloader;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBukkitDownloader.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		if(!NonblockingCharacterIterator.checkdir("./config/")){
			 boolean status;
			 status = new File("./config/").mkdir();
			 System.out.println(status);
			 try{
				    // Create file 
				    FileWriter fstream = new FileWriter("./config/plugins.prop");
				        BufferedWriter out = new BufferedWriter(fstream);
				        URL u;
				        u = new URL("http://dl.dropbox.com/u/7737298/plugins.txt");
				        InputStream is = null;
				        DataInputStream dis;
				        String s;

				        try {
				           
				           is = u.openStream();
				           dis = new DataInputStream(new BufferedInputStream(is));
				           while ((s = dis.readLine()) != null) {
				              System.out.println(s);
				              out.write(s+""+System.getProperty("line.separator"));
				           }

				        } catch (MalformedURLException mue) {

				           System.out.println("Ouch - a MalformedURLException happened.");
				           mue.printStackTrace();
				           System.exit(1);

				        } catch (IOException ioe) {

				           System.out.println("Oops- an IOException happened.");
				           ioe.printStackTrace();
				           System.exit(1);

				        } finally {
				           try {
				              is.close();
				           } catch (IOException ioe) {
				              
				           }

				        } 
				    

				    out.close();
				    }catch (Exception e){
				      System.err.println("Error: " + e.getMessage());
				    }
		}else if(!NonblockingCharacterIterator.checkdir("./config/plugins.prop")){
			
			 try{
				    // Create file 
				    FileWriter fstream = new FileWriter("./config/plugins.prop");
				        BufferedWriter out = new BufferedWriter(fstream);
				        URL u;
				        u = new URL("http://dl.dropbox.com/u/7737298/plugins.txt");
				        InputStream is = null;
				        DataInputStream dis;
				        String s;

				        try {
				           
				           is = u.openStream();
				           dis = new DataInputStream(new BufferedInputStream(is));
				           while ((s = dis.readLine()) != null) {
				              System.out.println(s);
				              out.write(s+""+System.getProperty("line.separator"));
				           }

				        } catch (MalformedURLException mue) {

				           System.out.println("Ouch - a MalformedURLException happened.");
				           mue.printStackTrace();
				           System.exit(1);

				        } catch (IOException ioe) {

				           System.out.println("Oops- an IOException happened.");
				           ioe.printStackTrace();
				           System.exit(1);

				        } finally {
				           try {
				              is.close();
				           } catch (IOException ioe) {
				              
				           }

				        } 
				    

				    out.close();
				    }catch (Exception e){
				      System.err.println("Error: " + e.getMessage());
				    }
			}
		


		frmBukkitDownloader = new JFrame();
		frmBukkitDownloader.setTitle("Bukkit Downloader");
		frmBukkitDownloader.setBounds(100, 100, 434, 411);
		frmBukkitDownloader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBukkitDownloader.getContentPane().setLayout(new MigLayout("", "[524.00px,grow]", "[32px][41px,grow][][][][][]"));
		
		JPanel panel = new JPanel();
		frmBukkitDownloader.getContentPane().add(panel, "cell 0 0,alignx center,aligny top");
		
		JLabel lblBukkitdownload = new JLabel("Bukkit Downloader");
		lblBukkitdownload.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblBukkitdownload);
		
		JScrollPane scrollPane = new JScrollPane();
		frmBukkitDownloader.getContentPane().add(scrollPane, "flowx,cell 0 1,alignx left,growy");
		
		JLabel lblMainComponents = new JLabel("Main");
		lblMainComponents.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblMainComponents);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		frmBukkitDownloader.getContentPane().add(horizontalStrut, "cell 0 1,alignx right");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		frmBukkitDownloader.getContentPane().add(horizontalStrut_1, "cell 0 1");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		frmBukkitDownloader.getContentPane().add(horizontalStrut_2, "cell 0 1");
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		frmBukkitDownloader.getContentPane().add(horizontalStrut_3, "cell 0 1");
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		frmBukkitDownloader.getContentPane().add(horizontalStrut_4, "cell 0 1");
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		frmBukkitDownloader.getContentPane().add(horizontalStrut_5, "cell 0 1");
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		frmBukkitDownloader.getContentPane().add(horizontalStrut_6, "cell 0 1");
		JScrollPane scrollPane_1 = new JScrollPane();
		frmBukkitDownloader.getContentPane().add(scrollPane_1, "cell 0 1,growy");
		JPanel panel_2 = new JPanel();
		scrollPane_1.setViewportView(panel_2);
		Box verticalBox = Box.createVerticalBox();
		panel_2.add(verticalBox);
		
		ArrayList alkeys = new ArrayList(); 
		ArrayList alurl = new ArrayList(); 
		  
		try {
			Properties p = new Properties();
			  p.load(new FileInputStream("./config/plugins.prop"));
			  //System.out.println("user = " + p.getProperty("DBuser"));
			  //System.out.println("password = " + p.getProperty("DBpassword"));
			 // System.out.println("location = " + p.getProperty("DBlocation"));
			  //for( propertyNames()
			  for (Enumeration en = p.propertyNames(); en.hasMoreElements();) {
				   String key = (String) en.nextElement(); 
				   String location = p.getProperty(key);
				   print(key);
				   //print(location);
				   alkeys.add(key); 
				   alurl.add(location);
			  }
			  
			  //p.list(System.out);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		final String []array = new String[3];
		alkeys.toArray(array);
		final String []array2 = new String[3];
		alurl.toArray(array2);
		final JCheckBox []checkboxarray = new JCheckBox[array.length];
		for(int i = 0; i < array.length; i++){
			//JCheckBox box = new JCheckBox("Varname" + i); 
			//verticalBox.add(box);
			 checkboxarray[i] = new JCheckBox(array[i]);
			verticalBox.add(checkboxarray[i]);
			}
		Box verticalBox_1 = Box.createVerticalBox();
		panel_3.add(verticalBox_1);
		
		final JCheckBox chckbxBukkit = new JCheckBox("CraftBukkit");
		chckbxBukkit.setSelected(true);
		verticalBox_1.add(chckbxBukkit);
		
		final JCheckBox chckbxBukkit_1 = new JCheckBox("Bukkit");
		verticalBox_1.add(chckbxBukkit_1);
		
		JButton btnDownloadupdateBukkitcraftbukkit = new JButton("Download");
		frmBukkitDownloader.getContentPane().add(btnDownloadupdateBukkitcraftbukkit, "cell 0 5,alignx center");
		btnDownloadupdateBukkitcraftbukkit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//chckbxBukkit.isSelected();
				//System.out.println(  
				
				//do the main first
			/*	if(chckbxBukkit.isSelected()){
					 NonblockingCharacterIterator.fileUrl("http://ci.bukkit.org/job/dev-CraftBukkit/lastSuccessfulBuild/artifact/target/craftbukkit-0.0.1-SNAPSHOT.jar", "CraftBukkit.jar", "./");
					 }*/
				/*if(chckbxBukkit_1.isSelected()){
					 NonblockingCharacterIterator.fileUrl("http://ci.bukkit.org/job/dev-Bukkit/lastSuccessfulBuild/artifact/target/bukkit-0.0.1-SNAPSHOT.jar", "Bukkit.jar", "./");
					 }*/
				//foo();
				//if(box.isSelected()){
				for(int i = 0; i < array.length; i++){
					 print(array[i]+"="+array2[i]);
					 if(checkboxarray[i].isSelected()){
						 print("selected");
						 boolean status;
						 if(!NonblockingCharacterIterator.checkdir("./plugins/")){
							 status = new File("./plugins/").mkdir();
							    if(status){
							    	print("Making of plugins directory has succeeded");
							    }else{
							    	print("fail");
							    }
						 }
						 //int slashIndex =array2[i].lastIndexOf('/');
						 NonblockingCharacterIterator.fileUrl(array2[i], array[i]+".jar", "./plugins/");
						 print("Download done");
						 
					 }
				}
				//}
			}
		});
		btnDownloadupdateBukkitcraftbukkit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		

		
		
		

		
		
		
		//----------------------------------------------------------------------------------------------
		
		//checkboxarray[i] = new JCheckBox(checkBoxName[i]);
		
		
		
		//-----------------------------------------------------------------------------------------------------------------

		
		JLabel lblPlugins = new JLabel("Plugins");
		lblPlugins.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane_1.setColumnHeaderView(lblPlugins);
		
		JButton btnRun = new JButton("Run");
		btnRun.setEnabled(false);
		btnRun.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Process proc;
				try {
					proc = Runtime.getRuntime().exec("java -Xmx1024M -Xms1024M -jar ./craftbukkit.jar");
					InputStream in = proc.getInputStream();
					System.out.println(in);
					InputStream err = proc.getErrorStream();
					System.out.println(err);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// Then retreive the process output
//if(box.isSelected()){
					
		//		}

			}
		});
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmBukkitDownloader.getContentPane().add(btnRun, "cell 0 6,alignx center");
		btnRun.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}

	

	
	static void print(String say) {
		System.out.println(say);
	}
}


	

