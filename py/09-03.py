from myTurtle import *
import turtle

import tkinter
swidth,sheight=500,500
inStr=''
tX,tY,tAngle,txtSize=[0]*4

turtle.title('거북이 글자 쓰기')
turtle.shape("turtle")
turtle.screensize(swidth,sheight)
turtle.setup(width=swidth + 50, height= sheight+50)
turtle.penup()

inStr = askstring('문자열 입력','거북이 쓸 문자열을 입력')

for ch in inStr:
    tX=random.randrange(-swidth/2,swidth/2)
    tY=random.randrange(-sheight/2,sheight/2)
    r=random.random(); g=random.random(); b=random.random()
    txtSize=random.randrange(10,50)
    turtle.goto(tX,tY)
    turtle.left(tAngle)

    turtle.pencolor((r,g,b))
    turtle.write(ch,font=('맑은고딕',txtSize,'blod'))

turtle.done()