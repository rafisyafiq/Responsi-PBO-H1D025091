# RPG Battle System - Responsi Akhir Pemrograman Berorientasi Objek (PBO)
Repositori ini berisi sistem **Game RPG** sederhana berbasis bahasa pemrograman Java.


## Identitas Mahasiswa
- Nama  : RAFI SYAFIQ FIRMANSYAH
- NIM   : H1D025091
- Tema  : GAME


## Deskripsi Singkat
Sistem pertarungan RPG sederhana dengan dua kelas karakter (Warrior dan Mage)
yang bertarung melawan monster Goblin.


## Petunjuk Compile dan Run (Terminal)
Pastikan JDK terpasang (`javac -version`).


1. Clone repositori dan masuk ke foldernya:
   ```bash
   git clone https://github.com/USERNAME/Responsi-PBO-H1D025091.git
   cd Responsi-PBO-H1D025091
   ```
2. Compile seluruh file Java:
   ```bash
   javac *.java
   ```
3. Jalankan program:
   ```bash
   java Main
   ```

## Implementasi Persyaratan Teknis
1. **State dan Behavior:** `Karakter` memiliki atribut, method prosedur `terimaDamage()` (void), dan method fungsi `isHidup()` (return value).
2. **Immutability:** konstanta global `LEVEL_MAKSIMAL` (public static final) dan atribut instans kekal `id` (private final).
3. **Enkapsulasi dan Overloading:** seluruh atribut `private` dengan getter/setter, memakai `this`, dan ada dua konstruktor di tiap class.
4. **Inheritance:** `Karakter` diwarisi oleh `Warrior` dan `Mage`; class `Main` dipisah.
5. **Super Chaining:** `super(...)` pada konstruktor subclass dan `super.tampilkanInfo()`.
6. **Method Overriding:** `@Override` pada `gunakanSkill()`, `tampilkanInfo()`, dan method interface.
7. **Abstract Class:** `Karakter` abstract dengan abstract method `gunakanSkill(Karakter target)`.
8. **Logika State Percabangan:** `gunakanSkill()` memakai if/else yang membaca dan mengubah rage (Warrior) atau mana (Mage).
9. **Polimorfisme Interface:** `Bertarung petarung1 = new Warrior("Brutus", 2);` di `Main`.
10. **Multiple Interface:** `Mage implements Bertarung, Penyembuh`.


## Screenshot Output
<img width="484" height="280" alt="Screenshot1" src="https://github.com/user-attachments/assets/39be52d0-0ae4-40df-b468-049e00c8960e" />
<img width="635" height="368" alt="Screenshot2" src="https://github.com/user-attachments/assets/cb7aecf1-b6db-4e57-845d-a1aed886a565" />
