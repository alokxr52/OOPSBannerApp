/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This version introduces a CharacterPatternMap class
 * that encapsulates a character and its ASCII pattern.
 */

public class OOPSBannerApp {

    // Inner class to store character and its pattern
    static class CharacterPatternMap {

        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create array of character patterns
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
                " **** ",
                "*     ",
                "*     ",
                " ***  ",
                "     *",
                "     *",
                "****  "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        });

        return maps;
    }

    // Get pattern for a specific character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', maps);
    }

    // Print banner
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}