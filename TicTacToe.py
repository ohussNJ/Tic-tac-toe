
class TicTacToe():
    board = [[' ', ' ', ' '], [' ', ' ', ' '], [' ', ' ', ' ']]
    P1_Name = " "
    P2_Name = " "
    ticker = 0

    def __init__(self, P1_Name, P2_Name):
        self.P1_Name = P1_Name
        self.P2_Name = P2_Name

    def move_set():
        print("1 | 2 | 3")
        print("---------")
        print("4 | 5 | 6")
        print("---------")
        print("7 | 8 | 9")
        print("Move Set: 1=Top Left, 2=Top Middle, 3=Top Right, 4=Middle Left, 5=Middle, 6=Middle Right, 7=Bottom Left, 8=Bottom Middle, 9=Bottom Right")

    def check_valid_move(move):
        board_check = TicTacToe.board
        while True:
            move = int(move)
            if move == 1:
                if board_check[0][0] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            elif move == 2:
                if board_check[0][1] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            elif move == 3:
                if board_check[0][2] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            elif move == 4:
                if board_check[1][0] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            elif move == 5:
                if board_check[1][1] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            elif move == 6:
                if board_check[1][2] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            elif move == 7:
                if board_check[2][0] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            elif move == 8:
                if board_check[2][1] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            elif move == 9:
                if board_check[2][2] == ' ':
                    break
                else:
                    move = input('Invalid Move, Choose Another Number: ')
            else:
                move = input("Error Choose A Number Between 1 and 9: ")
        return move

    def set_move(move):
        TicTacToe.ticker += 1
        turn_checker = TicTacToe.ticker
        board_fill = TicTacToe.board
        letter = ""
        move = int(move)
        if turn_checker % 2 == 0:
            letter = "o"
        else:
            letter = "x"
        if move == 1:
            board_fill[0][0] = letter
        elif move == 2:
            board_fill[0][1] = letter
        elif move == 3:
            board_fill[0][2] = letter
        elif move == 4:
            board_fill[1][0] = letter
        elif move == 5:
            board_fill[1][1] = letter
        elif move == 6:
            board_fill[1][2] = letter
        elif move == 7:
            board_fill[2][0] = letter
        elif move == 8:
            board_fill[2][1] = letter
        elif move == 9:
            board_fill[2][2] = letter
        TicTacToe.board = board_fill

    def print_board():
        board_print = TicTacToe.board
        print(board_print[0][0]+" | "+board_print[0][1]+" | "+board_print[0][2])
        print("---------")
        print(board_print[1][0]+" | "+board_print[1][1]+" | "+board_print[1][2])
        print("---------")
        print(board_print[2][0]+" | "+board_print[2][1]+" | "+board_print[2][2])

    def check_winner():
        check = TicTacToe.ticker
        winner = False
        a = TicTacToe.board
        if check % 2 == 0:
            letter = 'o'
        else:
            letter = 'x'
        if a[0][0] == letter and a[0][1] == letter and a[0][2] == letter:
            winner = True
        if a[1][0] == letter and a[1][1] == letter and a[1][2] == letter:
            winner = True
        if a[2][0] == letter and a[2][1] == letter and a[2][2] == letter:
            winner = True
        if a[0][0] == letter and a[1][0] == letter and a[2][0] == letter:
            winner = True
        if a[0][1] == letter and a[1][1] == letter and a[2][1] == letter:
            winner = True
        if a[0][2] == letter and a[1][2] == letter and a[2][2] == letter:
            winner = True
        if a[0][0] == letter and a[1][1] == letter and a[2][2] == letter:
            winner = True
        if a[0][2] == letter and a[1][1] == letter and a[2][0] == letter:
            winner = True
        if winner and letter == 'o':
            return 1
        elif winner and letter == 'x':
            return 2
        return 0

    def available_moves():
        moves = []
        curr_board = TicTacToe.board
        if curr_board[0][0] == " ":
            moves.append(1)
        if curr_board[0][1] == " ":
            moves.append(2)
        if curr_board[0][2] == " ":
            moves.append(3)
        if curr_board[1][0] == " ":
            moves.append(4)
        if curr_board[1][1] == " ":
            moves.append(5)
        if curr_board[1][2] == " ":
            moves.append(6)
        if curr_board[2][0] == " ":
            moves.append(7)
        if curr_board[2][1] == " ":
            moves.append(8)
        if curr_board[2][2] == " ":
            moves.append(9)
        print("Available Moves: ", end='')
        print(moves)

    def start_game():
        TicTacToe.move_set()
        while TicTacToe.ticker < 10:
            if TicTacToe.ticker == 9:
                print("Game Over, No Winner :(")
                break
            if TicTacToe.ticker % 2 == 0:
                TicTacToe.available_moves()
                print(TicTacToe.P1_Name, end='')
                move = input(" what is your move: ")
            else:
                TicTacToe.available_moves()
                print(TicTacToe.P2_Name, end='')
                move = input(" what is your move: ")
            valid_move = TicTacToe.check_valid_move(move)
            TicTacToe.set_move(valid_move)
            TicTacToe.print_board()
            win_check = TicTacToe.check_winner()
            if win_check == 1:
                print(TicTacToe.P2_Name, end='')
                print(" has won the game!")
                break
            elif win_check == 2:
                print(TicTacToe.P1_Name, end='')
                print(" has won the game!")
                break


Player1_Name = input("Please enter Player 1 name: ")
Player2_Name = input("Please enter Player 2 name: ")
TicTacToe.P1_Name = Player1_Name
TicTacToe.P2_Name = Player2_Name
new_game = TicTacToe(Player1_Name, Player2_Name)
TicTacToe.start_game()
