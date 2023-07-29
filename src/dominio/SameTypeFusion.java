package dominio;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public enum SameTypeFusion {
	
	AVIAN(DemonType.AVIAN,Demon.AEROS),
	BEAST(DemonType.BEAST,Demon.AEROS),
	BRUTE(DemonType.BRUTE,Demon.ERTHYS),
	DIVINE(DemonType.DIVINE,Demon.AEROS),
	DRAGON(DemonType.DRAGON,Demon.AQUANS),
	EARTHSPIRIT(DemonType.EARTHSPIRIT,Demon.ERTHYS),
	FAIRY(DemonType.FAIRY,Demon.AEROS),
	FALLENANGEL(DemonType.FALLENANGEL,Demon.ERTHYS),
	FEMME(DemonType.FEMME,Demon.AQUANS),
	GODLYBEAST(DemonType.GODLYBEAST,Demon.FLAMIES),
	HOLYBEAST(DemonType.HOLYBEAST,Demon.FLAMIES),
	MOTHEREARTH(DemonType.MOTHEREARTH,Demon.ERTHYS),
	NOCTURNUS(DemonType.NOCTURNUS,Demon.ERTHYS),
	SNAKE(DemonType.SNAKE,Demon.AQUANS),
	WILDBIRD(DemonType.WILDBIRD,Demon.AEROS),
	WILDER(DemonType.WILDER,Demon.AEROS),
	YOMA(DemonType.YOMA,Demon.AQUANS);
	
	DemonType demonType;
	Demon resultDemon;
	
	private SameTypeFusion(DemonType type, Demon demon){
		this.demonType = type;
		this.resultDemon = demon;
	}
	
	public static Demon sameTypeFusion(DemonType type) {
		if ((type.equals(DemonType.GODLYBEAST))||
				(type.equals(DemonType.HOLYBEAST)))
			return Demon.FLAMIES;
		if ((type.equals(DemonType.AVIAN))||
				(type.equals(DemonType.BEAST))||
				(type.equals(DemonType.DIVINE))||
				(type.equals(DemonType.FAIRY))||
				(type.equals(DemonType.WILDBIRD))||
				(type.equals(DemonType.WILDER)))
			return Demon.AEROS;
		if ((type.equals(DemonType.BRUTE))||
				(type.equals(DemonType.EARTHSPIRIT))||
				(type.equals(DemonType.FALLENANGEL))||
				(type.equals(DemonType.MOTHEREARTH))||
				(type.equals(DemonType.NOCTURNUS)))
			return Demon.ERTHYS;
		if ((type.equals(DemonType.DRAGON))||
				(type.equals(DemonType.FEMME))||
				(type.equals(DemonType.SNAKE))||
				(type.equals(DemonType.YOMA)))
			return Demon.AQUANS;
		return null;
	}
	
	public DemonType getType(){
		return this.demonType;
	}
	
	public Demon getResultDemon(){
		return this.resultDemon;
	}
	
	@Override
	public String toString(){
		return this.getType().getName()+" + "+this.getType().getName();
	}
	
	public static Set<SameTypeFusion> getReverseMode(Demon demon){
		Set<SameTypeFusion> set = new TreeSet<SameTypeFusion> (new Comparator<SameTypeFusion>(){
			@Override
			public int compare(SameTypeFusion o1, SameTypeFusion o2) {
				return o1.getType().getName().compareTo(o2.getType().getName());
			}
		});
		for (SameTypeFusion iteratedSameTypeFusion : SameTypeFusion.values()){
			if (iteratedSameTypeFusion.resultDemon.equals(demon))
				set.add(iteratedSameTypeFusion);
		}
		return set;
	}
}
