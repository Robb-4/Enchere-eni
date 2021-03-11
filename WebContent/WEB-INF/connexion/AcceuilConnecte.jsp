<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <nav>
            <a href="<%=request.getContextPath()%>/AcceuilConnecte">ENI-Encheres</a>
            <a href="/Eclipse/Enchere-Eni/WebContent/Page Accueil/pageListeEncheresConnecte.html">Enchères</a>
            <a href="/Eclipse/Enchere-Eni/WebContent/Page Vente/pageVendreUnArticle.html">Vendre un article</a>
            <a href="<%=request.getContextPath()%>/AfficherProfil">Mon profil</a>
            <a href="<%=request.getContextPath()%>/Deconnection">Déconnexion</a>

 

 </nav>
        <h1>Liste des enchères</h1>
        <br>
        <br>
        <div>
            <label for="site-search">Filtres :</label>
            <input type="search" id="site-search" name="recherche" aria-label="Le nom de l'article contient">
            <button>Rechercher</button>
        </div>
        <br>
        <div>
            <label for="Selection-categorie">Catégorie :</label>
            <select name="Categorie" id="Selection-categorie">
                <option value="Toutes">Toutes </option>
                <option value="Informatique">Informatique </option>
                <option value="Ameublement">Ameublement </option>
                <option value="Vêtement">Vêtement </option>
                <option value="Sport&Loisirs">Sport et Loisirs </option>
            </select>
        </div>
        <br>
        <br>
        <form action="" method="get" class="achatvente">
	       	<fieldset>
				<legend>
	                 <input type="radio" id="achat" name="achat" value="achat" checked> Achats :
	            </legend>
					<fieldset>
						<div>
						   <input type="checkbox" id="ouvertes" name="ouvertes" value="Encheres ouvertes" checked>
						   <label for="ouvertes">Enchères ouvertes</label>
						 </div>
						 <div>
						   <input type="checkbox" id="encheres" name="encheres" value="Mes encheres">
						   <label for="encheres">Mes enchères</label>
						 </div>
						 <div>
						   <input type="checkbox" id="remportees" name="remportees" value="Mes encheres remportées">
						   <label for="remportees">Mes encheres remportées</label>
						 </div>
			      	</fieldset>
	         	<legend>
	                  <input type="radio" id="ventes" name="ventes" value="Ventes"> Mes ventes :
	            </legend>
	       			<fieldset>
			            <div>
			                <input type="checkbox" id="encours" name="encours" value="Mes ventes en cours">
			                <label for="encours">mes ventes en cours</label>
			            </div>
			            <div>
			                <input type="checkbox" id="nondebutees" name="nondebutees" value="Ventes non débutées">
			                <label for="nondebutees">ventes non débutées</label>
			            </div>
			            <div>
			                <input type="checkbox" id="terminees" name="terminees" value="Ventes terminées">
			                <label for="terminees">ventes terminées</label>
			            </div>
	        		</fieldset>
	        </fieldset>
	    </form>
        <br>
        
        <div>
            <img src="#"    alt="Exemple de produit - #">
            <div>
                <h4>PIOU PIOU <a href="/Eclipse/Enchere-Eni/WebContent/Page Vente/pageEncherir.html"></a></h4>
                <p> Prix : tbd </p>
                <p> Fin de l'enchère : JJ/MM/AAAA </p>
                <p> Vendeur : <a href="/Eclipse/Enchere-Eni/WebContent/Page Connexion/pageProfil.html">JOJO44</a></p>
            </div>
        </div>
        <footer>To be determined</footer>

 

 

 

</body>
</html>