package Main;

import java.io.File;

import static Main.CheckUtils.parseUserData;
import static Main.CheckUtils.userInput;

public class Main {


    public static void main(String[] args) {
        String[] data = parseUserData(userInput());
        String fileName = data[0] + ".txt";
        WriteToFile.writeUserData(data,fileName);
    }

//      Иванов Иван Иванович 29.02.2000 89277512055 f  - Корректный ввод
//      Иванов Иван Иванович 7.04.1999 89277512055 f  - Корректный ввод запись в тот же файл
//      Петров Иван Иванович 5.04.1998 89277512055 в  - Исключение по гендеру
//      Степан Иван Иванович 34.03.1997 89277512055 f  - Исключение по дате
//      Иванов Иван Иванович 3.04.1995 89277512321055 f  - Исключение по номеру
}
