import turtle
import random

sw,sh,pS,exC=300,300,3,0
r,g,h,angle,dist,curX,curY=[0]*7

turtle.speed(100)
turtle.shape('turtle')
turtle.pensize(pS)
turtle.setup(width=sw+30,height=sh+30)
turtle.screensize(sw,sh)

while True:
    r=random.random()
    g=random.random()
    b=random.random()
    turtle.pencolor((r,g,b))

    angle=random.randrange(0,360)
    dist =random.randrange(1,100)
    turtle.left(angle)
    turtle.forward(dist)
    curX=turtle.xcor()

    curY=turtle.ycor()

    if(-sw/2<=curX and curX <=sw/2)and (-sh/2<=curY and curY <=sh/2):
        pass
    else:
        turtle.penup()
        turtle.goto(0,0)
        turtle.pendown()

        exC +=1
        if exC >=5:
            break
turtle.done()

