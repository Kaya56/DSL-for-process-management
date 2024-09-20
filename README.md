# Conception d'un Éditeur de Processus avec Xtext

## Introduction

Ce projet a été réalisé dans le cadre d'un stage à l'École Nationale Supérieure Polytechnique de Yaoundé (ENSPY) sous la supervision du Docteur Kungne. Le but principal est de concevoir un éditeur de processus à l'aide du framework **Xtext**, en s'appuyant sur un langage spécifique au domaine (DSL) pour décrire et gérer des processus complexes comme la construction d'infrastructures ou la réhabilitation de systèmes.

## Objectif

L'objectif de ce projet est de concevoir un **DSL** (langage spécifique au domaine) déclaratif permettant de modéliser et de décrire les éléments essentiels d'un processus :
- Les **tâches** à accomplir (simples ou composites).
- Les **acteurs** et leurs catégories.
- Les **contrats** et le **financement** requis.
- Les **besoins** spécifiques associés au processus.

## Technologies Utilisées

- **Xtext** : Un framework utilisé pour la conception et la mise en œuvre de langages spécifiques au domaine.
- **Eclipse** : Environnement de développement intégré (IDE) utilisé pour le développement du projet.
- **Java** : Utilisé en backend pour certaines logiques internes du projet.
- **Git** : Versionnement du code source.

## Prérequis

Avant de cloner et d'exécuter ce projet, assurez-vous d'avoir les éléments suivants installés sur votre machine :
- **JDK 8+** (Java Development Kit)
- **Eclipse IDE for Java and DSL Developers**
- **Xtext** plugin pour Eclipse
- **Git** pour cloner le projet

## Installation

1. **Cloner le dépôt GitHub** :

   ```bash
   git clone https://github.com/Kaya56/DSL-for-process-management.git
   cd DSL-for-process-management
   ```

2. **Ouvrir le projet dans Eclipse** :
   - Ouvrez Eclipse, puis sélectionnez `File > Import > Existing Projects into Workspace`.
   - Sélectionnez le répertoire du projet que vous avez cloné.

3. **Configurer Xtext** :
   - Assurez-vous que le plugin **Xtext** est correctement installé dans Eclipse. Sinon, vous pouvez l'installer à partir du marketplace Eclipse.

## Utilisation

Une fois installé, l'éditeur Xtext permet de :

1. **Décrire des processus** sous forme déclarative, en spécifiant les acteurs, les tâches, les contrats et les financements associés.
2. **Valider** les descriptions de processus en fonction des règles définies dans la grammaire.
3. **Générer** du code ou des fichiers basés sur les descriptions de processus.

### Exemple de grammaire

Voici un extrait de la grammaire Xtext utilisée pour décrire les processus dans ce projet :

```xtext
Process ConstructionEcole {
	
  int budgetTotal = 5000000
  
  ActorCategory Acteurs {
    codeActeur: "Architecte", "Ouvriers"
    descriptionActeur: "Acteurs impliqués dans la construction"
  }

  TaskSimple Planification {
    description: "Planification des étapes du projet"
  }

  TaskComposite Construction {
    description: "Construction de l'école"
    taches 
    TaskSimple Planification {}
  }

  TaskSimple Reception {
    description: "Réception des travaux"
  }
}
```

### Détails techniques de la grammaire

La grammaire est structurée de manière à définir plusieurs éléments clés :

- **Processus** : Un processus est représenté par un identifiant et peut contenir des tâches, des acteurs, des variables et des paramètres d'entrée/sortie.
  
```xtext
Process:
  'Process' identifiant=ID
  ('(' entrees+=Parameter* ')')? 
  ('<' sorties+=Parameter* '>')? 
  '{'
    (variables+=VariableDeclaration*)?
    (acteurCategories+=ActorCategory*)?
    (taches+=Task*)?
  '}'
;
```

- **Catégories d'acteurs** : Chaque catégorie d'acteur est définie par un identifiant, des acteurs concrets, et des variables associées.

```xtext
ActorCategory:
  'ActorCategory' identifiant=ID
  '{'
    'codeActeur' ':' codeActeur=STRING (',' codeActeurs+=STRING)*
    (variables+=VariableDeclaration*)?
    'descriptionActeur' ':' descriptionActeur=STRING
    ('acteursConcrets' ':' acteursConcrets+=ConcretActor*)?
  '}'
;
```

- **Tâches** : Il existe des tâches simples et des tâches composites, chacune pouvant avoir des paramètres d'entrée et de sortie, ainsi qu'une description optionnelle.

```xtext
TaskSimple:
  'TaskSimple' identifiant=ID
  ('(' entrees+=Parameter* ')')?
  ('<' sorties+=Parameter* '>')?
  '{'
    ('description' ':' descriptionActeur=STRING)?
    (variables+=VariableDeclaration*)?
  '}'
;
```

- **Paramètres** : Le système gère des paramètres simples (comme des chaînes, entiers, flottants, booléens) et des paramètres complexes.

```xtext
Parameter:
  SimpleParameter | ComplexParameter
;
```

- **Déclaration de variables** : Les variables peuvent être réutilisées au sein des processus et des tâches. Les types de variables incluent des types simples, complexes, ou des tableaux.

```xtext
VariableDeclaration:
  type=VariableType identifiant=ID ('=' value=Expression (',' value=Expression)*)?
;
```

## Fonctionnalités

- **Langage déclaratif** : Créez et gérez des processus via une syntaxe simple et structurée.
- **Validation** : Assurez-vous que les processus respectent les contraintes et les règles définies.
- **Extensibilité** : La grammaire peut être étendue pour inclure des fonctionnalités supplémentaires spécifiques aux processus complexes.

## Contributions

Les contributions sont les bienvenues ! Si vous souhaitez contribuer :
1. Forkez ce dépôt.
2. Créez une nouvelle branche pour vos modifications.
3. Faites un pull request avec une description détaillée des changements proposés.

## Licence

Ce projet est sous la licence MIT. Consultez le fichier [LICENSE](LICENSE) pour plus d’informations.

## Auteur

- **Kaya Desmond** - Auteur principal du projet.
- Supervision : **Dr. Kungne**, ENSPY.
