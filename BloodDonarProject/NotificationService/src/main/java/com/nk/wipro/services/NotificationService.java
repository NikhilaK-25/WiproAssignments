package com.nk.wipro.services;

import com.nk.wipro.entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification sendNotification(Notification notification);
    List<Notification> getAllNotifications();
}
