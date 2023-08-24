function handleUpdateButtonClick() {
  let selectedValues = [];
  $("input[type=checkbox]:checked").each(function () {
    selectedValues.push($(this).val());
  });

  $.ajax({
    type: "POST",
    url: "/api/userInfo",
    data: JSON.stringify(selectedValues),
    contentType: "application/json",
    error: function (jqXHR, textStatus, errorThrown) {
      // 오류 처리 (팝업창 표시)
      alert(jqXHR.responseText); //에러의 내용을 보여줌
    },
  });
}
