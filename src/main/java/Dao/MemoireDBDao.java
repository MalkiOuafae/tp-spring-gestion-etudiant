package Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import PKEtudiants.Etudiant;

@Primary
@Repository
public class MemoireDBDao implements EtudiantDao {

	private List<Etudiant> listEtud;
	
	public MemoireDBDao()
	{
		listEtud =new ArrayList<>();
	}
	@Override
	public void persister(Etudiant et) {
		listEtud.add(et);
		System.out.println("Etudiant :"+et.getNom()+" "+et.getPrenom());
		
	}
	
	
}
