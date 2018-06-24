databaseChangeLog = {

    changeSet(author: "grails (generated)", id: "1528382562207-2") {
        addColumn(tableName: "workorders") {
            column(defaultValue: "invalid_code", name: "department", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "grails (generated)", id: "1528382562207-3") {
        addColumn(tableName: "workorders") {
            column(defaultValue: false, name: "is_payroll", type: "boolean") {
                constraints(nullable: "false")
            }
        }
    }
}
