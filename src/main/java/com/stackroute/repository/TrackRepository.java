package com.stackroute.repository;


import com.stackroute.domain.Track;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {

    /*@Query(value = "select * from track where track_name = ?1", nativeQuery = true)
    public List<Track> getTrackByName(String trackName);*/

}
