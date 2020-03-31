package Workshop9;

public class IllegalTriangleException extends Exception{
    private String message="This is not a triangle";
    
    public String getMessage() {
        return message;
    }
}
