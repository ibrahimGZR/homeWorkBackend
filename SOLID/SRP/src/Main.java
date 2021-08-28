
public class Main {

	public static void main(String[] args) {
		// Single Responsibility Prenciple  

	}

	public class CustomerManager {
		//aspect orianted programming
		public void transactionalOpertion() {
			update();
			add();
		}

		public void update() {
			MyContext context = new MyContext();
			context.update();
		}

		public void add() {
			MyContext context = new MyContext();
			context.add();
		}
	}

	public class MyContext {
		public void update() {

		}

		public void add() {

		}
	}

	public class PersonManager {
		public void add() {
			CustomerManager customerManager = new CustomerManager();
			customerManager.transactionalOpertion();
		}
	}

}
