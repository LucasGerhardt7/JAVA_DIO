package educ.lucas.curso01;

public class TiposVariaveis{
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        System.out.println(numeroCurto2);
    }
}
