package org.univ_paris8.iut.montreuil.qdev.tp2025.gr21.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr21.jeuQuizz.entities.bo.FichierCSVBO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr21.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr21.jeuQuizz.utils.exceptions.ChargementException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr21.jeuQuizz.utils.exceptions.FichierIndisponibleException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr21.jeuQuizz.utils.exceptions.FormatFichierException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr21.jeuQuizz.utils.exceptions.IntégritéException;

import java.util.ArrayList;


public interface IQuestionnaireServices {



    public FichierCSVBO chargerFichier(String path) throws FormatFichierException, IntégritéException;

    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaire() throws FichierIndisponibleException, ChargementException;


}
