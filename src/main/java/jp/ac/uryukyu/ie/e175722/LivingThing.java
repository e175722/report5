package jp.ac.uryukyu.ie.e175722;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;


    public LivingThing(String name, int hitpoint, int attack) {
        this.name = name;
        this.hitPoint = hitpoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitpoint, attack);
    }


    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }


    public String getName(){
        return name;
    }

    public int getHitpoint(){
        return hitPoint;
    }

    public void calculateHitpoint(int damage){
        hitPoint -= damage;
    }


    public int getAttack(){
        return attack;
    }



    public void attack(LivingThing opponent){
        if(!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }


    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
