package Workshop9;

public class IllegalRightTriangleException extends Exception{
    private String message="This is not a right triangle!";

    public String getMessage() {
        return message;
    }
    
    
}
