databaseChangeLog = {

    changeSet(author: "grails (generated)", id: "1529939513379-2") {
        addColumn(tableName: "book") {
            column(name: "publisher", type: "varchar(255)")
        }
    }
}
