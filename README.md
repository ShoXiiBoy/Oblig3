# Oblig3

Ettersom jeg har integrert GitHub i intelliJ, 
brukte jeg intelliJ til å opprette et public repository.

I pom.xml la jeg til < build>, 
altså nødvendig informasjon til å bygge prosjektet.

For å ta i bruk GitHub actions gikk jeg inn på "Actions"
på GitHub, og valgte "Build with maven".

Dette oprettet maven.yml filen,
her valgte jeg å fjerne delen som var "optional".

Fikk først problemer med maven.compiler.source i pom.xml,
men endret dette til 17 og fikk det da til å funke.

Etter dette ble ikke testene kjørt når jeg kjørte en ny "commit" 
fordi det var noen problemer med Junit jupiter api

Jeg måtte da gjøre noen endringer i dependencies i pom.xml,
og fikk så kjørt testene ved ny "commit".