package com.summary_ai.persistence.repository;

import com.summary_ai.persistence.crud.CrudRecordEntity;
import com.summary_ai.persistence.entity.RecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
    private final CrudRecordEntity recordEntity;

    @Autowired
    public RecordService(CrudRecordEntity recordEntity){
        this.recordEntity = recordEntity;
    }
    public RecordEntity add(RecordEntity record) {
       return this.recordEntity.save(record);
    }
}
