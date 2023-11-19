import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        File src = new File("C:/Games/src");
        src.mkdir();
        sb.append("Директория создана, путь: C:/Games/src\n");

        File main = new File("C:/Games/src/main");
        main.mkdir();
        sb.append("Директория создана, путь: C:/Games/src/main\n");

        File main1 = new File(main, "Main.java");
        File main2 = new File(main, "Utils.java");
        try {
            main1.createNewFile();
            main2.createNewFile();
            sb.append("Файл создан, путь: C:/Games/main/Main.java\n");
            sb.append("Файл создан, путь: C:/Games/main/Utils.java\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File test = new File("C:/Games/src/test");
        test.mkdir();
        sb.append("Директория создана, путь: C:/Games/src/test\n");

        File res = new File("C:/Games/res");
        res.mkdir();
        sb.append("Директория создана, путь: C:/Games/res\n");

        File drawables = new File("C:/Games/res/drawables");
        drawables.mkdir();
        sb.append("Директория создана, путь: C:/Games/res/drawables\n");

        File vectors = new File("C:/Games/res/vectors");
        vectors.mkdir();
        sb.append("Директория создана, путь: C:/Games/res/vectors\n");

        File icons = new File("C:/Games/res/icons");
        icons.mkdir();
        sb.append("Директория создана, путь: C:/Games/res/icons\n");

        File saveGames = new File("C:/Games/savegames");
        saveGames.mkdir();
        sb.append("Директория создана, путь: C:/Games/savegames\n");

        File temp = new File("C:/Games/temp");
        temp.mkdir();
        sb.append("Директория создана, путь: C:/Games/temp\n");

        File tempText = new File(temp, "temp.txt");
        try {
            FileWriter writer = new FileWriter(tempText);
            writer.write(sb.toString());
            writer.close();
            sb.append("Файл создан, путь: C:/Games/temp/temp.txt\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}