package fr.eni.enchere.javaproject.bo;

import java.io.Serializable;

public class Utilisateurs implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private boolean administrateur = false;
	
// Constructeur par défaut
	public Utilisateurs() {
		
	}
	
// Constructeur prenant en compte tous les paramètres
	public Utilisateurs(String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}	
	
// Constructeur prenant en compte tous les paramètres + noUtilisateur
	public Utilisateurs(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		this( pseudo, nom, prenom, email, telephone, rue, codePostal,ville, motDePasse, credit, administrateur);
		this.noUtilisateur = noUtilisateur;
	}

// Getters et Setters
	public int getNoUtilisateur() {
		return noUtilisateur;
	}


	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public int getCredit() {
		return credit;
	}


	public void setCredit(int credit) {
		this.credit = credit;
	}


	public boolean isAdministrateur() {
		return administrateur;
	}


	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	} 
// Methode ToString
	@Override
	public String toString() {
		return "Utilisateurs ->\n Num Utilisateur :" + noUtilisateur + "\n pseudo :" + pseudo + "\n nom :" + nom + "\n prenom :"
				+ prenom + "\n  email :" + email + "\n telephone :" + telephone + "\n rue :" + rue + "\n Code Postal :"
				+ codePostal + "\n ville :" + ville + "\n motDePasse :" + motDePasse + "\n credit :" + credit
				+ "\n administrateur :" + administrateur;
	}


	
	
	
	
	

}
