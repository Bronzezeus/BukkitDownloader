import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JLabel;
import java.awt.Insets;


public class SimpleTransactionCollector extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleTransactionCollector frame = new SimpleTransactionCollector();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleTransactionCollector() {
		setTitle("Settings");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 177, 124);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnChangePluginSource = new JButton("Change Plugin Source");
		btnChangePluginSource.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 JFrame frame = new JFrame();
				    String result = JOptionPane.showInputDialog(frame, "Enter URL for plugin source:");
if(NonblockingCharacterIterator.checkdir("./config/")){
	//folder exists
	try{
	    // Create file 
	    FileWriter fstream = new FileWriter("./config/plugins.prop");
	        BufferedWriter out = new BufferedWriter(fstream);
	        URL u;
	        u = new URL(result);
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
}else{
	Boolean status;
	status = new File("./config/").mkdir();
	 System.out.println(status);
		try{
		    // Create file 
		    FileWriter fstream = new FileWriter("./config/plugins.prop");
		        BufferedWriter out = new BufferedWriter(fstream);
		        URL u;
		        u = new URL(result);
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
				    System.out.println(result);
			           Main.frmBukkitDownloader.setVisible(false);
			           Main.frmBukkitDownloader.dispose();
			           Main.main(null);
			}
		});
		GridBagConstraints gbc_btnChangePluginSource = new GridBagConstraints();
		gbc_btnChangePluginSource.insets = new Insets(0, 0, 5, 0);
		gbc_btnChangePluginSource.gridx = 0;
		gbc_btnChangePluginSource.gridy = 0;
		contentPane.add(btnChangePluginSource, gbc_btnChangePluginSource);
		
		JLabel lblOtherOptionsTo = new JLabel("Other options to come.");
		GridBagConstraints gbc_lblOtherOptionsTo = new GridBagConstraints();
		gbc_lblOtherOptionsTo.gridx = 0;
		gbc_lblOtherOptionsTo.gridy = 2;
		contentPane.add(lblOtherOptionsTo, gbc_lblOtherOptionsTo);
	}

}
