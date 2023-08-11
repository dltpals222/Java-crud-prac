const umInfo = document.getElementById("c-div");

umInfo.addEventListener("click", () => {
  fetch("/pages/create")
    .then((Response) => Response.text())
    .then((result) => {
      const parser = new DOMParser();
      const doc = parser.parseFromString(result, "text/html");
      const infoDIv = doc.getElementById("user-management");

      // css태그 찾기
      const cssLink = doc.querySelector("link[rel='stylesheet'][id='page-specific-css']");

      //기존의 css태그 제거
      const currentCssLink = document.querySelector(
        "link[rel='stylesheet'][id='page-specific-css']"
      );
      if (currentCssLink) {
        document.head.removeChild(currentCssLink);
      }

      //새로운 css link 태그 추가
      document.head.appendChild(cssLink);

      document.getElementById("user-info").innerHTML = infoDIv.innerHTML;
    });
});
