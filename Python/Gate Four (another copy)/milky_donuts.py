def count_evens(numbers):
    count = 0

    for num in numbers:
        if num % 2 == 0:
            count += 1

    return count


numbers = [2, 5, 8, 11, 14, 7]
result = count_evens(numbers)
print("Even numbers count:", result)


def linear_search(numbers, target):

    for counter in range(len(numbers)):
        if numbers[counter] == target:
            return counter  

    return -1 


numbers = [4, 7, 9, 2, 5]

result = linear_search(numbers, 9)
print("counter:", result)


def squares(number):
    result = []

    for index in range(1, number + 1):
        result.append(index * index)

    return result

output = squares(5)
print(output)


def flatten_numbers(matrix):
    result = []

    for row in matrix:
        for value in row:
            result.append(value)

    return result

matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

output = flatten_numbers(matrix)
print(output)
