array = [5,1,8,3,0,4,6,2,7,9]

for i in range(len(array)):
    min_index = i #가장 작은 원소의 인덱스
    for j in range(i+1,len(array)):
        if array[min_index] > array[j]:
            min_index = j
    array[i], array[min_index] = array[min_index], array[i]
    # 파이썬에서는 위와 같은 스왑 연산을 한 줄로 간단히 작성가능
print(array)