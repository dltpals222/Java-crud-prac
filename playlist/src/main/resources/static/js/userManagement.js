window.addEventListener("DOMContentLoaded", function () {
  // 추가 버튼 클릭 이벤트
  var infoAddBtn = document.getElementById("info-add");
  infoAddBtn.addEventListener("click", function () {
    var createModal = document.getElementById("Create-modal-container");
    createModal.style.display = "block";
  });

  // 취소 버튼 클릭 이벤트
  var cancelBtn = document.getElementById("cancel");
  cancelBtn.addEventListener("click", function () {
    var createModal = document.getElementById("Create-modal-container");
    createModal.style.display = "none";
  });
});
