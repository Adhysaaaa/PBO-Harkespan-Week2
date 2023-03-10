class Sepeda {
    
    //tempat atribut
    int gear = 8;
    int gear2 = 3;
    int Roda;
    String Jenis;
    String Merk;

    //tempat method
    void ngerem() {
        System.out.println("Sepeda direm");
    }

    //konstrukor
    Sepeda(int jumlah_roda, String jenis, String merk) {

        Roda = jumlah_roda;
        Jenis = jenis;
        Merk = merk;

        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlah_roda);
    }
}

class lampu {
    //tempat atribut
    boolean nyala;
    
    //tempat method
    void nyalakanLampu() {
        nyala = true;
    }
    void matikanLampu() {
        nyala = false;
    }
}

//objek sepeda
class ObjekSepeda {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(2, "Gunung", "Pacific");
        Sepeda sepeda2 = new Sepeda(4, "BMX FAMILY SX-102", "Family");

        int gear1 = sepeda1.gear;
        System.out.println("Jumlah gear "+gear1);
        sepeda1.ngerem();

        int gear2 = sepeda2.gear2;
        System.out.println("Jumlah gear "+gear2);
        sepeda2.ngerem();
    }
}

//objek lampu
class ObjekLampu {
    public static void main(String[] args) {
        
        //objek
        lampu lampu1 = new lampu();
        lampu1.nyalakanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
        
        lampu1.matikanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
    }
}