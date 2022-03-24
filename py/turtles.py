import random
import turtle as t

t.shape("turtle")
t.pensize(5)
t.speed(50)

def randomDrawCircle(x,y):
    while True:
        x = random.randrange(-400, 400)
        y = random.randrange(-400, 400)
        t.penup()
        t.goto(x, y)
        t.pendown()
        t.circle(50)
        if (x >300 or x < -300) or (y>300 or y<-300) :
            t.up()
            t.color("black")
            t.goto(0, 0)
            t.down
        else:
            t.color("red")

t.onscreenclick(randomDrawCircle,1)
t.done()