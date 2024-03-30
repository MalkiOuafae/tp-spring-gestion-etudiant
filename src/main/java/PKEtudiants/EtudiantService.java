package PKEtudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import Dao.EtudiantDao;
import GenerationID.IdGenerat;

public class EtudiantService {
@Autowired
	private EtudiantDao etudiant;
@Autowired
@Qualifier("IdIdentity")
	private IdGenerat idgenerat;
	
	public void ajouter(Etudiant et )
	{
		et.setId(idgenerat.IdGeneration());
		etudiant.persister(et);
	}
}
