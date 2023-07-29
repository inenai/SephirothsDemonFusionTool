package frontera;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

import dominio.DemonType;
import frontera.ReferenceModel.SelectionChangedListener;

public class ReferenceView extends JPanel {
	private static final long serialVersionUID = 1438619208434371723L;

	ReferenceModel model;
	JLabel allignment;

	public ReferenceView(ReferenceModel visualModel) {

		this.model = visualModel;
		final GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		final GridBagConstraints c = new GridBagConstraints();
		this.model.updateSelectedFamilyDemonList();

		JLabel selectFamily = new JLabel("Demon family:");
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(6, 2, 2, 10);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(selectFamily, c);

		JComboBox typeCombo = new JComboBox();
		typeCombo.setModel(this.model.demonTypesComboBoxModel);
		this.model.demonTypesComboBoxModel.addSelectionChangedListener(new SelectionChangedListener(){
			@Override
			public void selectionHasChanged() {
				ReferenceView.this.remove(allignment);
				allignment = ((DemonType)ReferenceView.this.model.demonTypesComboBoxModel.getSelectedItem()).getAlignment().toLabel();
				c.gridx = 2;
				c.gridy = 0;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(6, 10, 2, 2);
				c.anchor = GridBagConstraints.NORTHWEST;
				c.weightx = 0;
				c.weighty = 0;
				ReferenceView.this.add(allignment, c);
				ReferenceView.this.model.updateSelectedFamilyDemonList();
				ReferenceView.this.model.getTableModel().fireTableDataChanged();
				ReferenceView.this.validate();
				ReferenceView.this.repaint();
			}
		});
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(typeCombo, c);
		
		allignment = ((DemonType)this.model.demonTypesComboBoxModel.getSelectedItem()).getAlignment().toLabel();
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(6, 10, 2, 2);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(allignment, c);
		
		final JTable resultsTable = new JTable(this.model.getTableModel());
		TableColumn column = null;
		for (int i = 0; i < resultsTable.getColumnCount(); i++) {
			column = resultsTable.getColumnModel().getColumn(i);
			if (i == 0) {
				column.setPreferredWidth(85);
				DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
				renderer.setHorizontalAlignment(JLabel.CENTER);
				column.setCellRenderer(renderer);
			} else 
			if (i == 2) {
				column.setPreferredWidth(65);
			} else {
				column.setPreferredWidth(500);
			}
		}
		resultsTable.setRowHeight(40);
		
		resultsTable.setFillsViewportHeight(true);
		resultsTable.setSelectionModel(this.model.getTableSelectionModel());
		final JScrollPane scrollPaneTable = new JScrollPane(resultsTable);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		c.gridheight = 1;
		c.fill = GridBagConstraints.BOTH;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.CENTER;
		c.weightx = 1;
		c.weighty = 1;
		this.add(scrollPaneTable, c);
		
		JButton reverseMode = new JButton(this.model.actionReverseMode);
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 2;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTHEAST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(reverseMode, c);
	}
}
