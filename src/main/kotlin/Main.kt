fun main() {
    showIntro()
    mainMenu()
}

fun showIntro() {
    println("Добро пожаловать в текстовую приключенческую игру!")
    println("Вам предстоит выбирать свой путь и столкнуться с различными вызовами в лесу.")
}

fun mainMenu() {
    println("Главное меню:")
    println("1. Начать новую игру")
    println("2. Загрузить игру")
    println("3. Выйти из игры")
    val choice = readLine()
    when (choice) {
        "1" -> startNewGame()
        else -> {
            println("Неправильный выбор. Пожалуйста, выберите 1, 2 или 3.")
            mainMenu()
        }
    }
}

fun startNewGame() {
    println("Вы находитесь в темном лесу...")
    println("Впереди раздвигаются деревья, и вам нужно принять решение.")
    println("1. Пойти налево в глубь леса.")
    println("2. Пойти направо к реке.")
    println("3. Пойти прямо через поляну.")

    val choice = readLine()

    when (choice) {
        "1" -> {
            val weapon = "магический меч"
            val damage = 20
            println("Вы направились вглубь леса и нашли $weapon!")
            println("У вас есть $weapon, который наносит $damage урона.")
            continueJourney()
        }
        "2" -> {
            val treasures = arrayOf("золото", "сокровища", "драгоценные камни")
            println("Вы пришли к реке и увидели мост.")
            println("Вы перешли мост и обнаружили некоторые сокровища: ${treasures.joinToString(", ")}!")
            continueJourney()
        }
        "3" -> {
            val dragonHP = 100
            val playerHP = 50
            println("Вы прошли через поляну и наткнулись на дракона с $dragonHP здоровья!")

            if (playerHP > dragonHP) {
                println("Вы победили дракона! Поздравляем!")
            } else {
                println("Дракон атакует вас, но у вас нет шансов. Игра окончена.")
            }
        }
        else -> {
            println("Вы потерялись в лесу и никогда не выбрались.")
        }
    }
}

fun continueJourney() {
    println("Продолжаем свое приключение...")
    // Здесь вы можете добавить дополнительные ветви сюжета или действия игрока
}