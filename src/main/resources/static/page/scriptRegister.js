$("#button-register").click(function () {
    const uniqueName = $("#uniqueName").val();
    const login = $("#username").val();
    const password = $("#password").val();
    const passwordConfirm = $("#confirmPassword").val();
    const userDTO = {
        username: login,
        password: password,
        uniqueName: uniqueName
    };
    if (password !== passwordConfirm) {
        alert("Confirm password wrong");
        return;
    }
    $.ajax({
        url: "http://localhost:8080/register",
        method: "post",
        contentType: "application/json",
        data: JSON.stringify(userDTO),
        success: function () {
            window.location.href = "http://localhost:8080/page/index.html";
        }
    });
});



