def add_rec(a, b):
    if (a > 0) and (b > 0):
        print("add_rec a = ", a, " b= ", b)

        if (b == 1):
            return (a + 1)
        else:
            return (1 + add_rec( a, b-1))
    else:
        print("your integers are not positive")

if __name__ == "__main__":
    
    a = input("Enter a positive integer:  ")
    a = int(a)
    b = input("Enter a positive integer:  ")
    b = int(b)
    sum = a + b
    add_rec(a,b)
    print(a, " + ", b, " is: ", sum )
