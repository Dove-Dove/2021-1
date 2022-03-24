while True:
    m = str(input("교환할 돈은 얼마인가?"))
    if(m=="00000"):
        print("종료")
        break
    m = int (m)
    n = m % 500
    c = m/500
    print("나머지", n,"500원교환 갯수", int (c))

    s = n % 100
    c = n / 100
    print("나머지", s, "100원교환 갯수", int (c))

    i = s % 50
    c = s / 50
    print("나머지", i,"50원교환 갯수", int (c))

    z = i % 10
    c = i/10
    print("나머지",z, "10원교환 갯수", int (c))
