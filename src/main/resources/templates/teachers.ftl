<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Teachers</title>
</head>
<body>
<div>
    <table border="3" bgcolor="#a9a9a9">
        <tr>
            <th>LastName</th>
            <th>FirstName</th>
            <th>Patronymic</th>
            <th>Degree</th>
            <th>Position</th>
            <th>Experience</th>
            <th>Delete</th>
        </tr>
        <#list teachers as teacher>
            <tr>
                <td>${teacher.lastName}</td>
                <td>${teacher.firstName}</td>
                <td>${teacher.patronymic}</td>
                <td>${teacher.degree}</td>
                <td>${teacher.position}</td>
                <td>${teacher.experience}</td>
                <td><a href="/ui/v1/teachers/${teacher.id}"><button>Delete</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>