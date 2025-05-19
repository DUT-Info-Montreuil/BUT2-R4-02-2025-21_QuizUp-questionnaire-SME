package org.univ_paris8.iut.montreuil.qdev.tp2025.gr21.jeuQuizz.entities.dto;
import java.util.ArrayList;

public class QuestionnaireDTO {
    private int idQuestionnaire;
    private String theme;
    private ArrayList<QuestionDTO> listeDeQuestions;


    public QuestionnaireDTO(int idQuestionnaire, String theme, ArrayList<QuestionDTO> listeDeQuestions) {
        this.idQuestionnaire = idQuestionnaire;
        this.theme = theme;
        this.listeDeQuestions = listeDeQuestions;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }


    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public ArrayList<QuestionDTO> getListeDeQuestions() {
        return listeDeQuestions;
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "idQuestionnaire=" + idQuestionnaire +
                ", theme='" + theme + '\'' +
                ", listeDeQuestions=" + listeDeQuestions +
                '}';
    }
}