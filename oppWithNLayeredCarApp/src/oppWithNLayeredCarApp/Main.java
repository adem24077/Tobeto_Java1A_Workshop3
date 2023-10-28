package oppWithNLayeredCarApp;

import oppWithNLayeredCarApp.business.CarManager;
import oppWithNLayeredCarApp.core.logging.DatabaseLogger;
import oppWithNLayeredCarApp.core.logging.FileLogger;
import oppWithNLayeredCarApp.core.logging.Logger;
import oppWithNLayeredCarApp.core.logging.MailLogger;
import oppWithNLayeredCarApp.dataAccess.HibernateCarDao;
import oppWithNLayeredCarApp.dataAccess.JdbcCarDao;
import oppWithNLayeredCarApp.entities.Car;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Car car1 = new Car(1,"Fiat","Linea",510);
		
		Car car2 = new Car(2,"Fiat","Egea",600);
		
		Car car3 = new Car(3,"Opel","Astra",650);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		CarManager carManager = new CarManager(new HibernateCarDao(),loggers);
		
		carManager.add(car1);
		
		carManager.update(car2);
		
		carManager.delete(car3);
		
	}

}
