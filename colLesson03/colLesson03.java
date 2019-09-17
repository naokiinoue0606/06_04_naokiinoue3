package Function.colLesson03;

import java.util.Scanner;

public class colLesson03 {
    public static void main(String[] args) {

        System.out.println("たんごとうろく帳です");
        System.out.println("5件まで、たんごと意味をとうろくできます。たんごの後に半角スペ-スを入れてください");
        System.out.println("※入力を途中でやめるには＜e＞を押します。");

        Word3[] words = new Word3[5];
        Scanner scanner = new Scanner(System.in);
        int count = 0;


        while (true) {

            String input = scanner.nextLine();

            String[] wordAndMeaning = input.split(" ");
            try {

                Word3 word = new Word3(wordAndMeaning[0], wordAndMeaning[1]);

                words[count] = word;
            } catch (Exception e) {
                break;
            }
            count++;
        }


        for (int i = 0; i < count; i++) {
            System.out.println(words[i]);

        }
        System.out.println("とうろく制限を超えました。とうろくずみのデ-タは以上となります。");
    }


}

