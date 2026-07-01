package com.drade.training.room_web_app.data.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ROOMS")
@Data
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID roomId;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "NUMBER", nullable = false, unique = true)
    private String number;
    @Column(name = "BED_INFO", nullable = false)
    private String bedInfo;

    @Deprecated
    public String toString() {
        return "RoomEntity [roomId=" + roomId + ", name=" + name + ", number=" + number + ", bedInfo=" + bedInfo
                + "]";
    }
}