package reusableModels;

import dominio.ThreeWayFusion;

public class ThreeWayFusionWrapper {

	ThreeWayFusion fusion;
	
	public ThreeWayFusionWrapper(ThreeWayFusion fusion){
		this.fusion = fusion;
	}
	
	@Override
	public String toString(){
		return this.fusion.getFusionDesc();
	}
	           
	public ThreeWayFusion getFusion(){
		return this.fusion;
	}
	
}
