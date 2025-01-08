# expression (list) : 후위연산식
# num (list) : 알파벳 순서에 맞게 제공된 값들
# stk (list) : 연산해야하는 숫자들 모음

# [과정]
# 1. 후위연산식이 들어있는 expression 앞에서부터 읽기
# 2. 만약 알파벳일 경우,해당 알파벳을 아스키 코드로 바꾸어 65를 뺀 값을 인덱스로 하는 num을 stk에 append
#     (이유 : 'A'의 아스키 코드 값이 65이기 때문)
# 3. 만약 연산자일 경우, stk에서 두 번 pop
# 4. 후위연산자이기 때문에 먼저 pop되는 숫자가 연산의 뒤에 있어야 함을 주의하여 나온 2숫자를 연산자에 맞게 연산
# 5. 연산이 끝난 결과는 다시 계산을 위해 stk에 append
# 6. 1~5번을 반복
# 7. 계산 결과를 소숫점 둘째 자리까지 출력

N=int(input())
expression=list(input())
num=[int(input()) for i in range(N)]

stk=[]

for i in expression:
    if i.isalpha():
        stk.append(num[ord(i)-65])
    else:
        a=stk.pop()
        result=stk.pop()

        if i=='+':
            result+=a

        elif i=='-':
            result-=a

        elif i=='*':
            result*=a

        elif i=='/':
            result/=a

        stk.append(result)

print('%.2f' %stk[-1])