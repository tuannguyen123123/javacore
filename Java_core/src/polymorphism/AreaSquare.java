package polymorphism;

public class AreaSquare extends Square {
	double a;

	@Override
	protected double sSquare() {
		// TODO Auto-generated method stub
		 System.out.println("Polymorphism.DienTich.Dientich()"+a*4);
		return super.sSquare();
	}

	@Override
	protected double sSquare(String name) {
		// TODO Auto-generated method stub
		  System.out.println("Polymorphism.DienTich.Dientich()"+name+a*4);
		
		return super.sSquare(name);
	}

	public AreaSquare(double a) {
		super();
		this.a = a;
	}
	
	public static void main(String args[]){
		AreaSquare hinhvuong = new AreaSquare(5);
        hinhvuong.sSquare();
        hinhvuong.sSquare("Hinh Vuong ");
		
	}

}
