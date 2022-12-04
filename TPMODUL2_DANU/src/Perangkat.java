public class Perangkat<T,U,V> {

//    protected String drive;
//    protected int ram;
//    protected float processor;

    protected T drive;
    protected U ram;
    protected V processor;

    public Perangkat(T drive, U ram, V processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe " + this.drive + "dengan RAM sebesar "+ this.ram + "GB dan processor secepat " + this.processor + "Ghz.");
    }

}
