package com.activityservice.ActivityService;

import com.activityservice.ActivityService.Model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {

}
