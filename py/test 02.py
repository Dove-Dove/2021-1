def add(a, b):
    return a + b
def minus(a, b):
    return  a - b
def muulti(a, b):
    return  a * b
def divide(a, b):
    return  a / b


while True:
    a = input("첫번째 함수")
    if a == "00000":
        break
    a= int(a)
    b=int(input("두번째 함수"))
    ad=add(a, b)
    mi=minus(a, b)
    mu=muulti(a, b)
    di=divide(a, b)
    print("add = ",ad)
    print("minus = ",mi)
    print("multi=",mi)
    print("divide=",di)

print("종료")
    
