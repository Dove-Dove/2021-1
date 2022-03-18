import random
import turtle

col = ['red', 'yellow', 'green', 'blue',
       'white', 'black', 'orange', 'pink']
# print(col)
# print(col[0], col[1], col[7])
# print('length=', len(col))
# print(type(col))

# ind=random.randint(0,7)
# print(ind)

def fxn(x,y):
       global col #col은 지역함수가 아니라 전역함수를 사용
       ind = random.randint(0,7)
       turtle.bgcolor(col[ind])

#set screen
turtle.setup(400, 300)

#call method on screen click
turtle.onscreenclick(fxn, 1)

turtle.done()