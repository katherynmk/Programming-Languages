
x = input("what is the number you want to convert to binary?")
x = int(x)
listy = []

y = 0.0
while (y == 0):
    a = int(x%2)
    listy.append(a)
    y = x%2
    x = x/2

listy.reverse()
print("Your binary number is: ", listy)