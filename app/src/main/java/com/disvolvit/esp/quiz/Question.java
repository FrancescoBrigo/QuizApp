package com.disvolvit.esp.quiz;

public class Question {
    private int mTestResId;
    private boolean mAnswerTrue;

    public Question(int question, boolean trueQuestion){
        mTestResId=question;
        mAnswerTrue=trueQuestion;
    }

    public int getQuestion(){
        return mTestResId;
    }
    public void setQuestion(int q){
        mTestResId=q;
    }
    public boolean isTrue(){
        return mAnswerTrue;
    }
    public void setTrueQuestion (boolean trueQ){
        mAnswerTrue = trueQ;
    }
}
