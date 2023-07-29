package reusableModels;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.EventListenerList;

import dominio.DemonType;
import frontera.ReferenceModel.SelectionChangedListener;

public class DemonTypesComboBoxModel extends DefaultComboBoxModel {
	private static final long serialVersionUID = -4969037742668854294L;

	public DemonTypesComboBoxModel(boolean includeSpiritType) {
		this.listenerList = new EventListenerList();
		Set<DemonType> sortedTypesSet = new TreeSet<DemonType>(new Comparator<DemonType>(){
			@Override
			public int compare(DemonType o1, DemonType o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (DemonType iteratedType : DemonType.values()) {
			if (!includeSpiritType){
				if (!iteratedType.equals(DemonType.SPIRIT))
				sortedTypesSet.add(iteratedType);
			} else sortedTypesSet.add(iteratedType);
		}
		for (int i = 0; i<sortedTypesSet.size();i++){
			this.addElement((DemonType)sortedTypesSet.toArray()[i]);
		}
	}

	public void setSelectedItem(final Object anObject) {
		super.setSelectedItem(anObject);
		this.fireSelectionChanged();
	}

	public void addSelectionChangedListener(final SelectionChangedListener scl) {
		this.listenerList.add(SelectionChangedListener.class, scl);
	}

	public void fireSelectionChanged() {
		final Object[] listeners = this.listenerList.getListenerList();
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == SelectionChangedListener.class) {
				((SelectionChangedListener) listeners[i + 1])
						.selectionHasChanged();
			}
		}
	}
}
