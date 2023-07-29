package frontera;

import java.awt.event.ActionEvent;
import java.util.EventListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.event.EventListenerList;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

import reusableModels.DemonComboBoxModel;
import reusableModels.DemonTypesComboBoxModel;
import reusableModels.DemonWrapper;
import dominio.Demon;
import dominio.DemonType;
import dominio.Fusion;

public class FusionModel {

	public Action actionFamily;
	public Action actionDemon;
	public Action actionFuse;
	public DemonTypesComboBoxModel typeComboBox1;
	public DemonTypesComboBoxModel typeComboBox2;
	public DemonComboBoxModel demonComboBox1;
	public DemonComboBoxModel demonComboBox2;
	public Document lvl1;
	public Document lvl2;
	public FusionMode fusionMode;
	public ResultDemon result;

	final static int FAMILY = 0;
	final static int DEMON = 1;

	public FusionModel(){
		this.typeComboBox1 = new DemonTypesComboBoxModel(false);
		this.typeComboBox2 = new DemonTypesComboBoxModel(false);
		this.demonComboBox1 = new DemonComboBoxModel(DemonComboBoxModel.BOTHWAYS,DemonComboBoxModel.BASICONLY);
		this.demonComboBox2 = new DemonComboBoxModel(DemonComboBoxModel.BOTHWAYS,DemonComboBoxModel.BASICONLY);
		this.fusionMode = new FusionMode(FusionModel.FAMILY);
		this.result = new ResultDemon();
		this.actionFamily = new AbstractAction("Fuse families"){
			private static final long serialVersionUID = 4284187253593270501L;
			@Override
			public void actionPerformed(ActionEvent e) {
				FusionModel.this.fusionMode.setFusionMode(FusionModel.FAMILY);
				FusionModel.this.fusionMode.fireFusionModeHasChanged();
			}
		};
		this.actionDemon = new AbstractAction("Fuse demons"){
			private static final long serialVersionUID = -6595058312255681423L;
			@Override
			public void actionPerformed(ActionEvent e) {
				FusionModel.this.fusionMode.setFusionMode(FusionModel.DEMON);
				FusionModel.this.fusionMode.fireFusionModeHasChanged();
			}
		};
		this.actionFuse = new AbstractAction("Fuse!"){
			private static final long serialVersionUID = 1047084648963201790L;
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					if (FusionModel.this.fusionMode.getFusionMode() == FusionModel.FAMILY){
						Demon fusResult = Fusion.fuseTypes((DemonType)FusionModel.this.typeComboBox1.getSelectedItem(),Integer.parseInt(FusionModel.this.lvl1.getText(0,FusionModel.this.lvl1.getLength())),
								(DemonType)FusionModel.this.typeComboBox2.getSelectedItem(),Integer.parseInt(FusionModel.this.lvl2.getText(0,FusionModel.this.lvl2.getLength())));
						FusionModel.this.result.setDemon(fusResult);
						FusionModel.this.result.fireResultHasChanged();
					}
					if (FusionModel.this.fusionMode.getFusionMode() == FusionModel.DEMON){
						Demon fusResult = Fusion.fuseDemons(((DemonWrapper)FusionModel.this.demonComboBox1.getSelectedItem()).getDemon(),Integer.parseInt(FusionModel.this.lvl1.getText(0,FusionModel.this.lvl1.getLength())),
								((DemonWrapper)FusionModel.this.demonComboBox2.getSelectedItem()).getDemon(),Integer.parseInt(FusionModel.this.lvl2.getText(0,FusionModel.this.lvl2.getLength())));
						FusionModel.this.result.setDemon(fusResult);
						FusionModel.this.result.fireResultHasChanged();
					}
				} catch (BadLocationException f) {
					
				} catch (NumberFormatException g) {
				
				}
			}
		};
		this.lvl1 = new PlainDocument();
		this.lvl2 = new PlainDocument();
	}
	
	class FusionMode {
		int fusionMode;
		EventListenerList listenerList;
		
		public FusionMode (int mode){
			this.listenerList = new EventListenerList();
			this.fusionMode = mode;
		}
		
		int getFusionMode(){
			return fusionMode;
		}
		
		void setFusionMode(int mode){
			this.fusionMode = mode;
		}
		
		void fireFusionModeHasChanged(){
			final Object[] listeners = this.listenerList.getListenerList();
			for (int i = listeners.length - 2; i >= 0; i -= 2) {
				if (listeners[i] == FusionModeListener.class) {
					((FusionModeListener) listeners[i + 1]).fusionModeHasChanged();
				}
			}
		}
		
		void addFusionModeListener(final FusionModeListener fml){
			this.listenerList.add(FusionModeListener.class, fml);
		}
	}
	
	interface FusionModeListener extends EventListener{
		public void fusionModeHasChanged();
	}
	
	public class ResultDemon {
		Demon resultDemon;
		EventListenerList listenerList;
		
		public ResultDemon() {
			this.listenerList = new EventListenerList();
			this.resultDemon = null;
		}

		void setDemon(Demon demon){
			this.resultDemon = demon;
		}
		
		Demon getDemon(){
			return this.resultDemon;
		}
		
		void fireResultHasChanged(){
			final Object[] listeners = this.listenerList.getListenerList();
			for (int i = listeners.length - 2; i >= 0; i -= 2) {
				if (listeners[i] == ResultListener.class) {
					((ResultListener) listeners[i + 1]).resultHasChanged();
				}
			}
		}
		
		void addResultListener(final ResultListener rl){
			this.listenerList.add(ResultListener.class, rl);
		}
	}
	
	public interface ResultListener extends EventListener {
		public void resultHasChanged();
	}
	
	public final ResultDemon getResult() {
		return result;
	}
	
}
