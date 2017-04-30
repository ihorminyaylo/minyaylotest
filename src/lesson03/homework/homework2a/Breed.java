package lesson03.homework.homework2a;

/**
 * Created by user on 26.04.2017.
 */
public enum Breed {
    BULLDOG("Bulldog"), YORKSHIRE_TERRIER("Yorkshire Terrier"), SHEEPDOG("Sheepdog");
    private String nameBreed;

    public String getNameBreed() {
        return nameBreed;
    }

    public void setNameBreed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
    Breed(String nameBreed) {
        this.nameBreed = nameBreed;
    }
}
