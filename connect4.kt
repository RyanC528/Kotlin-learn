import java.util.Scanner

class Turn{
    private var turnCount = 1
    public var playerTurn = 1

    fun incTurn(){
        turnCount++
        playerTurn = turnCount % 2
    }
}

class Column {
    private var tokens = arrayOf(0, 0, 0, 0, 0, 0)
    private var height = 0
    private val maxHeight = 6

    fun addTokenCol(player: Int){
        if(height == (maxHeight-1)){
            tokens.set(height,player)
            height++
        }else{
            println("Error, Column Full")
        }
    }

    fun printCol(tokLoc: Int){
        if(tokens[tokLoc] == 0){
            print(" * ")
        }else{
            print(" 0 ")
        }
    }
}

class Board{
    private var rows = Array(7){Column()}

    fun addToken(rowNum: Int,player:Int){
        if((rowNum > 0 )&&(rowNum < 8)){
            rows[rowNum - 1].addTokenCol(player)
        }else{
            println("Error, non valid row")
        }
    }

    fun printBoard(){
        for(i in 0..5){
            for(row in rows){
                row.printCol(i)
            }
            print("\n")
        }
    }

}

fun main() {
    var gameBoard = Board()
    var timer = Turn()
    val reader = Scanner(System.`in`)

    println("Enter 1 to begin")

    var userInput = reader.nextInt()

    println("Beginning Game:")

    while(true){
        println("Enter row number:")
        gameBoard.printBoard()

        userInput = reader.nextInt()

        gameBoard.addToken(userInput,timer.playerTurn)

        timer.incTurn()
    }

}
