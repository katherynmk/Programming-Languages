def whole_number_x_converter(n):
    return "{0:b}".format(int(n))

def decimal_number_converter(y): 
    while y > 1:
        y /= 10
    return y

def binary_converter(x, places = 3):

    whole_number, decimal_number = str(x).split(".")
    whole_number = int(whole_number)
    decimal_number = int (decimal_number)
    end_number = whole_number_x_converter(whole_number)

    for x in range(places):
        whole_number, decimal_number = str((decimal_number_converter(decimal_number)) * 2).split(".")
        decimal_number = int(decimal_number)
        end_number += whole_number
  
    return end_number

n = 7.125
p = 3
  
print(binary_converter(n, places = p))