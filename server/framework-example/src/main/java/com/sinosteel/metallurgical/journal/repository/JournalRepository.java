package com.sinosteel.metallurgical.journal.repository;

import org.springframework.stereotype.Repository;

import com.sinosteel.framework.core.base.repository.BaseRepository;
import com.sinosteel.metallurgical.journal.domain.Journal;

@Repository
public interface JournalRepository extends BaseRepository<Journal>
{
	
}
