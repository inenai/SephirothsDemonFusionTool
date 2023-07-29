package frontera;

import dominio.Demon;

public class Control {
	
	ReverseModel reverseModel;
	ThreeWayModel threeWayModel;
	MainView main;

	public Control(MainView main, ReverseModel reverseModel,ThreeWayModel threeWayModel){
		this.main = main;
		this.reverseModel = reverseModel;
		this.threeWayModel = threeWayModel;
	}
	
	public void showReverseModeFor(Demon demon){
		reverseModel.showReverseModeFor(demon);
	}
	
	public void showReverseModeTab(){
		this.main.showReverseModeTab();
	}

	public void showThreeWayReverseModeFor(Demon demon) {
		threeWayModel.showThreeWayReverseModeFor(demon);	
	}

	public void showThreeWayTab() {
		this.main.showThreeWayTab();
	}
}
