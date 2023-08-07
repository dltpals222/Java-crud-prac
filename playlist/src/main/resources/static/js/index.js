const fs = require("fs");
const path = require("path");

const umInfo = document.createElement("um-info");

umInfo.addEventListener("click", () => {
  fs.readdirSync(path.join(__dirname, "..", "templates", "usersManagement.html"));
});
