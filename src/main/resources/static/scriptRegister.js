// function getUserWall() {
//     $.ajax({
//         url: "http://localhost:8080/registration",
//         method: "get"
//     });
//
//     $("button-register").click(function () {
//         const uniqueName = $("uniqueName").val();
//         const login = $("login").val();
//         const password = $("inputPassword").val();
//         const passwordConfirm = $("inputPasswordConfirm").val();
//         if (password == passwordConfirm) {
//             const userDTO = {
//                 uniqueName: uniqueName,
//                 login: login,
//                 password: password
//             };
//             $.ajax({
//                 url: "http://localhost:8080/registration",
//                 method: "post",
//                 contentType: "application/json",
//                 data: JSON.stringify(userDTO),
//                 success: function () {
//                     getUserWall();
//                 }
//             })
//         }
//     })
// };
//
// function getUserWall() {
//     $.ajax({
//         url: "http://localhost:8080/login",
//         method: "get"
//     })
//
// }