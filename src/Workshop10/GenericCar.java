package Workshop10;

import java.util.ArrayList;


public class GenericCar<T> {
    private T obj;
    private ArrayList<T> carList = new ArrayList<>();
    
    public GenericCar() {
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public ArrayList<T> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<T> carList) {
        this.carList = carList;
    }
    
}
