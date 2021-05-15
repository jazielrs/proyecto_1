//Librerias para Escritura y Lectura de Archivos

package data;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FilesTxt {

	// Crea el archivo y la ubicaci�n a escribir
	FileWriter file;
	// Objeto que escribe en el archivo creado
	PrintWriter pw;

	// Es la ubicaci�n con el archivo a leer
	File fileAddress;
	// Objeto que permite leer el archivo seleccionado
	FileReader fr;
	// Objeto que almacena el archivo leido
	BufferedReader br;

	public FilesTxt() {
	}

	public void writeFile(String address, String data) {

		try {
			// Se crea el archivo y se la dan las propiedades de escritura (boolean)
			file = new FileWriter(address, true);
			// Se crea el objeto que tiene la propiedad de escribir en el archivo
			pw = new PrintWriter(file);

			pw.println(data);

		} catch (IOException ioe) {

			JOptionPane.showMessageDialog(null, ioe.getMessage());
			ioe.printStackTrace();
		} finally {
			try {
				file.close();// Cerrar el archivo de texto
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				e.printStackTrace();
			}
		}
	}

	public String readFile(String address) {

		String information = "";
		String line = "";

		try {
			fileAddress = new File(address);
			fr = new FileReader(fileAddress);
			br = new BufferedReader(fr);

			// Leo una l�nea y si tiene un valor, la almaceno
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				information += line + "\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return information;
	}

	public boolean existFile(String address) {

		File file = new File(address);

		return file.exists();
	}
	public String readFileUser(String address) {

		String information = "";
		String line = "";
		String vec[] = new String[2];
		try {
			fileAddress = new File(address);
			fr = new FileReader(fileAddress);
			br = new BufferedReader(fr);

			// Leo una l�nea y si tiene un valor, la almaceno
			while ((line = br.readLine()) != null) {

				information += line+"\n";
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println(information);
		return information;
	}
}