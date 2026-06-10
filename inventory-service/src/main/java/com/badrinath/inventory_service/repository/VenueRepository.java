package com.badrinath.inventory_service.repository;

import com.badrinath.inventory_service.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue,Long> {

}
