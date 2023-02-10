package com.example.Hibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hibernate.model.Restaurant;

@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
