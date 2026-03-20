#def is_prime(num):
#    if num <= 1:
#        return False
#
#    for i in range(2, int(num ** 0.5) + 1):
#        if num % i == 0:
#            return False
#    return True
#
#
#def get_sorted_primes(arr):
#    primes = []
#
#    for num in arr:
#        if is_prime(num):
#            primes.append(num)
#
#       primes.sort(reverse=True)
#
#    return primes
#
#
#numbers = [5, 9, 3, 6, 2]
#result = get_sorted_primes(numbers)
#
#print(result)
#


def replace_negative_integers(arrays):

    for nums in range(len(arrays)):
        if arrays[nums] < 0:
            arrays[nums] = 0

    return arrays


numbers = [5, -9, 3, -6, 2, -1]
result = replace_negative_integers(numbers)

print(result) 




def zeros_at_the_end(array):

    zero_count = array.count(0)

      while 0 in array:
        array.remove(0)

    for nums in range(zero_count):
        array.append(0)

    return array

numbers = [5, 0, 3, 0, 2, 0]
result = zeros_at_the_end(numbers)

print(result)  



def its_palindrome(array):

    start = 0
    end = len(array) - 1

    while start < end:
        if array[start] != array[end]:
            return False
        start += 1
        end -= 1

    return True

numbers = [45, 0, 8, 0, 45]
result = its_palindrome(numbers)

print(result) 




def replace_non_squares(arraya):

    result = []

    for num in array:
        root = int(num ** 0.5)

        if root * root == num:
            result.append(num)
        else:
            result.append(-1)

    return result

numbers = [4, 7, 9, 10, 49, 6]
result = replace_non_squares(numbers)

print(result)
