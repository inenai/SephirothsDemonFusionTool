/**
 * 
 */
package miscelaneos;

import java.util.LinkedList;
import java.util.List;

/**
 * @author inaiberger
 * 
 */
public class StringTools {

	/**
	 * Devuelve la primera palabra de un String (separada del resto del String
	 * por un espacio o un guion bajo ('_').
	 * 
	 * @param lineaArchivo
	 *            (String)
	 * @return String
	 */
	public static String primeraPalabra(final String lineaArchivo) {

		final StringBuffer linea = new StringBuffer(40);
		linea.append(lineaArchivo);

		char c;
		int index = 0;
		final StringBuffer palabra = new StringBuffer(15);

		c = linea.charAt(index);
		while (c != ' ' && c != '_' && index < linea.length()) {
			palabra.append(c);
			index++;
			c = linea.charAt(index);
		}
		return palabra.toString();
	}

	/**
	 * Toma un string y lo separa en palabras, que después guarda y devuelve en
	 * una lista de Strings.
	 * 
	 * @author inaiberger
	 * @param lineaArchivo
	 *            (String)
	 * @return una lista de Strings.
	 */
	public static List<String> lineToListOfWords(final String lineaArchivo) {

		final StringBuffer linea = new StringBuffer(40);
		linea.append(lineaArchivo);
		final List<String> lista = new LinkedList<String>();

		char c;
		int index = 0;
		final StringBuffer palabra = new StringBuffer(15);

		c = linea.charAt(index);

		while (index < linea.length()) {
			while (c != ' ' && index < linea.length()) {
				if (c != '\r')
					palabra.append(c);
				index++;
				if (index != linea.length())
					c = linea.charAt(index);
			}
			lista.add(palabra.toString());
			palabra.delete(0, palabra.length());
			index++;
			if (index != linea.length() + 1)
				c = linea.charAt(index);
		}
		return lista;
	}

	/**
	 * Cambia espacios por '_' en un string.
	 * 
	 * @author inaiberger
	 * @param tira
	 *            (String)
	 * @return String
	 */
	public static String cambiarEspaciosAGuionBajo(final String tira) {
		final StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < tira.length(); i++) {
			if (tira.charAt(i) != ' ')
				buffer.append(tira.charAt(i));
			else
				buffer.append('_');
		}
		return buffer.toString();
	}

	/**
	 * Toma el nombre de un campo (siempre en minúscula y con guion bajo ('_')
	 * en vez de espacios) y los reescribe en mayúscula y colocando espacios
	 * donde estan los guiones bajos. Al final le agrega dos puntos (':'). Para
	 * usar en las labels que se usan en las ventanas.
	 * 
	 * @author inaiberger
	 * @param campo
	 *            (String)
	 * @return String
	 */
	public static String nombreDeCampoALabel(final String campo) {
		final StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < campo.length(); i++) {
			if (i == 0 && campo.charAt(0) > 96)
				// Entre 97 y 122 - es minuscula
				buffer.append((char) (campo.charAt(i) - 32));
			else if (i == 0)
				buffer.append((campo.charAt(i)));
			else if (campo.charAt(i) == '_')
				buffer.append(' ');
			else
				buffer.append(campo.charAt(i));
		}
		return buffer.toString();
	}


	/**
	 * @param desc
	 * @return
	 */
	public static int contarPalabras(final String desc) {
		int cantPalabras = 0;
		for (int i = 0; i < desc.length(); i++) {
			if (desc.charAt(i) == ' ')
				cantPalabras++;
		}
		return cantPalabras + 1;
	}
}
