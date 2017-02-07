<html>
<body>
<%
int a=3;
int b=3;
    Object ob = session.getAttribute("ob");
    if(ob!=null & ob instanceof String ) {
        out.write(String.format("Result: %s = %d", ob, (a+b)));
    } else {
        session.setAttribute("ob", "Cool");
    }
    response.addCookie(new Cookie("mycookie", "value"));
%>
</body>
</html>
