databaseChangeLog = {
    changeSet(author: 'ig657', id: 'init_database') {
        grailsChange {
            change {
                sql.execute "GRANT USAGE ON SCHEMA finance_workorders TO api_finance_workorders_role;"
                sql.execute "GRANT USAGE ON SCHEMA finance_workorders TO finance_workorders_read_role;"

                sql.execute "GRANT SELECT " +
                    "ON ALL TABLES IN SCHEMA finance_workorders " +
                    "TO finance_workorders_read_role;"

                sql.execute "ALTER ROLE api_finance_workorders_role SET search_path TO finance_workorders"
                sql.execute "ALTER ROLE finance_workorders_read_role SET search_path TO finance_workorders"

                confirm 'DB has been initialized'
            }
        }
    }
}

