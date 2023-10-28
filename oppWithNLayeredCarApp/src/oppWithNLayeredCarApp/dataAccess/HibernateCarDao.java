package oppWithNLayeredCarApp.dataAccess;

import oppWithNLayeredCarApp.entities.Car;

public class HibernateCarDao implements CarDao{
	public void add(Car car) {
		System.out.println(car.getBrand() + " Hibernate ile veritabanına eklendi.");
	}

	@Override
	public void update(Car car) {
		System.out.println(car.getBrand() + " Hibernate ile veritabanında güncellendi.");
		
	}

	@Override
	public void delete(Car car) {
		System.out.println(car.getBrand() + " Hibernate ile veritabanından silindi.");
	}
}
