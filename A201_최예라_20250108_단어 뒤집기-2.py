# 1. 먼저 탐색하는 문자는 스택안에 추가.
# 2. 괄호안의 존재하는 문자열은 스택의 첫번째부터 pop하여 순차적으로 정답을 추가.
# 3. 그 외의 존재하는 문자열은 스택의 마지막부터 pop하여 역순차적으로 정답을 추가.

data = input()

stack = []
ans = ''
check = False # 괄호안의 여부를 체크
for d in data:
    # 스택에 존재하는 값을 역으로 추가.
    if d == '<':
        check = True
        for _ in range(len(stack)):
            ans += stack.pop()

    stack.append(d)
    # 스택에 존재하는 값은 괄호안의 값이기에 순차적으로 추가.
    if d == '>':
        check = False
        for _ in range(len(stack)):
            ans += stack.pop(0)
    # 스택에 존재하는 값을 역으로 추가.
    if d == ' ' and check == False:
        for i in range(len(stack)):
            if i == 0:
                stack.pop()
                continue
            ans += stack.pop()
        ans += ' '
# 스택에 값이 남아있는 경우는 괄호의 경우가 아니기에 역으로 추가.
if stack:
    for _ in range(len(stack)):
        ans += stack.pop()

print(ans)