package es.studium.taller;

import java.io.*;
import org.apache.commons.net.ftp.*;
public class SubirFichero {
	public static void main(String[] args) {
		FTPClient cliente = new FTPClient(); //cliente
		String servidor = "127.0.0.1"; //servidor

		String user = "usuario";
		String pasw = "clave";
		try {
			System.out.println("Conectandose a " + servidor);
			cliente.connect(servidor);
			boolean login = cliente.login(user, pasw);
			String direc = "/NUEVODIREC";
			if (login) {
				cliente.changeWorkingDirectory(direc);
				cliente.setFileType(FTP.BINARY_FILE_TYPE);
				//stream de entrada con el fichero a subir
				BufferedInputStream in = new
						BufferedInputStream(new FileInputStream("C:\\texto1.txt"));
				cliente.storeFile("texto1.txt", in);
				in = new BufferedInputStream(new
						FileInputStream("C:\\studium.jpg"));
				cliente.storeFile("studium.jpg", in);
				in.close(); //cerrar flujo
				cliente.logout(); //logout del usuario
				cliente.disconnect(); //desconexión del servidor
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}