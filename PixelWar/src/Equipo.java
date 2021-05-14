public class Equipo{

	String Nombre;
	static int hp, misil;
	String tipo;
	int misila, misild;
	
	public Equipo(String tipo, String nom){
		
		this.Nombre=nom;
		this.tipo = tipo;
		this.hp=gethptipo(tipo);
		this.misil=getmisilestipo(tipo);
	}
	public static int gethptipo(String tipo) {
		if(tipo.equals("Stickman")) {
			hp = 200;
		}
		if(tipo.equals("Link")) {
			hp = 200;
		}
		if(tipo.equals("Link")) {
			hp = 200;
		}
		if(tipo.equals("Sonic")) {
			hp = 200;
		}
		if(tipo.equals("Ratchet & Clank")) {
			hp = 200;
		}
		if(tipo.equals("Donkey Kong")) {
			hp = 400;
		}
		if(tipo.equals("Clank")) {
			hp = 50;
		}
		if(tipo.equals("Mario")) {
			hp = 200;
		}
		if(tipo.equals("Pikachu")) {
			hp = 200;
		}
		if(tipo.equals("Sub-Zero")) {
			hp = 200;
		}
		
		return hp;
	}
	
	public static int getmisilestipo(String tipo) {
		if(tipo.equals("Stickman")) {
			misil = 50;
		}
		if(tipo.equals("Link")) {
			misil = 50;
		}
		if(tipo.equals("Link")) {
			misil = 50;
		}
		if(tipo.equals("Sonic")) {
			misil = 50;
		}
		if(tipo.equals("Ratchet & Clank")) {
			misil = 50;
		}
		if(tipo.equals("Donkey Kong")) {
			misil = 20;
		}
		if(tipo.equals("Clank")) {
			misil = 20;
		}
		if(tipo.equals("Mario")) {
			misil = 50;
		}	
		if(tipo.equals("Pikachu")) {
			misil = 50;
		}
		if(tipo.equals("Sub-Zero")) {
			misil = 50;
		}
		
		return misil;
	}
	
	
	
	public int recibirmisiles(String nome, int cantidad, String nom, int hp, int misilesE, int misilesD) {
	int cont=0;
	int vida;
	String jugador[] = new String[cantidad];
	jugador[cont] = nom; 
	String jugadorO[] = new String[cantidad];
	jugadorO[cont] = nome; 		
	
	if(cont == cantidad) {
	for(int i = 0; i < cantidad;i++) {
		for(int y = 0; y < cantidad;y++) {
		if(jugador[i] == jugadorO[y]) {
			
		}
		}
	}
	}
		vida = misilesE - misilesD;
		
		hp = hp-vida;
		vida=0;
		return hp;	
	}
	
	public String getNombre(){
		return this.Nombre;
	}
	
	public int gethp() {
		
		
		
		return 0;
	}

	
	
	
	
}
