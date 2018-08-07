package app

class Book {
    String title
    String author
    String barcode
    Integer authorId
    String publisher

    static mapping = {
        version false
        table 'book'
    }

    static constraints = {
        barcode unique: true
        publisher nullable: true
        id generator: 'sequence', params: [sequence: 'book_id']
    }
}
