import java.time.LocalDate;

/**
 * Applying creation design pattern Builder
 *
 * @author Daniel Mora Cantillo
 * */
public class ProgrammingLanguage {
    private String name;
    private String nameCreator;
    private LanguageType languageType;
    private LocalDate launchDate;

    /**
     * Is necessary define a private constructor to obligate create a new object using 'Builder'
     * The constructor have an object type ProgrammingLanguageBuilder (An inner class defined more down)
        with all parameters of the principal class encapsulated
     * */
    private ProgrammingLanguage(ProgrammingLanguageBuilder builder) {
        this.name = builder.name;
        this.nameCreator = builder.nameCreator;
        this.languageType = builder.languageType;
        this.launchDate = builder.launchDate;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCreator() {
        return nameCreator;
    }

    public void setNameCreator(String nameCreator) {
        this.nameCreator = nameCreator;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", nameCreator='" + nameCreator + '\'' +
                ", languageType=" + languageType +
                ", launchDate=" + launchDate +
                '}';

    }


    /**
     * Inner class to apply builder pattern
     * All the attributes of this inner class are the same of the principal class and for each attribute
     * is necessary define a method to initialize the variable, finally return an object of this inner class
     * (necessary to allow call chaining)
     */
    public static class ProgrammingLanguageBuilder {
        private String name;
        private String nameCreator;
        private LanguageType languageType;
        private LocalDate launchDate;

        ProgrammingLanguageBuilder name(String name) {
            this.name = name;
            return this;
        }

        ProgrammingLanguageBuilder nameCreator(String nameCreator) {
            this.nameCreator = nameCreator;
            return this;
        }

        ProgrammingLanguageBuilder languageType(LanguageType languageType) {
            this.languageType = languageType;
            return this;
        }

        ProgrammingLanguageBuilder launchDate(LocalDate launchDate) {
            this.launchDate = launchDate;
            return this;
        }

        /**
         * Build method to return and object of the principal class 'ProgrammingLanguage'
         * */
        ProgrammingLanguage build() {
            return new ProgrammingLanguage(this);
        }
    }
}
