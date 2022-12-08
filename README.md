# 3D Print

Un projet pour afficher dans le terminal un objet 3D qui tourne, en ASCII

## Principe :

Projection d'un espace 3D sur un plan (écran d'affichage).
Matrices de rotation sur des objets.

![](https://github.com/Rockinfox91/3Dprint/Animation.gif)

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

## Améliorations : 

- Améliorer la vitesse de rendu. En effet, la rotation est rapide à faire mais l'affichage est trop long (axe : faire une char[] static qui se modifie lorsqu'un point bouge).
- Ajouter les méthodes TODO.
