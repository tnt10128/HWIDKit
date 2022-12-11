package xyz.playneptune.hwidkit;

public enum SystemSpecification {
    
    OS_NAME(System.getProperty("os.name")),
    OS_ARCHITECTURE(System.getProperty("os.arch")),
    OS_VERSION(System.getProperty("os.version")),
    USER_NAME(System.getProperty("user.name")),
    AVAILABLE_PROCESSORS(String.valueOf(Runtime.getRuntime().availableProcessors())),
    WIN_PROCESSOR_IDENTIFIER(System.getenv("PROCESSOR_IDENTIFIER")),
    WIN_PROCESSOR_ARCHITECTURE(System.getenv("PROCESSOR_ARCHITECTURE")),
    WIN_PROCESSOR_ARCHITEW6432(System.getenv("PROCESSOR_ARCHITEW6432")),
    WIN_NUMBER_OF_PROCESSORS(System.getenv("NUMBER_OF_PROCESSORS"));

    public final String asString;

    SystemSpecification(String asString) {
        this.asString = asString;
    }

    @Override
    public String toString() {
        return asString;
    }

}
