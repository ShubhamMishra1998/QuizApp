package model;

public class Quiz {
    private String ID;
    private String problemStatememt;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String ans;

    public Quiz(String problemStatememt, String opt1, String opt2, String opt3, String opt4, String ans) {
        this.problemStatememt = problemStatememt;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getProblemStatememt() {
        return problemStatememt;
    }

    public void setProblemStatememt(String problemStatememt) {
        this.problemStatememt = problemStatememt;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
