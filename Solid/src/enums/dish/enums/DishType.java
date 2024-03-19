package enums.dish.enums;

public enum DishType {
    CHICKEN_BROTH_WITH_PASTA("chicken broth with pasta"),
    CHICKEN_BROTH_WITH_RICE("chicken broth with rice"),
    TOMATO_SOUP_WITH_PASTA("tomato soup with pasta"),
    TOMATO_SOUP_WITH_RICE("tomato soup with rice");

    private final String dishTypeName;

    DishType(String displayName) {
        this.dishTypeName = displayName;
    }

    public String getDishTypeName() {
        return dishTypeName;
    }
}
