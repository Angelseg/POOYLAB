//// Inicializa de forma manual arreglo de números flotantes y lo imprime


public class _p81_InicializaArregloNumeros {
    public static void main(String[] args) {
        int max=8;
        double[] nums = new double[max];
        nums[0] = 5.0;
        nums[1] = 15.0;
        nums[2] = 25.0;
        nums[3] = 45.0;
        nums[4] = 55.0;
        nums[5] = 65.0;
        nums[6] = 75.0;
        nums[7] = 85.0;
        //nums[8] = 95.0;

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nEl primer elemento del arreglo es: " + nums[0] );
        System.out.println("\nEl ultimo elemento del arreglo es: " + nums[6] );

        for(int i=0; i < max; i++)
            System.out.println(nums[i]);

        System.out.println("\nTodos los valores del arreglo con un ciclo for - each");
        for(double num : nums)
            System.out.println(num);
    }
}
