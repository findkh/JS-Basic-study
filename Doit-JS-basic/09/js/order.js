var check = document.querySelector("#shippingInfo");
console.log(check);



check.addEventListener("click", function() {
    console.log("체크");
    if (check.checked == true) {
        document.querySelector("#shippingName").value = document.querySelector("#billingName").value;
        document.querySelector("#shippingTel").value = document.querySelector("#billingTel").value;
        document.querySelector("#shippingAddr").value = document.querySelector("#billingAddr").value;
    } else {
        document.querySelector("#billingName").value = "";
        document.querySelector("#billingTel").value = "";
        document.querySelector("#billingAddr").value = "";
    }
});
