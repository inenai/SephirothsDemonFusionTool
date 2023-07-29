package dominio;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import reusableModels.FusResultWrapper;

public enum Fusion {

	AMATSUDEMIGODAVIAN(DemonType.AMATSUDEMIGOD,DemonType.AVIAN,DemonType.DRAGON),
	AMATSUDEMIGODBEAST(DemonType.AMATSUDEMIGOD,DemonType.BEAST,DemonType.HOLYBEAST),
	AMATSUDEMIGODBRUTE(DemonType.AMATSUDEMIGOD,DemonType.BRUTE,DemonType.GODLYBEAST),
	AMATSUDEMIGODDEITY(DemonType.AMATSUDEMIGOD,DemonType.DEITY,DemonType.GUARDIAN),
	AMATSUDEMIGODDEMIGOD(DemonType.AMATSUDEMIGOD,DemonType.DEMIGOD,DemonType.DRAGON),
	AMATSUDEMIGODDESTROYER(DemonType.AMATSUDEMIGOD,DemonType.DESTROYER,DemonType.FEMME),
	AMATSUDEMIGODDIVINE(DemonType.AMATSUDEMIGOD,DemonType.DIVINE,DemonType.AVIAN),
	AMATSUDEMIGODDRAGON(DemonType.AMATSUDEMIGOD,DemonType.DRAGON,DemonType.HOLYBEAST),
	AMATSUDEMIGODEARTHSPIRIT(DemonType.AMATSUDEMIGOD,DemonType.EARTHSPIRIT,DemonType.GUARDIAN),
	AMATSUDEMIGODEVILDEMON(DemonType.AMATSUDEMIGOD,DemonType.EVILDEMON,DemonType.VILE),
	AMATSUDEMIGODFAIRY(DemonType.AMATSUDEMIGOD,DemonType.FAIRY,DemonType.DIVINE),
	AMATSUDEMIGODFALLENANGEL(DemonType.AMATSUDEMIGOD,DemonType.FALLENANGEL,DemonType.WILDBIRD),
	AMATSUDEMIGODFEMME(DemonType.AMATSUDEMIGOD,DemonType.FEMME,DemonType.FALLENANGEL),
	AMATSUDEMIGODFOUL (DemonType.AMATSUDEMIGOD,DemonType.FOUL,DemonType.HAUNT),
	AMATSUDEMIGODGODLYBEAST(DemonType.AMATSUDEMIGOD,DemonType.GODLYBEAST,DemonType.DRAGON),
	AMATSUDEMIGODHAUNT(DemonType.AMATSUDEMIGOD,DemonType.HAUNT,DemonType.DESTROYER),
	AMATSUDEMIGODHOLYBEAST(DemonType.AMATSUDEMIGOD,DemonType.HOLYBEAST,DemonType.GODLYBEAST),
	AMATSUDEMIGODMOTHEREARTH(DemonType.AMATSUDEMIGOD,DemonType.MOTHEREARTH,DemonType.GODDESS),
	AMATSUDEMIGODNOCTURNUS(DemonType.AMATSUDEMIGOD,DemonType.NOCTURNUS,DemonType.FALLENANGEL),
	AMATSUDEMIGODRAPTOR(DemonType.AMATSUDEMIGOD,DemonType.RAPTOR,DemonType.NOCTURNUS),
	AMATSUDEMIGODSERAPHIM(DemonType.AMATSUDEMIGOD,DemonType.SERAPHIM,DemonType.GUARDIAN),
	AMATSUDEMIGODSNAKE(DemonType.AMATSUDEMIGOD,DemonType.SNAKE,DemonType.GODDESS),
	AMATSUDEMIGODWILDBIRD(DemonType.AMATSUDEMIGOD,DemonType.WILDBIRD,DemonType.AVIAN),
	AMATSUDEMIGODWILDER(DemonType.AMATSUDEMIGOD,DemonType.WILDER,DemonType.FEMME),
	AMATSUDEMIGODYOMA(DemonType.AMATSUDEMIGOD,DemonType.YOMA,DemonType.GODDESS),
	
	AVIANBEAST(DemonType.AVIAN,DemonType.BEAST,DemonType.SNAKE),
	AVIANBRUTE(DemonType.AVIAN,DemonType.BRUTE,DemonType.DEMIGOD),
	AVIANDEITY(DemonType.AVIAN,DemonType.DEITY,DemonType.AMATSUDEMIGOD),
	AVIANDEMIGOD(DemonType.AVIAN,DemonType.DEMIGOD,DemonType.AMATSUDEMIGOD),
	AVIANDESTROYER(DemonType.AVIAN,DemonType.DESTROYER,DemonType.DRAGON),
	AVIANDIVINE(DemonType.AVIAN,DemonType.DIVINE,DemonType.SNAKE),
	AVIANDRAGON(DemonType.AVIAN,DemonType.DRAGON,DemonType.GODLYBEAST),
	AVIANEARTHSPIRIT(DemonType.AVIAN,DemonType.EARTHSPIRIT,DemonType.DIVINE),
	AVIANEVILDEMON(DemonType.AVIAN,DemonType.EVILDEMON,DemonType.RAPTOR),
	AVIANFAIRY(DemonType.AVIAN,DemonType.FAIRY,DemonType.WILDBIRD),
	AVIANFALLENANGEL(DemonType.AVIAN,DemonType.FALLENANGEL,DemonType.SNAKE),
	AVIANFEMME(DemonType.AVIAN,DemonType.FEMME,DemonType.GODDESS),
	AVIANGODDESS(DemonType.AVIAN,DemonType.GODDESS,DemonType.AMATSUDEMIGOD),
	AVIANGODLYBEAST(DemonType.AVIAN,DemonType.GODLYBEAST,DemonType.HOLYBEAST),
	AVIANGUARDIAN(DemonType.AVIAN,DemonType.GUARDIAN,DemonType.AMATSUDEMIGOD),
	AVIANHOLYBEAST(DemonType.AVIAN,DemonType.HOLYBEAST,DemonType.MOTHEREARTH),
	AVIANMOTHEREARTH(DemonType.AVIAN,DemonType.MOTHEREARTH,DemonType.DRAGON),
	AVIANNOCTURNUS(DemonType.AVIAN,DemonType.NOCTURNUS,DemonType.FEMME),
	AVIANREAPER(DemonType.AVIAN,DemonType.REAPER,DemonType.RAPTOR),
	AVIANSERAPHIM(DemonType.AVIAN,DemonType.SERAPHIM,DemonType.DIVINE),
	AVIANSNAKE(DemonType.AVIAN,DemonType.SNAKE,DemonType.AMATSUDEMIGOD),
	AVIANVILE(DemonType.AVIAN,DemonType.VILE,DemonType.REAPER),
	AVIANWILDBIRD(DemonType.AVIAN,DemonType.WILDBIRD,DemonType.RAPTOR),
	AVIANWILDER(DemonType.AVIAN,DemonType.WILDER,DemonType.WILDBIRD),
	AVIANYOMA(DemonType.AVIAN,DemonType.YOMA,DemonType.NOCTURNUS),
	
	BEASTBRUTE(DemonType.BEAST,DemonType.BRUTE,DemonType.FEMME),
	BEASTDEITY(DemonType.BEAST,DemonType.DEITY,DemonType.GODLYBEAST),
	BEASTDEMIGOD(DemonType.BEAST,DemonType.DEMIGOD,DemonType.HOLYBEAST),
	BEASTDESTROYER(DemonType.BEAST,DemonType.DESTROYER,DemonType.HOLYBEAST),
	BEASTDIVINE(DemonType.BEAST,DemonType.DIVINE,DemonType.HOLYBEAST),
	BEASTDRAGON(DemonType.BEAST,DemonType.DRAGON,DemonType.SNAKE),
	BEASTEARTHSPIRIT(DemonType.BEAST,DemonType.EARTHSPIRIT,DemonType.YOMA),
	BEASTEVILDEMON(DemonType.BEAST,DemonType.EVILDEMON,DemonType.WILDER),
	BEASTEVILDRAGON(DemonType.BEAST,DemonType.EVILDRAGON,DemonType.REAPER),
	BEASTFAIRY(DemonType.BEAST,DemonType.FAIRY,DemonType.DIVINE),
	BEASTFALLENANGEL(DemonType.BEAST,DemonType.FALLENANGEL,DemonType.NOCTURNUS),
	BEASTFEMME (DemonType.BEAST,DemonType.FEMME,DemonType.FOUL),
	BEASTFOUL(DemonType.BEAST,DemonType.FOUL,DemonType.WILDER),
	BEASTGODDESS(DemonType.BEAST,DemonType.GODDESS,DemonType.HOLYBEAST),
	BEASTGODLYBEAST(DemonType.BEAST,DemonType.GODLYBEAST,DemonType.SNAKE),
	BEASTGUARDIAN(DemonType.BEAST,DemonType.GUARDIAN,DemonType.SNAKE),
	BEASTHAUNT(DemonType.BEAST,DemonType.HAUNT,DemonType.WILDER),
	BEASTHOLYBEAST(DemonType.BEAST,DemonType.HOLYBEAST,DemonType.GODLYBEAST),
	BEASTMOTHEREARTH(DemonType.BEAST,DemonType.MOTHEREARTH,DemonType.SNAKE),
	BEASTNOCTURNUS(DemonType.BEAST,DemonType.NOCTURNUS,DemonType.HOLYBEAST),
	BEASTRAPTOR(DemonType.BEAST,DemonType.RAPTOR,DemonType.SNAKE),
	BEASTREAPER(DemonType.BEAST,DemonType.REAPER,DemonType.WILDER),
	BEASTSNAKE(DemonType.BEAST,DemonType.SNAKE,DemonType.BRUTE),
	BEASTTYRANT(DemonType.BEAST,DemonType.TYRANT,DemonType.NOCTURNUS),
	BEASTVILE(DemonType.BEAST,DemonType.VILE,DemonType.FOUL),
	BEASTWILDBIRD(DemonType.BEAST,DemonType.WILDBIRD,DemonType.WILDER),
	BEASTWILDER(DemonType.BEAST,DemonType.WILDER,DemonType.EARTHSPIRIT),
	BEASTYOMA(DemonType.BEAST,DemonType.YOMA,DemonType.FALLENANGEL),
	
	BRUTEDEMIGOD(DemonType.BRUTE,DemonType.DEMIGOD,DemonType.DIVINE),
	BRUTEDESTROYER(DemonType.BRUTE,DemonType.DESTROYER,DemonType.EARTHSPIRIT),
	BRUTEDIVINE(DemonType.BRUTE,DemonType.DIVINE,DemonType.YOMA),
	BRUTEDRAGON(DemonType.BRUTE,DemonType.DRAGON,DemonType.NOCTURNUS),
	BRUTEEARTHSPIRIT(DemonType.BRUTE,DemonType.EARTHSPIRIT,DemonType.FAIRY),
	BRUTEEVILDEMON (DemonType.BRUTE,DemonType.EVILDEMON,DemonType.HAUNT),
	BRUTEEVILDRAGON(DemonType.BRUTE,DemonType.EVILDRAGON,DemonType.EVILDEMON),
	BRUTEFAIRY(DemonType.BRUTE,DemonType.FAIRY,DemonType.YOMA),
	BRUTEFALLENANGEL(DemonType.BRUTE,DemonType.FALLENANGEL,DemonType.EARTHSPIRIT),
	BRUTEFEMME(DemonType.BRUTE,DemonType.FEMME,DemonType.BEAST),
	BRUTEFOUL(DemonType.BRUTE,DemonType.FOUL,DemonType.WILDER),
	BRUTEGODDESS(DemonType.BRUTE,DemonType.GODDESS,DemonType.FEMME),
	BRUTEGODLYBEAST(DemonType.BRUTE,DemonType.GODLYBEAST,DemonType.EVILDRAGON),
	BRUTEGUARDIAN(DemonType.BRUTE,DemonType.GUARDIAN,DemonType.SNAKE),
	BRUTEHAUNT (DemonType.BRUTE,DemonType.HAUNT,DemonType.FOUL),
	BRUTEHOLYBEAST(DemonType.BRUTE,DemonType.HOLYBEAST,DemonType.FEMME),
	BRUTEMOTHEREARTH(DemonType.BRUTE,DemonType.MOTHEREARTH,DemonType.DIVINE),
	BRUTENOCTURNUS(DemonType.BRUTE,DemonType.NOCTURNUS,DemonType.DESTROYER),
	BRUTERAPTOR(DemonType.BRUTE,DemonType.RAPTOR,DemonType.FEMME),
	BRUTEREAPER(DemonType.BRUTE,DemonType.REAPER,DemonType.EARTHSPIRIT),
	BRUTESNAKE(DemonType.BRUTE,DemonType.SNAKE,DemonType.BEAST),
	BRUTEVILE(DemonType.BRUTE,DemonType.VILE,DemonType.FOUL),
	BRUTEWILDBIRD(DemonType.BRUTE,DemonType.WILDBIRD,DemonType.RAPTOR),
	BRUTEWILDER(DemonType.BRUTE,DemonType.WILDER,DemonType.FAIRY),
	BRUTEYOMA(DemonType.BRUTE,DemonType.YOMA,DemonType.FEMME),
	
	DEMIGODDESTROYER(DemonType.DEMIGOD,DemonType.DESTROYER,DemonType.GODLYBEAST),
	DEMIGODDIVINE(DemonType.DEMIGOD,DemonType.DIVINE,DemonType.GODDESS),
	DEMIGODDRAGON(DemonType.DEMIGOD,DemonType.DRAGON,DemonType.HOLYBEAST),
	DEMIGODEARTHSPIRIT(DemonType.DEMIGOD,DemonType.EARTHSPIRIT,DemonType.MOTHEREARTH),
	DEMIGODEVILDEMON(DemonType.DEMIGOD,DemonType.EVILDEMON,DemonType.REAPER),
	DEMIGODEVILDRAGON(DemonType.DEMIGOD,DemonType.EVILDRAGON,DemonType.GODLYBEAST),
	DEMIGODFALLENANGEL(DemonType.DEMIGOD,DemonType.FALLENANGEL,DemonType.MOTHEREARTH),
	DEMIGODFEMME(DemonType.DEMIGOD,DemonType.FEMME,DemonType.NOCTURNUS),
	DEMIGODGODDESS(DemonType.DEMIGOD,DemonType.GODDESS,DemonType.AMATSUDEMIGOD),
	DEMIGODGODLYBEAST(DemonType.DEMIGOD,DemonType.GODLYBEAST,DemonType.AMATSUDEMIGOD),
	DEMIGODGUARDIAN(DemonType.DEMIGOD,DemonType.GUARDIAN,DemonType.DESTROYER),
	DEMIGODHOLYBEAST(DemonType.DEMIGOD,DemonType.HOLYBEAST,DemonType.GODLYBEAST),
	DEMIGODMOTHEREARTH(DemonType.DEMIGOD,DemonType.MOTHEREARTH,DemonType.FEMME),
	DEMIGODNOCTURNUS(DemonType.DEMIGOD,DemonType.NOCTURNUS,DemonType.HOLYBEAST),
	DEMIGODRAPTOR(DemonType.DEMIGOD,DemonType.RAPTOR,DemonType.HOLYBEAST),
	DEMIGODREAPER(DemonType.DEMIGOD,DemonType.REAPER,DemonType.HAUNT),
	DEMIGODSERAPHIM(DemonType.DEMIGOD,DemonType.SERAPHIM,DemonType.GODDESS),
	DEMIGODSNAKE(DemonType.DEMIGOD,DemonType.SNAKE,DemonType.DRAGON),
	DEMIGODTYRANT(DemonType.DEMIGOD,DemonType.TYRANT,DemonType.YOMA),
	DEMIGODVILE(DemonType.DEMIGOD,DemonType.VILE,DemonType.GUARDIAN),
	DEMIGODWILDBIRD(DemonType.DEMIGOD,DemonType.WILDBIRD,DemonType.AVIAN),
	DEMIGODWILDER(DemonType.DEMIGOD,DemonType.WILDER,DemonType.YOMA),
	
	DEITYDESTROYER(DemonType.DEITY,DemonType.DESTROYER,DemonType.AMATSUDEMIGOD),
	DEITYDIVINE(DemonType.DEITY,DemonType.DIVINE,DemonType.GODDESS),
	DEITYDRAGON(DemonType.DEITY,DemonType.DRAGON,DemonType.GUARDIAN),
	DEITYEARTHSPIRIT(DemonType.DEITY,DemonType.EARTHSPIRIT,DemonType.BRUTE),
	DEITYFAIRY(DemonType.DEITY,DemonType.FAIRY,DemonType.NOCTURNUS),
	DEITYFEMME(DemonType.DEITY,DemonType.FEMME,DemonType.MOTHEREARTH),
	DEITYGODDESS(DemonType.DEITY,DemonType.GODDESS,DemonType.AMATSUDEMIGOD),
	DEITYGODLYBEAST(DemonType.DEITY,DemonType.GODLYBEAST,DemonType.DRAGON),
	DEITYGUARDIAN(DemonType.DEITY,DemonType.GUARDIAN,DemonType.AMATSUDEMIGOD),
	DEITYHOLYBEAST(DemonType.DEITY,DemonType.HOLYBEAST,DemonType.AVIAN),
	DEITYNOCTURNUS(DemonType.DEITY,DemonType.NOCTURNUS,DemonType.VILE),
	DEITYRAPTOR(DemonType.DEITY,DemonType.RAPTOR,DemonType.VILE),
	DEITYSNAKE(DemonType.DEITY,DemonType.SNAKE,DemonType.DESTROYER),
	DEITYVILE(DemonType.DEITY,DemonType.VILE,DemonType.DESTROYER),
	DEITYWILDBIRD(DemonType.DEITY,DemonType.WILDBIRD,DemonType.FALLENANGEL),
	DEITYWILDER(DemonType.DEITY,DemonType.WILDER,DemonType.BEAST),
	DEITYYOMA(DemonType.DEITY,DemonType.YOMA,DemonType.DEMIGOD),
	
	DESTROYERDIVINE(DemonType.DESTROYER,DemonType.DIVINE,DemonType.MOTHEREARTH),
	DESTROYERDRAGON(DemonType.DESTROYER,DemonType.DRAGON,DemonType.GUARDIAN),
	DESTROYEREARTHSPIRIT(DemonType.DESTROYER,DemonType.EARTHSPIRIT,DemonType.SNAKE),
	DESTROYEREVILDEMON (DemonType.DESTROYER,DemonType.EVILDEMON,DemonType.BRUTE),
	DESTROYEREVILDRAGON(DemonType.DESTROYER,DemonType.EVILDRAGON,DemonType.VILE),
	DESTROYERFAIRY (DemonType.DESTROYER,DemonType.FAIRY,DemonType.BRUTE),
	DESTROYERFALLENANGEL(DemonType.DESTROYER,DemonType.FALLENANGEL,DemonType.NOCTURNUS),
	DESTROYERFEMME(DemonType.DESTROYER,DemonType.FEMME,DemonType.MOTHEREARTH),
	DESTROYERFOUL(DemonType.DESTROYER,DemonType.FOUL,DemonType.EVILDRAGON),
	DESTROYERGODDESS(DemonType.DESTROYER,DemonType.GODDESS,DemonType.MOTHEREARTH),
	DESTROYERGODLYBEAST(DemonType.DESTROYER,DemonType.GODLYBEAST,DemonType.HOLYBEAST),
	DESTROYERHOLYBEAST(DemonType.DESTROYER,DemonType.HOLYBEAST,DemonType.GUARDIAN),
	DESTROYERMOTHEREARTH(DemonType.DESTROYER,DemonType.MOTHEREARTH,DemonType.FEMME),
	DESTROYERNOCTURNUS(DemonType.DESTROYER,DemonType.NOCTURNUS,DemonType.FEMME),
	DESTROYERRAPTOR(DemonType.DESTROYER,DemonType.RAPTOR,DemonType.VILE),
	DESTROYERREAPER(DemonType.DESTROYER,DemonType.REAPER,DemonType.EVILDEMON),
	DESTROYERSERAPHIM(DemonType.DESTROYER,DemonType.SERAPHIM,DemonType.GUARDIAN),
	DESTROYERSNAKE(DemonType.DESTROYER,DemonType.SNAKE,DemonType.DRAGON),
	DESTROYERTYRANT(DemonType.DESTROYER,DemonType.TYRANT,DemonType.DRAGON),
	DESTROYERVILE(DemonType.DESTROYER,DemonType.VILE,DemonType.REAPER),
	DESTROYERWILDBIRD(DemonType.DESTROYER,DemonType.WILDBIRD,DemonType.FEMME),
	DESTROYERYOMA(DemonType.DESTROYER,DemonType.YOMA,DemonType.GUARDIAN),
	
	DIVINEDRAGON(DemonType.DIVINE,DemonType.DRAGON,DemonType.GODDESS),
	DIVINEEARTHSPIRIT(DemonType.DIVINE,DemonType.EARTHSPIRIT,DemonType.NOCTURNUS),
	DIVINEEVILDEMON(DemonType.DIVINE,DemonType.EVILDEMON,DemonType.REAPER),
	DIVINEEVILDRAGON(DemonType.DIVINE,DemonType.EVILDRAGON,DemonType.WILDBIRD),
	DIVINEFAIRY(DemonType.DIVINE,DemonType.FAIRY,DemonType.GODDESS),
	DIVINEFEMME(DemonType.DIVINE,DemonType.FEMME,DemonType.BEAST),
	DIVINEFOUL(DemonType.DIVINE,DemonType.FOUL,DemonType.FALLENANGEL),
	DIVINEGODDESS(DemonType.DIVINE,DemonType.GODDESS,DemonType.AMATSUDEMIGOD),
	DIVINEGODLYBEAST(DemonType.DIVINE,DemonType.GODLYBEAST,DemonType.GODDESS),
	DIVINEGUARDIAN(DemonType.DIVINE,DemonType.GUARDIAN,DemonType.WILDBIRD),
	DIVINEHAUNT(DemonType.DIVINE,DemonType.HAUNT,DemonType.EARTHSPIRIT),
	DIVINEHOLYBEAST(DemonType.DIVINE,DemonType.HOLYBEAST,DemonType.GODDESS),
	DIVINEMOTHEREARTH(DemonType.DIVINE,DemonType.MOTHEREARTH,DemonType.GODDESS),
	DIVINENOCTURNUS(DemonType.DIVINE,DemonType.NOCTURNUS,DemonType.SNAKE),
	DIVINERAPTOR(DemonType.DIVINE,DemonType.RAPTOR,DemonType.WILDBIRD),
	DIVINEREAPER(DemonType.DIVINE,DemonType.REAPER,DemonType.RAPTOR),
	DIVINESNAKE(DemonType.DIVINE,DemonType.SNAKE,DemonType.FAIRY),
	DIVINETYRANT(DemonType.DIVINE,DemonType.TYRANT,DemonType.VILE),
	DIVINEVILE(DemonType.DIVINE,DemonType.VILE,DemonType.REAPER),
	DIVINEWILDBIRD(DemonType.DIVINE,DemonType.WILDBIRD,DemonType.FAIRY),
	DIVINEWILDER(DemonType.DIVINE,DemonType.WILDER,DemonType.FALLENANGEL),
	DIVINEYOMA(DemonType.DIVINE,DemonType.YOMA,DemonType.SNAKE),
	
	DRAGONEARTHSPIRIT(DemonType.DRAGON,DemonType.EARTHSPIRIT,DemonType.GUARDIAN),
	DRAGONEVILDEMON(DemonType.DRAGON,DemonType.EVILDEMON,DemonType.DESTROYER),
	DRAGONFAIRY(DemonType.DRAGON,DemonType.FAIRY,DemonType.DEMIGOD),
	DRAGONFALLENANGEL(DemonType.DRAGON,DemonType.FALLENANGEL,DemonType.SNAKE),
	DRAGONFEMME(DemonType.DRAGON,DemonType.FEMME,DemonType.NOCTURNUS),
	DRAGONFOUL(DemonType.DRAGON,DemonType.FOUL,DemonType.SNAKE),
	DRAGONGODDESS(DemonType.DRAGON,DemonType.GODDESS,DemonType.GODLYBEAST),
	DRAGONGODLYBEAST(DemonType.DRAGON,DemonType.GODLYBEAST,DemonType.DEMIGOD),
	DRAGONGUARDIAN(DemonType.DRAGON,DemonType.GUARDIAN,DemonType.MOTHEREARTH),
	DRAGONHOLYBEAST(DemonType.DRAGON,DemonType.HOLYBEAST,DemonType.SNAKE),
	DRAGONNOCTURNUS(DemonType.DRAGON,DemonType.NOCTURNUS,DemonType.FEMME),
	DRAGONRAPTOR(DemonType.DRAGON,DemonType.RAPTOR,DemonType.WILDER),
	DRAGONREAPER(DemonType.DRAGON,DemonType.REAPER,DemonType.EVILDRAGON),
	DRAGONSERAPHIM(DemonType.DRAGON,DemonType.SERAPHIM,DemonType.HOLYBEAST),
	DRAGONSNAKE(DemonType.DRAGON,DemonType.SNAKE,DemonType.MOTHEREARTH),
	DRAGONTYRANT(DemonType.DRAGON,DemonType.TYRANT,DemonType.EVILDRAGON),
	DRAGONVILE(DemonType.DRAGON,DemonType.VILE,DemonType.SNAKE),
	DRAGONWILDBIRD(DemonType.DRAGON,DemonType.WILDBIRD,DemonType.AMATSUDEMIGOD),
	DRAGONWILDER(DemonType.DRAGON,DemonType.WILDER,DemonType.BEAST),
	DRAGONYOMA(DemonType.DRAGON,DemonType.YOMA,DemonType.GODLYBEAST),
	
	EARTHSPIRITEVILDEMON(DemonType.EARTHSPIRIT,DemonType.EVILDEMON,DemonType.BEAST),
	EARTHSPIRITEVILDRAGON(DemonType.EARTHSPIRIT,DemonType.EVILDRAGON,DemonType.EVILDEMON),
	EARTHSPIRITFAIRY(DemonType.EARTHSPIRIT,DemonType.FAIRY,DemonType.WILDER),
	EARTHSPIRITFALLENANGEL(DemonType.EARTHSPIRIT,DemonType.FALLENANGEL,DemonType.YOMA),
	EARTHSPIRITFEMME(DemonType.EARTHSPIRIT,DemonType.FEMME,DemonType.WILDER),
	EARTHSPIRITFOUL(DemonType.EARTHSPIRIT,DemonType.FOUL,DemonType.FEMME),
	EARTHSPIRITGODDESS(DemonType.EARTHSPIRIT,DemonType.GODDESS,DemonType.MOTHEREARTH),
	EARTHSPIRITGODLYBEAST(DemonType.EARTHSPIRIT,DemonType.GODLYBEAST,DemonType.GUARDIAN),
	EARTHSPIRITGUARDIAN(DemonType.EARTHSPIRIT,DemonType.GUARDIAN,DemonType.SNAKE),
	EARTHSPIRITHAUNT (DemonType.EARTHSPIRIT,DemonType.HAUNT,DemonType.FOUL),
	EARTHSPIRITHOLYBEAST(DemonType.EARTHSPIRIT,DemonType.HOLYBEAST,DemonType.BEAST),
	EARTHSPIRITMOTHEREARTH(DemonType.EARTHSPIRIT,DemonType.MOTHEREARTH,DemonType.BEAST),
	EARTHSPIRITNOCTURNUS(DemonType.EARTHSPIRIT,DemonType.NOCTURNUS,DemonType.FOUL),
	EARTHSPIRITRAPTOR(DemonType.EARTHSPIRIT,DemonType.RAPTOR,DemonType.FOUL),
	EARTHSPIRITREAPER(DemonType.EARTHSPIRIT,DemonType.REAPER,DemonType.EVILDEMON),
	EARTHSPIRITSNAKE(DemonType.EARTHSPIRIT,DemonType.SNAKE,DemonType.FALLENANGEL),
	EARTHSPIRITTYRANT(DemonType.EARTHSPIRIT,DemonType.TYRANT,DemonType.WILDER),
	EARTHSPIRITVIILE(DemonType.EARTHSPIRIT,DemonType.VILE,DemonType.HAUNT),
	EARTHSPIRITWILDBIRD(DemonType.EARTHSPIRIT,DemonType.WILDBIRD,DemonType.FAIRY),
	EARTHSPIRITWILDER(DemonType.EARTHSPIRIT,DemonType.WILDER,DemonType.BRUTE),
	EARTHSPIRITYOMA(DemonType.EARTHSPIRIT,DemonType.YOMA,DemonType.WILDER),
	
	EVILDEMONEVILDRAGON(DemonType.EVILDEMON,DemonType.EVILDRAGON,DemonType.VILE),
	EVILDEMONFAIRY(DemonType.EVILDEMON,DemonType.FAIRY,DemonType.BRUTE),
	EVILDEMONFALLENANGEL(DemonType.EVILDEMON,DemonType.FALLENANGEL,DemonType.EVILDRAGON),
	EVILDEMONFEMME(DemonType.EVILDEMON,DemonType.FEMME,DemonType.BEAST),
	EVILDEMONFOUL (DemonType.EVILDEMON,DemonType.FOUL,DemonType.BRUTE),
	EVILDEMONGODDESS(DemonType.EVILDEMON,DemonType.GODDESS,DemonType.FEMME),
	EVILDEMONGUARDIAN(DemonType.EVILDEMON,DemonType.GUARDIAN,DemonType.VILE),
	EVILDEMONHAUNT (DemonType.EVILDEMON,DemonType.HAUNT,DemonType.FOUL),
	EVILDEMONHOLYBEAST(DemonType.EVILDEMON,DemonType.HOLYBEAST,DemonType.RAPTOR),
	EVILDEMONMOTHEREARTH(DemonType.EVILDEMON,DemonType.MOTHEREARTH,DemonType.DESTROYER),
	EVILDEMONNOCTURNUS(DemonType.EVILDEMON,DemonType.NOCTURNUS,DemonType.FALLENANGEL),
	EVILDEMONRAPTOR(DemonType.EVILDEMON,DemonType.RAPTOR,DemonType.FOUL),
	EVILDEMONREAPER(DemonType.EVILDEMON,DemonType.REAPER,DemonType.VILE),
	EVILDEMONSNAKE(DemonType.EVILDEMON,DemonType.SNAKE,DemonType.EVILDRAGON),
	EVILDEMONTYRANT(DemonType.EVILDEMON,DemonType.TYRANT,DemonType.FOUL),
	EVILDEMONVILE(DemonType.EVILDEMON,DemonType.VILE,DemonType.FOUL),
	EVILDEMONWILDBIRD(DemonType.EVILDEMON,DemonType.WILDBIRD,DemonType.BRUTE),
	EVILDEMONWILDER(DemonType.EVILDEMON,DemonType.WILDER,DemonType.BRUTE),
	EVILDEMONYOMA(DemonType.EVILDEMON,DemonType.YOMA,DemonType.EARTHSPIRIT),
	
	EVILDRAGONFAIRY(DemonType.EVILDRAGON,DemonType.FAIRY,DemonType.SNAKE),
	EVILDRAGONFALLENANGEL(DemonType.EVILDRAGON,DemonType.FALLENANGEL,DemonType.EVILDEMON),
	EVILDRAGONFEMME(DemonType.EVILDRAGON,DemonType.FEMME,DemonType.EVILDEMON),
	EVILDRAGONFOUL(DemonType.EVILDRAGON,DemonType.FOUL,DemonType.VILE),
	EVILDRAGONGODDESS(DemonType.EVILDRAGON,DemonType.GODDESS,DemonType.VILE),
	EVILDRAGONGUARDIAN(DemonType.EVILDRAGON,DemonType.GUARDIAN,DemonType.REAPER),
	EVILDRAGONHAUNT(DemonType.EVILDRAGON,DemonType.HAUNT,DemonType.RAPTOR),
	EVILDRAGONMOTHEREARTH(DemonType.EVILDRAGON,DemonType.MOTHEREARTH,DemonType.EARTHSPIRIT),
	EVILDRAGONNOCTURNUS(DemonType.EVILDRAGON,DemonType.NOCTURNUS,DemonType.FALLENANGEL),
	EVILDRAGONRAPTOR(DemonType.EVILDRAGON,DemonType.RAPTOR,DemonType.WILDER),
	EVILDRAGONREAPER(DemonType.EVILDRAGON,DemonType.REAPER,DemonType.WILDER),
	EVILDRAGONSNAKE(DemonType.EVILDRAGON,DemonType.SNAKE,DemonType.EVILDEMON),
	EVILDRAGONTYRANT(DemonType.EVILDRAGON,DemonType.TYRANT,DemonType.VILE),
	EVILDRAGONVILE(DemonType.EVILDRAGON,DemonType.VILE,DemonType.WILDER),
	EVILDRAGONWILDBIRD(DemonType.EVILDRAGON,DemonType.WILDBIRD,DemonType.RAPTOR),
	EVILDRAGONWILDER(DemonType.EVILDRAGON,DemonType.WILDER,DemonType.REAPER),
	EVILDRAGONYOMA(DemonType.EVILDRAGON,DemonType.YOMA,DemonType.SNAKE),
	
	FAIRYFALLENANGEL(DemonType.FAIRY,DemonType.FALLENANGEL,DemonType.YOMA),
	FAIRYFEMME (DemonType.FAIRY,DemonType.FEMME,DemonType.HAUNT),
	FAIRYFOUL (DemonType.FAIRY,DemonType.FOUL,DemonType.HAUNT),
	FAIRYGODDESS(DemonType.FAIRY,DemonType.GODDESS,DemonType.DEMIGOD),
	FAIRYGODLYBEAST(DemonType.FAIRY,DemonType.GODLYBEAST,DemonType.DIVINE),
	FAIRYGUARDIAN(DemonType.FAIRY,DemonType.GUARDIAN,DemonType.SNAKE),
	FAIRYHAUNT(DemonType.FAIRY,DemonType.HAUNT,DemonType.WILDBIRD),
	FAIRYHOLYBEAST(DemonType.FAIRY,DemonType.HOLYBEAST,DemonType.GODDESS),
	FAIRYMOTHEREARTH(DemonType.FAIRY,DemonType.MOTHEREARTH,DemonType.YOMA),
	FAIRYRAPTOR (DemonType.FAIRY,DemonType.RAPTOR,DemonType.HAUNT),
	FAIRYREAPER(DemonType.FAIRY,DemonType.REAPER,DemonType.NOCTURNUS),
	FAIRYSERAPH(DemonType.FAIRY,DemonType.HOLYBEAST,DemonType.HOLYBEAST),
	FAIRYSNAKE(DemonType.FAIRY,DemonType.SNAKE,DemonType.YOMA),
	FAIRYTYRANT(DemonType.FAIRY,DemonType.TYRANT,DemonType.NOCTURNUS),
	FAIRYVILE(DemonType.FAIRY,DemonType.VILE,DemonType.RAPTOR),
	FAIRYWILDBIRD(DemonType.FAIRY,DemonType.WILDBIRD,DemonType.DIVINE),
	FAIRYWILDER(DemonType.FAIRY,DemonType.WILDER,DemonType.WILDBIRD),
	FAIRYYOMA(DemonType.FAIRY,DemonType.YOMA,DemonType.EARTHSPIRIT),
	
	FALLENANGELFEMME(DemonType.FALLENANGEL,DemonType.FEMME,DemonType.WILDER),
	FALLENANGELGODDESS(DemonType.FALLENANGEL,DemonType.GODDESS,DemonType.DIVINE),
	FALLENANGELGODLYBEAST(DemonType.FALLENANGEL,DemonType.GODLYBEAST,DemonType.DIVINE),
	FALLENANGELGUARDIAN(DemonType.FALLENANGEL,DemonType.GUARDIAN,DemonType.SNAKE),
	FALLENANGELHAUNT(DemonType.FALLENANGEL,DemonType.HAUNT,DemonType.YOMA),
	FALLENANGELHOLYBEAST(DemonType.FALLENANGEL,DemonType.HOLYBEAST,DemonType.BEAST),
	FALLENANGELMOTHEREARTH(DemonType.FALLENANGEL,DemonType.MOTHEREARTH,DemonType.FEMME),
	FALLENANGELNOCTURNUS(DemonType.FALLENANGEL,DemonType.NOCTURNUS,DemonType.FAIRY),
	FALLENANGELRAPTOR (DemonType.FALLENANGEL,DemonType.RAPTOR,DemonType.FOUL),
	FALLENANGELREAPER(DemonType.FALLENANGEL,DemonType.REAPER,DemonType.RAPTOR),
	FALLENANGELSERAPHIM(DemonType.FALLENANGEL,DemonType.SERAPHIM,DemonType.MOTHEREARTH),
	FALLENANGELSNAKE(DemonType.FALLENANGEL,DemonType.SNAKE,DemonType.DEMIGOD),
	FALLENANGELVILE(DemonType.FALLENANGEL,DemonType.VILE,DemonType.BRUTE),
	FALLENANGELWILDBIRD(DemonType.FALLENANGEL,DemonType.WILDBIRD,DemonType.RAPTOR),
	FALLENANGELWILDER(DemonType.FALLENANGEL,DemonType.WILDER,DemonType.NOCTURNUS),
	FALLENANGELYOMA(DemonType.FALLENANGEL,DemonType.YOMA,DemonType.EARTHSPIRIT),
	
	FEMMEFOUL(DemonType.FEMME,DemonType.FOUL,DemonType.WILDER),
	FEMMEGODDESS(DemonType.FEMME,DemonType.GODDESS,DemonType.MOTHEREARTH),
	FEMMEGODLYBEAST(DemonType.FEMME,DemonType.GODLYBEAST,DemonType.DESTROYER),
	FEMMEGUARDIAN(DemonType.FEMME,DemonType.GUARDIAN,DemonType.DESTROYER),
	FEMMEHAUNT(DemonType.FEMME,DemonType.HAUNT,DemonType.FOUL),
	FEMMEHOLYBEAST(DemonType.FEMME,DemonType.HOLYBEAST,DemonType.MOTHEREARTH),
	FEMMEMOTHEREARTH(DemonType.FEMME,DemonType.MOTHEREARTH,DemonType.DESTROYER),
	FEMMENOCTURNUS(DemonType.FEMME,DemonType.NOCTURNUS,DemonType.EVILDEMON),
	FEMMERAPTOR(DemonType.FEMME,DemonType.RAPTOR,DemonType.FOUL),
	FEMMEREAPER(DemonType.FEMME,DemonType.REAPER,DemonType.EVILDEMON),
	FEMMESNAKE(DemonType.FEMME,DemonType.SNAKE,DemonType.DEMIGOD),
	FEMMETYRANT(DemonType.FEMME,DemonType.TYRANT,DemonType.MOTHEREARTH),
	FEMMEVILE(DemonType.FEMME,DemonType.VILE,DemonType.BRUTE),
	FEMMEWILDBIRD(DemonType.FEMME,DemonType.WILDBIRD,DemonType.EVILDEMON),
	FEMMEWILDER(DemonType.FEMME,DemonType.WILDER,DemonType.FALLENANGEL),
	FEMMEYOMA(DemonType.FEMME,DemonType.YOMA,DemonType.BRUTE),
	
	FOULHAUNT(DemonType.FOUL,DemonType.HAUNT,DemonType.BRUTE),
	FOULMOTHEREARTH(DemonType.FOUL,DemonType.MOTHEREARTH,DemonType.EARTHSPIRIT),
	FOULNOCTURNUS(DemonType.FOUL,DemonType.NOCTURNUS,DemonType.BRUTE),
	FOULSNAKE(DemonType.FOUL,DemonType.SNAKE,DemonType.FALLENANGEL),
	FOULVILE(DemonType.FOUL,DemonType.VILE,DemonType.HAUNT),
	FOULWILDER(DemonType.FOUL,DemonType.WILDER,DemonType.WILDBIRD),
	FOULYOMA(DemonType.FOUL,DemonType.YOMA,DemonType.WILDBIRD),
	
	GODDESSGODLYBEAST(DemonType.GODDESS,DemonType.GODLYBEAST,DemonType.BEAST),
	GODDESSGUARDIAN(DemonType.GODDESS,DemonType.GUARDIAN,DemonType.MOTHEREARTH),
	GODDESSHAUNT(DemonType.GODDESS,DemonType.HAUNT,DemonType.VILE),
	GODDESSHOLYBEAST(DemonType.GODDESS,DemonType.HOLYBEAST,DemonType.GODLYBEAST),
	GODDESSNOCTURNUS(DemonType.GODDESS,DemonType.NOCTURNUS,DemonType.FALLENANGEL),
	GODDESSRAPTOR(DemonType.GODDESS,DemonType.RAPTOR,DemonType.FALLENANGEL),
	GODDESSREAPER(DemonType.GODDESS,DemonType.REAPER,DemonType.VILE),
	GODDESSSERAPHIM(DemonType.GODDESS,DemonType.SERAPHIM,DemonType.MOTHEREARTH),
	GODDESSSNAKE(DemonType.GODDESS,DemonType.SNAKE,DemonType.FAIRY),
	GODDESSVILE(DemonType.GODDESS,DemonType.VILE,DemonType.REAPER),
	GODDESSWILDBIRD(DemonType.GODDESS,DemonType.WILDBIRD,DemonType.AVIAN),
	GODDESSWILDER(DemonType.GODDESS,DemonType.WILDER,DemonType.BEAST),
	GODDESSYOMA(DemonType.GODDESS,DemonType.YOMA,DemonType.FEMME),
	
	GODLYBEASTGUARDIAN(DemonType.GODLYBEAST,DemonType.GUARDIAN,DemonType.DRAGON),
	GODLYBEASTHOLYBEAST(DemonType.GODLYBEAST,DemonType.HOLYBEAST,DemonType.GODDESS),
	GODLYBEASTMOTHEREARTH(DemonType.GODLYBEAST,DemonType.MOTHEREARTH,DemonType.AVIAN),
	GODLYBEASTNOCTURNUS(DemonType.GODLYBEAST,DemonType.NOCTURNUS,DemonType.HOLYBEAST),
	GODLYBEASTRAPTOR(DemonType.GODLYBEAST,DemonType.RAPTOR,DemonType.WILDER),
	GODLYBEASTREAPER(DemonType.GODLYBEAST,DemonType.REAPER,DemonType.VILE),
	GODLYBEASTSERAPHIM(DemonType.GODLYBEAST,DemonType.SERAPHIM,DemonType.AVIAN),
	GODLYBEASTSNAKE(DemonType.GODLYBEAST,DemonType.SNAKE,DemonType.DRAGON),
	GODLYBEASTVILE(DemonType.GODLYBEAST,DemonType.VILE,DemonType.EVILDRAGON),
	GODLYBEASTWILDBIRD(DemonType.GODLYBEAST,DemonType.WILDBIRD,DemonType.AVIAN),
	GODLYBEASTYOMA(DemonType.GODLYBEAST,DemonType.YOMA,DemonType.DIVINE),
	
	GUARDIANHAUNT(DemonType.GUARDIAN,DemonType.HAUNT,DemonType.BRUTE),
	GUARDIANHOLYBEAST(DemonType.GUARDIAN,DemonType.HOLYBEAST,DemonType.EARTHSPIRIT),
	GUARDIANMOTHEREARTH(DemonType.GUARDIAN,DemonType.MOTHEREARTH,DemonType.DESTROYER),
	GUARDIANNOCTURNUS(DemonType.GUARDIAN,DemonType.NOCTURNUS,DemonType.MOTHEREARTH),
	GUARDIANRAPTOR(DemonType.GUARDIAN,DemonType.RAPTOR,DemonType.REAPER),
	GUARDIANREAPER(DemonType.GUARDIAN,DemonType.REAPER,DemonType.VILE),
	GUARDIANSNAKE(DemonType.GUARDIAN,DemonType.SNAKE,DemonType.MOTHEREARTH),
	GUARDIANTYRANT(DemonType.GUARDIAN,DemonType.TYRANT,DemonType.DESTROYER),
	GUARDIANVILE(DemonType.GUARDIAN,DemonType.VILE,DemonType.REAPER),
	GUARDIANWILDBIRD(DemonType.GUARDIAN,DemonType.WILDBIRD,DemonType.MOTHEREARTH),
	GUARDIANWILDER(DemonType.GUARDIAN,DemonType.WILDER,DemonType.GODLYBEAST),
	GUARDIANYOMA(DemonType.GUARDIAN,DemonType.YOMA,DemonType.FEMME),
	
	HAUNTHOLYBEAST(DemonType.HAUNT,DemonType.HOLYBEAST,DemonType.WILDBIRD),
	HAUNTMOTHEREARTH(DemonType.HAUNT,DemonType.MOTHEREARTH,DemonType.FEMME),
	HAUNTNUCTURNUS(DemonType.HAUNT,DemonType.NOCTURNUS,DemonType.YOMA),
	HAUNTRAPTOR(DemonType.HAUNT,DemonType.RAPTOR,DemonType.WILDBIRD),
	HAUNTSERAPHIM(DemonType.HAUNT,DemonType.SERAPHIM,DemonType.FALLENANGEL),
	HAUNTSNAKE(DemonType.HAUNT,DemonType.SNAKE,DemonType.BRUTE),
	HAUNTTYRANT(DemonType.HAUNT,DemonType.TYRANT,DemonType.FOUL),
	HAUNTVILE(DemonType.HAUNT,DemonType.VILE,DemonType.FOUL),
	HAUNTWILDBIRD(DemonType.HAUNT,DemonType.WILDBIRD,DemonType.YOMA),
	HAUNTWILDER(DemonType.HAUNT,DemonType.WILDER,DemonType.EARTHSPIRIT),
	HAUNTYOMA(DemonType.HAUNT,DemonType.YOMA,DemonType.EARTHSPIRIT),
	
	HOLYBEASTMOTHEREARTH(DemonType.HOLYBEAST,DemonType.MOTHEREARTH,DemonType.GODLYBEAST),
	HOLYBEASTNOCTURNUS(DemonType.HOLYBEAST,DemonType.NOCTURNUS,DemonType.MOTHEREARTH),
	HOLYBEASTRAPTOR(DemonType.HOLYBEAST,DemonType.RAPTOR,DemonType.AVIAN),
	HOLYBEASTSERAPHIM(DemonType.HOLYBEAST,DemonType.SERAPHIM,DemonType.GODLYBEAST),
	HOLYBEASTSNAKE(DemonType.HOLYBEAST,DemonType.SNAKE,DemonType.DESTROYER),
	HOLYBEASTTYRANT(DemonType.HOLYBEAST,DemonType.TYRANT,DemonType.EVILDRAGON),
	HOLYBEASTWILDBIRD(DemonType.HOLYBEAST,DemonType.WILDBIRD,DemonType.AVIAN),
	HOLYBEASTYOMA(DemonType.HOLYBEAST,DemonType.YOMA,DemonType.DIVINE),
	
	MOTHEREARTHNOCTURNUS(DemonType.MOTHEREARTH,DemonType.NOCTURNUS,DemonType.DESTROYER),
	MOTHEREARTHRAPTOR(DemonType.MOTHEREARTH,DemonType.RAPTOR,DemonType.SNAKE),
	MOTHEREARTHSERAPHIM(DemonType.MOTHEREARTH,DemonType.SERAPHIM,DemonType.AMATSUDEMIGOD),
	MOTHEREARTHSNAKE(DemonType.MOTHEREARTH,DemonType.SNAKE,DemonType.FEMME),
	MOTHEREARTHVILE(DemonType.MOTHEREARTH,DemonType.VILE,DemonType.REAPER),
	MOTHEREARTHWILDBIRD(DemonType.MOTHEREARTH,DemonType.WILDBIRD,DemonType.AVIAN),
	MOTHEREARTHWILDER (DemonType.MOTHEREARTH,DemonType.WILDER,DemonType.HAUNT),
	MOTHEREARTHYOMA(DemonType.MOTHEREARTH,DemonType.YOMA,DemonType.NOCTURNUS),
	
	NOCTURNUSRAPTOR(DemonType.NOCTURNUS,DemonType.RAPTOR,DemonType.WILDBIRD),
	NOCTURNUSREAPER(DemonType.NOCTURNUS,DemonType.REAPER,DemonType.FALLENANGEL),
	NOCTURNUSSERAPHIM(DemonType.NOCTURNUS,DemonType.SERAPHIM,DemonType.FALLENANGEL),
	NOCTURNUSSNAKE(DemonType.NOCTURNUS,DemonType.SNAKE,DemonType.FALLENANGEL),
	NOCTURNUSTYRANT(DemonType.NOCTURNUS,DemonType.TYRANT,DemonType.MOTHEREARTH),
	NOCTURNUSVILE(DemonType.NOCTURNUS,DemonType.VILE,DemonType.HAUNT),
	NOCTURNUSWILDBIRD (DemonType.NOCTURNUS,DemonType.WILDBIRD,DemonType.BRUTE),
	NOCTURNUSWILDER(DemonType.NOCTURNUS,DemonType.WILDER,DemonType.BEAST),
	NOCTURNUSYOMA(DemonType.NOCTURNUS,DemonType.YOMA,DemonType.DIVINE),
	
	RAPTORREAPER(DemonType.RAPTOR,DemonType.REAPER,DemonType.EVILDRAGON),
	RAPTORSNAKE(DemonType.RAPTOR,DemonType.SNAKE,DemonType.FOUL),
	RAPTORTYRANT(DemonType.RAPTOR,DemonType.TYRANT,DemonType.DRAGON),
	RAPTORVILE(DemonType.RAPTOR,DemonType.VILE,DemonType.EVILDRAGON),
	RAPTORWILDER(DemonType.RAPTOR,DemonType.WILDER,DemonType.WILDBIRD),
	RAPTORYOMA(DemonType.RAPTOR,DemonType.YOMA,DemonType.EVILDEMON),
	
	REAPERSNAKE(DemonType.REAPER,DemonType.SNAKE,DemonType.EVILDRAGON),
	REAPERTYRANT(DemonType.REAPER,DemonType.TYRANT,DemonType.VILE),
	REAPERVILE(DemonType.REAPER,DemonType.VILE,DemonType.FOUL),
	REAPERWILDBIRD(DemonType.REAPER,DemonType.WILDBIRD,DemonType.RAPTOR),
	REAPERWILDER(DemonType.REAPER,DemonType.WILDER,DemonType.RAPTOR),
	REAPERYOMA(DemonType.REAPER,DemonType.YOMA,DemonType.EARTHSPIRIT),
	
	SERAPHIMVILE(DemonType.SERAPHIM,DemonType.VILE,DemonType.DIVINE),
	SERAPHIMWILDBIRD(DemonType.SERAPHIM,DemonType.WILDBIRD,DemonType.AVIAN),
	SERAPHIMYOMA(DemonType.SERAPHIM,DemonType.YOMA,DemonType.GODDESS),
	
	SNAKETYRANT(DemonType.SNAKE,DemonType.TYRANT,DemonType.EVILDRAGON),
	SNAKEVILE(DemonType.SNAKE,DemonType.VILE,DemonType.DESTROYER),
	SNAKEWILDBIRD(DemonType.SNAKE,DemonType.WILDBIRD,DemonType.BEAST),
	SNAKEWILDER(DemonType.SNAKE,DemonType.WILDER,DemonType.NOCTURNUS),
	SNAKEYOMA(DemonType.SNAKE,DemonType.YOMA,DemonType.NOCTURNUS),
	
	TYRANTVILE(DemonType.TYRANT,DemonType.VILE,DemonType.REAPER),
	TYRANTWILDBIRD(DemonType.TYRANT,DemonType.WILDBIRD,DemonType.EVILDRAGON),
	TYRANTWILDER(DemonType.TYRANT,DemonType.WILDER,DemonType.NOCTURNUS),
	TYRANTYOMA(DemonType.TYRANT,DemonType.YOMA,DemonType.NOCTURNUS),
	
	VILEWILDBIRD(DemonType.VILE,DemonType.WILDBIRD,DemonType.EVILDRAGON),
	VILEWILDER (DemonType.VILE,DemonType.WILDER,DemonType.FOUL),
	VILEYOMA(DemonType.VILE,DemonType.YOMA,DemonType.EARTHSPIRIT),
	
	WILDBIRDWILDER (DemonType.WILDBIRD,DemonType.WILDER,DemonType.FOUL),
	WILDBIRDYOMA (DemonType.WILDBIRD,DemonType.YOMA,DemonType.DIVINE),
	
	WILDERYOMA (DemonType.WILDER,DemonType.YOMA,DemonType.EVILDEMON);
	
	
	DemonType type1;
	DemonType type2;
	DemonType resultType;
	
	private Fusion (final DemonType firstType, final DemonType secondType, final DemonType result) {
		this.type1 = firstType;
		this.type2 = secondType;
		this.resultType = result;
	}
	
	public static Demon fuseTypes (DemonType first, int lvl1, DemonType second,int lvl2){
		if (first.equals(second)){
			return SameTypeFusion.sameTypeFusion(first);
		}
		for (Fusion iteratedFusion : Fusion.values()){
			if ((first.equals(iteratedFusion.type1))&&(second.equals(iteratedFusion.type2))||
			((first.equals(iteratedFusion.type2))&&(second.equals(iteratedFusion.type1)))){
				int average = (lvl1 + lvl2)/2;
				for (Demon iteratedDemon : Demon.getDemonsOfTheType(iteratedFusion.resultType,false)){
					if (iteratedDemon.getLevel() > average)
						if (iteratedDemon.fusType == 2)
							return iteratedDemon;
				}
				return Demon.getDemonsOfTheType(iteratedFusion.resultType,false).get(Demon.getDemonsOfTheType(iteratedFusion.resultType,false).size()-1);
			}
		}
		return null;
	}
	
	public static Demon fuseDemons (Demon first, int lvl1, Demon second,int lvl2){
		if (first.equals(second)){
			return SameTypeFusion.sameTypeFusion(first.getType());
		}
		if ((first.getType().equals(DemonType.SPIRIT))^(second.getType().equals(DemonType.SPIRIT))){
		//Demon + Spirit fusion.
			Demon demonUsed;
			Demon spiritUsed;
			if (first.getType().equals(DemonType.SPIRIT)){
				spiritUsed = first;
				demonUsed = second;
			} else {
				spiritUsed = second;
				demonUsed = first;
			}
			FusResultWrapper fusResult = demonUsed.getType().getSpiritFusion(spiritUsed);
			List<Demon> demonsOfTypeUsed = Demon.getDemonsOfTheType(demonUsed.getType(), false);
			if (fusResult.getResult() == 'U'){
				for (int i = 0; i<demonsOfTypeUsed.size();i++){
					if (demonUsed.equals(demonsOfTypeUsed.get(i)))
						if (i == demonsOfTypeUsed.size()-1)
							return demonUsed; //O NADA? PUEDEN FUSIONARSE? AVERIGUAR!
						else
							return demonsOfTypeUsed.get(i+1);
				}
			} else
			if (fusResult.getResult() == 'D'){
				for (int i = 0; i<demonsOfTypeUsed.size();i++){
					if (demonUsed.equals(demonsOfTypeUsed.get(i)))
						if (i == 0)
							return demonUsed; //O NADA? PUEDEN FUSIONARSE? AVERIGUAR!
						else
							return demonsOfTypeUsed.get(i-1);
				}
			}			
		}
			
		for (Fusion iteratedFusion : Fusion.values()){
			if ((first.getType().equals(iteratedFusion.type1))&&(second.getType().equals(iteratedFusion.type2))||
			((first.getType().equals(iteratedFusion.type2))&&(second.getType().equals(iteratedFusion.type1)))){
				float average = (lvl1 + lvl2)/2;
				for (Demon iteratedDemon : Demon.getDemonsOfTheType(iteratedFusion.resultType,false)){
					if (iteratedDemon.getLevel() > average)
						if (iteratedDemon.fusType == 2)
							return iteratedDemon;
				}
				return Demon.getDemonsOfTheType(iteratedFusion.resultType,false).get(Demon.getDemonsOfTheType(iteratedFusion.resultType,false).size()-1);
			}
		}
		return null;
	}
	
	public DemonType getType1() {
		return type1;
	}
	
	public DemonType getType2() {
		return type2;
	}

	public static Set<?> getReverseModeFor(Demon demon) {
		if (demon.getType().equals(DemonType.SPIRIT)){
			return SameTypeFusion.getReverseMode(demon);
		}
		Set<Fusion> set = new TreeSet<Fusion> (new Comparator<Fusion>(){
			@Override
			public int compare(Fusion o1, Fusion o2) {
				if (o1.getType1().getName().compareTo(o2.getType1().getName()) == 0)
					return o1.getType2().getName().compareTo(o2.getType2().getName());
				return o1.getType1().getName().compareTo(o2.getType1().getName());
			}
		});
		for (Fusion iteratedFusion : Fusion.values()){
			if (iteratedFusion.resultType.equals(demon.getType()))
				set.add(iteratedFusion);
		}
		return set;
	}
	
	@Override
	public String toString(){
		return this.type1.getName()+" + "+this.type2.getName();
	}
	
	/**
	 * 999 = "and up"
	 * @param demon
	 * @return
	 */
	public static String getLevelRange(Demon demon){
		String result = new String();
		if (demon.getType().equals(DemonType.SPIRIT))
			return "Any";
		Object[] levels = Fusion.getLevelsOf(demon.getType()).toArray();
		if (demon.getLevel() == (Integer)levels[0]){
			result = "Less than " + String.valueOf((Integer)levels[0]*2);
			return result;
		}
		if (demon.getLevel() == (Integer)levels[levels.length-1]){
			result = String.valueOf(((Integer)levels[(levels.length-2)])*2) + " and up";
			return result;
		}
		for (int i = 0; i<levels.length; i++){
			if (demon.getLevel() == (Integer)levels[i]){
				result = String.valueOf(((Integer)levels[i-1]*2)) + " to " + String.valueOf((Integer)levels[i]*2-1);
				return result;
			}
		}
		return null;
	}
	
	public static Set<Integer> getLevelsOf (DemonType type){
		Set<Integer> levels = new TreeSet<Integer>();
		for (Demon iteratedDemon : Demon.getDemonsOfTheType(type,false)){
			levels.add(iteratedDemon.getLevel());
		}
		return levels;
	}
}
