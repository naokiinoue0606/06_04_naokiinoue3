package Function.colLesson02;

import java.util.Scanner;

public class colLesson02 {
    public static void main(String[] args) {

        System.out.println("たんごとうろく帳です");
        System.out.println("10件まで、たんごと意味をとうろくできます。たんごの後に半角スペ-スを入れてください");
        System.out.println("※入力を途中でやめるには＜e＞を押します。");

        Word2[] words = new Word2[10];

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (count < 10) {
            String input = scanner.nextLine();
            if (input.equals("e")) {
                break;
            }

            String[] wordAndMeaning = input.split(" ");

            Word2 word = new Word2(wordAndMeaning[0], wordAndMeaning[1]);

            words[count] = word;
            count++;

        }
        System.out.println(count + "件登完了");
        for (int i = 0; i < count; i++) {
            System.out.println("たんごは" + words[i].word + "意味は" + words[i].meaning);
        }
    }

}

