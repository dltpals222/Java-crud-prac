/**
 *
 * @param {string} endPoint 엔드포인트 지정
 * @param {string} readPageId 읽어올 페이지의 최상위 id
 * @param {string} insertPageId 읽어온 페이지를 넣을 id
 * @param {string} contentType 기본값은 text/html 그 이외라면 추가
 */
async function fetchModule(endPoint, insertPageId, contentType = "text/html") {
  const response = await fetch(endPoint);
  const result = await response.text();

  const parser = new DOMParser();
  const doc = parser.parseFromString(result, contentType);
  const infoDiv = doc.body.firstChild;
  console.log(infoDiv);

  //HTML에 입력시킬 태그
  document.getElementById(insertPageId).innerHTML = infoDiv.innerHTML;
}

document.addEventListener("DOMContentLoaded", () => {
  const umInfo = document.getElementById("um-info");

  umInfo.addEventListener("click", async () => {
    await fetchModule("/pages/userInfo", "user-info");
    await fetchModule("/pages/create", "create-div");
    await fetchModule("/pages/update", "update-div");
  });
});
