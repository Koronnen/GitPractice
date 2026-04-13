public class anotherone {
    private boolean isValid;
    private int statuscode;
    private String message;

    public anotherone(boolean isValid, int statuscode) {
        this.isValid = isValid;
        this.statuscode = statuscode;
        message = "Status code is " + statuscode + " and validity is " + isValid;
    }

    public boolean getValid() {
        return isValid;
    }
    public int getStatuscode() {
        return statuscode;
    }

    public String getMessage() {
        return message;
    }
    
}
