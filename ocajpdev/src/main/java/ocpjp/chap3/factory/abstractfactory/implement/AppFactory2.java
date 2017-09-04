package ocpjp.chap3.factory.abstractfactory.implement;

import ocpjp.chap3.factory.abstractfactory.App;
import ocpjp.chap3.factory.abstractfactory.AbstractAppFactory;
import ocpjp.chap3.factory.abstractfactory.Web;

public class AppFactory2 extends AbstractAppFactory {

	@Override
	protected App getInstanceApp() {
		return new AppChild1();
	}

	@Override
	protected Web getInstanceWeb() {
		return new WebChild1();
	}

}
