package frontera;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class MainView extends JFrame {
	private static final long serialVersionUID = 2470886968206450846L;

	Control controller;
	ReverseModel reverseModel; 
	ThreeWayModel threeWayModel;
	JTabbedPane tabbedPane;
	
	public MainView() {
		this.setTitle("Demon Fusion Tool by Sephiroth");
		final Container contentPane = this.getContentPane();

		UIManager.put("TabbedPane.contentAreaColor", 
				new javax.swing.plaf.ColorUIResource(new Color(238,238,238)));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		threeWayModel = new ThreeWayModel();
		reverseModel = new ReverseModel();
		this.controller = new Control(this,reverseModel,threeWayModel);
		
		JComponent panel0 = new FusionView(new FusionModel());
		tabbedPane.addTab("Fusion", null, panel0, "Fusion simulator");
	
		JComponent panel1 = new ReverseView(reverseModel);
		tabbedPane.addTab("Reverse mode", null, panel1,
				"How to get a certain demon by fusion");

		JComponent panel2 = new ReferenceView(new ReferenceModel(controller));
		tabbedPane.addTab("Reference", null, panel2, "Demon family reference");
		
		JComponent panel3 = new ThreeWayView(threeWayModel);
		tabbedPane.addTab("3-Way fusion", null, panel3, "List of 3-way fusions");

		JComponent panel4 = new SpiritFusionView(new SpiritFusionModel());
		tabbedPane.addTab("Spirits", null, panel4, "Spirit fusion chart");

//		ClassLoader classLoader = MainView.class.getClassLoader();
//		URL url= classLoader.getResource ("Images/Splash.jpg");
//		ImageIcon image = new ImageIcon (url);
//		JComponent panel5 = new JLabel(image);
//		tabbedPane.addTab("About", null, panel5, "About Sephiroth's Fusion Tool...");
			
		contentPane.add(tabbedPane);

		this.setPreferredSize(new Dimension(415, 325));
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public void showReverseModeTab(){
		this.tabbedPane.setSelectedIndex(1);
	}

	public void showThreeWayTab() {
		this.tabbedPane.setSelectedIndex(3);
		
	}
}
