# 3D Print

Un projet pour afficher dans le terminal un objet 3D qui tourne, en ASCII

## Principe :

Projection d'un espace 3D sur un plan (écran d'affichage).
Matrices de rotation sur des objets.

![](https://github.com/Rockinfox91/3Dprint/blob/main/Animation.gif)

## Installation :

```sh
git clone https://github.com/Rockinfox91/3Dprint.git
cd 3Dprint/
```

## Utilisation :

```sh
javac -cp src -d bin src/App.java
java -cp bin App
```

Dézoomer le terminal pour une visualisation optimale.

## Améliorations : 

- Voir comment clear l'écran sans affecter les performances
- Ajouter la gestion des surface
- Gérer la lumière
- Pouvoir mettre l'écran avec un angle
- Pouvoir déplacer les objets
