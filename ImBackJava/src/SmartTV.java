import java.util.Scanner;

public class SmartTV {
    Scanner entrada = new Scanner(System.in);

    //Constantes
    final int CANAL_INICIAL = 1;
    final int CANAL_FINAL = 50;
    final int VOLUME_INICIAL = 1;
    final int VOLUME_FINAL = 50;

    //Variáveis
    private boolean ligada = false;
    private int canalAtual = 1;

    private int volumeAtual = 25;

    //Getters and Setters
    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    //Métodos
    public void ligar(){
        setLigada(true);
    }
    public void desligar(){
        setLigada(false);
    }
    public void voltarCanal(){
        if(canalAtual > CANAL_INICIAL)
            canalAtual--;
        else{
            canalAtual = CANAL_FINAL;
        }
    }
    public void avancarCanal(){
        if(canalAtual < CANAL_FINAL)
            canalAtual++;
        else{
            canalAtual = CANAL_INICIAL;
        }
    }
    public void escolherCanal(){
        System.out.print("Digite o canal: ");
        int entrada_usuario = entrada.nextInt();

        while(entrada_usuario <  1 || entrada_usuario > 50) {
            System.out.println("Canal não encontrado!");
            System.out.print("Digite o canal: ");
            entrada_usuario = entrada.nextInt();
        }
        setCanalAtual(entrada_usuario);
    }

    public void diminuirVolume(){
        if(volumeAtual > VOLUME_INICIAL)
            volumeAtual--;
        else{
            volumeAtual = 0;
        }
    }
    public void aumentarVolume(){
        if(volumeAtual < VOLUME_FINAL)
            volumeAtual++;
        else{
            System.out.println("Volume Máximo Atingido");
        }
    }
}
