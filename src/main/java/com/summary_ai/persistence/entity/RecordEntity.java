package com.summary_ai.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "records")
public class RecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_record", nullable = false)
    private Long idRecord;

    @Column(name = "time_talk_start")
    private LocalDateTime timeTalkStart;

    @Column(name = "time_talk_stop")
    private LocalDateTime timeTalkStop;

    @CreationTimestamp
    @Column(name="created_at",updatable = false)
    private LocalDateTime createdAt;

    // RELATIONSHIPS

    @OneToOne(mappedBy = "record", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private SummaryEntity summary;

    @OneToMany(mappedBy = "record", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TalkEntity> talks = new ArrayList<>();

    @OneToMany(mappedBy = "record", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContentTranscriptionEntity> transcriptions = new ArrayList<>();


    // Getters and Setters
    public Long getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(Long idRecord) {
        this.idRecord = idRecord;
    }

    public LocalDateTime getTimeTalkStart() {
        return timeTalkStart;
    }

    public void setTimeTalkStart(LocalDateTime timeTalkStart) {
        this.timeTalkStart = timeTalkStart;
    }

    public LocalDateTime getTimeTalkStop() {
        return timeTalkStop;
    }

    public void setTimeTalkStop(LocalDateTime timeTalkStop) {
        this.timeTalkStop = timeTalkStop;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public SummaryEntity getSummary() {
        return summary;
    }

    public void setSummary(SummaryEntity summary) {
        this.summary = summary;
    }

    public List<TalkEntity> getTalks() {
        return talks;
    }

    public void setTalks(List<TalkEntity> talks) {
        this.talks = talks;
    }

    public List<ContentTranscriptionEntity> getTranscriptions() {
        return transcriptions;
    }

    public void setTranscriptions(List<ContentTranscriptionEntity> transcriptions) {
        this.transcriptions = transcriptions;
    }
}

