 public class Variable {
    public static void main(String[] args) {
        byte numberOfProcessors = 2;
        short frequency = 2500;
        int ramInMb = 8099;
        long diagonal = 12;
        float frequencyInGhz = 2.5564f;
        double ramInGb = 7.91;
        char seriesOfLaptop = 'E';
        boolean laptop = true;
        System.out.println("\nКолличество процессоров : " + numberOfProcessors);
        System.out.println("Частота : " + frequency);
        System.out.println("Оперативная память в МБ : " + ramInMb);
        System.out.println("Диагональ экрана в дюймах: " + diagonal);
        System.out.println("Частота в Ггц : " + frequencyInGhz);
        System.out.println("Оперативная память в ГБ: " + ramInGb);
        System.out.println("Серия ноутбуков : " + seriesOfLaptop);
        System.out.println("Это правда ноутбук? : " + laptop);
    }
}
