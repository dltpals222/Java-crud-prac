/**
 *
 * @param {string} endPoint 엔드포인트 지정
 * @param {string} insertPageId 읽어온 페이지를 넣을 id
 * @param {string} contentType 기본값은 text/html 그 이외라면 추가
 */
async function fetchModule(endPoint, insertPageId, contentType = "text/html") {
  const response = await fetch(endPoint);
  const result = await response.text();

  const parser = new DOMParser();
  const doc = parser.parseFromString(result, contentType);
  const infoDiv = doc.body.firstChild;

  //HTML에 입력시킬 태그
  document.getElementById(insertPageId).innerHTML = infoDiv.innerHTML;
}

// 불러올 html 파일 관리
document.addEventListener("DOMContentLoaded", () => {
  const umInfo = document.getElementById("um-info");

  umInfo.addEventListener("click", async () => {
    //* 정보
    await fetchModule("/pages/userInfo", "user-info");

    //* 유저정보 입력
    await fetchModule("/pages/create", "create-div");

    //* 유저정보 수정
    await fetchModule("/pages/update", "update-div");

    // update에 사용할 체크박스 값 가져오기
    const infoUpdate = document.getElementById("info-update");
    infoUpdate.addEventListener("click", async (e) => {
      e.preventDefault();
      console.log("info-update 버튼이 클릭되었습니다.");

      const checkedValues = Array.from(
        document.querySelectorAll("input[type=checkbox]:checked")
      ).map((checkbox) => checkbox.value);

      if (checkedValues.length === 0) {
        alert("변경할 항목을 선택해주세요.");
        return;
      }

      const response = await fetch("/api/update", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ values: checkedValues }),
      });

      if (response.ok) {
        const updatedContent = await response.text();
        document.getElementById("update-div").innerHTML = updatedContent;
      } else {
        console.error("서버에서 에러가 발생했습니다. 상태 코드: " + response.status);
      }
    });
  });
});
