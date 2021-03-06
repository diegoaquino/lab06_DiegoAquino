package centralGames;
/**
 * 
 * @author DiegoAquino
 *
 */
public abstract class Jogo {
	private String nome;
	private int preco;
	private int topScore = 0;
	private int vezes_jogado = 0;
	private int vezes_zerado = 0;
	private int pontosX2pDaJogada;
	
	public Jogo(String nome, int preco){
		this.nome = nome;
		setPreco(preco);
	}
	public void setPontosX2pDaJogada(int pontos){
		pontosX2pDaJogada = pontos;
	}
	public int getPontosX2pDaJogada(){
		return pontosX2pDaJogada;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getTopScore() {
		return topScore;
	}

	public void setTopScore(int topScore) {
		this.topScore = topScore;
	}

	public int getVezes_jogado() {
		return vezes_jogado;
	}

	public void setVezes_jogado(int vezes_jogado) {
		this.vezes_jogado = vezes_jogado;
	}

	public int getVezes_zerado() {
		return vezes_zerado;
	}

	public void setVezes_zerado(int vezes_zerado) {
		this.vezes_zerado = vezes_zerado;
	}

	public String getNome() {
		return nome;
	}
	
	abstract boolean registraJogada(int score , boolean zerou);
	
}
