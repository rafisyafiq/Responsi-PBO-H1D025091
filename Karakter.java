public abstract class Karakter {

    public static final int LEVEL_MAKSIMAL = 50;

    private static int jumlahKarakter = 0;

    private final String id;

    private String nama;
    private int hp;
    private int maxHp;
    private int level;

    public Karakter(String nama, int maxHp) {
        this(nama, maxHp, 1);
    }

    public Karakter(String nama, int maxHp, int level) {
        jumlahKarakter++;
        this.id = String.format("CHR-%03d", jumlahKarakter);
        this.nama = nama;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.level = Math.min(Math.max(level, 1), LEVEL_MAKSIMAL);
    }

    public void terimaDamage(int damage) {
        setHp(this.hp - damage);
        System.out.println("   >> " + nama + " menerima " + damage + " damage. HP: " + hp + "/" + maxHp);
    }

    public void tampilkanInfo() {
        System.out.println("[" + id + "] " + nama + " (Lv " + level + ") HP " + hp + "/" + maxHp);
    }

    public boolean isHidup() {
        return hp > 0;
    }

    public abstract void gunakanSkill(Karakter target);

    public String getId() { return id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getHp() { return hp; }
    public void setHp(int hp) {
        this.hp = Math.max(0, Math.min(hp, this.maxHp));
    }

    public int getMaxHp() { return maxHp; }
    public void setMaxHp(int maxHp) { this.maxHp = maxHp; }

    public int getLevel() { return level; }
    public void setLevel(int level) {
        this.level = Math.min(Math.max(level, 1), LEVEL_MAKSIMAL);
    }
}
