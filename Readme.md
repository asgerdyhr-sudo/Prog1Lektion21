### Opgave 1

Kik på koden i main metoden i opgave 1. Koden er ikke særlig robust i 
forhold til brugerinput. Der er to exceptions der kan blive kastet, hvis ikke brugeren 
indtaster korrekt. 

Undersøg hvilke exceptions der kan blive kastet og fang disse exceptions og udskriv en 
passende besked til brugeren i konsollen. 

---

### Opgave 2

I denne opgave skal du indlæse tallene fra filen [numbers.txt](resources/numbers.txt) gange dem med 2 og udskrive
resultatet i konsollen.

---

### Opgave 3

Indlæs tallene fra filen [numbers.txt](resources/numbers.txt) og indsæt tallene i en ArrayList<Integer> efterhånden som de indlæses.
Udskriv dernæst tallene fra listen i omvendt rækkefølge.

---

### Opgave 4

Lav en applikation der i main-metoden skriver en fil med alle positive, ulige tal mindre end 100

---

### Opgave 5

Lav en applikation der i main-metoden indlæser en række tal fra tastaturet (sluttende med -1), de indlæste tal skrives til en tekstfil. Tallet -1 skal ikke skrives i filen. De øvrige tal skal være positive.
Tallene skal skrives i filen efterhånden, som de indlæses (de skal altså ikke gemmes i en ArrayList).

---

### Opgave 6

Lav en metode med følgende signatur:

```java
public static int maximum(File file)
```

Metoden skal returnere det største tal i den fil der gives som parameter. 
Filen indeholder en række heltal, et tal pr. linje.

Husk at fange relevante exceptions.

[data.txt](resources/opgave06/data.txt) indeholder tilfældige heltal som I kan bruge som indput.

---

### Opgave 7 Ekstra opgave

Denne opgave kommer fra https://adventofcode.com/2024/day/2

I filen [reports.txt](resources/opgave07/reports.txt) finder I et antal linjer med et antal heltal i hver linje.

I skal indlæse disse tal linje for linje og kontrollere om denne linje er sikker eller usikker. 

En linje er sikker hvis 
- alle tal i linjen er enten voksende eller faldende. 
- Forskellen imellem to nabotal er mindst 1 og højest 3

Eksempler:

- 7 6 4 2 1: Sikker, fordi tallene alle falder med 1 eller 2.
- 1 2 7 8 9: Usikker, fordi 2 → 7 er en stigning på 5.
- 9 7 6 2 1: Usikker, fordi 6 → 2 er et fald på 4.
- 1 3 2 4 5: Usikker, fordi 1 → 3 stiger, men 3 → 2 falder.
- 8 6 4 4 1: Usikker, fordi 4 → 4 hverken er en stigning eller et fald.
- 1 3 6 7 9: Sikker, fordi tallene alle stiger med 1, 2 eller 3.

Så I reports.txt er der 2 linjer der er sikre. 

I filen [bigReport.txt](resources/opgave07/bigReport.txt) finder I lidt flere rækker. 
Antallet af sikre linjer i denne fil er 246
