package com.utopia.jumpin.repository;

import com.utopia.jumpin.model.Jumper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JumperRepository extends JpaRepository<Jumper, Long>{

    Jumper findByJumperName(String name);

}
