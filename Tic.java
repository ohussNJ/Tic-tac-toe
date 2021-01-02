import java.util.ArrayList;

public class Tic {
    private String [][] board;
    private String player1;
    private String player2;

    public Tic (){
        player1="Player 1";
        player2="Player 2";
        board=new String [][]{{" "," "," "},{" "," "," "},{" "," "," "}};
    }
    public String [][] getBoard(){
        return board;
    }
    public void setBoard(String [][] a){
        this.board=a;
    }
    public void setPlayerName(String name1, String name2){
        this.player1=name1;
        this.player2=name2;
    }
    public boolean winnerPlayerOne(){
        String [][] a=getBoard().clone();
        boolean g=false;
        if ((a[0][0]=="x")&& (a[0][1]=="x") && (a[0][2]=="x")){
            g=true;
        } 
        if ((a[1][0]=="x")&& (a[1][1]=="x") && (a[1][2]=="x")){
            g=true;
        } 
        if ((a[2][0]=="x")&& (a[2][1]=="x") && (a[2][2]=="x")){
            g=true;
        } 
        if ((a[0][0]=="x")&& (a[1][0]=="x") && (a[2][0]=="x")){
            g=true;
        } 
        if ((a[0][1]=="x")&& (a[1][1]=="x") && (a[2][1]=="x")){
            g=true;
        } 
        if ((a[0][2]=="x")&& (a[1][2]=="x") && (a[2][2]=="x")){
            g=true;
        } 
        if ((a[0][0]=="x")&& (a[0][1]=="x") && (a[0][2]=="x")){
            g=true;
        } 
        if ((a[0][0]=="x")&& (a[0][1]=="x") && (a[0][2]=="x")){
            g=true;
        } 
        if ((a[0][0]=="x")&& (a[1][1]=="x") && (a[2][2]=="x")){
            g=true;
        } 
        if ((a[2][0]=="x")&& (a[1][1]=="x") && (a[0][2]=="x")){
            g=true;
        } 
        return g;
    }
    public boolean winnerPlayerTwo(){
        String [][] a=getBoard().clone();
        boolean g=false;
        if ((a[0][0]=="o")&& (a[0][1]=="o") && (a[0][2]=="o")){
            g=true;
        } 
        if ((a[1][0]=="o")&& (a[1][1]=="o") && (a[1][2]=="o")){
            g=true;
        } 
        if ((a[2][0]=="o")&& (a[2][1]=="o") && (a[2][2]=="o")){
            g=true;
        } 
        if ((a[0][0]=="o")&& (a[1][0]=="o") && (a[2][0]=="o")){
            g=true;
        } 
        if ((a[0][1]=="o")&& (a[1][1]=="o") && (a[2][1]=="o")){
            g=true;
        } 
        if ((a[0][2]=="o")&& (a[1][2]=="o") && (a[2][2]=="o")){
            g=true;
        } 
        if ((a[0][0]=="o")&& (a[0][1]=="o") && (a[0][2]=="o")){
            g=true;
        } 
        if ((a[0][0]=="o")&& (a[0][1]=="o") && (a[0][2]=="o")){
            g=true;
        } 
        if ((a[0][0]=="o")&& (a[1][1]=="o") && (a[2][2]=="o")){
            g=true;
        } 
        if ((a[2][0]=="o")&& (a[1][1]=="o") && (a[0][2]=="o")){
            g=true;
        } 
        return g;
    }
    public void moveSetPlayerOne(int a){
        String [][] boardOne=getBoard().clone();
        if (a==1)
            boardOne[0][0]="x";
            if (a==2)
            boardOne[0][1]="x";
            if (a==3)
            boardOne[0][2]="x";
            if (a==4)
            boardOne[1][0]="x";
            if (a==5)
            boardOne[1][1]="x";
            if (a==6)
            boardOne[1][2]="x";
            if (a==7)
            boardOne[2][0]="x";
            if (a==8)
            boardOne[2][1]="x";
            if (a==9)
            boardOne[2][2]="x";
            setBoard(boardOne);
    }

    public void moveSetPlayerTwo(int a){
        String [][] boardOne=getBoard().clone();
        if (a==1)
            boardOne[0][0]="o";
            if (a==2)
            boardOne[0][1]="o";
            if (a==3)
            boardOne[0][2]="o";
            if (a==4)
            boardOne[1][0]="o";
            if (a==5)
            boardOne[1][1]="o";
            if (a==6)
            boardOne[1][2]="o";
            if (a==7)
            boardOne[2][0]="o";
            if (a==8)
            boardOne[2][1]="o";
            if (a==9)
            boardOne[2][2]="o";
            setBoard(boardOne);
    }
    public void gameTable(){
        System.out.println(getBoard()[0][0]+" | "+getBoard()[0][1]+" | "+getBoard()[0][2]);
        System.out.println("---------");
        System.out.println(getBoard()[1][0]+" | "+getBoard()[1][1]+" | "+getBoard()[1][2]);
        System.out.println("---------");
        System.out.println(getBoard()[2][0]+" | "+getBoard()[2][1]+" | "+getBoard()[2][2]);
    }
    public ArrayList<Integer> moveSetNumbers(){
        ArrayList<Integer> moves=new ArrayList<Integer>();
        if (getBoard()[0][0]==" "){
            moves.add(1);
        }
        if (getBoard()[0][1]==" "){
            moves.add(2);
        }
        if (getBoard()[0][2]==" "){
            moves.add(3);
        }
        if (getBoard()[1][0]==" "){
            moves.add(4);
        }
        if (getBoard()[1][1]==" "){
            moves.add(5);
        }
        if (getBoard()[1][2]==" "){
            moves.add(6);
        }
        if (getBoard()[2][0]==" "){
            moves.add(7);
        }
        if (getBoard()[2][1]==" "){
            moves.add(8);
        }
        if (getBoard()[2][2]==" "){
            moves.add(9);
        }
        return moves;
    }
    public int checkIfValidMove(int a){
        boolean moveCheck=false;
        while (!moveCheck){
            if (a==1){
                if(getBoard()[0][0]==" "){
                    moveCheck=true;
                } else {
                    StdOut.println("Invalid Move: Choose another number");
                    a=StdIn.readInt();
                }
        }
        if (a==2){
            if(getBoard()[0][1]==" "){
                moveCheck=true;
            } else {
                StdOut.println("Invalid Move: Choose another number");
                a=StdIn.readInt();
            }
    }
    if (a==3){
        if(getBoard()[0][2]==" "){
            moveCheck=true;
        } else {
            StdOut.println("Invalid Move: Choose another number");
            a=StdIn.readInt();
        }
}
    if (a==4){
        if(getBoard()[1][0]==" "){
            moveCheck=true;
    } else {
        StdOut.println("Invalid Move: Choose another number");
        a=StdIn.readInt();
    }
}
    if (a==5){
        if(getBoard()[1][1]==" "){
            moveCheck=true;
    } else {
        StdOut.println("Invalid Move: Choose another number");
        a=StdIn.readInt();
    }
}
    if (a==6){
        if(getBoard()[1][2]==" "){
            moveCheck=true;
    } else {
        StdOut.println("Invalid Move: Choose another number");
        a=StdIn.readInt();
    }
}
    if (a==7){
        if(getBoard()[2][0]==" "){
            moveCheck=true;
    } else {
        StdOut.println("Invalid Move: Choose another number");
        a=StdIn.readInt();
    }
}
    if (a==8){
        if(getBoard()[2][1]==" "){
            moveCheck=true;
    } else {
        StdOut.println("Invalid Move: Choose another number");
        a=StdIn.readInt();
    }
}
    if (a==9){
        if(getBoard()[2][2]==" "){
            moveCheck=true;
    } else {
        StdOut.println("Invalid Move: Choose another number");
        a=StdIn.readInt();
    }
}
    if (a<1 || a>9){
        StdOut.println("Error: Choose a number from the choices");
        a=StdIn.readInt();
    }
        }
        return a;

    }

    public void gameSetup(){
        StdOut.println("What is the name of Player 1");
            String firstName=StdIn.readString();
        StdOut.println("What is the name of Player 2");
            String secondName=StdIn.readString();
            setPlayerName(firstName, secondName);
            StdOut.println("1 | 2 | 3");
            StdOut.println("---------");
            StdOut.println("4 | 5 | 6");
            StdOut.println("---------");
            StdOut.println("7 | 8 | 9");
            StdOut.println("Move Set: 1=Top Left, 2=Top Middle, 3=Top Right, 4=Middle Left, 5=Middle, 6=Middle Right, 7=Bottom Left, 8=Bottom Middle, 9=Bottom Right");
    }
      public void moves(){      
            ArrayList<Integer> availableMoves=new ArrayList<Integer>();
            for (int i=0; i<9; i++){
            availableMoves=moveSetNumbers();
            StdOut.println(player1+" choose a number: "+availableMoves);
            int move=StdIn.readInt();
            move=checkIfValidMove(move);
            moveSetPlayerOne(move);
            gameTable();
            boolean winner=winnerPlayerOne();
            if (winner){
                StdOut.println("Game Over: "+player1+" Won");
                break;
            }
            i++;
            if (i>7){
                break;
            }
            availableMoves=moveSetNumbers();
            StdOut.println(player2+" choose a number: "+availableMoves);
            int move2=StdIn.readInt();
            move2=checkIfValidMove(move2);
            moveSetPlayerTwo(move2);
            gameTable();
            boolean winner2=winnerPlayerTwo();
            if (winner2){
                StdOut.println("Game Over: "+player2+" Won");
                break;
            }}
            boolean win=winnerPlayerOne();
            boolean win2=winnerPlayerTwo();
            if (!(win) && !(win2))
                StdOut.println("Game Over: No Winner");
    
}
public String toString(){
    return "Thanks for playing";
}    
    
    public static void main (String[] args){
        Tic game=new Tic();
        game.gameSetup();
        game.moves();
        StdOut.println(game);
    }
}
