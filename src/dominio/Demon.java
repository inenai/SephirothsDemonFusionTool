package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public enum Demon {
	
	AELLO("Aello",DemonType.WILDBIRD,36,2,true), 
	AEROS("Aeros",DemonType.SPIRIT,11,2,true),
	ALICE("Alice",DemonType.FIEND,0,0,true),
	ALP("Alp",DemonType.NOCTURNUS,8,2,true), 
	AMENOUZUME("Ameno-Uzume",DemonType.GODDESS,24,2,true), 
	ANDRAS("Andras",DemonType.FALLENANGEL,15,2,true), 
	ANGEL("Angel",DemonType.DIVINE,11,2,true), 
	APIS("Apis",DemonType.HOLYBEAST,24,2,true), 
	APSARAS("Apsaras",DemonType.YOMA,8,2,true), 
	AQUANS("Aquans",DemonType.SPIRIT,15,2,true), 
	ARAHABAKI("Arahabaki",DemonType.GUARDIAN,83,2,true), 
	ARCHANGEL("Archangel",DemonType.DIVINE,17,2,true), 
	ARTEMIS("Artemis",DemonType.MOTHEREARTH,30,2,true), 
	AZUMI("Azumi",DemonType.BRUTE,10,2,true), 
	BADBHCATH("Badbh Cath",DemonType.WILDBIRD,54,2,true), 
	BAIZE("Bai Ze",DemonType.HOLYBEAST,27,2,true), 
	BAPHOMET("Baphomet",DemonType.VILE,30,2,true), 
	BASILISK("Basilisk",DemonType.EVILDRAGON,43,2,true), 
	BELIAL("Belial",DemonType.FALLENANGEL,58,2,true), 
	BICORN("Bicorn",DemonType.WILDER,17,2,true), 
	BISHAMOTEN("BishamoTen",DemonType.DESTROYER,72,3,true), 
	BLACKOOZE("Black Ooze",DemonType.FOUL,31,2,true), 
	BLOB("Blob",DemonType.FOUL,16,2,true), 
	BUCCABOO("Bucca-Boo",DemonType.EARTHSPIRIT,24,2,true), 
	CAITSITH("Cait Sith",DemonType.BEAST,7,2,true), 
	CAMAZOTZ("Camazotz",DemonType.RAPTOR,69,2,true), 
	CATOBLEPAS("Catoblepas",DemonType.WILDER,50,2,true), 
	CERBERUS("Cerberus",DemonType.BEAST,49,2,true), 
	CHATTERSKULL("Chatterskull",DemonType.HAUNT,33,2,true), 
	CHERNOBOG("Chernobog",DemonType.REAPER,62,2,true), 
	CHORONZON("Choronzon",DemonType.HAUNT,17,2,true), 
	COATLICUE("Coatlicue",DemonType.DRAGON,33,2,true), 
	COCKATRICE("Cockatrice",DemonType.EVILDRAGON,8,2,true), 
	CUCHULAINN("CuChuLainn",DemonType.DEMIGOD,44,2,true), 
	CUSITH("Cu Sith",DemonType.BEAST,13,2,true), 
	CYCLOPS("Cyclops",DemonType.EVILDEMON,46,2,true), 
	DAKINI("Dakini",DemonType.FEMME,65,2,true), 
	DATSUEBA("Datsue-ba",DemonType.FEMME,9,2,true), 
	DAWON("Dawon",DemonType.BEAST,42,2,true), 
	DECARABIA("Decarabia",DemonType.FALLENANGEL,50,2,true), 
	
	DEFORMEDJACKFROST("Deformed Jack Frost",DemonType.FAIRY,51,0,false),
	
	DIS("Dis",DemonType.YOMA,23,2,true), 
	DOMINION("Dominion",DemonType.DIVINE,64,2,true),
	DWARF("Dwarf",DemonType.EARTHSPIRIT,30,2,true), 
	ERTHYS("Erthys",DemonType.SPIRIT,7,2,true), 
	ELF("Elf",DemonType.FAIRY,31,2,true), 
	ELIGOR("Eligor",DemonType.FALLENANGEL,43,2,true), 
	EMPUSA("Empusa",DemonType.NOCTURNUS,11,2,true), 
	FENGHUANG("Feng Huang",DemonType.AVIAN,20,2,true), 
	FENRIR("Fenrir",DemonType.WILDER,57,2,true), 
	FLAMIES("Flamies",DemonType.SPIRIT,20,2,true),
	FOMORIA("Fomoria",DemonType.NOCTURNUS,27,2,true), 
	FORNEUS("Forneus",DemonType.FALLENANGEL,29,2,true), 
	FREYA("Freya",DemonType.GODDESS,38,2,true), 
	FURIAE("Furiae",DemonType.RAPTOR,45,2,true), 
	GAKI("Gaki",DemonType.HAUNT,7,2,true), 
	GANDHARVA("Gandharva",DemonType.FAIRY,23,2,true), 
	GANESHA("Ganesha",DemonType.YOMA,58,2,true), 
	GANGA("Ganga",DemonType.DRAGON,39,2,true), 
	GARM("Garm",DemonType.WILDER,9,2,true), 
	GARUDA("Garuda",DemonType.AVIAN,65,2,true), 
	GHOUL("Ghoul",DemonType.HAUNT,11,2,true), 
	GORGON("Gorgon",DemonType.FEMME,32,2,true), 
	GYUKI("Gyuki",DemonType.WILDER,25,2,true), 
	HARPY("Harpy",DemonType.WILDBIRD,7,2,true), 
	HATHOR("Hathor",DemonType.GODDESS,18,2,true), 
	HAYAGRIVA("Hayagriva",DemonType.DEMIGOD,57,2,true), 
	HECATE("Hecate",DemonType.TYRANT,59,3,true), 
	HEL("Hel",DemonType.REAPER,46,2,true), 
	HIGHPIXIE("High Pixie",DemonType.FAIRY,15,2,true), 
	HRAESVELGR("Hraesvelgr",DemonType.RAPTOR,78,2,true), 
	HUAPO("Hua Po",DemonType.EARTHSPIRIT,5,2,true), 
	INCUBUS("Incubus",DemonType.NOCTURNUS,31,2,true), 
	
	INEXPERIENCEDAELLO("Inexperienced Aello",DemonType.WILDBIRD,28,3,false),
	INEXPERIENCEDARAHABAKI("Inexperienced Arahabaki",DemonType.GUARDIAN,45,3,false),
	INEXPERIENCEDCAITSITH("Inexperienced Cait Sith",DemonType.BEAST,2,3,false),
	INEXPERIENCEDDOMINION("Inexperienced Dominion",DemonType.DIVINE,26,3,false),
	INEXPERIENCEDGARM("Inexperienced Garm",DemonType.WILDER,3,3,false),
	INEXPERIENCEDHARPY("Inexperienced Harpy",DemonType.WILDBIRD,3,3,false),
	INEXPERIENCEDJACKFROST("Inexperienced Jack Frost",DemonType.FAIRY,4,3,false),
	INEXPERIENCEDKELAINO("Inexperienced Kelaino",DemonType.WILDBIRD,23,3,false),
	INEXPERIENCEDKOPPATENGU("Inexperienced Koppa-Tengu",DemonType.BRUTE,12,3,false),
	INEXPERIENCEDNEKOMATA("Inexperienced Nekomata",DemonType.BEAST,0,3,false),
	INEXPERIENCEDOBERON("Inexperienced Oberon",DemonType.FAIRY,36,3,false),
	INEXPERIENCEDOCYPETE("Inexperienced Ocypete",DemonType.WILDBIRD,14,3,false),
	INEXPERIENCEDPARVATI("Inexperienced Parvati",DemonType.MOTHEREARTH,25,3,false),
	INEXPERIENCEDPOLTERGEIST("Inexperienced Poltergeist",DemonType.HAUNT,4,3,false),
	INEXPERIENCEDPRINCIPALITY("Inexperienced Principality",DemonType.DIVINE,20,3,false),
	INEXPERIENCEDPYROJACK("Inexperienced Pyro Jack",DemonType.FAIRY,17,3,false),
	INEXPERIENCEDQUETZALCOATL("Inexperienced Quetzalcoatl",DemonType.DRAGON,0,3,false),
	INEXPERIENCEDSLIME("Inexperienced Slime",DemonType.FOUL,3,3,false),
	INEXPERIENCEDSUDAMA("Inexperienced Sudama",DemonType.EARTHSPIRIT,14,3,false),
	INEXPERIENCEDTITANIA("Inexperienced Titania",DemonType.FAIRY,38,3,false),
	INEXPERIENCEDUNICORN("Inexperienced Unicorn",DemonType.HOLYBEAST,15,3,false),
	INEXPERIENCEDYAKSINI("Inexperienced Yaksini",DemonType.FEMME,25,3,false),
	INEXPERIENCEDYATAGARASU("Inexperienced Yatagarasu",DemonType.AVIAN,52,3,false),
	
	INUGAMI("Inugami",DemonType.BEAST,18,2,true), 
	ISORA("Isora",DemonType.YOMA,14,2,true), 
	JACKFROST("Jack Frost",DemonType.FAIRY,11,2,true), 
	JATAYU("Jatayu",DemonType.AVIAN,29,2,true), 
	JIKOKUTEN("JikokuTen",DemonType.DESTROYER,52,2,true), 
	JINN("Jinn",DemonType.YOMA,44,2,true), 
	KAICHI("Kaichi",DemonType.GODLYBEAST,31,2,true), 
	KAIWAN("Kaiwan",DemonType.NOCTURNUS,47,2,true), 
	KALI("Kali",DemonType.MOTHEREARTH,68,2,true), 
	KARASUTENGU("Karasu-Tengu",DemonType.BRUTE,28,2,true),
	KELAINO("Kelaino",DemonType.WILDBIRD,30,2,true),
	KELPIE("Kelpie",DemonType.FAIRY,25,2,true), 
	KIKURIHIME("Kikuri-Hime",DemonType.MOTHEREARTH,18,2,true), 
	KINGFROST("King Frost",DemonType.TYRANT,40,3,true), 
	KIRIN("Kirin",DemonType.HOLYBEAST,41,2,true), 
	KODAMA("Kodama",DemonType.EARTHSPIRIT,3,2,true), 
	KOPPATENGU("Koppa-Tengu",DemonType.BRUTE,15,2,true), 
	KOUMOKUTEN("Koumokuten",DemonType.DESTROYER,45,2,true), 
	KURAMATENGU("Kurama-Tengu",DemonType.DEMIGOD,48,2,true), 
	KUSHINADAHIME("Kushinada-Hime",DemonType.MOTHEREARTH,26,2,true), 
	LAMIA("Lamia",DemonType.FEMME,47,2,true), 
	LEGION("Legion",DemonType.HAUNT,38,2,true), 
	LILIM("Lilim",DemonType.NOCTURNUS,20,2,true), 
	
	LIONDANCEFROST("Lion Dance Frost",DemonType.FAIRY,11,0,false),
	
	LOKI("Loki",DemonType.TYRANT,69,3,true), 
	MACHA("Macha",DemonType.WILDBIRD,12,2,true), 
	MAKAMI("Makami",DemonType.GODLYBEAST,25,2,true), 
	MITHRA("Mithra",DemonType.DEITY,74,3,true), 
	MIZUCHI("Mizuchi",DemonType.SNAKE,31,2,true), 
	MOMUNOFU("Momunofu",DemonType.BRUTE,19,2,true), 
	MOT("Mot",DemonType.REAPER,85,3,true), 
	MOTHMAN("Mothman",DemonType.WILDER,40,2,true), 
	MOURYUU("Mou Ryuu",DemonType.FOUL,11,2,true), 
	NAGA("Naga",DemonType.SNAKE,24,2,true), 
	NAGARAJA("Raja Naga",DemonType.SNAKE,40,2,true), 
	NANDI("Nandi",DemonType.GODLYBEAST,44,2,true), 
	NEKOMATA("Nekomata",DemonType.BEAST,26,2,true),
	NIDHOGG("Nidhogg",DemonType.EVILDRAGON,57,2,true), 
	NOCKER("Nocker",DemonType.EARTHSPIRIT,11,2,true), 
	NOZUCHI("Nozuchi",DemonType.SNAKE,14,2,true), 
	OBERON("Oberon",DemonType.FAIRY,52,2,true), 
	OCYPETE("Ocypete",DemonType.WILDBIRD,25,2,true), 
	ODIN("Odin",DemonType.DEITY,70,3,true), 
	OGRE("Ogre",DemonType.EVILDEMON,25,2,true), 
	OKUNINUSHI("Okuninushi",DemonType.GUARDIAN,59,2,true), 
	OMOIKANE("Omoikane",DemonType.AMATSUDEMIGOD,31,2,true), 
	ONCOTT("Oncott",DemonType.YOMA,37,2,true), 
	ONI("Oni",DemonType.BRUTE,25,2,true), 
	ONMORAKI("Onmoraki",DemonType.RAPTOR,1,2,true), 
	ORTHRUS("Orthrus",DemonType.BEAST,31,2,true), 
	PABILSAG("Pa Bil Sag",DemonType.HOLYBEAST,31,2,true), 
	PALASATHENA("Palas Athena",DemonType.GODDESS,76,3,true),
	PARVATI("Parvati",DemonType.MOTHEREARTH,64,2,true),
	PAZUZU("Pazuzu",DemonType.VILE,82,2,true), 
	PHANTOM("Phantom",DemonType.FOUL,93,3,true),
	PHOENIX("Phoenix",DemonType.AVIAN,36,2,true), 
	PISACA("Pisaca",DemonType.HAUNT,36,2,true), 
	PIXIE("Pixie",DemonType.FAIRY,2,2,true), 
	POLTERGEIST("Poltergeist",DemonType.HAUNT,4,2,true), 
	POWER("Power",DemonType.DIVINE,36,2,true), 
	PRINCIPALITY("Principality",DemonType.DIVINE,25,2,true), 
	PYROJACK("Pyro Jack",DemonType.FAIRY,20,2,true), 
	QUEENMAEVE("Queen Maeve",DemonType.NOCTURNUS,57,2,true), 
	QUETZALCOATL("Quetzalcoatl",DemonType.DRAGON,55,2,true), 
	RAKSHASA("Rakshasa",DemonType.EVILDEMON,41,2,true), 
	RAPHAEL("Raphael",DemonType.SERAPHIM,93,3,true),
	
	SANTAFROST("Santa Frost",DemonType.FAIRY,11,0,false),
	
	SARASVATI("Sarasvati",DemonType.GODDESS,30,2,true), 
	SATI("Sati",DemonType.GODDESS,55,2,true), 
	SENRI("Senri",DemonType.HOLYBEAST,36,2,true), 
	SETANTA("Setanta",DemonType.DEMIGOD,28,2,true), 
	SHADOW("Shadow",DemonType.FOUL,52,2,true), 
	SHIISAA("Shiisaa",DemonType.HOLYBEAST,13,2,true), 
	SHIKIGAMI("Shikigami",DemonType.BRUTE,5,2,true), 
	SHIKIOUJI("Shiki-Ouji",DemonType.BRUTE,63,2,true), 
	SKADI("Skadi",DemonType.MOTHEREARTH,74,2,true), 
	SLEPNIR("Slepnir",DemonType.HOLYBEAST,62,2,true), 
	SLIME("Slime",DemonType.FOUL,6,2,true), 
	SPECTOR("Spector",DemonType.FOUL,36,2,true), 
	SUCCUBUS("Succubus",DemonType.NOCTURNUS,37,2,true), 
	SUDAMA("Sudama",DemonType.EARTHSPIRIT,17,2,true), 
	SURT("Surt",DemonType.TYRANT,72,3,true), 
	SUZAKU("Suzaku",DemonType.AVIAN,49,3,true), 
	TAKEMIKAZUCHI("Takemikazuchi",DemonType.AMATSUDEMIGOD,71,2,true), 
	TANKI("Tanki",DemonType.BEAST,37,2,true), 
	TARAKA("Taraka",DemonType.FEMME,25,2,true), 
	TARASQUE("Tarasque",DemonType.EVILDRAGON,17,2,true), 
	THOTH("Thoth",DemonType.DEITY,42,3,true), 
	THRONE("Throne",DemonType.DIVINE,71,2,true), 
	TITANIA("Titania",DemonType.FAIRY,57,2,true), 
	TROLL("Troll",DemonType.FAIRY,28,2,true), 
	TURDAK("Turdak",DemonType.BRUTE,23,2,true), 
	UBELLURI("Ubelluri",DemonType.EARTHSPIRIT,41,2,true), 
	UNICORN("Unicorn",DemonType.HOLYBEAST,21,2,true), 
	URIEL("Uriel",DemonType.SERAPHIM,80,3,true), 
	VALKYRIE("Valkyrie",DemonType.DEMIGOD,36,2,true), 
	VETALA("Vetala",DemonType.HAUNT,44,2,true), 
	VIRTUE("Virtue",DemonType.DIVINE,51,2,true), 
	WILLOWISP("Will o' Wisp",DemonType.FOUL,1,2,true), 
	YAKKA("Yakka",DemonType.HAUNT,24,2,true), 
	YAKSA("Yaksa",DemonType.BRUTE,51,2,true), 
	YAKSINI("Yaksini",DemonType.FEMME,53,2,true), 
	YATAGARASU("Yatagarasu",DemonType.AVIAN,52,2,true), 
	YOMOTSUIKUSA("Yomotsu-Ikusa",DemonType.BRUTE,44,2,true), 
	YOMOTSUSHIKOME("Yomotsu-Shikome",DemonType.FEMME,35,2,true), 
	ZHEN("Zhen",DemonType.RAPTOR,41,2,true), 
	ZOCHOTEN("Zochoten",DemonType.DESTROYER,38,2,true);

	String name;
	DemonType type;
	int baseLvl;
	int fusType;
	boolean isBasic;
	
	private Demon (final String nam, final DemonType demonType, final int lvl, final int fusionType, final boolean isBasic) {
		this.name = nam;
		this.type = demonType;
		this.baseLvl = lvl;
		this.fusType = fusionType;
		this.isBasic = isBasic;
	}

	public final boolean isBasic() {
		return isBasic;
	}
	
	@Override
	public String toString(){
		return new String(" "+this.name);
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getLevel(){
		return this.baseLvl;
	}
	
	public DemonType getType(){
		return this.type;
	}
	
	public int getFusionMode(){
		return this.fusType;
	}
	/**
	 * returns list sorted by level
	 * @param type
	 * @param include3WayFusionMode
	 * @return
	 */
	public static List<Demon> getDemonsOfTheType(DemonType type, boolean include3WayFusionMode){
		List<Demon> list = new ArrayList<Demon>();
		List<Demon> demonList = new LinkedList<Demon>();
		
		for (Demon itDemon : Demon.values())
			demonList.add(itDemon);
		
		Demon[] sortedArray = demonList.toArray(new Demon[]{});
		Arrays.sort(sortedArray,new Comparator<Demon>(){
			@Override
			public int compare(Demon o1, Demon o2) {
				if (o1.getLevel()<o2.getLevel())
					return -1;
				if (o1.getLevel()>o2.getLevel())
					return 1;
				return 0;			
			}
		});
		
		for (Demon iteratedDemon : sortedArray){	
			if (iteratedDemon.getType().equals(type))
				if (!((!include3WayFusionMode)&&(iteratedDemon.fusType == 3)))
					list.add(iteratedDemon);
		}
		return list;
	}
}
