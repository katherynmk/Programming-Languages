
list = []
total = 0
x = None
max = 0;

while (x != 0):
    x = input("enter a number, enter 0 to quit: ")
    x = int(x)
    list.append(x)

    

for num in list:
    if (num > max):
        max = num

print (max)
