def selection_sort(array:list):
    for i in range(0,len(array)):
        for j in range(i+1, len(array)):
            if(array[i] > array[j]):
                temp_value = array[j]
                array[j] = array[i]
                array[i] = temp_value

a = [3,6,2,1,3,3]
print(a)
selection_sort(a)
print(a)

def selection_sort(array:list):
    for i in range(0,len(array)):
        new_min_index = i
        for j in range(i+1, len(array)):
            if(array[new_min_index] > array[j]):
                new_min_index = j
        temp_value = array[i]
        array[i] = array[new_min_index]
        array[new_min_index] = temp_value


a = [3,6,2,1,3,3]
print(a)
selection_sort(a)
print(a)