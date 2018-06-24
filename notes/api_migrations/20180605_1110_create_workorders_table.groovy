databaseChangeLog = {

    changeSet(author: "grails (generated)", id: "1528211339063-1") {
        createSequence(sequenceName: "workorder_id")
    }

    changeSet(author: "grails (generated)", id: "1528211339063-2") {
        createTable(tableName: "workorders") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "source_of_funds", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_change", type: "BYTEA") {
                constraints(nullable: "false")
            }

            column(name: "code", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "obsolete_date", type: "BYTEA") {
                constraints(nullable: "false")
            }

            column(name: "status", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "analysis_code", type: "VARCHAR(255)")

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "grails (generated)", id: "1528211339063-3") {
        addPrimaryKey(columnNames: "id", constraintName: "workordersPK", tableName: "workorders")
    }

    changeSet(author: "grails (generated)", id: "1528211339063-4") {
        addUniqueConstraint(columnNames: "code", constraintName: "UC_WORKORDERSCODE_COL", tableName: "workorders")
    }

}
