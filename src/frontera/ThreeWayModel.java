package frontera;

import java.util.Set;

import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import reusableModels.DemonWrapper;
import reusableModels.ThreeWayDemonComboBoxModel;
import reusableModels.ThreeWayFusionWrapper;
import dominio.Demon;
import dominio.ThreeWayFusion;

public class ThreeWayModel {

	public ThreeWayDemonComboBoxModel threeWayDemonComboBox;
	public FusionsTableModel tableModel;
	private DefaultListSelectionModel tableSelectionModel;
	private Set<ThreeWayFusion> resFusionSet;
	
	public ThreeWayModel(){
		this.threeWayDemonComboBox = new ThreeWayDemonComboBoxModel();
		this.resFusionSet = ThreeWayFusion.getThreeWayReverseModeFor(((DemonWrapper)this.threeWayDemonComboBox.getSelectedItem()).getDemon());
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

		public ThreeWayFusionWrapper getValueAt(final int row, final int col) {
			switch (col) {
			case 0:
				return new ThreeWayFusionWrapper((ThreeWayFusion)ThreeWayModel.this.resFusionSet.toArray()[row]); 
			default:
				throw new IllegalArgumentException();
			}
		}

		@Override
		public Class<?> getColumnClass(final int c) {
				return ThreeWayFusionWrapper.class;
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
		this.resFusionSet = ThreeWayFusion.getThreeWayReverseModeFor(((DemonWrapper)this.threeWayDemonComboBox.getSelectedItem()).getDemon());
	}
	
	public void showThreeWayReverseModeFor(Demon demon){
		this.threeWayDemonComboBox.setSelectedItem(new DemonWrapper(demon));
	}

}
