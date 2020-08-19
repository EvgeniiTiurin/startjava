public class GuessNumber {

    private int goal = 40;
    private int playerNumber = 46;

    public void inGame(String name , int number) {
        String tempName = name;
        int playerNumber = number;
        while (goal != playerNumber) {
            if (goal > playerNumber) {
                System.out.println("\nВведенное вами число меньше того, что загадал компьютер");
                playerNumber ++;
            } else if (goal < playerNumber) {
                System.out.println("\nВведенное вами число больше того, что загадал компьютер");
                playerNumber --;
            }
        }
        System.out.println("\nВы угадали!");
        //victory(tempName);
    }

    public void startGame() {
        System.out.println("\nИгра запустилась!");
    }

    public void endGame() {
        System.out.println("\nИгра завершилась!");
        return;
    }

    public boolean continueGame() {
        return true;
    }

    public void changePlayer() {
        System.out.println("\nТеперь ответ второго игрока");
    }

    public void victory(String player) {
        System.out.println("\nИгрок" + player + " угадал!!! Это победа!!!");
    }


}
