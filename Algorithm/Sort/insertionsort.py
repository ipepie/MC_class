array = [5,1,8,3,0,4,6,2,7,9]
# 맨처음 원소. 인덱스 0의 원소는 정렬되어있다고 생각하고 출발해서 range가 1부터
for i in range(1,len(array)): 
    for j in range(i,0,-1): #i부터 1까지 1씩 감소하며반복
        if array[j] < array[j-1]: # 한 칸씩 왼쪽으로 이동
            array[j], array[j-1] = array[j-1], array[j]
        else: # 자기보다 작은 데이터를 만나면 해당 위치에서 멈춤
            break
print(array)