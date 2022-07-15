print("Factorial")

def Factorial(number):
    if(number == 1):
        return 1

    else:
        return number * Factorial(number-1)

print("Enter a number:")

_number = int(input())

print(f'Factorial of {_number} is {Factorial(_number)}')
