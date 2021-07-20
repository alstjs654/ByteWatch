function checkLoginForm() {
    const id = document.getElementById("id");
    const spaceRegExp = /\s/g;
    if (spaceRegExp.test(id.value)) {
        alert("아이디에는 공백을 사용할 수 없습니다.");
        id.focus();
        return false;
    } else {
        return true;
    }
}