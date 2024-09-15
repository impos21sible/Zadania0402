public class MyCharacter {
    int gold;
    int silver;
    double wood;
    byte health;
    byte helpersNumber;

    public MyCharacter(
            int characterGold,
            int characterSilver,
            double characterWood,
            byte characterHealth,
            byte characterHelpersNumber
    ) {
        gold = characterGold;
        silver = characterSilver;
        wood = characterWood;
        health = characterHealth;
        helpersNumber = characterHelpersNumber;
    }
}