package com.nk.wipro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nk.wipro.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
