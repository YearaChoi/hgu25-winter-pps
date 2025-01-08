# 이분탐색 
import sys
input = sys.stdin.readline

s, c = map(int,input().split())
L = [int(input()) for _ in range(s)]

start = 0
end = 1000000000

resChick = 0

while(start<=end):
    mid = (start+end) // 2
    if mid == 0:
        mid = 1
        
    cnt = sum(pa//mid for pa in L)
    if cnt >= c: #cnt 가 같다 == mid 저장,
        # cnt의 개수가 크다는 것은 mid를 더크게 해도 된다는 것. 
        resChick = max(resChick,mid)
        start = mid+1
    else:
        end = mid -1

 # 전체 파의 합  - (파닭의 개수 * 치킨에 들어가는 파)      
res = sum(L) - (c * resChick)
print(res)


