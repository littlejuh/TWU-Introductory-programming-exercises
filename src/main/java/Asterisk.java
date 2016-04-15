
public class Asterisk {

    String asteriskCharacter;

    public Asterisk() {
        this.asteriskCharacter = "*";
    }

    public String easiest() {
        return this.asteriskCharacter;
    }

    public String horizontalLine(int n) {
        StringBuilder asteriskToReturn = new StringBuilder();
        for (int i = 1; i < n; i++) {
            asteriskToReturn = asteriskToReturn.append(this.asteriskCharacter);
        }
        return asteriskToReturn.toString();
    }

    public String verticalLine(int n) {
        StringBuilder asteriskToReturn = new StringBuilder();
        for(int i = 0; i <= n; i++){
            asteriskToReturn =  asteriskToReturn.append("\n"+ this.asteriskCharacter);
        }
        return asteriskToReturn.toString();
    }

    public String rightTriangle(int n){
        StringBuilder asteriskToReturn = new StringBuilder();
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++ ){
                asteriskToReturn = asteriskToReturn.append(this.asteriskCharacter);
            }

            asteriskToReturn = asteriskToReturn.append("\n");
        }
        return asteriskToReturn.toString();
    }
}
