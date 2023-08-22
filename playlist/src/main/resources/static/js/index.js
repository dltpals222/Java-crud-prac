/**
 *
 * @param {string} endPoint 엔드포인트 지정
 * @param {string} readPageId 읽어올 페이지의 최상위 id
 * @param {string} insertPageId 읽어온 페이지를 넣을 id
 */
function fetchModule(endPoint, readPageId, insertPageId) {
  fetch(endPoint)
    .then((Response) => Response.text())
    .then((result) => {
      const parser = new DOMParser();
      const doc = parser.parseFromString(result, "text/html");
      const infoDIv = doc.getElementById(readPageId);

      //HTML에 입력시킬 태그
      document.getElementById(insertPageId).innerHTML = infoDIv.innerHTML;
    });
}

const umInfo = document.getElementById("um-info");

umInfo.addEventListener("click", () => {
  fetchModule("/pages/userInfo", "user-management", "user-info");
});
