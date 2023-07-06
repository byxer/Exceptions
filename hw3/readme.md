Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет операцию возведения первого числа в степень второго числа. Если введены некорректные числа или происходит деление на ноль, необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
Важно! С использованием принципа одного уровня абстракции!
**В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(), выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль) и отрицательная степень, выбрасывается исключение InvalidInputException.