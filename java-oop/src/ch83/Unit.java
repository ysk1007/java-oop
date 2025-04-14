package ch83;

public abstract class Unit{
    protected int hp;
    protected String name;
    protected void move() {
        System.out.println(this.name+" Go!");
    }
}
