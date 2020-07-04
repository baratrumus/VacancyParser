package parser;

import parser.data.StoreSQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JobExec implements Job {
    private static final Logger LOGGER = LoggerFactory.getLogger(JobExec.class);
    private Config config = new Config();
    private SiteParser sqlRuParser;
    private StoreSQL storeSQL = new StoreSQL(this.connectDatabase());

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        LOGGER.warn("Parsing process started");
        sqlRuParser = new SiteParser(this.connectDatabase(), storeSQL);
        this.sqlRuParser.parsing();
        LOGGER.warn("Parsing process stopped");
    }

    private Connection connectDatabase() {
        try {
            return DriverManager.getConnection(
                    this.config.get("url"),
                    this.config.get("username"),
                    this.config.get("password")
            );
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}

