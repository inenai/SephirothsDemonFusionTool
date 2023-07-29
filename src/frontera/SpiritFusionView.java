package frontera;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class SpiritFusionView extends JPanel {
	private static final long serialVersionUID = -5261238174873417219L;

	SpiritFusionModel model;
	
	public SpiritFusionView (SpiritFusionModel visualModel){
		this.model = visualModel;
		final GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		final GridBagConstraints c = new GridBagConstraints();
		
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
			}
		}
		resultsTable.setFillsViewportHeight(true);
		resultsTable.setSelectionModel(this.model.getTableSelectionModel());
		final JScrollPane scrollPaneTable = new JScrollPane(resultsTable);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.BOTH;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 1;
		c.weighty = 1;
		this.add(scrollPaneTable,c);
	}
}
