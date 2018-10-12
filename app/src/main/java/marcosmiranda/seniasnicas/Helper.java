package marcosmiranda.seniasnicas;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class Helper {
    private static final String APP_NAME = "com.marcosmiranda.seniasnicas";
    private static final String EXTRA_TITLE = APP_NAME + ".TITLE";
    private static final String EXTRA_IMAGE = APP_NAME + ".IMAGE";
    private static final String EXTRA_VIDEO = APP_NAME + ".VIDEO";

    public static void gallery(Context context, int title, int idImage, int idVideo) {
        Intent intent = new Intent(context, Galeria.class);
        Uri pathImage = Uri.parse("android.resource://" + context.getPackageName() + "/" + idImage);
        Uri pathVideo = Uri.parse("android.resource://" + context.getPackageName() + "/" + idVideo);
        intent.putExtra(EXTRA_TITLE, title);
        intent.putExtra(EXTRA_IMAGE, pathImage);
        intent.putExtra(EXTRA_VIDEO, pathVideo);
        context.startActivity(intent);
    }

    /*
    // Return the index of a given letter
    static int getIndexOfLetter(Letras letter) {
        int letterIndex = 0;
        Letras[] lettersArray = Letras.values();
        for (int i = 0; i < lettersArray.length; i++) {
            Letras l = lettersArray[i];
            if (letter == l) {
                letterIndex = i;
                break;
            }
        }
        return letterIndex;
    }

    // Return the letter that is in the given index
    static Letras getLetterOfIndex(int index) {
        return Letras.values()[index];
    }

    static int getIndexOfWord(Words word) {
        String strWord = word.toString();
        Categories cat = getWordCategory(word);
        Array<XmlReader.Element> catWords = getCategoryWords(cat);
        int index = -1;
        for (XmlReader.Element child : catWords) {
            String val = child.getChildByName("value").getText();
            if (strWord.equals(val)) {
                index = catWords.indexOf(child, true);
                break;
            }
        }
        return index;
    }

    static String getWordString(Words word) {
        String wordVal = word.toString();
        XmlReader reader = new XmlReader();
        XmlReader.Element root = reader.parse(Gdx.files.internal("data/words.xml"));
        Array<XmlReader.Element> items = root.getChildrenByNameRecursively("word");
        String strWord = "";
        for (XmlReader.Element child : items) {
            String val = child.getChildByName("value").getText();
            if (wordVal.equals(val)) {
                strWord = child.getChildByName("text").getText();
                break;
            }
        }
        return strWord;
    }

    static Categories getWordCategory(Words word) {
        String strWord = word.toString();
        XmlReader reader = new XmlReader();
        XmlReader.Element root = reader.parse(Gdx.files.internal("data/words.xml"));
        Array<XmlReader.Element> items = root.getChildrenByNameRecursively("word");
        Categories cat = null;
        for (XmlReader.Element child : items) {
            String val = child.getChildByName("value").getText();
            if (strWord.equals(val)) {
                String strCat = child.getParent().getParent().getChildByName("value").getText();
                cat = Categories.valueOf(strCat);
                break;
            }
        }
        return cat;
    }

    static String getCategoryName(Categories category) {
        String strCategory = category.toString();
        XmlReader reader = new XmlReader();
        XmlReader.Element root = reader.parse(Gdx.files.internal("data/words.xml"));
        Array<XmlReader.Element> items = root.getChildrenByName("category");
        String name = "";
        for (XmlReader.Element child : items) {
            String val = child.getChildByName("value").getText();
            if (strCategory.equals(val)) {
                name = child.getChildByName("name").getText();
                break;
            }
        }
        return name;
    }

    // Get the icon path of the given category
    static String getCategoryIconPath(Categories category) {
        String strCategory = category.toString();
        XmlReader reader = new XmlReader();
        XmlReader.Element root = reader.parse(Gdx.files.internal("data/words.xml"));
        Array<XmlReader.Element> items = root.getChildrenByName("category");
        String icon_path = "";
        for (XmlReader.Element child : items) {
            String val = child.getChildByName("value").getText();
            if (strCategory.equals(val)) {
                icon_path = child.getChildByName("icon_path").getText();
                break;
            }
        }
        return icon_path;
    }

    // Returns the words that are in the given category
    static Array<XmlReader.Element> getCategoryWords(Categories category) {
        String strCategory = category.toString();
        XmlReader reader = new XmlReader();
        XmlReader.Element root = reader.parse(Gdx.files.internal("data/words.xml"));
        Array<XmlReader.Element> items = root.getChildrenByName("category");
        Array<XmlReader.Element> words = new Array<XmlReader.Element>();
        for (XmlReader.Element child : items) {
            String val = child.getChildByName("value").getText();
            if (strCategory.equals(val)) {
                words = child.getChildrenByNameRecursively("word");
                break;
            }
        }
        return words;
    }
    */
}