<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Subjects</title>
</head>
<body>
<div>
    <table border="3" bgcolor="#a9a9a9">
        <tr>
            <th>Name</th>
            <th>TypeOfSubject</th>
            <th>NumberOfHours</th>
            <th>Delete</th>
        </tr>
        <#list subjects as subject>
            <tr>
                <td>${subject.name}</td>
                <td>${subject.typeOfSubject}</td>
                <td>${subject.numberOfHours}</td>
                <td><a href="/ui/v1/subjects/${subject.id}"><button>Delete</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>