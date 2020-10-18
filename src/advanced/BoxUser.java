package advanced;

public class BoxUser {

    public static void main(String[] args) {
        
        Box<String> fadilBox = new Box<>();
        fadilBox.setObject("Ovo je Fadilova kutija");
        fadilBox.inspect(23);
    }
}
