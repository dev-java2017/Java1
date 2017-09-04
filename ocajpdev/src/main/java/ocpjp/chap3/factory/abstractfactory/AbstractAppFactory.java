package ocpjp.chap3.factory.abstractfactory;

public abstract class AbstractAppFactory {
	protected App app;
	protected Web web;

	public App createInstanceApp() {
		return getInstanceApp();
	}

	protected abstract App getInstanceApp() ;







	public Web createInstanceWeb() {
		return getInstanceWeb();
	}

	protected abstract Web getInstanceWeb() ;
}
