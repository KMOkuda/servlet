<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="UTF-8">
<title>ひいらぎ不動産：お問い合わせ</title>
<link rel="stylesheet" href="css/mystyle.css">
<meta name="keywords" content="お問い合わせ,フォーム,電話番号">
<meta name="description" content="ひいらぎ不動産のお問い合わせ先です。">
<meta name="viewport" content="width=device-width">
</head>

<body>
	<header>
		<div class="header-in">
			<a href="index.html" id="pagetop"><img src="image/logo.png"
				width="300" height="56" alt="Hiiragi Real Estate"></a>
			<nav>
				<ul>
					<li><a href="index.html">トップ</a></li>
					<li><a href="point.html">物件選びのポイント</a></li>
					<li><a href="bukken01.html">おすすめ物件</a></li>
					<li><a href="company.html">会社案内</a></li>
					<li>お問い合わせ</li>
				</ul>
			</nav>
		</div>
	</header>
	<article class="page">
		<ol>
			<li><a href="index.html">トップ</a>&nbsp;&nbsp;&gt;</li>
			<li>お問い合わせ</li>
		</ol>
		<h1 class="sabu-h1">管理者ログイン画面</h1>
		<form action="/hiiragi/LoginServlet" method="post">
			<p>
				<label>ユーザーID:</label> <input type="text" name="userId" required="required">
			</p>

			<p>
				<label>パスワード:</label> <input type="password" name="pass" required="required">
			</p>
				<button type="submit">ログイン</button>
			</p>
		</form>
	</article>
	<footer>
		<small>Copyright &copy; 2015 Hiiragi Real Estate. All Rights
			Reserved.</small>
	</footer>
</body>

</html>