package ocpjp.chap3.factory.abstractfactory.implement;

import ocpjp.chap3.factory.abstractfactory.App;
import ocpjp.chap3.factory.abstractfactory.AbstractAppFactory;
import ocpjp.chap3.factory.abstractfactory.Web;

public class AppFactory1 extends AbstractAppFactory {

	@Override
	protected App getInstanceApp() {
		app = new AppChild1();
		return  app;
	}

	@Override
	protected Web getInstanceWeb() {
		web = new WebChild1();
		return web;
	}

}
