<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table>
    <colgroup>
      <col span="2" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
      <col style="background-color:#ff564f"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
      <col style="background-color:#33d1ff"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
      <col style="background-color:#2cff23"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
      <col style="background-color:#d94cff"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
    </colgroup>
    <tr>
      <th >ID</th>
      <th >Message</td>
      <th >date</td>
      <th>done</td>

    </tr>

    <c:forEach items="${list}" var="d" >
      <tr>
        <td>${d.id}</td>
        <td>${d.message}</td>
        <td>${d.date}</td>
        <td>${d.done}</td>
      </tr>

    </c:forEach>
  </table>
  </body>
</html>
