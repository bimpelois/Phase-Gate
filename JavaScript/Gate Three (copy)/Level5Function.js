function new_number():
    numbers = [10,11,12]
    new_list = [-1]*2
    numbers.extend(new_list)
    return numbers
result = new_number()
console.log (result)

function two_number():
    numbers = [10,11,12,13,14]
    numbers.pop(4)
    numbers.pop(3)
    numbers.pop(2)
    return numbers
result = two_number()
console.log (result)

function negative_numbers():
    numbers = []
    new_list = [-1]*4
    numbers.extend(new_list)
    return numbers
result = negative_numbers()
console.log (result)
