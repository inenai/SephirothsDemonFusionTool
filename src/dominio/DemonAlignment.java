package dominio;

import java.awt.Color;
import java.util.zip.DataFormatException;

import javax.swing.JLabel;

public enum DemonAlignment {

	LAW("LAW"),
	NEUTRAL("NEUTRAL"),
	CHAOS("CHAOS");
	
	String typeName;
	
	private DemonAlignment (final String type) {
		this.typeName = type;
	}

	public static DemonAlignment nameToType(String type) throws DataFormatException {
		for (final DemonAlignment iteratedAllignment : DemonAlignment.values()) {
			if (iteratedAllignment.typeName.equals(type))
				return iteratedAllignment;
		}
		System.out.println("DemonAlignment: No se encontró la alineación.");
		throw (new DataFormatException());
	}
	
	@Override
	public String toString(){
		return new String (this.typeName);
	}
	
	public JLabel toLabel(){
		JLabel label = new JLabel (this.typeName);
		switch(this){
		case NEUTRAL:
			label.setForeground(new Color(36675));
			break;
		case LAW:
			label.setForeground(Color.BLUE);
			break;
		case CHAOS:
			label.setForeground(Color.RED);
			break;
		}
		return label;
	}
	
}
