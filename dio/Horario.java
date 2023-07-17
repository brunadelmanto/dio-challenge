package one.dio;

public class Horario {
    public static void obterMensagem(int hora){
        switch (hora){
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagem1();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagem2();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
                mensagem3();
                break;
            default:
                System.out.println("Hora inválida");
                break;
        }
    }

    public static void mensagem1(){
        System.out.println("Bom dia");
    }

    public static void mensagem2(){
        System.out.println("Boa tarde");
    }

    public static void mensagem3(){
        System.out.println("Boa noite");
    }
}
