package com.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Preferences;

//@Repository
public class PreferencesRepository implements SettingsRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	 public int save(Preferences item) {
	        return jdbcTemplate.update(
	                "insert into preferences (freqCount, trnsAmnt,rspTime) values(?,?,?)",
	                item.getFrequencyCount(), item.getTransactionAmountFilter(), item.getSmsResponseTimeAllowed());
	    }

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
