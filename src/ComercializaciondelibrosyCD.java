import java.util.ArrayList;

public class ComercializaciondelibrosyCD {
	
	public static void mostrar1(ArrayList<Libros> p ) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	
	public static void PrecioIvaL(ArrayList<Libros> p ) {
		double precio,iva,precioIva,descuento,precioTotal;

		for(int i = 0; i < p.size(); i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.04;
			descuento = precio*0.2;
			precioTotal = precio + iva - descuento;
			precioIva = precio +iva;
			p.get(i).setPrecioIva(precioIva);
			p.get(i).setPrecioTotal(precioTotal);
			}
	}
	
	
	
	public static void mostrar2(ArrayList<CD> p ) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	
	public static void PrecioIvaC(ArrayList<CD> p ) {
		double precio,iva,precioIva,descuento,precioTotal;

		for(int i = 0; i < p.size(); i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.09;
			precioIva = precio +iva;
			p.get(i).setPrecioIva(precioIva);
			descuento = precio*0.1;
			precioTotal = precio + iva - descuento;
			p.get(i).setPrecioTotal(precioTotal);
				
			}
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Libros> lib = new ArrayList<Libros>();
		System.out.println("Datos de libros y de los CDs \n");
		Libros lib1 = new Libros(84032, "Battle Royale", "Koushun Takami", 1969, "Amagazaqui" , 864068974 , 60 );
		Libros lib2 = new Libros(54321, "Soy leyenda", "Richard Matheson", 1903, "Nueva Jersey" , 74601742 , 66.51 );
		Libros lib3 = new Libros(89562, "FAHRENHEIT 451", "Ray Bradbury", 1920, "Waukegan" , 325245050 , 45.98 );
		Libros lib4 = new Libros(78945, "La insoportable levedad del ser", "Milan Kundera", 2001, "Almadía" , 28504741 , 49);
		
		lib.add(lib1);
		lib.add(lib2);
		lib.add(lib3);
		lib.add(lib4);
		
		
		
		ArrayList<CD> cd = new ArrayList<CD>();
		CD cd1 = new CD(45678, "Secuencia", "Reik", 2006, 40);
		CD cd2 = new CD(98435, "SODA ESTEREO", "Soda Estereo", 1984, 23);
		CD cd3 = new CD(23145, "¿Que pides tu?", "Alex Ubago", 2003, 50);
		CD cd4 = new CD(19804, "Finisteria", "Mago de Oz", 2000, 60);
		
		cd.add(cd1);
		cd.add(cd2);
		cd.add(cd3);
		cd.add(cd4);
		
		mostrar1(lib);
		mostrar2(cd);
		
		
		
		PrecioIvaL(lib);
		System.out.println("\n--PRECIO VENTA LIBROS--\n");
		System.out.println("Libro1 con iva: " + lib1.getPrecioIva() + "$" +  " - Descuento = Precio Venta: "  + lib1.getPrecioTotal() + "$" );
		System.out.println("Libro2 con iva: " + lib2.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib2.getPrecioTotal() + "$" );
		System.out.println("Libro3 con iva: " + lib3.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib3.getPrecioTotal() + "$" );
		System.out.println("Libro4 con iva: " + lib4.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib4.getPrecioTotal() + "$" );
		
		PrecioIvaC(cd);
		System.out.println("\n--PRECIO VENTA DE CDs--\n");
		System.out.println("CD1 con iva: " + cd1.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " +  cd1.getPrecioTotal() + "$" );
		System.out.println("CD2 con iva: " + cd2.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd2.getPrecioTotal()+ "$" );
		System.out.println("CD3 con iva: " + cd3.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd3.getPrecioTotal() + "$" );
		System.out.println("CD4 con iva: " + cd4.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd4.getPrecioTotal() + "$" );
	
	}

}