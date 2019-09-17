package Function.colLesson02;

public class Word2 {
    String word;
    String meaning;

    public Word2(){}
    public Word2(String word, String meaning){
        this.meaning = meaning;
        this.word = word;
    }
    public String toString(){
        return "たんごは" + this.word + "意味は" + this.meaning;
    }
}
