databaseChangeLog = {
    changeSet(author: 'ig657', id: 'grant_privileges_for_hibernate_sequence') {
        grailsChange {
            change {
                sql.execute 'GRANT USAGE, SELECT ' +
                    'ON SEQUENCE hibernate_sequence ' +
                    'TO api_finance_workorders_role;'

                sql.execute 'GRANT SELECT ' +
                    'ON SEQUENCE hibernate_sequence ' +
                    'TO finance_workorders_read_role;'

                confirm 'Privileges on hibernate sequence have been granted'
            }
        }
    }
}

