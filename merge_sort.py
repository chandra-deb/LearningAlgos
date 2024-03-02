import random


def merge_sort(array:list) -> None:
    array_length = len(array)

    if(array_length < 2):
        return
    
    mid_point = array_length // 2

    left_half = array[:mid_point]
    right_half = array[mid_point:]

    merge_sort(left_half)
    merge_sort(right_half)
    
    left_size = len(left_half)
    right_size = len(right_half)
    i,j,k = 0,0,0

    while(i < left_size  and j < right_size):
        if(left_half[i] < right_half[j]):
            array[k] = left_half[i]
            i += 1
        else:
            array[k] = right_half[j]
            j += 1

        k += 1
    
    while(i < left_size):
        array[k] = left_half[i]
        i += 1
        k += 1
    
    while (j < left_size):
        array[k] = right_half[j]
        j += 1
        k += 1


    

array = [random.randint(0,1000000) for _ in range(10000000)]




merge_sort(array)
        
