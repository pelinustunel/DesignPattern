import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class CityListSingleton {

    // Singleton sınıfının tasarımı
    // bu sınıfı öyle oluşturulması gerekiyor ki sadece ve sadece getinstance metodu çağrılsın.
    // Veri tabanında bir kere oluşturman gerektiğinde singleton instance oluşturabilirsin.
    // Tek bir sefer oluşturmak için
    
    private static CityListSingleton instance;
    Date now = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
    String timeString = dateFormat.format(now);

    private CityListSingleton() {

    }
    public static CityListSingleton getInstance(){

        if(instance == null){
            instance = new CityListSingleton();
        }
        return instance;

    }

    public List<City> getCities(){

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
