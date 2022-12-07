
def max(num1, num2):
    if (num1 >= num2):
        result = num1
    else:
        result = num2
    return result

def max3(x,y,z):
    return max(x, max(y, z))

if __name__ == "__main__":
    i = 5
    j = 2

    k = max(i, j)

    print("The max of 5 and 2 is ", k)
    print("Max(5, max (2,5) is ", max(5, max(2,5)))
    print("Mx3(-5, 2, 10) is ", max3(-5,2,10))