package boacnin.oliveira.felipe;
import java.util.Random;

public class Dado {
    private int numeroFaces;
    private int faceAtual;
    private int[] FACES;

    public Dado(int numeroFaces){
        this.numeroFaces = numeroFaces;
        this.FACES = new int[this.numeroFaces];
        for (int i = 0; i < this.numeroFaces; i++) {
            FACES[i] = i + 1;
        }
        sortearNumero();
    }

    int sortearNumero(){
        Random random = new Random();
        this.faceAtual = random.nextInt(this.numeroFaces);
        return this.faceAtual;
    }

    int pegarFaceAtual(){
        return FACES[this.faceAtual];
    }
}
