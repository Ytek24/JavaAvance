package td2_exo2;

public class MereMain {
		public static void main(String[] args) throws Exception {
			Mere mere=new Mere();
			Mere mereFille=new Fille();
			Fille fille=new Fille();

			mere.miage();
			fille.miage();
			mereFille.miage();
			((Fille)mereFille).miage();
			mere.a();
			mereFille.a();
			fille.a();
			((Mere)mereFille).a();
			mereFille.b(null);

			mereFille.c();
			mereFille.c(mere);
			mereFille.c(mereFille);
			mereFille.c(fille);
			fille.c(fille);

			mere.d();
			mereFille.d();

			mere.printF();
			mereFille.printF();

			mereFille.j();
			mereFille.k();
			mereFille.l();
			mereFille.m();
			}
		//La redefinition : consiste a re-ecrire une methode definit dans la super-classe et a changer son
		//comportement. Le nombre et le type des arguments ainsi que la valeur de retour doivent etre
		//exactement les memes
		
		//La surcharge : consiste a modifier le prototype d'une methode existante, en
		//changeant le nombre d'arguments et/ou le type des arguments. La recherche d'une methode acceptble se fait en "remontant"
		//les derivations successives

}
