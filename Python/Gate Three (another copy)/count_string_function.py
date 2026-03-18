def count_string(size):
    result = ""
    count = 1

    for number in range (1,str(size)):

        if size[number]== size[number -1]:
            count == 1
        else:
            result += size[number -1] + str(count)
            count = 1
    result += size[-1] + str(count)
    return result
print(compress_string("AaaBBc"))
print(compress_string("EEEEnnnneee"))
print(compress_string("ooooooYOO"))

