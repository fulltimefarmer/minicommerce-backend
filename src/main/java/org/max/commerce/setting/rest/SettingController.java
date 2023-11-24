package org.max.commerce.setting.rest;

import lombok.RequiredArgsConstructor;
import org.max.commerce.setting.dao.SettingRepository;
import org.max.commerce.setting.entity.Setting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setting")
@RequiredArgsConstructor
public class SettingController {

    private final SettingRepository repository;

    @GetMapping
    public ResponseEntity<List<Setting>> getAllSettings() {
        List<Setting> settings = repository.list();
        return new ResponseEntity<>(settings, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Setting> getSettingById(@PathVariable Long id) {
        Setting setting = repository.getById(id);
        return setting != null ?
                new ResponseEntity<>(setting, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Boolean> createSetting(@RequestBody Setting setting) {
        Boolean result = repository.save(setting);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> updateSetting(@PathVariable Long id, @RequestBody Setting setting) {
        setting.setId(id);
        Boolean result = repository.updateById(setting);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteSetting(@PathVariable Long id) {
        Boolean result = repository.removeById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
