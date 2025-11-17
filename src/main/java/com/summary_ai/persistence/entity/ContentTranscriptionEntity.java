package com.summary_ai.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "content_transcription")
public class ContentTranscriptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "record_id", nullable = false)
    private RecordEntity record;

    @Lob
    @Column(name = "transcription_text")
    private String transcriptionText;

    @Column(name = "minutes_start")
    private Integer minutesStart;

    @Column(name = "minutes_end")
    private Integer minutesEnd;

    @Column(name = "indexRecord")
    private Integer indexRecord;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RecordEntity getRecord() {
        return record;
    }

    public void setRecord(RecordEntity record) {
        this.record = record;
    }

    public String getTranscriptionText() {
        return transcriptionText;
    }

    public void setTranscriptionText(String transcriptionText) {
        this.transcriptionText = transcriptionText;
    }

    public Integer getMinutesStart() {
        return minutesStart;
    }

    public void setMinutesStart(Integer minutesStart) {
        this.minutesStart = minutesStart;
    }

    public Integer getMinutesEnd() {
        return minutesEnd;
    }

    public void setMinutesEnd(Integer minutesEnd) {
        this.minutesEnd = minutesEnd;
    }

    public Integer getIndexRecord() {
        return indexRecord;
    }

    public void setIndexRecord(Integer indexRecord) {
        this.indexRecord = indexRecord;
    }
}
