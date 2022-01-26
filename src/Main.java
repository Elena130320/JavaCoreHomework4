public class Main {

    public static void main(String[] args) {
        WordArr wordArr = new WordArr(newWords());
        wordArr.doArrayWord();


    }

    public static String[] newWords() {
        String[] string = new String[10];
        string[0] = "Jaguar";
        string[1] = "Renault";
        string[2] = "Nissan";
        string[3] = "Jaguar";
        string[4] = "Mercedes";
        string[5] = "Range Rover";
        string[6] = "Mercedes";
        string[7] = "Jaguar";
        string[8] = "Renault";
        string[9] = "Ford";
        return string;

    }

    public static void PhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("Дима", "9031783456");
        phoneBook.addPhone("Вадим", "9269681234");
        phoneBook.addPhone("Андрей", "9212130987");
        phoneBook.addPhone("Даниил", "9100258789");
        phoneBook.addPhone("Дима", "9038596178");
    }
}
