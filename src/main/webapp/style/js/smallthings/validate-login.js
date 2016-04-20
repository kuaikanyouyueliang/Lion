/** 登录验证 */
function validateLogin() {
	var username = document.all.username.value;
	if ((username.replace(/(^\s*)|(\s*$)/g, "")) == "") {
		alert("请输入用户名");
		document.all.username.focus();
		return false;
	}
	var password = document.all.password.value;
	if ((password.replace(/(^\s*)|(\s*$)/g, "")) == "") {
		alert("请输入密码");
		document.all.password.focus();
		return false;
	}
	return true;
}