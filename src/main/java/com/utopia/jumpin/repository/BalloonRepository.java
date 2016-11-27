package com.utopia.jumpin.repository;

import com.utopia.jumpin.model.Balloon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BalloonRepository extends JpaRepository<Balloon, Long>{

}
