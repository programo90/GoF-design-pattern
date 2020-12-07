package builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[] {
				"좋은 아침"
				,"언뇽허새요"
				,
		});
		
		builder.makeString("밤에");
		builder.makeItems(new String[] {
				"안녕하세여"
				,"안녕히 주무세여"
				,"안녕히 계세여"
				,
		});
	}
}
