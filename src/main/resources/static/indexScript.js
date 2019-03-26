$.ajax({
    method: "post",
    url: "http://localhost:8080/login",
    success: function () {
        $("#div-online").hide();
    },
    error: function f() {
        $("#div-logged-out").hide()
    }
});



$("#button-login").click(function () {
    const username = $("#username").val();
    const password = $("#inputPassword").val();

    $.ajax({
        method: "post",
        url: "http://localhost:8080/login",
        headers: {
            "Authorization": "Basic " + btoa(username + ":" + password)
        },
        success: function () {
            alert("Zalogowano!");
            $("#div-logged-out").hide();
            $("#div-online").show();

        },
        error: function f() {
            alert("Niepoprawne dane!");
            $("#div-logged-out").hide()
        }
    });
});