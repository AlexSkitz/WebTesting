package utils;

public enum Links {
    ROZETKA("https://rozetka.com.ua/"),
    YOUTUBE("https://www.youtube.com/"),
    DJINNI("https://djinni.co/"),
    HACKER9("https://hacker9.org/?aid=CYZ0GCW5vZ/"),
    GOOGLE("https://www.google.com.ua/");

    private final String link;
    Links(String link){
        this.link = link;
    }
    public String getLink(){ return link;}
}
