package bank.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxy implements InvocationHandler {
	private Object target;
	Logger logger = new Logger();

	public LoggingProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// invoke the method on the target
		Object returnValue = method.invoke(target, args);
		logger.log("Calling method" + method.getName() + " with argument(s):");
		if (args != null) {
			for(int p=0; p<args.length;p++){
				logger.log(" Param[" + p + "]: " + args[p].toString());
			}
		} else {
			logger.log(" No arguments passed.");
		}
		return returnValue;
	}
}

