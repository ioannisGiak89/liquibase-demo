databaseChangeLog = {

    changeSet(author: "grails (generated)", id: "1527844109196-1") {
        addColumn(tableName: "test") {
            column(name: "desc", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "grails (generated)", id: "1527844109196-2") {
        dropColumn(columnName: "description", tableName: "test")
    }
}
