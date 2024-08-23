public class siswa{

int id;
String nama;
double ipk;
    
    public siswa(){

        id = 0; 
        nama = "kosong";
        ipk = 0.0;
    }

        public siswa(int id , String nama, double ipk){

            this.id = id;
            this.nama = nama;
            this.ipk  = ipk;
        }

        public void print(){
            System.out.println("id:   "+id);
            System.out.println("nama:   "+nama);
            System.out.println("ipk:   "+ipk);
        }

    }


        

    


