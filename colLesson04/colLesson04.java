package Function.colLesson04;
import java.util.ArrayList;
import java.util.Scanner;

public class colLesson04 {
 public static void main(String[] args) {
     System.out.println("5個のたん語をとうろくします。半角スペ-スを入れてください");
     System.out.println("入力を途中でやめるには＜e＞を押します。");
     Scanner scanner = new Scanner(System.in);
     ArrayList<Word4> word_array = new ArrayList<>(4);
     int count = 0;



     try {
         while (true) {
             String input = new java.util.Scanner(System.in).nextLine();

             if ("e".equals(input)) {
                 break;
             }
             String[] words = input.split("　");

             if (count == 5) {
                 System.out.println("制限を超えました。とうろくずみのデ-タは以下になります。");
                 break;
             } else {

                 word_array.add(new Word4(words[0], words[1]));
                 System.out.println("次のたん語と意味を入力してください。eで終了します。" + count);

                 count++;
             }
         }
         } finally{

             for (int j = 0; j < word_array.size(); j++) {
                 System.out.println(word_array.get(j).toString());
             }
             System.out.println(word_array.size() + "件、とうろくしました。");
         }
     }

 }

