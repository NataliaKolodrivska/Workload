<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Loads</title>
</head>
<body>
<div>
    <table border="3" bgcolor="#a9a9a9">
        <tr>
            <th>Teacher</th>
            <th>Subject</th>
            <th>NumberOfGroup</th>
            <th>Delete</th>
        </tr>
        <#list loads as load>
            <tr>
                <td>${load.teacher}</td>
                <td>${load.subject}</td>
                <td>${load.numberOfGroup}</td>
                <td><a href="/ui/v1/loads/${load.id}"><button>Delete</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>