package reusableModels;

import dominio.Demon;

public class DemonWrapper {
	
	Demon demon;
	
	public DemonWrapper(Demon demon){
		this.demon = demon;
	}
	@Override
	public
	String toString(){
		return this.demon.getName();
	}
	public Demon getDemon(){
		return this.demon;
	}
}
