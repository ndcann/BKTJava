<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>Tính BMI</title></head>
<body>
    <h2>Nhập chiều cao và cân nặng</h2>
    <form action="bmi" method="post">
        Chiều cao (m): <input type="text" name="height" /><br/>
        Cân nặng (kg): <input type="text" name="weight" /><br/>
        <input type="submit" value="Tính BMI" />
    </form>

    <c:if test="${not empty bmi}">
        <h3>Kết quả BMI: ${bmi}</h3>
        <c:choose>
            <c:when test="${bmi < 18.5}">Gầy</c:when>
            <c:when test="${bmi < 25}">Bình thường</c:when>
            <c:otherwise>Thừa cân</c:otherwise>
        </c:choose>
    </c:if>
</body>
</html>
