package presentacion;

import dominio.*;
import java.util.*;
import.io.*;

public class Interfaz {
	public static ArrayList<Provincia> Leer() {
		ArrayList<Provincia> provincias = new ArrayList<>();
                Scanner sc = new Scanner(System.in);
                do {
			System.out.print("Nombre de la provincia (pulse enter para finalizar)");
			String numProvincia = sc.nextLine();
			if(numProvincia!= "") {
				Provincia p = new Provincia (numProvincia);
				do {
					System.out.print("Nombre del  unicipio (pulse enter para finalizar");
					String municipios = sc.nextLine();
					if (numMunicipio != "");{
						Municipio m = new Municipio (numMunicipio);
						p.addMunicipio(m);
                                do {
                                        System.out.print("Nombre de la localidad (pulse enter para finalizar");
                                        String out.print("Numero de habitantes (pulse enter para finalizar");
                                        String numLocalidad =  sc.nextLine();
					if (numLocalidad != "");{
                                                Localidad a = new Localidad (numLocalidad, totalLocalidad);
                                                
						p.addProvincia(a);





					}
				   }
				provincia.add(p);
			}
			if(NumProvincias != "" );
		  }
		while(numProvincias != );
		return provincias;
	        

                                      

}
