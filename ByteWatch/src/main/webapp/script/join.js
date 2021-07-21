function checkJoinForm() {
    var nickname = document.getElementById("nickname");

    var idChecked = document.getElementById("idChecked");

    if (idChecked.value == "false") {
        alert("아이디 중복확인을 하십시오");
        id.focus();
        return false;
    }
    
    if(!isEqual()) {
        alert("비밀번호가 일치하지 않습니다.");
        pw.focus();
        return false;
    }

    var nicknameChecked = document.getElementById("nicknameChecked");

    if (nicknameChecked.value == "false") {
        alert("닉네임 중복확인을 하십시오");
        nickname.focus();
        return false;
    }

    return true;
}

function isEqual() {
    var pw = document.getElementById("pw").value;
    var secondPw = document.getElementById("pwCheck").value;
    var warning = document.getElementById("pwCheckWarning");

    if (pw === secondPw) {
        warning.innerHTML = "";
        return true;
    } else {
        warning.innerText = "비밀번호가 일치하지 않습니다.";
        return false;
    }
}

function checkId() {
    var id = document.getElementById("id");

    const spaceRegExp = /\s/g;
    if (spaceRegExp.test(id.value)) {
        alert("공백은 사용할 수 없습니다.");
        id.focus();
        return false;
    }

    const idRegExp = /^[a-z0-9]{8,20}$/;
    if (!idRegExp.test(id.value)) {
        alert("아이디는 영어 소문자, 숫자만 가능합니다. (8~20자)");
        id.focus();
        return false;
    }

    if (id.value != "") {
        var uri = "checkId.me?query=" + id.value;
        window.open(uri, "중복확인", "width=1, height=1, top=1, left=1, location=no," +
            "status=no, toolbars=no, scrollbars=no");
    }
}

function checkNickname() {
    var nickname = document.getElementById("nickname");

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
        var uri = "checkNickname.me?query=" + nickname.value;
        window.open(uri, "중복확인", "width=1, height=1, top=1, left=1, location=no," +
            "status=no, toolbars=no, scrollbars=no");
    }
}

function watchId() {
    var idChecked = document.getElementById("idChecked");
    idChecked.value = "false";
}

function watchNickname() {
    var nicknameChecked = document.getElementById("nicknameChecked");
    nicknameChecked.value = "false";
}