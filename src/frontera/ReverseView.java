package frontera;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

import reusableModels.DemonWrapper;
import reusableModels.DemonComboBoxModel.SelectionChangedListener;
import dominio.Fusion;

public class ReverseView extends JPanel {
	private static final long serialVersionUID = 2178720174736177893L;
	
	ReverseModel model;
	JLabel lblIcon;
	JLabel lblLevelRes;
	
	public ReverseView (ReverseModel visualModel){
		this.model = visualModel;
		final GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		final GridBagConstraints c = new GridBagConstraints();
		
		JLabel lblSelectDemon = new JLabel("Select a Demon:");
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 6);
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(lblSelectDemon, c);
		
		JComboBox demons = new JComboBox(ReverseView.this.model.demonComboBox);
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 6);
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(demons,c);
		
		ClassLoader classLoader = ReverseView.class.getClassLoader();
		URL url= classLoader.getResource ("Images/"+((DemonWrapper)ReverseView.this.model.demonComboBox.getSelectedItem()).getDemon().getName()+".png");
//nexis	String url = ("Images/"+((DemonWrapper)ReverseView.this.model.demonComboBox.getSelectedItem()).getDemon().getName()+".png");
		ImageIcon image = new ImageIcon (url);
		lblIcon = new JLabel(image);
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(lblIcon,c);
			
		final JTable resultsTable = new JTable(this.model.getTableModel());
		TableColumn column = null;
		for (int i = 0; i < resultsTable.getColumnCount(); i++) {
			column = resultsTable.getColumnModel().getColumn(i);
			if (i == 0) {
				column.setPreferredWidth(150);
			} else {
				DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
				renderer.setHorizontalAlignment(JLabel.CENTER);
				column.setCellRenderer(renderer);
				column.setPreferredWidth(40);
			}
		}
		resultsTable.setFillsViewportHeight(true);
		resultsTable.setSelectionModel(this.model.getTableSelectionModel());
		final JScrollPane scrollPaneTable = new JScrollPane(resultsTable);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		c.gridheight = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 250;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTH;
		c.weightx = 1;
		c.weighty = 1;
		this.add(scrollPaneTable, c);
				
		JLabel lblTotalLevel = new JLabel("Total level should be: ");
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 6);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(lblTotalLevel, c);
		
		this.lblLevelRes = new JLabel(Fusion.getLevelRange(((DemonWrapper)this.model.demonComboBox.getSelectedItem()).getDemon()));
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(this.lblLevelRes, c);
		
		this.model.demonComboBox.addSelectionChangedListener(new SelectionChangedListener(){
			@Override
			public void selectionHasChanged() {
				ReverseView.this.remove(ReverseView.this.lblIcon);
				ClassLoader classLoader = ReverseView.class.getClassLoader();
				URL url= classLoader.getResource ("Images/"+((DemonWrapper)ReverseView.this.model.demonComboBox.getSelectedItem()).getDemon().getName()+".png");
//nexis			String url = ("Images/"+((DemonWrapper)ReverseView.this.model.demonComboBox.getSelectedItem()).getDemon().getName()+".png");
				ImageIcon image = new ImageIcon (url);
				ReverseView.this.lblIcon = new JLabel(image);
				c.gridx = 2;
				c.gridy = 0;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0;
				c.weighty = 0;
				ReverseView.this.add(ReverseView.this.lblIcon,c);
				ReverseView.this.model.updateFusResults();
				ReverseView.this.model.getTableModel().fireTableDataChanged();
				ReverseView.this.remove(ReverseView.this.lblLevelRes);
				ReverseView.this.lblLevelRes = new JLabel(Fusion.getLevelRange(((DemonWrapper)ReverseView.this.model.demonComboBox.getSelectedItem()).getDemon()));
				c.gridx = 1;
				c.gridy = 2;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.NORTHWEST;
				c.weightx = 0;
				c.weighty = 0;
				ReverseView.this.add(ReverseView.this.lblLevelRes, c);
				ReverseView.this.validate();
			}
		});		
	}
	
}
