# <이것이 코딩테스트다> 정렬part
# <예제> - 두 배열의 원소 교체
#  내 풀이 
N,K = map(int,input().split())
A = list(map(int,input().split()))
B = list(map(int,input().split()))

A.sort(); B.sort() # B.sort(reverse=True)해서 똑같이 인덱스 0으로 사용해도 될듯
for x in range(K):
    if A[0] < B[-1]:
        A[0], B[-1] = B[-1], A[0]
        A.sort()
        B.sort()
    else:
        break

print(sum(A))