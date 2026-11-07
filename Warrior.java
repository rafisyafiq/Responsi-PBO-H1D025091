public class Warrior extends Karakter implements Bertarung {

    private static final int BIAYA_RAGE = 50;
    private int rage;

    public Warrior(String nama) {
        super(nama, 120);
        this.rage = 0;
    }

    public Warrior(String nama, int level) {
        super(nama, 120 + level * 10, level);
        this.rage = 0;
    }

    @Override
    public void serangBiasa(Karakter target) {
        int damage = 10 + getLevel();
        System.out.println(getNama() + " menebas " + target.getNama() + "!");
        target.terimaDamage(damage);
        setRage(rage + 25);
    }

    @Override
    public void gunakanSkill(Karakter target) {
        if (rage >= BIAYA_RAGE) {
            int damage = 30 + getLevel() * 2;
            setRage(rage - BIAYA_RAGE);
            System.out.println(getNama() + " memakai POWER STRIKE! (rage tersisa " + rage + ")");
            target.terimaDamage(damage);
        } else {
            System.out.println(getNama() + " belum cukup rage (" + rage + "/" + BIAYA_RAGE + "), menyerang biasa.");
            serangBiasa(target);
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("   Kelas: Warrior | Rage: " + rage);
    }

    public int getRage() { return rage; }
    public void setRage(int rage) { this.rage = Math.max(0, Math.min(rage, 100)); }
}
