package com.ecommerce.dao;

import com.ecommerce.model.Preferences;

public interface SettingsRepository {

	 int count();

	 int save(Preferences item);
}
