import unittest
from milky_donuts import *
class Testcount_evens(unittest.TestCase):

    def test_count_evens(self):

        numbers = [2, 5, 8, 11, 14, 7]
        expected= 3
        actual = count_evens(numbers)
        self.assertEqual(expected, actual)



    def test_linear_search(self):

        numbers = [4, 7, 9, 2, 5]
        expected= 2
        actual = linear_search(numbers, 9)
        self.assertEqual(expected, actual) 

     
    
    def test_squares(self):

        expected= [1, 4, 9, 16, 25]
        actual = squares(5)
        self.assertEqual(expected, actual) 


    def test_flatten_numbers(self):
        matrix = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

        expected= [1,2,3,4,5,6,7,8,9]
        actual = flatten_numbers(matrix)
        self.assertEqual(expected, actual) 

