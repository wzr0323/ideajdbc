package com.ideamoment.ideajdbc.log;

import javax.sql.DataSource;

public class DataSourceProxy extends DataSourceProxyBase implements DataSource {

    private static final long serialVersionUID = -6888072076120346186L;

    public DataSourceProxy() throws IdeaJdbcLogException {
        super();
    }

}
