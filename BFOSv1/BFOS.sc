
# mouse controls w(87)s(83) movement  (20) click
# screen dimensions are 26x19
# good symbols ┌ ┐ └ ┘ ─ │ ┬ ┤ ┴ ├ ┼




phrase Loading Variables...

int zero
int CY
int CC
int CY1
int action
int compare
int Screenmode
int loops
int step
int valid?
int border?

int cache
int num1
int num2
int OP

nl
phrase Setting Variables...

set CY 1
set CC 0
set step 1
set Screenmode 1



nl
phrase Loading Settings....

nl
nl
nl
nl
nl
nl
nl
nl
nl
set action 0
phrase Allow Borders? (Y/N)
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
loop zero = zero
input action

set compare 89
do if action = compare
set action 1
set border? 1
phrase Borders: allowed!
nl
nl
nl
nl
nl
nl
nl
nl
stopdo

set compare 78
do if action = compare
set action 1
set border? 0
phrase Borders: denied!
nl
nl
nl
nl
nl
stopdo

if action ≠ step loop

phrase Enter to continue...
nl
nl
nl
nl
nl
nl
input action








function Desktop

do if border? = step

copy CY CY1
nl
phrase ┌BF-OS───────────────────┐

nl
phrase │ 
set compare 1
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  Calculator           │
 
nl
phrase │ 
set compare 2
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  Keyboard Test        │
nl
phrase │ 
set compare 3
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  Tic Tac Toe          │
nl 
phrase │ 
set compare 4
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 5
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 6
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 7
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 8
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 9
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 10
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 11
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 12
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 13
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 14
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 15
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 16
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │
nl
phrase │ 
set compare 17
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase                       │


nl
phrase └────────────────────────┘

stopdo




do if border? = zero

copy CY CY1
nl
phrase BF - OS (no Border)

nl
set compare 1
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  Calculator
 
nl
set compare 2
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  Keyboard Test
nl

set compare 3
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  Tic Tac Toe
nl 
set compare 4
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 5
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 6
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 7
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 8
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 9
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 10
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl 
set compare 11
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 12
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 13
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 14
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 15
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 16
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo

phrase  (none)
nl
set compare 17
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo
phrase  (none)
nl

stopdo

endfunc


nl
nl
nl
phrase Selection Movement:
nl
nl
phrase W(87) and S(83)
nl
nl
phrase Click/Enter:
nl
nl
phrase space(32) or DC4(20)
nl
nl
nl
phrase Enter to start...
nl
nl
nl
nl
nl
nl
nl
nl
nl
input action
nl
nl
nl




nl
phrase Loading Desktop...
nl






#main loop

set valid? 0

loop zero = zero

set compare 1
do if Screenmode = compare
func Desktop

set valid? 1

# Mouse Movement
input action
set compare 87
do if action = compare
set compare 1
do if CY ≠ compare
math CY - step
stopdo
stopdo
set compare 83
do if action = compare
set compare 17
do if CY ≠ compare
math CY + step
stopdo
stopdo

# Click
set compare 20
do if action = compare
math CY + step
copy CY Screenmode
math CY - step
set valid? 0
stopdo

# Click
set compare 32
do if action = compare
math CY + step
copy CY Screenmode
math CY - step
set valid? 0
stopdo

stopdo


# If Screenmode is 2
set compare 2
do if Screenmode = compare
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
phrase Calculator!
nl
nl
nl
nl

phrase Enter Number 1: 
input num1
outvar num1
nl
nl
phrase Enter Operation (+-*/): 
input OP
outvar OP
nl
nl
phrase Enter Number 2: 
input num2
outvar num2
nl
nl
# do the math
set cache 48
math num1 - cache
math num2 - cache
set compare 43
do if OP = compare
math num1 + num2
phrase Result: 
outvardec num1
stopdo
set compare 45
do if OP = compare
math num1 - num2
phrase Result: 
outvardec num1
stopdo
set compare 42
do if OP = compare
math num1 * num2
phrase Result: 
outvardec num1
stopdo
set compare 47
do if OP = compare
set cache 10
math num1 * cache
math num1 / num2
copy num1 num2
math num2 / cache
phrase Result: 
outvardec num2
output .
math num2 * cache
math num1 - num2
outvardec num1
stopdo
nl
nl
nl
nl
Phrase Enter Something to exit...
nl
nl
input OP
set screenmode 1
set valid? 1
stopdo



# If Screenmode is 3
set compare 3
do if Screenmode = compare
nl
nl
nl
nl
nl
nl
nl
nl
nl
phrase Keyboard Test!
nl
phrase (Enter # to exit)
nl

set compare 35
loop zero = zero
input action
outvar action
output (
outvardec action
output ) 
nl
if action ≠ compare loop
set screenmode 1
set valid? 1
stopdo


set compare 4
do if Screenmode = compare
int TicX
int TicO
int TicS
int TicC

set TicX 88
set TicO 79
set TicS 32
# using variables instead of lists to make it faster
int TicP1
int TicP2
int TicP3
int TicP4
int TicP5
int TicP6
int TicP7
int TicP8
int TicP9
int validmove
int CuPl

set CuPl 1
copy TicS TicP1
copy TicS TicP2
copy TicS TicP3
copy TicS TicP4
copy TicS TicP5
copy TicS TicP6
copy TicS TicP7
copy TicS TicP8
copy TicS TicP9

nl
nl
nl
nl
nl
nl
phrase 2P Tic Tac Toe!
nl
phrase By me (lol)
nl
nl
nl
phrase Select a Number (1-9) to
nl
phrase place your X/O there.
nl
nl
nl
nl
phrase Press Enter to begin.
nl
nl
nl
nl
nl
nl
nl
function WIN
# gotta set action to 88 if there is an end to the game like win/draw
# X is 88 O is 79
int TR1
int TR2
int TR3
int TRO
int TRX
int Twin?
int Twinner
int Tone
int Tfull

set Tfull 0
set Tone 1
set Twinner 0
set Twin? 0


# Check row 1 for win
copy TicP1 TR1
copy TicP2 TR2
copy TicP3 TR3
set TRX 0
set TRO 0
set compare 88
do if TR1 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR1 = compare
math TRO + Tone
math Tfull + Tone
stopdo
set compare 88
do if TR2 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR2 = compare
math TRO + Tone
math Tfull + Tone
stopdo
set compare 88
do if TR3 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR3 = compare
math TRO + Tone
math Tfull + Tone
stopdo

set compare 3
do if TRX = compare
set Twin? 1
set Twinner 1
stopdo
set compare 3
do if TRO = compare
set Twin? 1
set Twinner 2
stopdo
# Check row 2 for win
copy TicP4 TR1
copy TicP5 TR2
copy TicP6 TR3
set TRX 0
set TRO 0
set compare 88
do if TR1 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR1 = compare
math TRO + Tone
math Tfull + Tone
stopdo
set compare 88
do if TR2 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR2 = compare
math TRO + Tone
math Tfull + Tone
stopdo
set compare 88
do if TR3 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR3 = compare
math TRO + Tone
math Tfull + Tone
stopdo

set compare 3
do if TRX = compare
set Twin? 1
set Twinner 1
stopdo
set compare 3
do if TRO = compare
set Twin? 1
set Twinner 2
stopdo
# Check row 3 for win
copy TicP7 TR1
copy TicP8 TR2
copy TicP9 TR3
set TRX 0
set TRO 0
set compare 88
do if TR1 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR1 = compare
math TRO + Tone
math Tfull + Tone
stopdo
set compare 88
do if TR2 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR2 = compare
math TRO + Tone
math Tfull + Tone
stopdo
set compare 88
do if TR3 = compare
math TRX + Tone
math Tfull + Tone
stopdo
set compare 79
do if TR3 = compare
math TRO + Tone
math Tfull + Tone
stopdo

set compare 3
do if TRX = compare
set Twin? 1
set Twinner 1
stopdo
set compare 3
do if TRO = compare
set Twin? 1
set Twinner 2
stopdo
# Check diag1 for win
copy TicP1 TR1
copy TicP5 TR2
copy TicP9 TR3
set TRX 0
set TRO 0
set compare 88
do if TR1 = compare
math TRX + Tone
stopdo
set compare 79
do if TR1 = compare
math TRO + Tone
stopdo
set compare 88
do if TR2 = compare
math TRX + Tone
stopdo
set compare 79
do if TR2 = compare
math TRO + Tone
stopdo
set compare 88
do if TR3 = compare
math TRX + Tone
stopdo
set compare 79
do if TR3 = compare
math TRO + Tone
stopdo

set compare 3
do if TRX = compare
set Twin? 1
set Twinner 1
stopdo
set compare 3
do if TRO = compare
set Twin? 1
set Twinner 2
stopdo

# Check diag2 for win
copy TicP3 TR1
copy TicP5 TR2
copy TicP7 TR3
set TRX 0
set TRO 0
set compare 88
do if TR1 = compare
math TRX + Tone
stopdo
set compare 79
do if TR1 = compare
math TRO + Tone
stopdo
set compare 88
do if TR2 = compare
math TRX + Tone
stopdo
set compare 79
do if TR2 = compare
math TRO + Tone
stopdo
set compare 88
do if TR3 = compare
math TRX + Tone
stopdo
set compare 79
do if TR3 = compare
math TRO + Tone
stopdo

set compare 3
do if TRX = compare
set Twin? 1
set Twinner 1
stopdo
set compare 3
do if TRO = compare
set Twin? 1
set Twinner 2
stopdo
# Check vert1 for win
copy TicP1 TR1
copy TicP4 TR2
copy TicP7 TR3
set TRX 0
set TRO 0
set compare 88
do if TR1 = compare
math TRX + Tone
stopdo
set compare 79
do if TR1 = compare
math TRO + Tone
stopdo
set compare 88
do if TR2 = compare
math TRX + Tone
stopdo
set compare 79
do if TR2 = compare
math TRO + Tone
stopdo
set compare 88
do if TR3 = compare
math TRX + Tone
stopdo
set compare 79
do if TR3 = compare
math TRO + Tone
stopdo

set compare 3
do if TRX = compare
set Twin? 1
set Twinner 1
stopdo
set compare 3
do if TRO = compare
set Twin? 1
set Twinner 2
stopdo
# Check vert2 for win
copy TicP2 TR1
copy TicP5 TR2
copy TicP8 TR3
set TRX 0
set TRO 0
set compare 88
do if TR1 = compare
math TRX + Tone
stopdo
set compare 79
do if TR1 = compare
math TRO + Tone
stopdo
set compare 88
do if TR2 = compare
math TRX + Tone
stopdo
set compare 79
do if TR2 = compare
math TRO + Tone
stopdo
set compare 88
do if TR3 = compare
math TRX + Tone
stopdo
set compare 79
do if TR3 = compare
math TRO + Tone
stopdo

set compare 3
do if TRX = compare
set Twin? 1
set Twinner 1
stopdo
set compare 3
do if TRO = compare
set Twin? 1
set Twinner 2
stopdo
# Check vert3 for win
copy TicP3 TR1
copy TicP6 TR2
copy TicP9 TR3
set TRX 0
set TRO 0
set compare 88
do if TR1 = compare
math TRX + Tone
stopdo
set compare 79
do if TR1 = compare
math TRO + Tone
stopdo
set compare 88
do if TR2 = compare
math TRX + Tone
stopdo
set compare 79
do if TR2 = compare
math TRO + Tone
stopdo
set compare 88
do if TR3 = compare
math TRX + Tone
stopdo
set compare 79
do if TR3 = compare
math TRO + Tone
stopdo

set compare 3
do if TRX = compare
set Twin? 1
set Twinner 1
stopdo
set compare 3
do if TRO = compare
set Twin? 1
set Twinner 2
stopdo

set compare 9
do if Tfull = compare
set Twin? 1
stopdo



set compare 1
do if Twin? = compare
set action 40
# not 88 because its 88 - 48
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
nl
phrase The game has ended!
nl
phrase The winner is Player: 
outvardec Twinner
nl
set compare 0
do if Twinner = compare
phrase (It's a draw)
nl
stopdo
do if Twinner ≠ compare
nl
stopdo
nl
nl
nl
nl
nl
nl
nl
nl
input Twin?
stopdo


endfunc




function TicBoard
nl
nl
nl
nl
phrase    #   #
nl
output# 32
outvar TicP1
phrase  # 
outvar TicP2
phrase  # 
outvar TicP3
nl
phrase    #   #
nl
phrase ###########
nl
phrase    #   #
nl
output# 32
outvar TicP4
phrase  # 
outvar TicP5
phrase  # 
outvar TicP6
nl
phrase    #   #
nl
phrase ###########
nl
phrase    #   #
nl
output# 32
outvar TicP7
phrase  # 
outvar TicP8
phrase  # 
outvar TicP9
nl
phrase    #   #

nl
nl
nl
endfunc




input action


loop step = step



set validmove 0
func TicBoard
phrase Enter a number: X to exit
nl
phrase Player: 
outvardec CuPl
nl
nl
nl
nl
input action

set compare 48
math action - compare

copy TicS TicC

set compare 1
do if CuPl = compare
copy TicX TicC
stopdo

set compare 2
do if CuPl = compare
copy TicO TicC
stopdo


set compare 1
do if action = compare 
do if TicP1 = TicS
copy TicC TicP1 
set validmove 1
stopdo
stopdo
set compare 2
do if action = compare 
do if TicP2 = TicS
copy TicC TicP2 
set validmove 1
stopdo
stopdo
set compare 3
do if action = compare 
do if TicP3 = TicS
copy TicC TicP3 
set validmove 1
stopdo
stopdo
set compare 4
do if action = compare 
do if TicP4 = TicS
copy TicC TicP4 
set validmove 1
stopdo
stopdo
set compare 5
do if action = compare 
do if TicP5 = TicS
copy TicC TicP5 
set validmove 1
stopdo
stopdo
set compare 6
do if action = compare 
do if TicP6 = TicS
copy TicC TicP6 
set validmove 1
stopdo
stopdo
set compare 7
do if action = compare 
do if TicP7 = TicS
copy TicC TicP7 
set validmove 1
stopdo
stopdo
set compare 8
do if action = compare 
do if TicP8 = TicS
copy TicC TicP8 
set validmove 1
stopdo
stopdo
set compare 9
do if action = compare 
do if TicP9 = TicS
copy TicC TicP9 
set validmove 1
stopdo
stopdo








set compare 1

do if validmove = compare
func WIN

# switch Player
set compare 1
math Cupl + compare

set compare 2
do if CuPl > compare
set CuPl 1
stopdo
stopdo



set compare 48
math action + compare
if action ≠ TicX loop





set screenmode 1
set valid? 1
stopdo





# If valid is 0
do if valid? = zero
nl
phrase Error!
nl
phrase Invalid Program...
set Screenmode 1
set CY 1
stopdo

set valid? 0
if zero = zero loop
