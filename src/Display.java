public class Display {
    private String theme;
    private int fontSize;
    private int currentPage;

    public Display(String theme, int fontSize){
        this.theme = theme;
        this.fontSize = fontSize;
        this.currentPage = -1;
    }

    public void setTheme(String theme){
        this.theme = theme;
        System.out.println("Theme set to " + theme);
    }

    public void setFontSize(int fontSize){
        this.fontSize = fontSize;
        System.out.println("Font size set to " + fontSize);
    }

    public void turnPageForward(){
        currentPage++;
        System.out.println("Turned to page: " + currentPage);
    }

    public void turnPageBackward(){
        if(currentPage > 1){
            currentPage--;
            System.out.println("Turned to page: " + currentPage);
        }else{
            System.out.println("Already on the first page!");
        }
    }

    public void displayCurrentSettings(){
        System.out.println("Current Display settings:");
        System.out.println("Theme: " + theme);
        System.out.println("Font Size: " + fontSize);
        System.out.println("Current Page: " + currentPage);
    }
}