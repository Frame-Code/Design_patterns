import java.time.LocalDate;

/**
 * The creational pattern Builder defines a way to create objects dynamically,
 * without the class depending on many long constructors
 * Using inner class and methods to initialize all attributes of the respective class
 * @see ProgrammingLanguage
 * @author Daniel Mora Cantillo
 * */
public class Main {
    public static void main(String[] args) {

        //Creating different objects to dynamic way using builder pattern
        ProgrammingLanguage java = new ProgrammingLanguage.ProgrammingLanguageBuilder()
                .name("Java good")
                .nameCreator("James Gosling")
                .languageType(LanguageType.HYBRID)
                .launchDate(LocalDate.of(1996, 1, 23))
                .build();

        ProgrammingLanguage python  = new ProgrammingLanguage.ProgrammingLanguageBuilder()
                .name("Python good")
                .nameCreator("Guido van Rossum")
                .languageType(LanguageType.INTERPRETED)
                .launchDate(LocalDate.of(1991, 2, 20))
                .build();

        ProgrammingLanguage javascript = new ProgrammingLanguage.ProgrammingLanguageBuilder()
                .name("Javascript good")
                .nameCreator("Brendan Eich")
                .languageType(LanguageType.INTERPRETED)
                .launchDate(LocalDate.of(1995, 12, 4))
                .build();

        ProgrammingLanguage c = new ProgrammingLanguage.ProgrammingLanguageBuilder()
                .name("C")
                .nameCreator("Dennis Ritchie")
                .languageType(LanguageType.COMPILED)
                .launchDate(LocalDate.of(1972, 1, 1))
                .build();

        System.out.println(java);
        System.out.println(python);
        System.out.println(javascript);
        System.out.println(c);
    }
}