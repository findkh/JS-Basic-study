var toyRobot = {
    productID: "123-12",
    name: "Robot",
    price: "25,000",
    madeIn: "KOREA",
    quantity: 10,
    showStock: function() {
        document.querySelector('#display').innerHTML = this.name + " 제품은 " + this.quantity + " 개 남았습니다";
    },
    showPricece : function() { alert(this.price); }
};

// toyRobot.showPricece();
toyRobot.showStock();