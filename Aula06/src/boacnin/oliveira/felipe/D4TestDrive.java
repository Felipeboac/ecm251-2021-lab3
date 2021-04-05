package boacnin.oliveira.felipe;

public class D4TestDrive {
    public static void main(String[] args) {
        D4 d1 = new D4();
        System.out.println("Primeira Leitura:" + d1.pegarFaceAtual());
        for(int i = 0; i<10; i++){
            System.out.println("Numero sorteado:" + d1.sortearNumero());
            System.out.println("Face Atual:" + d1.pegarFaceAtual());
        }
    }
}


