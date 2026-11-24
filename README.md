# Permatomas Laikrodis

Minimalistinis „Android“ planšetės pagrindinio ekrano laikrodžio valdiklis su permatomu fonu.
Rodo tik esamą laiką (`TextClock`), be jokių reklamų, leidimų ar fone veikiančių tarnybų.

## Kaip sukompiliuoti .apk failą

### 1 būdas: Automatiškai per GitHub (be „Android Studio“)
1. Sukurkite naują „GitHub“ saugyklą ir įkelkite visus šio aplanko failus, **įskaitant paslėptą `.github/workflows/build-apk.yml` failą** (keliant per naršyklę, paslėpti aplankai kartais praleidžiami — tokiu atveju įkelkite `build-apk.yml` per *Add file -> Create new file* į `.github/workflows/build-apk.yml`).
2. **Nenaudokite** numatytojo „GitHub Android CI“ šablono (jis ieško `gradlew` ir naudoja `Java 11`). Šis projektas naudoja `build-apk.yml` su `Java 17` ir `gradle assembleDebug`.
3. Atsidarykite skiltį **Actions -> Sukurti APK**.
4. Palaukite ~1 minutę ir atsisiųskite paruoštą `app-debug.apk` iš **Artifacts**.

### 2 būdas: Per „Android Studio“
1. Atsidarykite šį aplanką su **Android Studio**.
2. Viršutiniame meniu pasirinkite **Build -> Build Bundle(s) / APK(s) -> Build APK(s)**.
3. Sukurtą `app-debug.apk` perkelkite į planšetę ir įdiekite.

## Kaip įdėti valdiklį į planšetės ekraną
Įdiegę programėlę, galite ją atidaryti ir paspausti **„Pridėti valdiklį į ekraną“**, arba ilgai palaikyti pirštą ant tuščios planšetės ekrano vietos, pasirinkti **Valdikliai** ir uždėti laikrodį.
