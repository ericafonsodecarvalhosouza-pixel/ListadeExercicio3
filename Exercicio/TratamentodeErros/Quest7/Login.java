package Exercicio.TratamentodeErros.Quest7;

import java.util.Objects;

public class Login {

    private String usuario;
    private String senha;


    public void validar(String usuario, String senha) {
        if (Objects.isNull(usuario)){
            throw new LoginInvalidException("O nome de usuário não pode ser vazio.");
        }
        validarTamanhoSenha(senha);
        validarLetraMaiusculaSenha(senha);
        validarNumeroSenha(senha);
    }

    public void validarTamanhoSenha(String senha) {
        if (senha.length() < 8){
            throw new LoginInvalidException("A senha tem menos de 8 caracteres");
        }
    }

    public void validarLetraMaiusculaSenha(String senha){
        var temLetraMaiuscula = false;
        for (int i = 0; i < senha.length(); i++){
            char c = senha.charAt(i);
            char upper = Character.toUpperCase(senha.charAt(i));
            if (upper == c && !Character.isDigit(c)){
                temLetraMaiuscula = true;
                break;
            }
        }
        if (temLetraMaiuscula == false){
            throw new LoginInvalidException("Senha não possui uma letra maiúscula.");
        }
    }

    public void validarNumeroSenha(String senha){
        var temNumero = false;
        for (int i = 0; i < senha.length(); i++){
            char c = senha.charAt(i);
            if (Character.isDigit(c)){
                temNumero = true;
                break;
            }
            if (temNumero == false){
                throw new LoginInvalidException("A senha deve ter um número.");
            }
        }
    }

}
