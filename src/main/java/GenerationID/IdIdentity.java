package GenerationID;

import org.springframework.stereotype.Service;

@Service
public class IdIdentity implements IdGenerat {
    private int id=0;
	@Override
	public String IdGeneration() {
		
		id++;
		System.out.println("Id Identity.");
		
		return String.valueOf(id);
	}

	
}
