databaseChangeLog = {
    changeSet(author: 'ig657', id: 'grant_privileges_to_workorders_table') {
        grailsChange {
            change {
                sql.execute "GRANT SELECT, INSERT, UPDATE, DELETE " +
                    "ON TABLE workorders " +
                    "TO api_finance_workorders_role;"

                sql.execute 'GRANT USAGE, SELECT ' +
                    'ON SEQUENCE workorder_id ' +
                    'TO api_finance_workorders_role;'

                sql.execute "GRANT SELECT " +
                    "ON TABLE workorders " +
                    "TO finance_workorders_read_role;"

                sql.execute 'GRANT SELECT ' +
                    'ON SEQUENCE workorder_id ' +
                    'TO finance_workorders_read_role;'

                confirm 'Privileges on workorders table have been granted'
            }
        }
    }
}



