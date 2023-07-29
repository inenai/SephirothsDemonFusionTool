package frontera;

import java.util.Set;

import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import reusableModels.DemonComboBoxModel;
import reusableModels.DemonWrapper;
import dominio.Demon;
import dominio.Fusion;

public class ReverseModel {

	public DemonComboBoxModel demonComboBox;
	public FusionsTableModel tableModel;
	private DefaultListSelectionModel tableSelectionModel;
	private Set<?> resFusionSet;
	
	public ReverseModel(){
		this.demonComboBox = new DemonComboBoxModel(DemonComboBoxModel.TWOWAYONLY,DemonComboBoxModel.BASICONLY);
		this.resFusionSet = Fusion.getReverseModeFor(((DemonWrapper)this.demonComboBox.getSelectedItem()).getDemon());
		this.tableModel = new FusionsTableModel();
		this.tableSelectionModel = new DefaultListSelectionModel();
		this.tableSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
	
	public class FusionsTableModel extends DefaultTableModel {
		private static final long serialVersionUID = -1760211101043253866L;

		public int getColumnCount() {
			return 1;
		}

		public int getRowCount() {
			return resFusionSet.size();
		}

		@Override
		public String getColumnName(final int col) {
			switch (col) {
			case 0:
				return "Possible fusion combinations";
			default:
				throw new IllegalArgumentException();
			}
		}

		public String getValueAt(final int row, final int col) {
			switch (col) {
			case 0:
				return " "+ReverseModel.this.resFusionSet.toArray()[row].toString(); 
			default:
				throw new IllegalArgumentException();
			}
		}

		@Override
		public Class<?> getColumnClass(final int c) {
				return String.class;
			}
		
		public boolean isCellEditable(int row, int col)
        { 
			return false; 
        }
	}
	
	public FusionsTableModel getTableModel(){
		return this.tableModel;
	}
	
	public DefaultListSelectionModel getTableSelectionModel(){
		return this.tableSelectionModel;
	}
	
	public void updateFusResults(){
		this.resFusionSet = Fusion.getReverseModeFor(((DemonWrapper)this.demonComboBox.getSelectedItem()).getDemon());
	}
	
	public void showReverseModeFor(Demon demon){
		DemonWrapper wrap = new DemonWrapper(demon);
		this.demonComboBox.setSelectedItem(wrap);
	}
	
	
}
