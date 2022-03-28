import turtle
import random

swidth,shight=500,500


turtle.shape('turtle')
turtle.setup(width=swidth+50,height=shight+50)
turtle.screensize(swidth,shight)
turtle.penup()
turtle.goto(0,-shight /2)
turtle.pendown()
turtle.speed(20)


for radius in range(1,250):
    r=random.random()
    g=random.random()
    b=random.random()
    turtle.pencolor((r,g,b))

    turtle.circle(radius)

turtle.done()