package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char vowels[] = {'a','e','i','o','u',
                'A','E','I','O','U'};
        char consonants[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z',
                'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};

        for (char var : vowels) {
            if(character == var) {
                System.out.println("Vowel");
                return;
            }
        }

        for (char var : consonants) {
            if(character == var) {
                System.out.println("Consonant");
                return;
            }
        }

        System.out.println("wrong alphabet!");
    }
}
