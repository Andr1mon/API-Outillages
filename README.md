### Lien vers le projet GitHub: https://github.com/Andr1mon/TP-INFO2

# TP 3

## Étape 5

**Spring Web**
  > * Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the  default embedded container. 
  > * La dépendance Spring Web est utilisée pour le développement d'applications web avec le framework Spring. Elle fournit des fonctionnalités essentielles pour la création de services web RESTful et la gestion des requêtes HTTP. Cette dépendance inclut des composants tels que des contrôleurs (Controllers) qui permettent de gérer les requêtes HTTP, des annotations pour définir des points d'entrée REST, et d'autres utilitaires pour simplifier le développement web dans l'écosystème Spring. En résumé, la dépendance Spring Web facilite la création d'applications web robustes en utilisant le modèle de programmation proposé par Spring pour la gestion des requêtes et des réponses HTTP.

**Spring Data JPA**
  > * Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
  > * La dépendance Spring Data JPA facilite l'intégration de la technologie Java Persistence API (JPA) dans les applications Spring. JPA est une spécification Java qui permet de mapper des objets Java vers des bases de données relationnelles. Voici comment la dépendance Spring Data JPA est généralement utilisée :
  >   * Mapping Objet-Relationnel (ORM) évitant la nécessité de requêtes SQL manuelles.
  >   * Opérations CRUD (Create, Read, Update, Delete)
  >   * Requêtes personnalisées
  >   * Gestion des Transactions
  
**H2 Database**
  > * Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application. 
  > * La dépendance H2 est généralement utilisée pour intégrer la base de données H2 dans une application Java. H2 est une base de données relationnelle légère et embarquée, écrite en Java, qui peut être utilisée pour le développement, le test et diverses applications où une base de données simple est nécessaire. Voici quelques-unes des utilisations courantes de la dépendance H2 :
  >   * Base de données embarquée
  >   * Tests unitaires et tests d'intégration
  >   * Développement rapide
  >   * Environnements de démonstration
  >   * Compatibilité avec JPA et Spring

**Spring Boot DevTools**
  > * Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
  > * La dépendance Spring Boot DevTools est utilisée pour améliorer le processus de développement dans les applications Spring Boot. Voici quelques-unes des fonctionnalités et des avantages qu'elle offre
  >   * Redémarrage automatique
  >   * Rechargement des propriétés
  >   * Console distante
  >   * Désactivation temporaire des fonctionnalités
  >   * Surveillance des changements dans les dépendances

**Thymeleaf**
  > * A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.
  > * La dépendance Thymeleaf est utilisée dans le contexte de développement web avec des applications Java, en particulier avec le framework Spring. Thymeleaf est un moteur de template qui facilite l'intégration des pages web dynamiques dans les applications Java. Voici quelques-unes des utilisations courantes de la dépendance Thymeleaf
  >   * Moteur de template
  >   * Intégration avec Spring
  >   * Expression Language (Thymeleaf EL)
  >   * Thymeleaf Fragment
  >   * Internationalisation
  >   * Prévisualisation dans le navigateur

## Étape 13

1. Nous avons défini des paramètres au niveau des requêtes HTTP avec `@RequestParam`
2. Lorsqu'on utilise la commande `return "greeting"` - où "greeting" est le nom du fichier HTML, Spring est chargé de vérifier s'il y a un page avec ce nom.
3. Dans le page `greeting.html` on a un attribut `${nomTemplate}`. Au niveau de contrôleur, `nomTemplate` est créé en utilisant le modèle qui prend en argument `nameGET`. Donc, lorsqu'on a saisi dans URL `localhost:9090/greeting` on a un affichage suivant : `Bonjour World !` parce que la valeur par défaut de nameGET est `World`. Mais si on accede au URL `localhost:9090/greeting?nameGET=Test` on a bien l'affichage `Bonjour Test !` comme on a défini le variable `nameGET` à chaine de caractères `Test`.

## Étape 17

On a l'apparition de la nouvelle table `Address` avec les attributs `id`, `creation`, `content` et `author`.

## Étape 18

Une entité représente une table dans la base de données. Lorsqu'on a créé une classe `Address` et a mis une annotation `@Entity`, on a défini la table Address avec la clé primaire automatiquement générée grâce à `@id` et `@GeneratedValue`.

## Étape 20

On voit bien tout le contenu de data.sql avec la requête `SELECT * FROM ADDRESS` :
```
ID  CONTENT                                 CREATION  
1   57 boulevard demorieux                  2023-12-04 13:00:16.858612
2   51 allee du gamay, 34080 montpellier    2023-12-04 13:00:16.860615
```

## Étape 22

L'annotation @Autowired dans Spring est utilisée pour effectuer l'injection de dépendances automatique. Elle permet au conteneur Spring de résoudre automatiquement et d'injecter les dépendances nécessaires à un composant. Voici comment elle fonctionne :

* Injection de Dépendances : Lorsqu'un composant (par exemple, un bean) nécessite une dépendance vers un autre composant, nous pouvons utiliser l'annotation @Autowired pour demander au conteneur Spring de fournir automatiquement la référence de la dépendance.

* Injection par Type : L'injection se fait généralement par type, ce qui signifie que Spring recherche un bean du type requis et l'injecte dans le composant demandeur.

* Injection par Nom : Nous pouvons également spécifier le nom du bean à injecter si plusieurs beans du même type sont présents dans le contexte Spring.

Constructeur, Setter, ou Méthode : L'annotation @Autowired peut être utilisée au niveau du constructeur, des méthodes ou des setters.

L'utilisation de @Autowired simplifie le code en évitant la nécessité d'instancier manuellement les dépendances. Cela favorise une approche plus modulaire et facilite la gestion des dépendances dans les applications Spring.

## Étape 30

Pour ajouter Bootstrap à notre projet, il suffit d'insérer à la balise head de chaque page html la ligne suivante :

`<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">`

Ensuite, on peut utiliser la fonctionnalité de Bootstrap.

# TP 4

## Étape 6

**Faut-il une clé API pour appeler MeteoConcept ?**

> Oui, pour pouvoir utiliser API MeteoConcept, il faut avoir une clé.

**Quelle URL appeler ?**

>https://api.meteo-concept.com/api/forecast/daily
> pour recevoir l'information par rapport au prevision du meteo sur la semaine. A la fin d'URL il faut saisir une cle API et code postale ou latitude avec longitude.

**Quelle méthode HTTP utiliser ?**

>On utilise un methode GET pour recuperer l'information a partir d'API.

**Comment passer les paramètres d'appels ?**

>On passe les parametres d'appels dans URL : A la fin d'URL il faut saisir une cle API et code postale ou latitude avec longitude.

**Où est l'information dont j'ai besoin dans la réponse ?**

>L'information necessaire se retrouve sur le contenu de la page en donnees de JSON.

**Pour afficher la température du lieu visé par les coordonnées GPS ?**

>

**Pour afficher la prévision de météo du lieu visé par les coordonnées GPS ?**

>

## Étape 7

### Lien vers le projet GitHub: https://github.com/Andr1mon/TP-INFO2
