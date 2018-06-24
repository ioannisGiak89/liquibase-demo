databaseChangeLog = {

    changeSet(author: "grails (generated)", id: "1527843605077-1") {
        createSequence(sequenceName: "workorders.hibernate_sequence")
    }

    changeSet(author: "grails (generated)", id: "1527843605077-2") {
        createTable(tableName: "test") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "testPK")
            }

            column(name: "date_created", type: "BYTEA") {
                constraints(nullable: "false")
            }

            column(name: "code", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "obsolete_date", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "BYTEA") {
                constraints(nullable: "false")
            }

            column(name: "status", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "grails (generated)", id: "1527843605077-3") {
        createTable(tableName: "workorders") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "workordersPK")
            }

            column(name: "date_created", type: "BYTEA") {
                constraints(nullable: "false")
            }

            column(name: "code", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "obsolete_date", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "BYTEA") {
                constraints(nullable: "false")
            }

            column(name: "status", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "grails (generated)", id: "1527843605077-4") {
        addUniqueConstraint(columnNames: "code", constraintName: "UC_TESTCODE_COL", tableName: "test")
    }

    changeSet(author: "grails (generated)", id: "1527843605077-5") {
        addUniqueConstraint(columnNames: "code", constraintName: "UC_WORKORDERSCODE_COL", tableName: "workorders")
    }

    include file: 'change_to_desc_20182012.groovy'
    include file: 'change_test_table_20182013.groovy'
    include file: 'insert.xml'
    include file: 'insert2.yml'
}
