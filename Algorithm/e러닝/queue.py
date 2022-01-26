from collections import deque 

#큐 구현할 떄는 덱 라이브러리 사용
queue = deque()

queue.append(5)
queue.append(2)
queue.append(3)
queue.append(7)
queue.popleft()
queue.append(1)
queue.append(4)
queue.popleft()
#삽입은 append, 삭제는 popleft

print(queue) # 먼저 들어온 순으로 출력
queue.reverse() # 역순으로 바꾸기
print(queue) # 나중에 들어온 순으로 출력

# 리스트를 이용해도 기능적으로는 큐를 구현할 수도 있지만 시간 복잡도가 높아서 비효율적. pop할시 위치고려해야해서 시간복잡도가 O(k)
# 엄밀히 말하면 덱 라이브러리는 스택과 큐의 장점을 합친 구조의 자료구조라고 볼 수 있음. list의 append와 동일하게 작동함. 오른쪽으로 삽입. 시간복잡도 상수시간. O(1)
# popleft도 가장 왼쪽에 있는 데이터 삭제니 O(1)
#출력결과
#deque([3, 7, 1, 4])
#deque([4, 1, 7, 3])