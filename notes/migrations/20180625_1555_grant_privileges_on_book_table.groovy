databaseChangeLog = {
    changeSet(author: 'ig657', id: 'grant_privileges_to_book_table') {
        grailsChange {
            change {
                sql.execute "GRANT SELECT, INSERT, UPDATE, DELETE " +
                    "ON TABLE book " +
                    "TO app_liquibase_demo_role;"

                sql.execute 'GRANT USAGE, SELECT ' +
                    'ON SEQUENCE book_id ' +
                    'TO app_liquibase_demo_role;'

                sql.execute "GRANT SELECT " +
                    "ON TABLE book " +
                    "TO liquibase_demo_read_role;"

                sql.execute 'GRANT SELECT ' +
                    'ON SEQUENCE book_id ' +
                    'TO liquibase_demo_read_role;'

                confirm 'Privileges on book table have been granted'
            }
        }
    }
}
