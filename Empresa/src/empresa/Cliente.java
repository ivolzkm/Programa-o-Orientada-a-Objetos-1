package empresa;

public class Cliente implements Autenticavel{
	@Override
	public boolean autentica(String senha) {
		if (senha.equals("senha123")) {
		return true;
	} else {
		return false;
	}	
}
}
