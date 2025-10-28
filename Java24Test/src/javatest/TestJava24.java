package javatest;

public class TestJava24 {
    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Eclipse Version: 2025-06");
        
        // Teste simples - removendo records por enquanto
        String message = "Java 24 funcionando!";
        System.out.println(message);
        
        // Teste de text blocks (Java 15+)
        String json = """
            {
                "status": "success",
                "javaVersion": "24"
            }
            """;
            
        System.out.println(json);
    }
}