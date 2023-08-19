def add(a,b):
    return a+b
def sub(a,b):
    return a-b
def multiply(a,b):
    return a*b
def divide(a,b):
    if b==0:
        print("Error")
        return 0
    else:
        return a/b
while True:
        print("Select Operation: ")
        print("q. Quit")
        print("1. Add")
        print("2. Subtract")
        print("3. Multiply")
        print("4. Divide")
        choice=input("Enter choice: ")
        if choice =='q':
            break
        if choice in['1','2','3','4']:
            num1=float(input("Enter your first number:"))
            num2=float(input("Enter your first number:"))
        if choice=='1':
            result=add(num1,num2)
            print(result)
        elif choice=='2':
            result=sub(num1,num2)
            print(result)
        elif choice=='3':
            result=multiply(num1,num2)
            print(result)
        elif choice=='4':
            result=divide(num1,num2)
            print(result)
        else:
            print("Invalid Input")
