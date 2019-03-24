$("#button-login").click(function () {
    $.ajax({
        url: "localhost:8080/login",
        method: "get",
        success: function () {
            alert("Zalogowno")
        }
    })
});