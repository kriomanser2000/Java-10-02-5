<!DOCTYPE html>
<html lang="uk">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="calculator" method="POST">
    <label for="num1">Num 1:</label>
    <input type="number" name="num1" id="num1" required><br><br>
    <label for="num2">Num 2:</label>
    <input type="number" name="num2" id="num2" required><br><br>
    <label for="operation">Operation: </label>
    <select name="operation" id="operation">
        <option value="add">Addition</option>
        <option value="subtract">Subtraction</option>
        <option value="multiply">Multiplication</option>
        <option value="divide">Division</option>
        <option value="power">Promotion to degree</option>
        <option value="percentage">Percentages</option>
    </select><br><br>
    <button type="submit">Calculate</button>
</form>
</body>
</html>
