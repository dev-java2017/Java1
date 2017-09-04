package ocpjp.chap3.factory.abstractfactory;

import ocpjp.chap3.factory.abstractfactory.implement.AppFactory1;

public class Client {
	AbstractAppFactory appFactory;
	App app;
	Web web;

	public Client(AbstractAppFactory appFactory) {
		this.appFactory = appFactory;
		app = appFactory.createInstanceApp();
		web = appFactory.createInstanceWeb();
	}


	public static void main(String[] args) {
		AbstractAppFactory appFactory= new AppFactory1();
		Client client1 = new Client(appFactory);
		client1.run();
	}

	public void run() {
		app.display();
		web.display();
	}
}
