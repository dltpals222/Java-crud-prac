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
