package Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Classe Singleton qui gère toutes les missions et leurs fusées
public class MissionControlCenter {
    // Instance unique de la classe
    private static MissionControlCenter instance;

    // Map qui associe chaque mission à une liste de fusées
    private Map<String, List<String>> missionsAndRockets;

    // Constructeur privé pour empêcher l'instanciation externe
    private MissionControlCenter() {
        missionsAndRockets = new HashMap<>();
    }

    // Méthode statique pour obtenir l'unique instance
    public static MissionControlCenter getInstance() {
        if (instance == null) {
            System.out.println("Création du MissionControlCenter");
            instance = new MissionControlCenter();
        }
        return instance;
    }

    // Ajouter une nouvelle mission
    public void addMission(String missionName) {
        missionsAndRockets.putIfAbsent(missionName, new ArrayList<>());
        System.out.println("Mission ajoutée : " + missionName);
    }

    // Ajouter une fusée à une mission existante
    public void addRocketToMission(String missionName, String rocketName) {
        if (!missionsAndRockets.containsKey(missionName)) {
            System.out.println("Mission inexistante ! Création automatique.");
            addMission(missionName);
        }
        missionsAndRockets.get(missionName).add(rocketName);
        System.out.println("Fusée " + rocketName + " ajoutée à la mission " + missionName);
    }

    // Afficher toutes les missions et les fusées associées
    public void showMissionsAndRockets() {
        System.out.println("=== Missions et Fusées ===");
        for (Map.Entry<String, List<String>> entry : missionsAndRockets.entrySet()) {
            System.out.println("Mission : " + entry.getKey() + " | Fusées : " + entry.getValue());
        }
    }

    // Démonstration
    public static void main(String[] args) {
        MissionControlCenter control = MissionControlCenter.getInstance();

        control.addMission("Lune");
        control.addMission("Mars");

        control.addRocketToMission("Lune", "SATURN-V");
        control.addRocketToMission("Lune", "SLS");
        control.addRocketToMission("Mars", "Falcon Heavy");
        control.addRocketToMission("Mars", "Starship");
        control.addRocketToMission("Saturn", "Gemini");

        control.showMissionsAndRockets();
    }
}
