databaseChangeLog = {

    changeSet(author: "grails (generated)", id: "1527845705123-1") {
        dropColumn(columnName: "date_created", tableName: "test")
    }

    changeSet(author: "grails (generated)", id: "1527845705123-2") {
        dropColumn(columnName: "last_updated", tableName: "test")
    }

    changeSet(author: "grails (generated)", id: "1527845705123-3") {
        dropColumn(columnName: "obsolete_date", tableName: "test")
    }
}
