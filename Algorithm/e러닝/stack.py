stack = []
#파이썬에서는 스택 구현에 리스트 사용

stack.append(5)
stack.append(2)
stack.append(3)
stack.append(7)
stack.pop()
stack.append(1)
stack.append(4)
stack.pop()

print(stack[::-1]) # 최상단 원소부터 출력
print(stack) # 최하단 원소부터 출력

# 파이썬에서는 별도로 표준라이브러리 이용할 필요 없이 리스트를 이용하면 된다.
