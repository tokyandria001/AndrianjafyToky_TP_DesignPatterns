# Singleton


**Problème** :

Dans une application de gestion d’équipe de football, il est essentiel de conserver toutes les informations importantes de l’équipe dans un seul et unique endroit.

Si chaque partie du code pouvait créer sa propre instance d’une classe qui gère l’équipe, alors :

La liste des joueurs pourrait être différente selon les modules, ce qui rendrait les données incohérentes.

Le nom de l’entraîneur pourrait diverger d’un composant à l’autre.

Les changements effectués dans une partie du programme ne seraient pas visibles ailleurs, rendant difficile toute coordination globale.

Le pattern Singleton résout ce problème en garantissant qu’il n’existe qu’une seule instance de la classe qui gère l’équipe de football, accessible partout dans l’application.

---
**Principe de fonctionnement** :

Le pattern Singleton empêche la création de plusieurs instances d’une classe. Il le fait en :

* Déclarant le constructeur comme privé, pour empêcher l’instanciation depuis l’extérieur.

* Stockant une référence statique à l’unique instance.

* Fournissant une méthode statique getInstance() qui crée l’objet la première fois puis renvoie toujours la même instance pour tous les appels suivants.

Cela permet d’avoir une instance unique et globale, évitant les inconsistances de données et les conflits dans l’application.

---
**Structure** :
Classe Singleton : FootballTeam

* Contient les données globales de l’équipe (liste des joueurs, entraîneur, etc.).
* Le constructeur est privé pour empêcher la création directe d’instances.
* Une variable statique privée stocke l’unique instance.
* La méthode statique getInstance() permet d’obtenir cette instance.

---
**Avantages** :
* Assure que seule une instance existe dans tout le programme.
* Fournit un point d’accès global à l’objet.
* Évite les incohérences de données en centralisant les informations de l’équipe.
* Économie de ressources parce qu’on ne crée pas plusieurs objets identiques.

---
**Inconvénients** :
* Peut être difficile à tester (mocking) car son état persiste.
* Introduit des dépendances globales qui compliquent parfois la maintenance.
* Moins flexible si l’on souhaite gérer plusieurs équipes dans des contextes différents.

---
**Cas d’usage** :

Le pattern Singleton peut être utile dans des situations où une seule instance doit gérer une ressource ou des données partagées, par exemple :

* Gestion centralisée des paramètres d’une application.
* Système de journalisation unique.
* Pool de connexions à une base de données.
* Dans notre exemple : gestion d’une équipe de football, où une seule entité doit contenir l’état complet de l’équipe (joueurs, coach, etc.).