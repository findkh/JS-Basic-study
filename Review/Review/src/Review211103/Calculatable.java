package Review211103;
public interface Calculatable{
	public void setOprands(int first, int second, int third);
	public int sum();
	public int avg();
//	Calculator가 조작하게 하기 위해 public으로 되어 있음
//	I/F의 멤버들은 public으로 지정해줘야 함
}