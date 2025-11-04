public enum Education {
    
    PHD("PHD"), 
    MA("MA"), 
    BA("BS"), 
    HS("HS");

    private String education;

    private Education(String education) { // constructor
        this.education = education;
    }

    public String getEducation() {
        return this.education;
    }
}
