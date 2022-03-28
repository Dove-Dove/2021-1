f = 0;

q = int(input('1. 입력한 수식 계산, 2. 두 수 사이의 합계'))


if q==1:
    a = input('수식을 입력하시요 :')
    result = eval(a)
    print(result)

elif q==2:
    a = int(input('첫번째 숫자 입력 :'))
    b = int(input('두번째 숫자 입력:'))
    for i in range (a,b+1):
        f = f + i
        print(f)


