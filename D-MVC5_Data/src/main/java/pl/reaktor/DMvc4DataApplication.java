package pl.reaktor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.reaktor.model.Car;
import pl.reaktor.repository.CarRepo;

@SpringBootApplication
public class DMvc4DataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DMvc4DataApplication.class, args);
		
		// utworzenie tabelki zawierajacej samochody
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("A6","Audi",200000.0));
		cars.add(new Car("Auris","Toyota",120000.0));
		cars.add(new Car("Panda","Fiat",30000.0));
		cars.add(new Car("Tipo","Fiat",30000.0));
		cars.add(new Car("Uno","Fiat",20000.0));
		cars.add(new Car("A3","Audi",20000.0));
		cars.add(new Car("Astra","Opel",20000.0));
		cars.add(new Car("Adam","Opel",20000.0));
		cars.add(new Car("Zafira","Opel",20000.0));
		cars.add(new Car("Insignia","Opel",20000.0));
	
		CarRepo cr = ctx.getBean(CarRepo.class);
		// zapis do bazy danych 
		cars.forEach(cr::save);
		
		//Car selectedCar = cr.findOne(1L);
		//cr.delete(selectedCar);
		
		cr.findAll().forEach(System.out::println);
		System.out.println(cr.count());
		List<Car> list1 = cr.findByBrand("Fiat");
		System.out.println(list1);
		List<Car> list2 = cr.findByName("Tipo");
		System.out.println(list2);
		List<Car> list3 = cr.findByPrice(20000.0);
		System.out.println(list3);
		List<Car> list4 = cr.findByBrandAndPrice("Toyota",120000.0);
		System.out.println(list4);
		System.out.println("Pierwszy Fiat");
		List<Car> list5 = cr.findFirstByBrand("Fiat");
		System.out.println(list5);
		System.out.println("Trzy pierwsze Fiaty");
		List<Car> list6 = cr.findFirst3ByBrand("Fiat");
		System.out.println(list6);
		System.out.println("Trzy pierwsze Ople:");
		List<Car> list7 = cr.findFirst3ByBrand("Opel");
		System.out.println(list7);
		// select * from car where brand = br or brand = b2;
		System.out.println("Wszystkie Ople i Fiaty");
		List<Car> list8 = cr.findAllByBrandOrBrand("Opel", "Fiat");
		System.out.println(list8);
		System.out.println("Wszystkie nazwy zaczynając się na \"A\"");
		List<Car> list9 = cr.findAllByNameStartingWith("A");
		System.out.println(list9);
		System.out.println("Wszystkie nazwy zaczynając się na \"I\"");
		List<Car> list10 = cr.findAllByNameLike("I%");
		System.out.println(list10);
		System.out.println("Wszystkie nazwy zawierajace \"st\"");
		List<Car> list11 = cr.findAllByNameContaining("st");
		System.out.println(list11);
		System.out.println("Wszystkie nazwy kończące się na \"A\"");
		List<Car> list12 = cr.findAllByNameEndingWith("A%");
		//list12.forEach(System.out::println);
		System.out.println(list12);
		System.out.println("Wszystkie nazwy zaczynając się na \"A\" i kończące na \"A\"");
		List<Car> list13 = cr.findAllByNameStartingWithAndNameEndingWith("A", "A");
		System.out.println(list13);
		System.out.println("Wszystkie nazwy zawierające \"st\" i zaczynające się na \"A\"");
		List<Car> list14 = cr.findAllByNameContainingAndNameStartingWith("st", "A");
		//list14.forEach(System.out::println);
		System.out.println(list14);
		System.out.println("Wszystkie ople tańsze niż 50tys.");
		List<Car> list15 = cr.findAllByBrandAndPriceLessThan("Opel", 50000.0);
		//list15.forEach(System.out::println);
		System.out.println(list15);
		System.out.println("Wszystkie marki zawierające \"ia\" z ceną w przedziale(30tys.;100000tys.)");
		List<Car> list16 = cr.findAllByBrandLikeAndPriceBetween("%ia%", 30000.0,100000.0 );
		//list16.forEach(System.out::println);
		System.out.println(list16);
		System.out.println("Wszystkie marki zawierające \"ia\" z ceną w przedziale(30tys.;100000tys.)");
		List<Car> list17 = cr.findAllByBrandOrderByNameAsc("Opel");
		//list16.forEach(System.out::println);
		System.out.println(list17);
		List<Car> list18 = cr.findAllByPriceNotNullOrderByPriceDesc();
		//list16.forEach(System.out::println);
		System.out.println(list18);
		List<Car> list19 = cr.findAllByOrderByPriceDesc();
		//list16.forEach(System.out::println);
		System.out.println(list19);
		
		ctx.close();
	}
	
}
