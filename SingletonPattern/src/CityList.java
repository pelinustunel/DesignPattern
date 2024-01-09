import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class CityList {

    public List<City> getCities(){

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String timeString = dateFormat.format(now);

        System.out.println("Data loading please wait...");
        System.out.println(timeString);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
             throw new RuntimeException(e);
        }


        List<City> cities = new ArrayList<>();
        cities.add(new City("New York"));
        cities.add(new City("İstanbul"));
        cities.add(new City("Ankara"));
        cities.add(new City("Kırklareli"));

        return cities;

    }

}
