package Exercicio.TratamentodeErros.Quest9;

public class IdentificacaoDeValorNulo {
    public static void main(String[] args) {

        try{
            String texto = null;
            visualizarstring(texto);
        } catch (Exception e) {
            System.out.println("Texto sem informação. Digite algo válido.");
        }
    }

    public static void visualizarstring(String texto){
        System.out.println("Word" + texto.length());
    }

}
