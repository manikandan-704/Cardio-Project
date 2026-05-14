package com.activityservice.ActivityService.Controllers;


import com.activityservice.ActivityService.Service.activityService;
import com.activityservice.ActivityService.dto.ActivityRequest;
import com.activityservice.ActivityService.dto.ActivityResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

//    @PostMapping
//    public ResponseEntity<ActivityResponse>trackActivity(@RequestBody ActivityRequest request){
//        return ResponseEntity.ok(activityService.trackActivity(request));
//}
}