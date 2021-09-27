public class Orc implements Tradable, Domesticatable {
    int toes;
    private String[] armor;
    private String[] weapon;

    public Orc(){
        this.armor = new String[0];
        this.weapon = new String[0];
        toes = 1;
    }
    @Override
    public String sound() {
        return "growl";
    }

    @Override
    public int getPrice() {
        return 50;
    }

    public void upgrade_armor(String item){
        String[] jk = new String[armor.length+1];
        for(int i = 0; i < jk.length; i++){
            jk[i] = armor[i];
        }
        jk[armor.length] = item;
        armor = jk;
    }
    public void upgrade_weapon(String item){
        String[] lm = new String[weapon.length+1];
        for(int i = 0; i < lm.length; i++){
            lm[i] = weapon[i];
        }
        lm[weapon.length] = item;
        weapon = lm;
    }

    public String[] getArmor(){
        return armor;
    }

    public String[] getWeapon(){
        return weapon;
    }

}