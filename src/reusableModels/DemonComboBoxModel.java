package reusableModels;

import java.util.Comparator;
import java.util.EventListener;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.EventListenerList;

import dominio.Demon;

public class DemonComboBoxModel extends DefaultComboBoxModel {
	private static final long serialVersionUID = -5313297518559549734L;

	public static final int BOTHWAYS = 1;
	public static final int TWOWAYONLY = 2;
	public static final int THREEWAYONLY = 3;
	public static final int BASICONLY = 4;
	public static final int INCLUDEVERSIONS = 5;
	
	public DemonComboBoxModel(int waysToInclude,int demonsToInclude) {
		this.listenerList = new EventListenerList();
		Set<DemonWrapper> sortedDemonSet = new TreeSet<DemonWrapper>(new Comparator<DemonWrapper>(){
			@Override
			public int compare(DemonWrapper o1, DemonWrapper o2) {
				return o1.demon.getName().compareTo(o2.demon.getName());
			}
		});
		switch(waysToInclude){
		case TWOWAYONLY:
			for (Demon iteratedDemon : Demon.values()) {
				if(iteratedDemon.getFusionMode() == 2){
					if (!((demonsToInclude == BASICONLY)&&(!iteratedDemon.isBasic()))){
						sortedDemonSet.add(new DemonWrapper(iteratedDemon));
					}
				}
			}
			break;	
		case THREEWAYONLY:
		
			for (Demon iteratedDemon : Demon.values()) {
				if(iteratedDemon.getFusionMode() == 3){
					if (!((demonsToInclude == BASICONLY)&&(!iteratedDemon.isBasic()))){
						sortedDemonSet.add(new DemonWrapper(iteratedDemon));
					}
				}
			}
			break;
		case BOTHWAYS:
			for (Demon iteratedDemon : Demon.values()) {
				if (iteratedDemon.getFusionMode() != 0){
					if (!((demonsToInclude == BASICONLY)&&(!iteratedDemon.isBasic()))){
						sortedDemonSet.add(new DemonWrapper(iteratedDemon));
					}
				}
			}
			break;
		}		
		for (int i = 0; i<sortedDemonSet.size();i++){
			this.addElement((DemonWrapper)sortedDemonSet.toArray()[i]);
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
	
	public interface SelectionChangedListener extends EventListener {
		void selectionHasChanged();
	}
	
	public int getSelectedDemonLevel(){
		return ((DemonWrapper)this.getSelectedItem()).demon.getLevel();
	}
}
