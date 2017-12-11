package jp.ac.uryukyu.ie.e175722;

public class Enemy extends LivingThing {

    public Enemy (String name, int hitpoint, int attack) {
        super(name, hitpoint, attack);
    }

    @Override
    public void wounded(int damage){
        calculateHitpoint(damage);
        if( getHitpoint() <= 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}