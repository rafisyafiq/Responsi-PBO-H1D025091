public class Mage extends Karakter implements Bertarung, Penyembuh {

    private static final int BIAYA_FIREBALL = 30;
    private static final int BIAYA_HEAL = 20;
    private int mana;

    public Mage(String nama) {
        super(nama, 80);
        this.mana = 60;
    }

    public Mage(String nama, int level) {
        super(nama, 80 + level * 5, level);
        this.mana = 60 + level * 5;
    }

    @Override
    public void serangBiasa(Karakter target) {
        System.out.println(getNama() + " memukul dengan tongkat sihir.");
        target.terimaDamage(5 + getLevel());
    }

    @Override
    public void gunakanSkill(Karakter target) {
        if (mana >= BIAYA_FIREBALL) {
            mana -= BIAYA_FIREBALL;
            System.out.println(getNama() + " melempar FIREBALL! (mana tersisa " + mana + ")");
            target.terimaDamage(35 + getLevel() * 3);
        } else {
            mana += 15;
            System.out.println(getNama() + " kehabisan mana, bermeditasi. Mana sekarang " + mana + ".");
        }
    }

    @Override
    public void sembuhkan(Karakter target) {
        if (mana >= BIAYA_HEAL && target.isHidup()) {
            mana -= BIAYA_HEAL;
            target.setHp(target.getHp() + 25);
            System.out.println(getNama() + " menyembuhkan " + target.getNama()
                    + " +25 HP. HP: " + target.getHp() + "/" + target.getMaxHp());
        } else {
            System.out.println(getNama() + " gagal menyembuhkan (mana kurang / target gugur).");
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("   Kelas: Mage | Mana: " + mana);
    }

    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = Math.max(0, mana); }
}
