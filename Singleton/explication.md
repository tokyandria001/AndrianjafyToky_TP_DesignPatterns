# Singleton


**Problème** :
Dans le contrôle des missions spatiales, il est crucial de disposer d'un centre de contrôle unique qui supervise toutes les missions et leurs fusées.
Si plusieurs instances existaient :

- Deux centres pourraient ordonner simultanément des lancements sur la même mission, créant des conflits.

- Des fusées pourraient être assignées à plusieurs missions par erreur, entraînant des incohérences dans la planification.

La supervision globale deviendrait incohérente, rendant impossible de suivre l’état réel des missions.

Le Singleton permet donc de garantir qu’il n’y a qu’un seul point de contrôle, centralisant toutes les décisions et évitant les conflits ou la duplication de données.

---
**Principe de fonctionnement** :
Le Singleton garantit qu’une classe n’a qu’une seule instance. Le constructeur est privé, et l’accès à l’instance unique se fait via une méthode statique. Chaque appel à cette méthode retourne la même instance.

---
**Structure** :
- MissionControlCenter : classe contenant la liste des missions et les méthodes pour les gérer.  
- Instance statique privée et constructeur privé.  
- Méthode publique statique `getInstance()` pour récupérer l’instance.

---
**Avantages** :
- Assure une supervision unique des missions  
- Accès global à l’instance  
- Prévention des incohérences et économies de ressources

---
**Inconvénients** :
- Difficile à tester (mocking)  
- Dépendances globales possibles  
- Moins flexible si besoin de plusieurs instances dans le futur

---
**Cas d’usage** :
- Centre de contrôle spatial supervisant plusieurs fusées et missions en même temps.
