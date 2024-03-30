package GenerationID;

import org.springframework.stereotype.Service;

@Service
public class IdDate implements IdGenerat {

	@Override
	public String IdGeneration() {

		
		return String.valueOf(System.currentTimeMillis());
	}

	
}
