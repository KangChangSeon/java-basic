package Day10;

import Day10.dao.CarDAO;
import Day10.dto.CarDTO;
import Day10.dto.Tire;

public class CarMain {

    public static void main(String[] args) {
        CarDTO car1 = new CarDTO();
        System.out.println(car1.toString());
        Tire tire = new Tire();
        tire.setModel("한국타이어");
        CarDTO car2 = new CarDTO("캐스퍼",tire);
        CarDAO carDao = new CarDAO(car2);
        carDao.insert();
        carDao.update();;
        carDao.select();
        carDao.delete();

    }
}
