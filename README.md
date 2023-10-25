# Oblig3
Repository til oblig 3

Ettersom jeg har integrert GitHub i intellij, brukte jeg intellij til å opprette et public repository.

I pom.xml la jeg til < build>, altså nødvendig informasjon til å bygge prosjektet.

For å ta i bruk GitHub actions gikk jeg inn på "Actions" på GitHub, og valgte "Build with maven".

Dette oprettet maven.yml filen, her valgte jeg å fjerne delen som var "optional".

Fikk først problemer med maven.compiler.source, men endret dette til 17 og fikk det da til å funke.