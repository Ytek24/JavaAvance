package td2_exo3;

public class Main {
	
	public static void main(String[] args) {
		
		//Expr val = new Value(1337.0);
		//System.out.println(val.eval()); //affiche 1337.0
		//Expr add = new Add(new Value(327.0), val);
		//System.out.println(add.eval()); //affiche 1664.0
		//Expr e = new Add(new Value(350.0), add);
		//System.out.println(e.eval()); //affiche 2014.0	

	}
	class Add implements Expr{
		private final Expr val1, val2;
		public Add(Expr val1, Expr val2) {
			this.val1=val1;
			this.val2=val2;
		}
		public double eval() {
			return val1.eval() + val2.eval();
		}
		public String afficheEval() {
			return val1.afficheEval()+"+"+val2.afficheEval();
		}
}
	class Value implements Expr {

	    private final Double d;

	    public Value(Double d) {
	        this.d = d;
	    }

	    public double eval(){
	        return Double.valueOf(d);
	    }

	    public String afficheEval() {
	        return Double.toString(d);
	    }
	}
	class Multiply implements Expr{
		private final Expr val1, val2;
		public Multiply(Expr val1, Expr val2) {
			this.val1=val1;
			this.val2=val2;
		}
		public double eval() {
			return val1.eval() * val2.eval();
		}
		public String afficheEval() {
			return val1.afficheEval()+"*"+val2.afficheEval();
		}
	}
	class Sqrt implements Expr{
		private final double d;
		public Sqrt(double d) {
			this.d=d;
		}
		public double eval() {
			return Math.sqrt(d);
		}
	    public String afficheEval() {
	        return Double.toString(d);
	    }
	}
}
