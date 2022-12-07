
list = []
total = 0
x = None

while (x != 0):
    x = input("enter a number, enter 0 to quit: ")
    x = int(x)
    list.append(x)

    

for num in list:
    total = total + num

average = total/(len(list))

print (average)
