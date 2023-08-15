const umInfo = document.getElementById("um-info");

umInfo.addEventListener("click", () => {
  fetch("/pages/userInfo")
    .then((Response) => Response.text())
    .then((result) => {
      const parser = new DOMParser();
      const doc = parser.parseFromString(result, "text/html");
      const infoDIv = doc.getElementById("user-management");

      //HTML에 입력시킬 태그
      document.getElementById("user-info").innerHTML = infoDIv.innerHTML;
    });
});
