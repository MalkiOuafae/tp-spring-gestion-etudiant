package ma.ehei.tp;

import ma.ehei.tp.configuration.AppConfig;
import ma.ehei.tp.service.facturation.FacturationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import GenerationID.IdIdentity;
import PKEtudiants.Etudiant;
import PKEtudiants.EtudiantService;

public class App {
    public static void main(String[] args) {
   
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	EtudiantService etudService=context.getBean(EtudiantService.class);
    	
    	Etudiant et1=new Etudiant();
    	et1.setNom("MALKI");
    	et1.setPrenom("Ouafae");
    	etudService.ajouter(et1);
    	
    }
}
