package GenerationID;

import org.springframework.stereotype.Service;

@Service
public class PrefixId implements IdGenerat {

	private String prefix;
	
	public PrefixId(String prefix)
	{
		this.prefix=prefix;
	}
	
	@Override
	public String IdGeneration() {
		
		return prefix;
	}

}
