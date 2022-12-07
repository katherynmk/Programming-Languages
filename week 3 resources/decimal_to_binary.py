def convesion(n):
    if n> 1:
        convesion(n//2)
    print(n %2, end ='')

n = int(input("Enter a decimal number: "))
convesion(n)
