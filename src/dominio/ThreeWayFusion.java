package dominio;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public enum ThreeWayFusion {
	BISHAMOTEN1(Demon.JIKOKUTEN,Demon.KOUMOKUTEN,Demon.RAKSHASA,Demon.BISHAMOTEN,Demon.BISHAMOTEN.getName()+"'s plugin needed."),
	BISHAMOTEN2(Demon.JIKOKUTEN,Demon.KOUMOKUTEN,Demon.YAKSINI,Demon.BISHAMOTEN,Demon.BISHAMOTEN.getName()+"'s plugin needed."),
	HECATE1(Demon.ARTEMIS,Demon.QUETZALCOATL,Demon.YAKSINI,Demon.HECATE,""),
	HECATE2(Demon.PARVATI,Demon.GANGA,Demon.DAKINI,Demon.HECATE,""),
	HECATE3(Demon.KALI,Demon.GANGA,Demon.DECARABIA,Demon.HECATE,""),
	INEXPERIENCEDAELLO(Demon.AELLO,Demon.INEXPERIENCEDKOPPATENGU,Demon.PYROJACK,Demon.INEXPERIENCEDAELLO,"Plugin needed."),
	INEXPERIENCEDARAHABAKI(Demon.ARAHABAKI,Demon.INEXPERIENCEDOCYPETE,Demon.INEXPERIENCEDJACKFROST,Demon.INEXPERIENCEDARAHABAKI,"Plugin needed."),
	INEXPERIENCEDCAITSITH(Demon.CAITSITH,Demon.SLIME,Demon.INEXPERIENCEDSUDAMA,Demon.INEXPERIENCEDCAITSITH,"Plugin needed."),
	INEXPERIENCEDDOMINION(Demon.DOMINION,Demon.INEXPERIENCEDOBERON,Demon.QUETZALCOATL,Demon.INEXPERIENCEDDOMINION,"Plugin needed."),
	INEXPERIENCEDGARM(Demon.GARM,Demon.INEXPERIENCEDQUETZALCOATL,Demon.INEXPERIENCEDHARPY,Demon.INEXPERIENCEDGARM,"Plugin needed."),
	INEXPERIENCEDHARPY(Demon.HARPY,Demon.INEXPERIENCEDGARM,Demon.INEXPERIENCEDQUETZALCOATL,Demon.INEXPERIENCEDHARPY,"Plugin needed."),
	INEXPERIENCEDJACKFROST(Demon.JACKFROST,Demon.INEXPERIENCEDOCYPETE,Demon.ARAHABAKI,Demon.INEXPERIENCEDJACKFROST,"Plugin needed."),
	INEXPERIENCEDKELAINO(Demon.KELAINO,Demon.NEKOMATA,Demon.YAKSINI,Demon.INEXPERIENCEDKELAINO,"Plugin needed."),
	INEXPERIENCEDKOPPATENGU(Demon.KOPPATENGU,Demon.INEXPERIENCEDAELLO,Demon.INEXPERIENCEDPYROJACK,Demon.INEXPERIENCEDKOPPATENGU,"Plugin needed."),
	INEXPERIENCEDNEKOMATA(Demon.NEKOMATA,Demon.INEXPERIENCEDKELAINO,Demon.YAKSINI,Demon.INEXPERIENCEDNEKOMATA,"Plugin needed."),
	INEXPERIENCEDOBERON(Demon.OBERON,Demon.DOMINION,Demon.QUETZALCOATL,Demon.INEXPERIENCEDOBERON,"Plugin needed."),
	INEXPERIENCEDOCYPETE(Demon.OCYPETE,Demon.INEXPERIENCEDJACKFROST,Demon.ARAHABAKI,Demon.INEXPERIENCEDOCYPETE,"Plugin needed."),
	INEXPERIENCEDPARVATI(Demon.PARVATI,Demon.INEXPERIENCEDTITANIA,Demon.INEXPERIENCEDYATAGARASU,Demon.INEXPERIENCEDPARVATI,"Plugin needed"),
	INEXPERIENCEDPOLTERGEIST(Demon.POLTERGEIST,Demon.UNICORN,Demon.INEXPERIENCEDPRINCIPALITY,Demon.INEXPERIENCEDPOLTERGEIST,"Plugin needed"),
	INEXPERIENCEDPRINCIPALITY(Demon.PRINCIPALITY,Demon.INEXPERIENCEDUNICORN,Demon.INEXPERIENCEDPOLTERGEIST,Demon.INEXPERIENCEDPRINCIPALITY,"Plugin needed."),
	INEXPERIENCEDPYROJACK(Demon.PYROJACK,Demon.INEXPERIENCEDAELLO,Demon.INEXPERIENCEDKOPPATENGU,Demon.INEXPERIENCEDPYROJACK,"Plugin needed."),
	INEXPERIENCEDQUETZALCOATL(Demon.QUETZALCOATL,Demon.INEXPERIENCEDGARM,Demon.INEXPERIENCEDHARPY,Demon.INEXPERIENCEDQUETZALCOATL,"Plugin needed"),
	INEXPERIENCEDSLIME(Demon.SLIME,Demon.INEXPERIENCEDSUDAMA,Demon.INEXPERIENCEDCAITSITH,Demon.INEXPERIENCEDSLIME,"Plugin needed"),
	INEXPERIENCEDSUDAMA(Demon.SUDAMA,Demon.INEXPERIENCEDCAITSITH,Demon.SLIME,Demon.INEXPERIENCEDSUDAMA,"Plugin needed."),
	INEXPERIENCEDTITANIA(Demon.TITANIA,Demon.YATAGARASU,Demon.PARVATI,Demon.INEXPERIENCEDTITANIA,"Plugin needed."),
	INEXPERIENCEDUNICORN(Demon.UNICORN,Demon.POLTERGEIST,Demon.PRINCIPALITY,Demon.INEXPERIENCEDUNICORN,"Plugin needed."),
	INEXPERIENCEDYAKSINI(Demon.YAKSINI,Demon.INEXPERIENCEDKELAINO,Demon.INEXPERIENCEDNEKOMATA,Demon.INEXPERIENCEDYAKSINI,"Plugin needed."),
	INEXPERIENCEDYATAGARASU(Demon.YATAGARASU,Demon.TITANIA,Demon.PARVATI,Demon.INEXPERIENCEDYATAGARASU,"Plugin needed."),
	KINGFROST1(Demon.JACKFROST,Demon.INEXPERIENCEDJACKFROST,Demon.DEFORMEDJACKFROST,Demon.KINGFROST,""),
	KINGFROST2(Demon.JACKFROST,Demon.INEXPERIENCEDJACKFROST,Demon.SANTAFROST,Demon.KINGFROST,""),
	KINGFROST3(Demon.JACKFROST,Demon.INEXPERIENCEDJACKFROST,Demon.LIONDANCEFROST,Demon.KINGFROST,""),
	LOKI1(Demon.ODIN,Demon.HEL,Demon.SLEPNIR,Demon.LOKI,""),
	LOKI2(Demon.ODIN,Demon.CHERNOBOG,Demon.KURAMATENGU,Demon.LOKI,""),
	MITHRA1(Demon.THRONE,Demon.JIKOKUTEN,Demon.KALI,Demon.MITHRA,""),
	MITHRA2(Demon.DOMINION,Demon.SKADI,Demon.OKUNINUSHI,Demon.MITHRA,""),
	MITHRA3(Demon.VIRTUE,Demon.SKADI,Demon.TAKEMIKAZUCHI,Demon.MITHRA,""),
	MOT(Demon.ODIN,Demon.CHERNOBOG,Demon.HEL,Demon.MOT,Demon.MOT.getName()+"'s plugin needed."),
	ODIN1(Demon.YATAGARASU,Demon.SLEPNIR,Demon.VALKYRIE,Demon.ODIN,""),
	ODIN2(Demon.VALKYRIE,Demon.GARUDA,Demon.PARVATI,Demon.ODIN,""),
	ODIN3(Demon.KURAMATENGU,Demon.YATAGARASU,Demon.SATI,Demon.ODIN,""),
	PALASATHENA(Demon.THRONE,Demon.VALKYRIE,Demon.SATI,Demon.PALASATHENA,Demon.PALASATHENA.getName()+"'s plugin needed."),
	PHANTOM(Demon.SURT,Demon.SPECTOR,Demon.QUETZALCOATL,Demon.PHANTOM,Demon.PHANTOM.getName()+"'s plugin needed."),
	SURT1(Demon.JIKOKUTEN,Demon.FENRIR,Demon.SHIKIOUJI,Demon.SURT,Demon.SURT.getName()+"'s plugin needed."),
	SURT2(Demon.THRONE,Demon.HECATE,Demon.SURT,Demon.SURT,""),
	SURT3(Demon.THRONE,Demon.HECATE,Demon.URIEL,Demon.SURT,""),
	SUZAKU(Demon.PHOENIX,Demon.KIRIN,Demon.BADBHCATH,Demon.SUZAKU,Demon.SUZAKU+"'s plugin needed."),
	THOTH1(Demon.SARASVATI,Demon.PHOENIX,Demon.KAICHI,Demon.THOTH,""),
	THOTH2(Demon.SARASVATI,Demon.JATAYU,Demon.NANDI,Demon.THOTH,""),
	THOTH3(Demon.SARASVATI,Demon.FENGHUANG,Demon.KIRIN,Demon.THOTH,""),
	URIEL1(Demon.DOMINION,Demon.VIRTUE,Demon.POWER,Demon.URIEL,Demon.URIEL.getName()+"'s plugin needed."),
	URIEL2(Demon.DOMINION,Demon.THRONE,Demon.SURT,Demon.URIEL,""),
	URIEL3(Demon.DOMINION,Demon.THRONE,Demon.URIEL,Demon.URIEL,""),
	RAPHAEL(Demon.URIEL,Demon.THRONE,Demon.THRONE,Demon.RAPHAEL,Demon.RAPHAEL.getName()+"'s plugin needed.");
	
	Demon first;
	Demon second;
	Demon third;
	Demon result;
	String message;
	
	private ThreeWayFusion (final Demon first,Demon second, Demon third, Demon result, final String message){
		this.first = first;
		this.second = second;
		this.third = third;
		this.result = result;
		this.message = message;
	}
	
	public final Demon getFirst() {
		return first;
	}

	public final Demon getSecond() {
		return second;
	}

	public final Demon getThird() {
		return third;
	}

	public Demon getResult(){
		return this.result;
	}
	
	public String getMessage(){
		if (this.message.equals("")){
			return "<html><i>No notes.</i></html>";
		}
		return this.message;
	}
		
	public static Set<ThreeWayFusion> getThreeWayReverseModeFor(Demon demon) {
		Set<ThreeWayFusion> set = new TreeSet<ThreeWayFusion>(new Comparator<ThreeWayFusion>(){
			@Override
			public int compare(ThreeWayFusion o1, ThreeWayFusion o2) {
				if (o1.getFirst().getName().compareTo(o2.getFirst().getName()) == 0){
					if (o1.getSecond().getName().compareTo(o2.getSecond().getName()) == 0){
						return o1.getThird().compareTo(o2.getThird());
					}
					return o1.getSecond().compareTo(o2.getSecond());
				}
				return o1.getFirst().getName().compareTo(o2.getFirst().getName());
			}
		});
		for (ThreeWayFusion iteratedFusion : ThreeWayFusion.values()){
			if (iteratedFusion.result.equals(demon))
				set.add(iteratedFusion);
		}
		return set;
	}

	public String getFusionDesc() {
		if (this.message.equals(""))
			return this.first.getName()+" + "+this.second.getName()+" + "+third.getName(); 
		return this.first.getName()+" + "+this.second.getName()+" + "+third.getName()+"*";
	}

}
