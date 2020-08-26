
# mouse controls w(87)a(65)s(83)d(68) movement  (20) click
# screen dimensions are 26x19
# good symbols ┌ ┐ └ ┘ ─ │ ┬ ┤ ┴ ├ ┼




phrase Loading Variables...

int zero
int CX
int CY
int CC
int CX1
int CY1
int CC1
int action
int compare
int Screenmode
int loops
int step
nl
phrase Setting Variables...

set CX 1
set CY 1
set CC 0
set step 1
set Screenmode 1



nl
phrase Loading Settings....



function Desktop

copy CY CY1
nl
phrase ┌BF-OS───────────────────┐
set compare 1
loop CY1 ≠ compare
nl
phrase │                        │
math CY1 - step
if CY1 ≠ compare loop

  
nl          │
copy CX CX1
output │
set compare 1
loop CX1 ≠ compare
output# 32
math CX1 - step
if CX1 ≠ compare loop
output ┼
copy CX CX1
set compare 24
loop CX1 ≠ compare
output# 32
math CX1 + step
if CX1 ≠ compare loop
output │





copy CY CY1

set compare 17
loop CY1 ≠ compare
nl
phrase │                        │
math CY1 + step
if CY1 ≠ compare loop
nl
phrase └────────────────────────┘

endfunc





nl
phrase Loading Desktop...
nl

#main loop

loop zero = zero

set compare 1
do if Screenmode = compare
func Desktop
stopdo


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


set compare 68
do if action = compare
set compare 24
do if CX ≠ compare
math CX + step
stopdo
stopdo


set compare 65
do if action = compare
set compare 1
do if CX ≠ compare
math CX - step
stopdo
stopdo











if zero = zero loop



