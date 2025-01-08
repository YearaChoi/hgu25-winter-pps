# H, M - 45가 기본
# 만일 M < 45 일 경우
# 경우1) H가 0일 경우 23으로 변경 후 60 더하기
# 경우2) 아닐 경우, H -1 하고, 60 더하기
H, M = map(int, input().split())

if M < 45:
  if H == 0:
    H = 23
    M += 60
  else:
    H -= 1
    M += 60

print(H, M - 45)