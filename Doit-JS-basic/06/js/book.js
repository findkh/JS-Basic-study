function Book(title, author, volume, price) {
    this.title = title;
    this.author = author;
    this.volume - volume;
    this.price = price;
}

var html = new Book('웹 표준의 정석', 'Ko', '608', '28,000');
var youtube = new Book('유튜브 만들기', 'Park', '300', '18,000');
var cat = new Book('고양이 키우기', 'Park', '300', '20,000');

var bookList = [html, youtube, cat];

document.write("<h1>책 제목으로 살펴보기</h1>");
for(var i=0; i<bookList.length; i++){
    document.write("<p>" + bookList[i].title + bookList[i].price + "</p>");
}

