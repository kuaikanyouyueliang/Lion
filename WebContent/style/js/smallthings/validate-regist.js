/** 注册验证 */
function validateregist() {
	if (!(/^1[3|4|5|8][0-9]\d{4,8}$/.test(shouji))) {
		alert("不是完整的11位手机号或者正确的手机号前七位");
		document.all.shouji.focus();
		return false;
	}
	if (reaccountpwd == "" || reaccountpwd == null) {
		alert("请再次填写密码！");
		document.getElementById("reaccountpwd").focus();
		return false;
	}
	if (accountpwd != reaccountpwd) {
		alert("密码必须一致！");
		document.getElementById("reaccountpwd").focus();
		return false;
	}
	return true;
}
/** 验证邮箱 */
function checkEmail(email) {
	var flag = /^[a-z0-9]{1,}[a-z0-9]*[-\.]*\w+@\w+\.[0-9a-z]{1,}[\.]{0,1}[a-z]{0,4}$/i
			.test(email);
	if (!flag) {
		// alert("邮件格式不正确，请检查！");
		return false;
	} else
		return true;
}