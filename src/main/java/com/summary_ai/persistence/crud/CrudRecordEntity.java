package com.summary_ai.persistence.crud;

import com.summary_ai.persistence.entity.RecordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface CrudRecordEntity extends ListCrudRepository<RecordEntity,Long> {

}
