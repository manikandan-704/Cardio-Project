package com.activityservice.ActivityService.Service;

import com.activityservice.ActivityService.ActivityRepository;
import com.activityservice.ActivityService.Model.Activity;
import com.activityservice.ActivityService.dto.ActivityRequest;
import com.activityservice.ActivityService.dto.ActivityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private ActivityRepository activityRepository;

    public ActivityResponse trackActivity(ActivityRequest request){
        Activity activity= Activity.builder()
                .userId(request.getUserId())
                .type(request.getType())
                .duration(request.getDuration())
                .
    }
}
