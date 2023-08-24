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

$(document).on("submit", "#updateForm", function (e) {
  e.preventDefault();

  let promises = [];

  $("div[name='no']").each(function () {
    const noName = $(this).text().trim();
    console.log(noName);
    const url = "/api/update/" + noName;
    console.log(url);

    const formFields = $(this).siblings("input");

    let data = {};
    formFields.each(function () {
      data[$(this).attr("name")] = $(this).val();
    });

    console.log("data 정보 : ", data);
    console.log("url 정보 : ", url);

    let promise = $.ajax({
      type: "PATCH",
      url: url,
      data: JSON.stringify(data),
      contentType: "application/json",
    });

    promises.push(promise);
  });

  console.log("promises : " + promises);

  Promise.all(promises).then(() => {
    alert("정보가 수정되었습니다.");
    $("#update-modal").modal("hide");
  });
});
