<p align="center">
<img src="https://cdn-icons-png.flaticon.com/512/4599/4599049.png" alt="ECF_JAVA" width="200"/>
</p>

# **ECF_JAVA PHARMACIE SPARADRAP**

## **Use Cases**
| User              | Action          | Résultat attendu |
| :----------------:|:---------------:| ----------------:|
|Pharmacien|démarrage de l'appli|chargement d'une simu de BDD|
|Pharmacien|FenetrePrincipale|accueil avec logo et titre de l'appli|
|Pharmacien|FentreAchat|panel enfant supperposé à la frame principale qui permet le choix du type d'achat|
|Pharmacien|PanelAchatSansOrdonnance|panel enfant supperposé à la frame principale qui permet l'ajout d'un client, nom, prénom, date de naissance et sa liste de médicament(s) acheté(s) avec le prix et le stock restant (possibilité d'en ajouter plusieurs par achat et client|
|Pharmacien|...|...|

## **Procédure**

### **1.1 Classe Main**
* Classe principale main qui définit la méthode de "look and feel" qui force l'utilisation du thread (tuyau) courant, point d'entrée de l'application avec création de la méthode static Pharmacie qui permet d'instancier une Pharmacie et toutes les listes qui lui sont nécessaires
* Utilisation de la méthode Look and feel de swing UIManager
* Try catch en cas d'erreur au chargement de l'application
* Appel de la frame principale qui contient tous les autres panel enfant en tant que composants indépendants

### **1.2 Classe FenetrePrincipale**
* Frame principale, qui regroupe l'ensemble des propriétés de la fenêtre principale de l'application
* Appel/remove/repaint/revalidate des panels enfants
* Bouton quitter commun à toute l'appli qui stop l'application
* Bouton Total des médicaments vendus par session (durée de vie de l'appli) commun à toute l'appli qui permet de suivre une liste accompagné du prix et du stock restant de chaque médicament
* Utilisation de swing et awt pour construire le visuel de la fenêtre et ses events, son menu et sa barre de statut

### **1.3 Class FenetreAchat**
* Classe d'un panel "canvas" qui génère les panel enfants sans et avec ordonnance
* JComboBOx qui permet le switch de pannel au click

### **1.4 ...**
