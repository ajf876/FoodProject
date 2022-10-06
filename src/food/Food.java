package food;

public abstract class Food {

	public int size = -1;

	public String whoAmI() {
		return this.getClass().getName();
	}
}
