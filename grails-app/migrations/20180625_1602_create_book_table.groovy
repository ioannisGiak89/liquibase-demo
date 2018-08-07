databaseChangeLog = {

    changeSet(author: "grails (generated)", id: "1529939018733-1") {
        createSequence(sequenceName: "book_id")
    }

    changeSet(author: "grails (generated)", id: "1529939018733-2") {
        createTable(tableName: "book") {
            column(name: "id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "title", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "author_id", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "barcode", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "author", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "grails (generated)", id: "1529939018733-3") {
        addPrimaryKey(columnNames: "id", constraintName: "bookPK", tableName: "book")
    }

    changeSet(author: "grails (generated)", id: "1529939018733-4") {
        addUniqueConstraint(columnNames: "barcode", constraintName: "UC_BOOKBARCODE_COL", tableName: "book")
    }
}
