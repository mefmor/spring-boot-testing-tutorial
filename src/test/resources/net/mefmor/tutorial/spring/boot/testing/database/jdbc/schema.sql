DROP TABLE IF EXISTS TEST/;

CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255) DEFAULT '')/;

INSERT INTO TEST (ID, NAME) VALUES (1, 'Ivan')/;


CREATE ALIAS IF NOT EXISTS GET_TEST AS  $$
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
@CODE
ResultSet getTestTable(final Connection conn) throws SQLException
{
  return conn.prepareStatement("select * from TEST").executeQuery();
}
$$/;