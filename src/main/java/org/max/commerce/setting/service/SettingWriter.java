package org.max.commerce.setting.service;

public interface SettingWriter {

	void saveOrUpdateSetting(String settingName, String extendKey, Object value);
}
