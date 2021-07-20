/**
 * 
 */
function checkChangePwForm() {
    if (!isEqual()) {
        alert("비밀번호가 일치하지 않습니다.");
        document.getElementById("newPw").focus();
        return false;
    }
    return true;
}

function isEqual() {
    var newPw = document.getElementById("newPw").value;
    var secondPw = document.getElementById("pwCheck").value;
    var warning = document.getElementById("pwCheckWarning");

    if (newPw === secondPw) {
        warning.innerHTML = "";
        return true;
    } else {
        warning.innerText = "비밀번호가 일치하지 않습니다.";
        return false;
    }
}