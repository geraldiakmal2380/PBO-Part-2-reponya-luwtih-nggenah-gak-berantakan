package PBOMinggu9.AbstractClass;

abstract class Hewan {
    private int umur;

    protected Hewan(){
        this.umur = 0;
    }

    void bertambahUmur(){
        this.umur += 1;
    }

    abstract void bergerak();
}
