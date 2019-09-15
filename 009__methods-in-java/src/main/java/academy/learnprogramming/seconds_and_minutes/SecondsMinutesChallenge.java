package academy.learnprogramming.seconds_and_minutes;

/*
Создайте новый консольный проект и назовите его SecondsAndMinutesChallenge

Создайте метод с именем getDurationString с двумя параметрами:
первый параметр кол-во минут (minutes) и второй параметр кол-во секунд (seconds).

Валидация входящих параметров:
Вы должны проверить, что первый параметр minutes >= 0.
Вы должны проверить, что второй параметр seconds >= 0 и <= 59.
Метод должен возвращать "Invalid value", если валидация не прошла.

Если значения параметров валидны, вычислите, сколько часов, минут и секунд равны минутам и секундам,
переданным этому методу, и верните это значение в виде строки
в формате "XXh YYm ZZs", где XX представляет количество часов, YY минуты и ZZ секунды.

Создайте 2-й метод с тем же именем, но с одним параметром кол-во секунд (seconds).
Проверьте, что seconds > = 0, и верните "Invalid value", если это не так.
Если кол-во секунд верны, вычислите, сколько минут указано в значении секунд,
затем вызовите другой перегруженный метод, передав правильные минуты и секунды,
рассчитанные для правильного вычисления.

Вызовите оба метода для вывода значений на консоль.

Подсказки:
Используйте int или long для ваших числовых типов данных.
1 минута = 60 секунд и 1 час = 60 минут или 3600 секунд.
Методы должны быть статическими, как мы использовали ранее.

Бонус:
Для ввода 61 минуты вывод в консоли должен быть 01h 01m 00s,
но это нормально, если будет и 1h 1m 0s (Совет: используйте if-else)

 */
public class SecondsMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 65));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}
