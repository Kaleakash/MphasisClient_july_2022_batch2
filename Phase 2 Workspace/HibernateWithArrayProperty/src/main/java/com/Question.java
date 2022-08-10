package com;

import java.util.Arrays;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderColumn;

@Entity				
public class Question {			// question table created...
@Id
private int qid;
private String question;
@ElementCollection
@OrderColumn(name = "answerId")
@CollectionTable(name = "answer")		// need one table answer
private String answers[];	
private String correctAnswer;
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String[] getAnswers() {
	return answers;
}
public void setAnswers(String[] answers) {
	this.answers = answers;
}
public String getCorrectAnswer() {
	return correctAnswer;
}
public void setCorrectAnswer(String correctAnswer) {
	this.correctAnswer = correctAnswer;
}
@Override
public String toString() {
	return "Question [qid=" + qid + ", question=" + question + ", answers=" + Arrays.toString(answers)
			+ ", correctAnswer=" + correctAnswer + "]";
}

}
