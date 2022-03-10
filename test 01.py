while True:
    a = (input("첫번째 "))
    if a == '00000':
        print("end")
        break
    a=int(a)
    b = int(input("두번째 "))

    result = a + b
    print(a, "+",b,"=",result)

    result = a - b
    print(a, "-",b,"=",result)

    result = a / b
    print(a, "/",b,"=",result)

    result = a * b
    print(a, "*",b,"=",result)
