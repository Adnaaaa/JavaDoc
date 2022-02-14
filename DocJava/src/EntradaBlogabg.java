/**Clase para manejar las entradas de un blog.
 * @version 2.3, 21/03/1999
 * @author Adrián Butrón
 */

public class EntradaBlogabg {
/**
 * Constructor
 * @author Adrián Butrón
 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
/**
 * Constructor de la clase. recibe el número de entrada, el nombre del autor
 * @param id primer parametro de entrada
 * @param autor segundo parametro de entrada
 * @param texto tercer parametro de entrada
 * @throws IllegalArgumentException Si el número de entrada es negativo, lanza una excepción.
 * @return Devuelve los parámetros de entrada el texto que contiene la entrada
 */

		public EntradaBlogabg (int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
/**
 * @return Devuelve el número de la entrada
 */
		public int getId(){
			return this.id;
		}
		
/**		
 * @return devuelve el texto completo de la entrada
 */
		public String getTexto(){
			return this.texto;
		}
		
/**
 * @return devuelve el nombre del autor de la entrada en mayúsculas
 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
/**
 * 		
 * @return devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
 */
		public String devuelveAutor(){
			return this.autor;
		}
		
/**
 * @param args No tiene porqué tener argumentos.
 */
		public static void main(String[] args) {
	                // Todo método main necesita ser implementado
			EntradaBlogabg e1=new EntradaBlogabg (3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}
	}

