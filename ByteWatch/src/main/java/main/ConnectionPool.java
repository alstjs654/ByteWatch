package main;

import org.apache.commons.dbcp2.*;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.sql.DriverManager;

public class ConnectionPool extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
    public void init() throws ServletException {
        jdbcDriver();
        connectionPool();
    }

    private void jdbcDriver() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void connectionPool() {
        try {
            String url = "jdbc:oracle:thin:@175.203.68.186:1521:orcl";
            String user = "watch";
            String password = "watch1234";
            ConnectionFactory conn = new DriverManagerConnectionFactory(url, user, password);
            PoolableConnectionFactory pool = new PoolableConnectionFactory(conn, null);
            GenericObjectPoolConfig<PoolableConnection> poolConfig = new GenericObjectPoolConfig<>();
            poolConfig.setTimeBetweenEvictionRunsMillis(60000L*5L);
            poolConfig.setMinIdle(5);
            poolConfig.setMaxTotal(100);
            poolConfig.setTestWhileIdle(true);

            GenericObjectPool<PoolableConnection> objectPool = new GenericObjectPool<>(pool, poolConfig);
            pool.setPool(objectPool);
            Class.forName("org.apache.commons.dbcp2.PoolingDriver");
            PoolingDriver driver = (PoolingDriver) DriverManager.getDriver("jdbc:apache:commons:dbcp:");
            driver.registerPool("watch", objectPool);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
