package app

class Book {
    String title
    String author
    String barcode
    Integer authorId

    static mapping = {
        version false
        table 'book'
    }

    static constraints = {
        barcode unique: true
        analysisCode nullable: true
        id generator: 'sequence', params: [sequence: 'book_id']
    }
}
