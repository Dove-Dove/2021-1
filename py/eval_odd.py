while True:
    a= input('input valew?')
    if a=='q':
        break
    else:
        a= int(a)
        if a%2==0:
            print("a는 짝수")
        else:
            print("a는 홀수")
print("종료")