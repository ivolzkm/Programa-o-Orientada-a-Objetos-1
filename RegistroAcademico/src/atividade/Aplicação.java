package atividade;

public class Aplicação {

    public static void main(String[] args) {
        // 1. Cria o objeto 'aluno1' como não bolsista, conforme a sua lógica
        RegistroAcademico aluno1 = new RegistroAcademico("Ivo Ricardo Lozekam Junior", 2025001, false); 
        float mensalidadeBase = 1200f; 
        
        System.out.println("--- Cenario 1: Aluno NAO Bolsista ---");
        aluno1.mostraRegistro();
        aluno1.calculaMensalidade(mensalidadeBase);
        
        System.out.println("\n--- Cenario 2: Aluno AGORA e Bolsista ---");
        // 2. Altera o status do aluno para bolsista, usando o setter que você criou
        aluno1.seteBolsista(true);
        aluno1.mostraRegistro();
        aluno1.calculaMensalidade(mensalidadeBase);
    }
}