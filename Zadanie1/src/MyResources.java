public class MyResources {
    long gold;
    byte silver;
    short wood;
    long health;
    boolean hasHelper;

    public MyResources(
            long inputGold,
            byte inputSilver,
            short inputWood,
            long inputHealth,
            boolean inputHasHelper
    ) {
        gold = inputGold;
        silver = inputSilver;
        wood = inputWood;
        health = inputHealth;
        hasHelper = inputHasHelper;
    }
}