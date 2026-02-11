# Factory Method

**Problème**

Lorsqu’une agence spatiale doit préparer des missions, il existe différents types de fusées (Cargo, Passagers, Exploration) adaptées à des objectifs variés.

Si on créait les fusées directement dans le code client :

- Le client devrait connaître toutes les classes concrètes de fusées, ce qui crée un fort couplage.

- Ajouter une nouvelle fusée (ex : une fusée de ravitaillement automatique) nécessiterait de modifier toutes les parties du code qui créent des fusées, augmentant le risque d’erreurs.

La logique de création serait dispersée dans tout le programme, rendant le code difficile à maintenir et à étendre.

Le pattern Factory Method résout ces problèmes en centralisant la création : chaque type de fusée est créé par une factory spécifique, et le client peut obtenir une fusée sans connaître sa classe concrète. Cela rend le code flexible, extensible et plus sûr.

---
**Principe de fonctionnement**

Le pattern définit une interface commune pour les objets créés (ici, Rocket) et une factory abstraite qui déclare une méthode de création (createRocket()). Chaque factory concrète (ex : CargoRocketFactory, PassengerRocketFactory) instancie le type spécifique de fusée.
Le client utilise uniquement la factory abstraite pour créer ses fusées, sans dépendre des classes concrètes.