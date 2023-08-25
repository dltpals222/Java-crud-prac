//? 체크박스 정보 전달
function handleDeleteButtonClick(noList) {
  console.log("noList : ", noList);
  const queryStringParts = noList.map((value) => `noList=${value}`);
  console.log("queryStringParts : ", queryStringParts);
  const queryString = queryStringParts.join("&");
  console.log("queryString : ", queryString);

  const url = "/pages/delete?" + queryString;

  $.ajax({
    type: "GET",
    url: url,
    success: function (response) {
      console.log("데이터가 성공적으로 전달되었습니다.");
    },
    error: function (jqXHR, textStatus, errorThrown) {
      // 오류 처리 (팝업창 표시)
      console.error(jqXHR.responseText); //에러의 내용을 보여줌
    },
  });
}

//? 정보 삭제
$(document).on("submit", "#userDeleteForm", function (e) {
  e.preventDefault();

  const selectedNos = $("div[name='no']");
  if (selectedNos.length === 0) {
    alert("삭제할 정보가 없습니다.");
    return;
  }

  let promises = [];

  selectedNos.each(function () {
    const noName = $(this).text().trim();
    console.log(noName);
    const url = "/api/delete/" + noName;
    console.log("url 정보 : ", url);

    let promise = $.ajax({
      type: "DELETE",
      url: url,
      contentType: "application/json",
    }).catch((error) => {
      console.error("delete Error : ", error);
    });

    promises.push(promise);
  });

  console.log("promises length : " + promises.length);

  Promise.all(promises).then(() => {
    alert("정보가 삭제되었습니다.");
    $("#delete-modal").modal("hide");
  });
});
