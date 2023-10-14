package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
