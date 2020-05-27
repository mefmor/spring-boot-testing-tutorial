package net.mefmor.tutorial.spring.boot.testing.database.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
@Sql(scripts = "schema.sql")
class DatabaseJdbcTest {
    @Autowired
    private JdbcTemplate jdbc;

    @Test
    void testQueryForString() {
        assertThat(jdbc.queryForObject("select name from test", String.class)).isEqualTo("Ivan");
    }
}
