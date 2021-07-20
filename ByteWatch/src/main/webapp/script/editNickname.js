/**
 * 
 */
function checkNickname() {
    var nickname = document.getElementById("newNickname");

    const spaceRegExp = /\s/g;
    if (spaceRegExp.test(nickname.value)) {
        alert("공백은 사용할 수 없습니다.");
        nickname.focus();
        return false;
    }

    const nickRegExp = /^[A-za-z0-9가-힣]{4,16}$/;
    if (!nickRegExp.test(nickname.value)) {
        alert("닉네임에는 특수문자를 사용할 수 없습니다.");
        nickname.focus();
        return false;
    }

    if (nickname.value != "") {
        var uri = "checkNickname.me?query="
            + nickname.value;
        window.open(uri, "중복확인", "width=1, height=1, top=100, left=300, location=no,"
            + "status=no, toolbars=no, scrollbars=no");
    }
}

function checkEditNicknameForm() {
    var nicknameChecked = document.getElementById("nicknameChecked");

    if (nicknameChecked.value == "false") {
        alert("닉네임 중복확인을 하십시오");
        document.getElementById("newNickname").focus();
        return false;
    }

    return true;
}

function watch() {
    var nicknameChecked = document.getElementById("nicknameChecked");
    
    nicknameChecked.value = "false";
}