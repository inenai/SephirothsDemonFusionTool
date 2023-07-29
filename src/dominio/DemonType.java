package dominio;

import reusableModels.FusResultWrapper;

public enum DemonType {

	AMATSUDEMIGOD("AmatsuDemigod",DemonAlignment.LAW,'D','D','D','D'),
	AVIAN("Avian",DemonAlignment.LAW,'D','D','D','D'),
	BEAST("Beast",DemonAlignment.NEUTRAL,'D','U','D','U'),
	BRUTE("Brute",DemonAlignment.CHAOS,'U','D','U','U'),
	DEITY("Deity",DemonAlignment.LAW,'D','D','D','D'),
	DEMIGOD("Demigod",DemonAlignment.NEUTRAL,'D','D','D','D'),
	DESTROYER("Destroyer",DemonAlignment.CHAOS,'U','D','D','D'),
	DIVINE("Divine",DemonAlignment.LAW,'D','D','U','U'),
	DRAGON("Dragon",DemonAlignment.CHAOS,'D','D','D','D'),
	EARTHSPIRIT("EarthSpirit",DemonAlignment.LAW,'U','U','D','D'),
	EVILDEMON("EvilDemon",DemonAlignment.LAW,'D','D','D','D'),
	EVILDRAGON("EvilDragon",DemonAlignment.CHAOS,'D','D','D','D'),
	FAIRY("Fairy",DemonAlignment.NEUTRAL,'U','D','U','D'),
	FALLENANGEL("FallenAngel",DemonAlignment.CHAOS,'D','U','D','U'),
	FEMME("Femme",DemonAlignment.CHAOS,'U','U','D','U'),
	FIEND("Fiend",DemonAlignment.NEUTRAL,'D','D','D','D'),
	FOUL("Foul",DemonAlignment.CHAOS,'D','D','U','D'),
	GODDESS("Goddess",DemonAlignment.LAW,'D','D','D','D'),
	GODLYBEAST("GodlyBeast",DemonAlignment.NEUTRAL,'D','D','D','D'),
	GUARDIAN("Guardian",DemonAlignment.CHAOS,'D','D','D','D'),
	HAUNT("Haunt",DemonAlignment.CHAOS,'D','U','D','D'),
	HOLYBEAST("HolyBeast",DemonAlignment.NEUTRAL,'D','D','D','U'),
	MOTHEREARTH("MotherEarth",DemonAlignment.CHAOS,'U','D','D','D'),
	NOCTURNUS("Nocturnus",DemonAlignment.NEUTRAL,'D','U','D','D'),
	RAPTOR("Raptor",DemonAlignment.LAW,'D','D','D','D'),
	REAPER("Reaper",DemonAlignment.NEUTRAL,'D','D','D','D'),
	SERAPHIM("Seraphim",DemonAlignment.LAW,'D','D','D','D'),
	SNAKE("Snake",DemonAlignment.NEUTRAL,'D','D','U','U'),
	SPIRIT("Spirit",DemonAlignment.NEUTRAL,'N','N','N','N'),
	TYRANT("Tyrant",DemonAlignment.CHAOS,'D','D','D','D'),
	VILE("Vile",DemonAlignment.LAW,'D','D','D','D'),
	WILDBIRD("WildBird",DemonAlignment.LAW,'D','D','D','D'),
	WILDER("Wilder",DemonAlignment.NEUTRAL,'D','D','U','U'),
	YOMA("Yoma",DemonAlignment.LAW,'D','U','U','D');
	
	String name;
	DemonAlignment alignment;
	char earthys;
	char aeros;
	char aquans;
	char flamies;
	
	private DemonType (final String name1, final DemonAlignment align, final char earth, final char aero, final char aqua, final char flam) {
		this.name = name1;
		this.alignment = align;
		this.earthys = earth;
		this.aeros = aero;
		this.aquans = aqua;
		this.flamies = flam;
	}
	
	@Override
	public String toString() {
		return new String(name);
	}

	public DemonAlignment getAlignment() {
		return this.alignment;
	}

	public String getName(){
		return this.name;
	}
	
	public FusResultWrapper getErthys() {
		return new FusResultWrapper(this.earthys);
	}
	
	public FusResultWrapper getAeros() {
		return new FusResultWrapper(this.aeros);
	}
	
	public FusResultWrapper getAquans() {
		return new FusResultWrapper(this.aquans);
	}
	
	public FusResultWrapper getFlamies() {
		return new FusResultWrapper(this.flamies);
	}	

	public FusResultWrapper getSpiritFusion(Demon spirit) {
		if (spirit.equals(Demon.ERTHYS))
			return this.getErthys();
		if (spirit.equals(Demon.AEROS))
			return this.getAeros();
		if (spirit.equals(Demon.AQUANS))
			return this.getAquans();
		if (spirit.equals(Demon.FLAMIES))
			return this.getFlamies();
		return null;
		
	}
	
}


