package frontera;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import reusableModels.DemonTypesComboBoxModel;
import dominio.Demon;
import dominio.DemonType;

public class ReferenceModel {

	public DemonTypesComboBoxModel demonTypesComboBoxModel;
	public FamilyTableModel tableModel;
	public AbstractAction actionReverseMode;
	private DefaultListSelectionModel tableSelectionModel;
	private List<Demon> selectedFamilyDemonList;
	public final Control controller;

	public ReferenceModel(Control controller) {
		this.controller = controller;
		this.demonTypesComboBoxModel = new DemonTypesComboBoxModel(true);
		this.selectedFamilyDemonList = new ArrayList<Demon>();
		this.tableModel = new FamilyTableModel();
		this.tableSelectionModel = new DefaultListSelectionModel();
		this.tableSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.actionReverseMode = new AbstractAction("Get reverse mode"){
			private static final long serialVersionUID = 1L;
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				if(!ReferenceModel.this.tableSelectionModel.isSelectionEmpty()){
					if (((Demon)ReferenceModel.this.tableModel.getValueAt(ReferenceModel.this.tableSelectionModel.getLeadSelectionIndex(),1)).getFusionMode() == 2)
					{
						ReferenceModel.this.controller.showReverseModeFor((Demon)ReferenceModel.this.tableModel.getValueAt(ReferenceModel.this.tableSelectionModel.getLeadSelectionIndex(), 1));
						ReferenceModel.this.controller.showReverseModeTab();
					} else {
						if (((Demon)ReferenceModel.this.tableModel.getValueAt(ReferenceModel.this.tableSelectionModel.getLeadSelectionIndex(),1)).getFusionMode() == 3)
						{
							ReferenceModel.this.controller.showThreeWayReverseModeFor((Demon)ReferenceModel.this.tableModel.getValueAt(ReferenceModel.this.tableSelectionModel.getLeadSelectionIndex(), 1));
							ReferenceModel.this.controller.showThreeWayTab();
						}
					}
				}
			}
		};
	}

	public interface SelectionChangedListener extends EventListener {
		/**
		 * Cuando cambia el tipo de producto seleccionado en el ComboBox de la
		 * ventana de altas se encarga de crear y mostrar un panel de ingreso de
		 * datos correspondiente al nuevo tipo de producto.
		 */
		void selectionHasChanged();
	}
	
	public class FamilyTableModel extends DefaultTableModel {
		private static final long serialVersionUID = -8340015430854579936L;
		
		public int getColumnCount() {
			return 3;
		}

		public int getRowCount() {
			return ReferenceModel.this.selectedFamilyDemonList.size();
		}

		@Override
		public String getColumnName(final int col) {
			switch (col) {
			case 0:
				return "Level";
			case 1:
				return "Name";
			case 2: 
				return "Icon";
			default:
				throw new IllegalArgumentException();
			}
		}

		public Object getValueAt(final int row, final int col) {
			switch (col) {
			case 0:
				if (((Demon)ReferenceModel.this.selectedFamilyDemonList.toArray()[row]).getLevel() == 0)
					return "??";
				return Integer.toString(((Demon)ReferenceModel.this.selectedFamilyDemonList.toArray()[row]).getLevel());
			case 1:
				return ((Demon)ReferenceModel.this.selectedFamilyDemonList.toArray()[row]);
			case 2:
				ClassLoader classLoader = ReferenceModel.class.getClassLoader();
				URL url= classLoader.getResource ("Images/"+((Demon)ReferenceModel.this.selectedFamilyDemonList.toArray()[row]).getName()+".png");
//nexis			String url = ("Images/"+((Demon)ReferenceModel.this.selectedFamilyDemonList.toArray()[row]).getName()+".png");
				ImageIcon image = new ImageIcon (url);
				return image;

				
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
				return Integer.class;
			case 1:
				return String.class;
			case 2:
				return ImageIcon.class;
			default:
				throw new IllegalArgumentException();
			}
		}
		
		public boolean isCellEditable(int row, int col)
        { 
			return false; 
        }

	}
	
	public void updateSelectedFamilyDemonList(){
		this.selectedFamilyDemonList.clear();
		this.selectedFamilyDemonList = Demon.getDemonsOfTheType((DemonType)this.demonTypesComboBoxModel.getSelectedItem(), true);
	}
	
	public DefaultTableModel getTableModel(){
		return this.tableModel;
	}
	
	public DefaultListSelectionModel getTableSelectionModel(){
		return this.tableSelectionModel;
	}
}
