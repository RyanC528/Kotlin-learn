import java.util.Scanner

fun winCheck(gameBoard: Board, player: Turn){

}

class Turn{
    private var turnCount = 1
    public var playerTurn = 1

    fun incTurn(){
        turnCount++
        playerTurn = turnCount % 2
    }
}


class Board{
    private var board = Array(7){IntArray(6)}
    private var index = IntArray(7)

    fun addToken(rowNum: Int,player:Int){
        if((rowNum > 0 )&&(rowNum < 8)){
            board[rowNum][index[rowNum-1]] = player + 1
            index[rowNum-1]++
        }else{
            println("Error, non valid row")
        }
    }

    fun printBoard(){
        for(i in 5 downTo 0){
            for( j in 6 downTo 0){
                if(board[j][i] == 1){
                    print(" B ")
                }else if(board[j][i] == 2){
                    print(" W ")
                }else{
                    print(" O ")
                }
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

        if(userInput == 9){
            println("Exit Command Entered")
            break
        }

        gameBoard.addToken(userInput,timer.playerTurn)

        timer.incTurn()
    }

}
