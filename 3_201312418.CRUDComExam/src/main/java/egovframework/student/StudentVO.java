package egovframework.student;

public class StudentVO extends StudentDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /** number */
    private java.lang.String number;
    
    /** name */
    private java.lang.String name;
    
    public java.lang.String getNumber() {
        return this.number;
    }
    
    public void setNumber(java.lang.String number) {
        this.number = number;
    }
    
    public java.lang.String getName() {
        return this.name;
    }
    
    public void setName(java.lang.String name) {
        this.name = name;
    }
    
}
