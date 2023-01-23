<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
//リクエストパラメータを取得
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("username");
String furigana = request.getParameter("userfurigana");
String tel = request.getParameter("usertel");
String mail = request.getParameter("usermail");
String comment = request.getParameter("usercomment");

%>
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
            <a href="index.html" id="pagetop"><img src="image/logo.png" width="300" height="56"
                    alt="Hiiragi Real Estate"></a>
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
        <h1 class="sabu-h1">お問い合わせが完了しました</h1>
        <p>お問い合わせいただきありがとうございました。お問い合わせを受け付けました。折り返し、担当者よりご連絡いたしますので、恐れ入りますが、しばらくお待ちください。</p>
        <section>
            <table>
				<tbody><tr>
					<th>名前</th>
					<td><%= name %></td>
				</tr>
				<tr>
					<th>フリガナ</th>
					<td><%= furigana %></td>
				</tr>
				<tr>
					<th>電話番号</th>
					<td><%=tel %></td>
				</tr>
				<tr>
					<th>メールアドレス</th>
					<td><%=mail %></td>
				</tr>
				<tr>
					<th>お問い合わせ内容</th>
					<td><%=comment %></td>
				</tr>
			</tbody></table>
        </section>
    </article>
    <footer>
        <small>Copyright &copy; 2015 Hiiragi Real Estate. All Rights Reserved.</small>
    </footer>
</body>

</html>