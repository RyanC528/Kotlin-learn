//basic connect for game. First project in kotlin

class Column {
        private var tokens = arrayOf(0 0 0 0 0 0)
        private var height = 0
        private val maxHeight = 6

        fun addTokenCol(){
            if(height == (maxHeight-1)){
                tokens.set(hieght, 1)
                height++
            }else{
                println("error, column full")
            }
        }

        fun printCol(tokLoc: Int){
            if(tokens[tokLoc] == 0){
                print(" * ")
            }else{
                print( " O ")
            }
        }
}

class Board{
    var rows = Array(7) { Column() }
    var i

    fun addToken(rowNum: Int){
        if((rowNum > 0)&&(rowNum < 8)){
            rows[rowNum -1].addTokenCol()
        }else{
            println("Error, non valid row")
        }


    }

    fun printBoard(){
        for( i in 0..5){
            for(row in rows){
                row.printCol(i)
            }
            print("\n")
        }

    }

}

fun main(args : Array<String>){
    var gameBoard = Board()
    var userInput: Int = 0

    println("Begining game")

    while(true){
        gameBoard.printBoard()
        println("Enter a number between 1-7 ")
        userInput = readLine()

        gameBoard.addToken(userInput)

    }

}