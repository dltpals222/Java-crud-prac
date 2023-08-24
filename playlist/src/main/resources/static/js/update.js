function handleUpdateButtonClick(noList) {
  console.log("noList : ", noList);
  const queryStringParts = noList.map((value) => `noList=${value}`);
  console.log("queryStringParts : ", queryStringParts);
  const queryString = queryStringParts.join("&");
  console.log("queryString : ", queryString);

  const url = "/pages/update?" + queryString;

  $.ajax({
    type: "GET",
    url: url,
    // data: JSON.stringify(selectedValues),
    // contentType: "application/json",
    success: function (response) {
      console.log("데이터가 성공적으로 전달되었습니다.");
    },
    error: function (jqXHR, textStatus, errorThrown) {
      // 오류 처리 (팝업창 표시)
      console.error(jqXHR.responseText); //에러의 내용을 보여줌
    },
  });
}

const infoUpdate = document.getElementById("info-update");

infoUpdate.addEventListener("click", async () => {
  //* 유저정보 수정
  await fetchModule("/pages/update", "update-div");
});
