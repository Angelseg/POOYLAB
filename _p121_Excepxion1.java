public class _p121_Excepxion1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 4;

        try{
                int c = a/b;
                System.out.println(c);
        }catch ( Exception e){
            System.out.println("No se puede we");
        }finally{
            System.out.println("Aqui llegamos se produzca o no el error");
        }
    }
}
