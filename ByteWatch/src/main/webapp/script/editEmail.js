/**
 * 
 */
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