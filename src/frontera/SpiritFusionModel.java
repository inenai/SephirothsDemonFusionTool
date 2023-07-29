package frontera;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import dominio.DemonType;


public class SpiritFusionModel {

	public SpiritFusTableModel tableModel;
	private DefaultListSelectionModel tableSelectionModel;
	private List<DemonType> demonTypeListNoSpirits;
	
	public SpiritFusionModel(){
		this.demonTypeListNoSpirits = new ArrayList<DemonType>();
		for (DemonType iteratedDemonType : DemonType.values()){
			if (!iteratedDemonType.equals(DemonType.SPIRIT))
				demonTypeListNoSpirits.add(iteratedDemonType);
		}
		this.tableModel = new SpiritFusTableModel();
		this.tableSelectionModel = new DefaultListSelectionModel();
		this.tableSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
	
	public class SpiritFusTableModel extends DefaultTableModel {
		private static final long serialVersionUID = 7277329846663461745L;

		public int getColumnCount() {
			return 5;
		}

		public int getRowCount() {
			return demonTypeListNoSpirits.size();
		}

		@Override
		public String getColumnName(final int col) {
			switch (col) {
			case 0:
				return "Family";
			case 1:
				return "Earthys";
			case 2:
				return "Aeros";
			case 3:
				return "Aquans";
			case 4:
				return "Flamies";
			default:
				throw new IllegalArgumentException();
			}
		}

		public String getValueAt(final int row, final int col) {
			switch (col) {
			case 0:
				return demonTypeListNoSpirits.get(row).toString();
			case 1:
				return demonTypeListNoSpirits.get(row).getErthys().toString();
			case 2:
				return demonTypeListNoSpirits.get(row).getAeros().toString();
			case 3:
				return demonTypeListNoSpirits.get(row).getAquans().toString();
			case 4:
				return demonTypeListNoSpirits.get(row).getFlamies().toString();
			default:
				throw new IllegalArgumentException();
			}
		}

		@Override
		public Class<?> getColumnClass(final int c) {
			switch (c) {
			case 0:
				/**
				 * Nota: Usar int.class como clase de una columna de tabla hace que tire
				 * un nullPointerException al intentar dibujarse. NO USAR! Usar Integer.class.
				 */
//				return int.class;
				return JLabel.class;
			case 1:
				return JLabel.class;
			case 2:
				return JLabel.class;
			case 3:
				return JLabel.class;
			case 4:
				return JLabel.class;
			default:
				throw new IllegalArgumentException();
			}
		}
		
		public boolean isCellEditable(int row, int col)
        { 
			return false; 
        }

	}
	
	public DefaultTableModel getTableModel(){
		return this.tableModel;
	}
	
	public DefaultListSelectionModel getTableSelectionModel(){
		return this.tableSelectionModel;
	}
	
}
