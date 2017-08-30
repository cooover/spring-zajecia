package pl.reaktor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.reaktor.model.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Long>{
	
	List<Register> findAllByLoginAndPasswd(String login, String passwd);

}
