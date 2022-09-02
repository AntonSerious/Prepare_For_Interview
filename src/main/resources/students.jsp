<html>
<head>
    <title>ListDeveloper</title>
</head>
<body>
<table>
    <colgroup>
        <col span="2" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
        <col style="background-color:#ff564f">
        <col style="background-color:#33d1ff">
        <col style="background-color:#2cff23">
        <col style="background-color:#d94cff">
    </colgroup>
    <tr>
        <th >ID</th>
        <th >FIRST_NAME</td>
        <th >LAST_NAME</td>
        <th>SPECIALTY</td>
        <th>SKILLS</td>
        <th>ACCOUNTS</td>
    </tr>
            <tr>
                <c:forEach items="${temp}" var="d" >
                    <td>${d.id}</td>
                    <td>${d.firstName}</td>
                    <td>${d.lastName}</td>
                    <td>${d.specialty}</td>
                    <c:forEach items="${d.skills}" var="trt">
                        <td>${trt.name}</td><br>
                    </c:forEach>
                    <td>${d.account.accountData}</td>
                </c:forEach>
            </tr>
     </table>
  </body>
</html>