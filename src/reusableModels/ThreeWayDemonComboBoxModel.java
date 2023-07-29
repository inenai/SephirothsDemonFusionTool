package reusableModels;

import java.util.Comparator;
import java.util.EventListener;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.EventListenerList;

import dominio.ThreeWayFusion;

public class ThreeWayDemonComboBoxModel extends DefaultComboBoxModel  {
	private static final long serialVersionUID = 8230978072748807543L;
	
	public ThreeWayDemonComboBoxModel(){
		this.listenerList = new EventListenerList();
		Set<ThreeWayFusion> set = new TreeSet<ThreeWayFusion>(new Comparator<ThreeWayFusion>(){
			@Override
			public int compare(ThreeWayFusion o1, ThreeWayFusion o2) {
				return o1.getResult().compareTo(o2.getResult());
			}
		});
		for(ThreeWayFusion iteratedFusion : ThreeWayFusion.values()){
			set.add(iteratedFusion);
		}
		for (ThreeWayFusion iteratedFusion : set){
			this.addElement(new DemonWrapper(iteratedFusion.getResult()));
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
		return ((DemonWrapper)this.getSelectedItem()).getDemon().getLevel();
	}
	
}
