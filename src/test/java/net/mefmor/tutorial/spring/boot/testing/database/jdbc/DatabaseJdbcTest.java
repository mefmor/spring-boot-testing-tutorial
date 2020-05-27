package net.mefmor.tutorial.spring.boot.testing.database.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
@Sql(scripts = "schema.sql")
@SqlConfig(separator = "/;")
class DatabaseJdbcTest {
    @Autowired
    private JdbcTemplate jdbc;

    @Test
    void testQueryForString() {
        assertThat(jdbc.queryForObject("select name from test", String.class)).isEqualTo("Ivan");
    }

    @Test
    void testStoredFunction() {
        assertThat(jdbc.queryForObject("select name from GET_TEST()", String.class)).isEqualTo("Ivan");
    }
}
