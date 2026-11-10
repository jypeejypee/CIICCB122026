interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        return timeToEat;
    }

    @Override
    public void groom() {
    }

    @Override
    public void pet() {
    }
}
