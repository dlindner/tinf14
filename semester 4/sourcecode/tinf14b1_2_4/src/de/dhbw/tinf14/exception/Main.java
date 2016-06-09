package de.dhbw.tinf14.exception;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
	
	public static void main(final String[] args) {
		try (ServerSocket socket = new ServerSocket(33322)) {
			System.out.println("open");
			
			//verwende socket
			final String text = null;
			text.length();
			
		} catch (final IOException e) {
			System.out.println("Alles blöd!");
			e.printStackTrace();
		} finally {
			return;
		}
	}

}
