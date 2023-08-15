/* userManagement.js */
$(document).ready(function () {
  $("#info-add").on("click", function () {
    $("#create-modal").show(); // create-modal을 보여줍니다.
  });

  // 모달의 "취소" 버튼을 눌렀을 때 모달을 숨깁니다.
  $("#cancel").on("click", function () {
    $("#create-modal").hide(); // create-modal을 숨깁니다.
  });
});
