package com.summary_ai.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "summary_points")
public class SummaryPointEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "summary_id", nullable = false)
    private SummaryEntity summary;

    private String title;

    @Lob
    @Column(name = "point_content")
    private String pointContent;

    @Column(name = "difficulty_level", nullable = false)
    private String difficultyLevel;

    @Column(name = "start_time_in_seconds")
    private Integer startTimeInSeconds;

    @Column(name = "end_time_in_seconds")
    private Integer endTimeInSeconds;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SummaryEntity getSummary() {
        return summary;
    }

    public void setSummary(SummaryEntity summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPointContent() {
        return pointContent;
    }

    public void setPointContent(String pointContent) {
        this.pointContent = pointContent;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Integer getStartTimeInSeconds() {
        return startTimeInSeconds;
    }

    public void setStartTimeInSeconds(Integer startTimeInSeconds) {
        this.startTimeInSeconds = startTimeInSeconds;
    }

    public Integer getEndTimeInSeconds() {
        return endTimeInSeconds;
    }

    public void setEndTimeInSeconds(Integer endTimeInSeconds) {
        this.endTimeInSeconds = endTimeInSeconds;
    }
}
