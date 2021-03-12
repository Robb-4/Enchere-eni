package fr.eni.enchere.javaproject.utils;


import java.security.SecureRandom;

public class TokenGenerator {
	
    protected static SecureRandom random = new SecureRandom();
    
    public synchronized String generateToken( String username ) {
            long longToken = Math.abs( random.nextLong() );
            String random = Long.toString( longToken, 16 );
            return ( username + ":" + random );
    }
}
// CLASSE POUR AJOUT D'IMG, A RECHERCHER