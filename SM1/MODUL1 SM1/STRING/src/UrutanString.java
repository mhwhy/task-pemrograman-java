
public class UrutanString {

 
    public static void main(String[] args) {
        String [] nama={"Ayam","Kucing","Sapi","Angsa","zebra"};
        String temp;
        System.out.println("Nama nama hewan sebelum diurutkan");
        for (int i=0; i<nama.length; i++){
            System.out.println(i+1+" "+nama[i]+" ");
        }
        //mengurutkan nama hewan
        
        System.out.println("====================================");
        System.out.println("Nama nama hewan setelah diurutkan");
        for (int i=0; i<(nama.length-1); i++){
            for (int w=0; w<(nama.length-1); w++){
                if(nama[w].compareTo(nama[w+1])>0){
                    temp=nama[w+1];
                    nama[w+1]=nama[w];
                    nama[w]=temp;
                }
            }
        }
        
        for (int i=0; i<nama.length; i++){
            System.out.println(i+1+" "+nama[i]);
        }
        
    }
    
}
