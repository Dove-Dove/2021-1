from tkinter.simpledialog import *
from turtle import*

swidth,sheight =300,300
txtSize=30
shape('turtle')
setup(width=swidth+50,height=sheight+50)
screensize(swidth,sheight)

retStr= askstring('Intput char','Input for turtle')
write(retStr,font=('맑은고딕',txtSize,'bold'))
done();

