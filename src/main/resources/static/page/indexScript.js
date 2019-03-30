$.ajax({
    method: "post",
    url: "http://localhost:8080/login",
    success: function () {
        $("#div-login").hide();
    },
    error: function f() {
        $("#div-logged-in").hide();
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
            $("#div-login").hide();
            $("#div-logged-in").show();
        },
        error: function () {
            alert("Niepoprawne dane!");
            $("#div-login").show();
        }
    });
});

$("#button-logout").click(function () {
    $.ajax({
        method: "get",
        url: "http://localhost:8080/logout",

        success: function f() {
            alert("Wylogowano");
            $("#div-login").show();
            $("#div-logged-in").hide();
        }
    });
});