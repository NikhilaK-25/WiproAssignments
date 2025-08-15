package com.nk.wipro.services;

import com.nk.wipro.Feign.NotificationServiceFeign;
import com.nk.wipro.entity.Notification;
import com.nk.wipro.entity.RequestBlood;
import com.nk.wipro.repo.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationServiceFeign notificationServiceFeign; 

    @Override
    public Notification sendNotification(Notification notification) {
        
        RequestBlood requestBlood = notificationServiceFeign.getRequestStatus(notification.getRequestId());

        
        notification.setMessage("Request ID " + requestBlood.getId() +
                                " is currently " + requestBlood.getStatus());
        notification.setSentAt(LocalDateTime.now());

        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
}
