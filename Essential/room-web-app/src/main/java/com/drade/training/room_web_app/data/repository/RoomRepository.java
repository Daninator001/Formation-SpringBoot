package com.drade.training.room_web_app.data.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drade.training.room_web_app.data.entity.RoomEntity;

public interface RoomRepository extends JpaRepository<RoomEntity, UUID> {

}
