# N개의 정수가 들어있는 집합 A가 있습니다.
# M개의 정수가 들어있는 집합 B가 있습니다.
# 집합 B의 요소들이 집합 A에 포함되어있는지 확인합니다.

def binary_search(target, arr):
    start = 0
    end = len(arr) - 1

    while start<= end :
        mid = (start + end) //2
        if arr[mid] == target:
            return 1
        elif arr[mid] < target:
            start = mid+1
        else:
            end = mid -1

    return 0

n = int(input())
arr = list(map(int,input().split()))
arr.sort()
m = int(input())
find = list(map(int,input().split()))

# for i in a:는 리스트 a에서 요소를 꺼내서 i에 저장하고, 꺼낼 때마다 코드를 반복.
# 따라서 print로 i를 출력하면 모든 요소를 순서대로 출력할 수 있음.
for f in find:
    isIn = binary_search(f,arr)
    print(isIn)