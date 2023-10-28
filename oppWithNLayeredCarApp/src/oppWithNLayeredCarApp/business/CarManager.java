package oppWithNLayeredCarApp.business;

import oppWithNLayeredCarApp.core.logging.Logger;
import oppWithNLayeredCarApp.dataAccess.CarDao;
import oppWithNLayeredCarApp.dataAccess.HibernateCarDao;
import oppWithNLayeredCarApp.dataAccess.JdbcCarDao;
import oppWithNLayeredCarApp.entities.Car;

public class CarManager {
	private CarDao carDao;
	private Logger[] loggers;
	
	public CarManager(CarDao carDao, Logger[] loggers) {
		this.carDao = carDao;
		this.loggers = loggers;
	}

	public void add(Car car) throws Exception {
		if (car.getBrand().length()<3) {
			throw new Exception("Araba markası adı 3'harften az olamaz.");
		}else if(car.getPricePerHour()<500) {
			throw new Exception("Arabanın saatlik ücreti 500'den az olamaz.");
		}
		carDao.add(car);
		
		for (Logger logger : loggers) {
			logger.log(car.getBrand());
		}
	}
	
	public void update(Car car) throws Exception {
		if(car.getBrand().length()<3) {
			throw new Exception("Araba markası adı 3 harfden az olduğu için güncelleştirme gerçekleşmedi");
		}
		
		carDao.update(car);
		
		for (Logger logger : loggers) {
			logger.log(car.getBrand());
		}
	}
	
	public void delete(Car car) {
		carDao.delete(car);
		
		for (Logger logger : loggers) {
			logger.log(car.getBrand());
		}
	}
	

}
