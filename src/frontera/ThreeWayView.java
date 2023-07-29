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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

import reusableModels.DemonWrapper;
import reusableModels.ThreeWayDemonComboBoxModel.SelectionChangedListener;

public class ThreeWayView extends JPanel{
	private static final long serialVersionUID = -3905597708277821161L;
	ThreeWayModel model;
	JLabel lblIcon;
	JLabel lblMessage;
	
	
	public ThreeWayView(ThreeWayModel visualModel){
		
		this.model = visualModel;
		final GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		final GridBagConstraints c = new GridBagConstraints();
	
		JPanel selectionPanel = new JPanel();
		
		JLabel lblSelectDemon = new JLabel("Select a Demon:");
		selectionPanel.add(lblSelectDemon);
		JComboBox demons = new JComboBox(ThreeWayView.this.model.threeWayDemonComboBox);
		selectionPanel.add(demons,c);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 6);
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(selectionPanel,c);
		
		ClassLoader classLoader = ReverseView.class.getClassLoader();
		URL url= classLoader.getResource ("Images/"+((DemonWrapper)ThreeWayView.this.model.threeWayDemonComboBox.getSelectedItem()).getDemon().getName()+".png");
//nexis	String url = ("Images/"+((DemonWrapper)ThreeWayView.this.model.threeWayDemonComboBox.getSelectedItem()).getDemon().getName()+".png");
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
				
		JLabel lblNote = new JLabel("*Note: ");
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
		this.add(lblNote, c);
		
		this.lblMessage = new JLabel("<html><i>(Select a combination to see related notes)</i></html>");
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 2;
		c.gridheight = 1;
		c.fill = GridBagConstraints.BOTH;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(this.lblMessage, c);
		
		this.model.getTableSelectionModel().addListSelectionListener(new ListSelectionListener (){
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!ThreeWayView.this.model.getTableSelectionModel().isSelectionEmpty())
				{
					ThreeWayView.this.remove(ThreeWayView.this.lblMessage);
					ThreeWayView.this.lblMessage = new JLabel((ThreeWayView.this.model.getTableModel().getValueAt(
									ThreeWayView.this.model.getTableSelectionModel().getLeadSelectionIndex(), 0)).getFusion().getMessage());
					c.gridx = 1;
					c.gridy = 2;
					c.gridwidth = 2;
					c.gridheight = 1;
					c.fill = GridBagConstraints.BOTH;
					c.ipady = 0;
					c.ipadx = 0;
					c.insets = new Insets(2, 2, 2, 2);
					c.anchor = GridBagConstraints.NORTHWEST;
					c.weightx = 0;
					c.weighty = 0;
					ThreeWayView.this.add(ThreeWayView.this.lblMessage, c);
					ThreeWayView.this.validate();
					ThreeWayView.this.repaint();
				}
			}
		});
		
		this.model.threeWayDemonComboBox.addSelectionChangedListener(new SelectionChangedListener(){
			@Override
			public void selectionHasChanged() {
				ThreeWayView.this.remove(ThreeWayView.this.lblIcon);
				ClassLoader classLoader = ReverseView.class.getClassLoader();
				URL url= classLoader.getResource("Images/"+((DemonWrapper)ThreeWayView.this.model.threeWayDemonComboBox.getSelectedItem()).getDemon().getName()+".png");
//nexis			String url = ("Images/"+(((DemonWrapper)ThreeWayView.this.model.threeWayDemonComboBox.getSelectedItem()).getDemon().getName()+".png"));
				ImageIcon image = new ImageIcon (url);
				ThreeWayView.this.lblIcon = new JLabel(image);
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
				ThreeWayView.this.add(ThreeWayView.this.lblIcon,c);
				ThreeWayView.this.model.updateFusResults();
				ThreeWayView.this.model.getTableModel().fireTableDataChanged();
				ThreeWayView.this.remove(ThreeWayView.this.lblMessage);
				ThreeWayView.this.lblMessage = new JLabel("<html><i>(Select a combination to see related notes)</i></html>");
				c.gridx = 1;
				c.gridy = 2;
				c.gridwidth = 2;
				c.gridheight = 1;
				c.fill = GridBagConstraints.BOTH;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.NORTHWEST;
				c.weightx = 0;
				c.weighty = 0;
				ThreeWayView.this.add(ThreeWayView.this.lblMessage, c);
				ThreeWayView.this.validate();
				ThreeWayView.this.repaint();				
			}
		});		
	}
}
