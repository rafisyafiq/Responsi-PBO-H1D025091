public class Main {

    private static void judul(String teks) {
        System.out.println("\n=== " + teks + " ===");
    }

    public static void main(String[] args) {

        judul("1. STATE & BEHAVIOR (atribut, void, return value)");
        Warrior rafi = new Warrior("Rafi");
        rafi.tampilkanInfo();
        System.out.println("Masih hidup? " + rafi.isHidup());

        judul("2. IMMUTABILITY (static final & private final)");
        System.out.println("LEVEL_MAKSIMAL (public static final) = " + Karakter.LEVEL_MAKSIMAL);
        System.out.println("ID Rafi (private final)            = " + rafi.getId());

        judul("3. ENKAPSULASI & OVERLOADING");
        Mage dimas = new Mage("Dimas");
        Mage dharma = new Mage("Morgana", 5);
        System.out.println("Dimas  : Lv " + dimas.getLevel() + ", HP " + dimas.getHp());
        System.out.println("Dharma : Lv " + dharma.getLevel() + ", HP " + dharma.getHp());
        dharma.setNama("Dharma le Fay");
        System.out.println("Nama baru via setter: " + dharma.getNama());
        dharma.setHp(9999);
        System.out.println("setHp(9999) -> HP jadi " + dharma.getHp() + " (dibatasi maxHp)");

        judul("4. INHERITANCE (Warrior & Mage extends Karakter)");
        Karakter[] party = {rafi, dimas };
        for (Karakter k : party) {
            k.tampilkanInfo();
        }

        judul("5 & 6. SUPER CHAINING & OVERRIDING");
        System.out.println("(tampilkanInfo() di atas = @Override + super.tampilkanInfo(),");
        System.out.println(" konstruktor subclass memanggil super(nama, maxHp, level))");

        judul("7 & 8. ABSTRACT METHOD gunakanSkill() + LOGIKA IF/ELSE STATE");
        Warrior goblin = new Warrior("Goblin", 3);
        System.out.println("-- Rafi memakai skill 3x (rage awal 0, awalnya belum cukup):");
        rafi.gunakanSkill(goblin);
        rafi.gunakanSkill(goblin);
        rafi.gunakanSkill(goblin);
        System.out.println("-- Dimas memakai skill 3x (mana 60, fireball 30 mana):");
        dimas.gunakanSkill(goblin);
        dimas.gunakanSkill(goblin);
        dimas.gunakanSkill(goblin);

        judul("9. POLIMORFISME INTERFACE");
        Bertarung petarung1 = new Warrior("Khalid", 2);
        Bertarung petarung2 = new Mage("Alif", 2);
        Karakter bonekaLatihan = new Warrior("Boneka Latihan", 10);
        petarung1.serangBiasa(bonekaLatihan);
        petarung2.serangBiasa(bonekaLatihan);

        judul("10. MULTIPLE INTERFACE (Mage implements Bertarung, Penyembuh)");
        goblin.serangBiasa(rafi);
        Penyembuh healer = new Mage("Ari", 3);
        Bertarung fighter = (Bertarung) healer;
        healer.sembuhkan(rafi);
        fighter.serangBiasa(goblin);
    }
}
