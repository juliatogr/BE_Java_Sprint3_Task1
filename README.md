# BE_Java_Sprint3_Task1

Repository created to deliver the first task of the third sprint of the BackEnd Java Bootcamp at IT-Academy.

<p align="center">
<img src=https://user-images.githubusercontent.com/72571435/179958350-c8db27b9-ada1-45d3-8ab4-6f2dcd31eb30.png width="120" height="120" />
</p>

## General description

En aquesta pràctica aprendrem a identificar i construir programes emprant patrons de disseny. La utilització de patrons és fonamental en la construcció d'un software extensible i reutilitzable. El llenguatge Java, així com tots els frameworks de software, estan fets d'acord amb els patrons més importants del software.

En tots els exercicis, crea un projecte amb una classe Main que demostri l'ús del patró (amb les invocacions necessàries).

## Nivell 1 - Singleton

### Statement
Crea una classe que repliqui el funcionament del comando 'Undo'. Aquesta classe serà utilitzada per la classe Main, que permetrà introduir opcions per consola.

La classe 'Undo' ha de guardar les últimes comandes introduïdes. Ha de permetre afegir o eliminar comandes, així com llistar les últimes comandes introduïdes (semblant a la comanda 'history' en Linux).

La classe 'Undo' ha d'implementar imprescindiblement un patró Singleton.

### info
- La classe Undo implementa el patró Singleton. 
- Per veure l'historial de comandes s'ha d'escriure `--history`.
- Per desfer l'última comanda s'ha d'escriure `--undo`.
- `--history` i `--undo` no s'afegeixen en la llista de comandes aplicades. La resta de cadenes si.
- Per sortir s'ha d'escriure `--exit`.


## Nivell 2 - Abstract Factory
### Statement
Crea un petit gestor de direccions i números de telèfon internacionals.

L'aplicació ha de permetre afegir a l'agenda, adreces i números de telèfon internacionals. Tenint en compte els diferents formats dels diferents països, construeix l'agenda, les adreces i els telèfons implementant un patró Abstract Factory.

### info

- Dins de la carpeta `src` hi ha 3 paquets importants: `application`, `generics`, `countries`.
- El paquet `application` conté la classe N1_Main, que és la que executa l'aplicació i la classe ContactBook que representa l'agenda de contactes.
- El paquet `generics` conté la Abstract Factory amb el nom de ContactFactory i altres classes i interfícies genèriques (independents del país)
- El paquet `countries` conté subpaquets segons els països implementats. Dins de cada subpaquet trobem 3 fitxers: la factoria concreta per al país en específic i les implementacions necessaries per crear l'adreça i el telèfon en el format requerit d'aquell país.

## Nivell 3 - Command (not done)
Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell. 

Mostra com funciona el patró Command que implementa els mètodes arrencar, accelerar i frenar per a cada tipus de vehicle.

## Util_links

The next links helped me a lot to finish this task.

- *Design Patterns for Beginners With Java Examples:* https://dzone.com/articles/design-patterns-for-beginners-with-java-examples

- *Patrones de diseño - Betta Tech, Youtube Playlist:* https://www.youtube.com/watch?v=3qTmBcxGlWk&list=PLJkcleqxxobUJlz1Cm8WYd-F_kckkDvc8&index=1

- *Singleton Java:* https://es.wikipedia.org/wiki/Singleton#Java

- *Maven Tutorial for Beginners:* https://www.simplilearn.com/tutorials/maven-tutorial/

- *address-formater-java Maven package from Placemarkt:* https://github.com/placemarkt/address-formatter-java

- *libphonenumber library from Google:* https://github.com/google/libphonenumber

- *Using libphonenumber to Validate Phone Numbers:* https://www.baeldung.com/java-libphonenumber

- *List of Country Calling Codes:* https://en.wikipedia.org/wiki/List_of_country_calling_codes