import turtle
import random

#오륜기 만들기
def screenLeftClick(x, y):
    global r, g, b
    global pSize


    turtle.pencolor((r, g, b))
    turtle.pendown()
    turtle.goto(x, y)

def sreenMidClick(x, y):
    turtle.penup()
    turtle.goto(x, y)

def screenRightClick(x, y):
    global  r, g, b
    global pSize
    pSize = random.randrange(1, 10)
    turtle.shapesize(pSize)
    r = random.random()
    g = random.random()
    b = random.random()

    turtle.shapesize(pSize)
    turtle.pencolor((r,g,b))
    turtle.color((r,g,b))
    turtle.pendown()
    turtle.goto(x,y)

pSize = 10
r, g, b = 0.0, 0.0, 0.0

turtle.title("거북이")
turtle.shape("turtle")
turtle.pensize(pSize)

turtle.onscreenclick(screenLeftClick, 1)
turtle.onscreenclick(sreenMidClick, 2)
turtle.onscreenclick(screenRightClick, 3)

turtle.done()