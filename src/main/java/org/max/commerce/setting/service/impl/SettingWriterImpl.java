package org.max.commerce.setting.service.impl;

import org.max.commerce.setting.dao.ExtendSettingRepository;
import org.max.commerce.setting.dao.SettingRepository;
import org.max.commerce.setting.entity.Setting;
import org.max.commerce.setting.service.SettingWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatisflex.core.query.QueryWrapper;

@Service
public class SettingWriterImpl implements SettingWriter {

	@Autowired
	private SettingRepository settingRepository;
	
	@Autowired
	private ExtendSettingRepository extendSettingRepository;
	
	@Override
	public void saveOrUpdateSetting(String settingName, String extendKey, Object value) {
		//TODO
		
	}

}
