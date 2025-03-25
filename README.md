# My First Project with Kotlin

Dette er et enkelt Kotlin-prosjekt som simulerer en butikk som beregner netto inntekt. Programmet viser faste inntekter og lar brukeren legge inn utgifter manuelt for å finne netto fortjeneste. Det er ment som en introduksjon til Kotlin og grunnleggende programmeringskonsepter.

## Prosjektbeskrivelse

Forestill deg at du eier en liten hjørnebutikk. Programmet skriver ut en oversikt over inntekter fra ulike produkter, og ber deg deretter om å oppgi:

- **Staff expenses**  
- **Other expenses**

Basert på dette beregnes netto inntekt. Applikasjonen bruker enkel input/output og grunnleggende aritmetikk.

---

## Hvordan klone, bygge og kjøre prosjektet

### Forutsetninger

- **Java 21** – Prosjektet er konfigurert til å bruke Java 21 via Gradle Toolchains.
- **Gradle Wrapper** – Du trenger ikke installere Gradle manuelt, da prosjektet inkluderer en wrapper.
- **Interaktiv input** – Siden applikasjonen bruker `readln()` for å hente input fra brukeren, anbefales det sterkt å kjøre programmet via en IDE som støtter interaktiv input.

---

### Klone og bygge

1. Klone repoet:

    ```bash
    git clone https://github.com/TorgrimRL/My_First_Project_with_Kotlin.git
    cd My_First_Project_with_Kotlin
    ```

2. Bygg prosjektet med Gradle-wrapper:

    ```bash
    ./gradlew build
    ```
    *(På Windows bruk `gradlew.bat`)*

---

### Kjøring av applikasjonen

#### 🔹 Anbefalt metode: Kjøring via IDE

For best støtte for interaktiv input:

1. Åpne prosjektet i **IntelliJ IDEA** (eller en annen IDE som støtter Kotlin og konsollinput).
2. Sett opp en kjørekonfigurasjon om nødvendig (IDE-en finner ofte `main`-funksjonen automatisk).
3. Gå til:  
   `Settings > Build, Execution, Deployment > Build Tools > Gradle`  
   og sett **Gradle JVM** til **Java 21**.
4. Kjør `Main.kt` direkte fra IDE-en.  
   Konsollen vil da tillate deg å skrive inn verdier når programmet ber om input.

---

#### ⚠️ Alternativ metode: Kjøring via kommandolinje

Du kan også kjøre programmet fra terminalen, men dette kan føre til problemer med input:

1. Sjekk hvilke moduler som finnes:

    ```bash
    ./gradlew projects
    ```

    Du vil se en modul som f.eks.:

    ```
    :My_First_Project_with_Kotlin-task
    ```

2. Kjør modulen direkte:

    ```bash
    ./gradlew :My_First_Project_with_Kotlin-task:run
    ```

> **Merk:** Kommandolinje-kjøring støtter ikke alltid `readln()` korrekt. Hvis du får feilmeldingen `ReadAfterEOFException`, betyr det at programmet ikke fikk noen input. Bruk da heller IDE-metoden for en bedre opplevelse.

---

## Hva jeg lærte

- **Kotlin-syntaks:** Hvordan skrive funksjoner, bruke variabler (`val` og `var`), og string-interpolasjon.
- **Input-håndtering:** Bruk av `readln()` for å lese input fra bruker.
- **Grunnleggende logikk:** Enkel regneoperasjoner og datatyper.
- **Gradle:**
  - Forskjellen på `settings.gradle` og `build.gradle`
  - Bruk av Gradle Wrapper
  - Oppsett av Java Toolchains
- **IDE-konfigurasjon:** Hvordan sette opp kjøremiljø i IntelliJ IDEA med riktig JDK.

---

## Ressurser

- 🔗 [Prosjektbeskrivelse på Hyperskill](https://hyperskill.org/projects/501)
- 👤 [Min Hyperskill-profil](https://hyperskill.org/profile/619357970)
