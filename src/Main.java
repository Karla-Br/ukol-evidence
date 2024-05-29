import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String nameSurname = "Jan Novák";
        LocalDate dateOfBirth = LocalDate.of(1963, 11, 8);
        int numberOfContracts = 50;
        double amountOfCarrot = 3.5;
        String addressOfSalesman = "Praha";
        String carRegistrationNumber = "5P1 88 66";
        double fuelConsumption = 6.0;
        String addressIPv4 = "192.168.0.0/16";

        double averageAmountOfCarrot = amountOfCarrot / numberOfContracts;

        System.out.println("Průměrné množství prodané mrkve na 1 smlouvu je: " + averageAmountOfCarrot + " tun.");

    }
}