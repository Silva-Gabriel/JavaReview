import java.util.Scanner;

public class Usuario {
    public static void main(String[] args)
    {
        SmartTV smartTv = new SmartTV();
        int resultado = menu();

        while(resultado != 0){
            switch (resultado) {
                case 1 -> smartTv.ligar();
                case 2 -> {
                    if (smartTv.isLigada())
                        smartTv.desligar();
                }
                case 3 -> {
                    if (smartTv.isLigada())
                        smartTv.voltarCanal();
                }
                case 4 -> {
                    if (smartTv.isLigada())
                        smartTv.avancarCanal();
                }
                case 5 -> {
                    if (smartTv.isLigada())
                        smartTv.escolherCanal();
                }
                case 6 -> {
                    if (smartTv.isLigada())
                        smartTv.diminuirVolume();
                }
                case 7 -> {
                    if (smartTv.isLigada())
                        smartTv.aumentarVolume();
                }
                case 8 -> System.exit(0);
            }
            System.out.println(status(smartTv));
            resultado = menu();
        }
        System.out.println();
        System.out.println("TESTE!");
    }

    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.print(
                """
                [1] - Ligar TV
                [2] - Desligar TV
                [3] - Voltar Canal
                [4] - Avançar Canal
                [5] - Escolher Canal
                [6] - Diminuir Volume
                [7] - Aumentar Volume
                Escolha uma das opções listadas:\s
                """
        );
        return entrada.nextInt();
    }

     public static String status(SmartTV smartTv) {
         String _statusTV = "TV Ligada? " + smartTv.isLigada() + "\n";
         String _canalTV = "Canal Atual: " + smartTv.getCanalAtual() + "\n";
         String _volumeTV = "Volume Atual: " + smartTv.getVolumeAtual();

         return _statusTV + _canalTV + _volumeTV;
     }

}
