package pl.reaktor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.reaktor.model.Car;

@Repository
public interface CarRepo extends JpaRepository<Car,Long>{

	List<Car> findByBrand(String brand);
	List<Car> findByPrice(Double price);
	List<Car> findByName(String name);
	List<Car> findByBrandAndPrice(String brand, Double price);
}