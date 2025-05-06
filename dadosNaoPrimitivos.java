public class dadosNaoPrimitivos {
    public static void main(String[] args) {

        String nome = "Monkey D. Luffy";
        String name = nome.toUpperCase();
        System.out.println(name);

        String palavraGrande = "Proporatoxinisitacinakolonoideldoscipiagia";
        System.out.println(palavraGrande.length());
        System.out.println(palavraGrande.charAt(15));
        System.out.println(palavraGrande.substring(10,20));
        System.out.println(palavraGrande.toUpperCase());

        String rima = "         O rato roeu a roupa do rei de Roma     "+ palavraGrande;
        System.out.println(rima);
        System.out.println(rima.trim());

        byte idade = 22;
        double altura = 1.87;
        char inicial = 'M';
        boolean vivoOuMorto = true;
        long saldoBancario = 4912304000300L;
        int numero = 84068535;
    }
}

