<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
${pageContext.request.contextPath}

<a href="${pageContext.request.contextPath}/user/user/u001">查询用户u001</a>
<a href="${pageContext.request.contextPath}/view/users.html">查看用户表</a>
<a href="view/xadmin.html">xadmin.html</a>
</body>
</html>
