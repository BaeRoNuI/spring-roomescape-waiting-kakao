package com.nextstep.theme;

import com.nextstep.domains.theme.ThemeDao;
import com.nextstep.domains.theme.entities.ThemeEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@JdbcTest
public class ThemeDaoTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void save() {
        ThemeDao themeDao = new ThemeDao(jdbcTemplate);
        Long id = themeDao.save(new ThemeEntity("테마 이름", "테마 설명", 22_000));
        assertThat(id).isNotNull();
    }
}
