package org.knit.lab3;

public class WarriorGuard extends Warrior {
    public WarriorGuard(String name) {
        super(name);
        this.def += 100;
    }

    @Override
    public void decreaseHealth(int value) {
        super.decreaseHealth(value - def);
    }
}
