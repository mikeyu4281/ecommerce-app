package com.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.model.Preferences;

public class PreferencesMapper implements RowMapper<Preferences> {

	@Override
	public Preferences mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Preferences preferences = new Preferences();
		preferences.setFrequencyCount(rs.getInt("freqCount"));
		preferences.setTransactionAmountFilter(rs.getFloat("trnsAmnt"));
		preferences.setSmsResponseTimeAllowed(rs.getInt("rspTime"));
	      return preferences;
	}

}
