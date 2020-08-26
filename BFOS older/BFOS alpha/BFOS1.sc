
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
nl
nl
nl
stopdo

if action ≠ step loop

phrase Enter to continue...
input action








function Desktop

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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
phrase                       │
nl 
phrase │ 
set compare 4
do if CY = compare
output X
stopdo
do if CY ≠ compare
output# 32
stopdo
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
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
# only 22 chars wih │ at the end
phrase                       │


nl
phrase └────────────────────────┘

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
