public class _p16_TrabajandoEnteros {
    public static void main(String[] args) {
        int num1 = 42;
        int num2 = 0x2A;
        int num3 = 0b00101010;

        byte val1 = 120, val2 = 1;
        short horas = 24, dias = 9099;
        long ganacia = 9223372036854733207l;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nUso de string.format para formateo de numersos enteros:\n");
        System.out.println(String.format("num1 es base decimal  : %d",num1));
        System.out.println(String.format("num1 es base octal  : %o",num1));
        System.out.println(String.format("num1 es base hexa  : %x",num1));
        System.out.println(String.format("las ganancia con comas  : %,d",ganacia));

        System.out.println("\nUso de Integer.toString para formateo de numeros enteros:\n");
        System.out.println("num2 en base decimal o 10:    " + Integer.toString(num2));
        System.out.println("num2 en base octal:    " + Integer.toString(num2,8));
        System.out.println("num2 en base hexa:    " + Integer.toString(num2,16));

        System.out.println("\nUso de System.out.printf para formateo de numeros enteros:\n");
        System.out.printf("val1 y val2 en formato decimal : %d   %d\n",val1,val2);
        System.out.printf("val1 y val2 en formato octal : %o   %o\n",val1,val2);
        System.out.printf("val1 y val2 en formato hexa : %x   %x\n",val1,val2);

        System.out.println("\nUso de MIN_VALUE y MAX_VALUE para mostrar los rangos\n");
        System.out.println(String.format("\nTipo byte: Min:  %d  Max:  %d", Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println(String.format("\nTipo short: Min:  %d  Max:  %d", Short.MIN_VALUE, Short.MAX_VALUE));
        System.out.println(String.format("\nTipo int: Min:  %d  Max:  %d", Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(String.format("\nTipo long: Min:  %d  Max:  %d", Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
