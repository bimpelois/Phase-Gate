import unittest
from level_5_functs import *
class Testis_prime(unittest.TestCase):

    def test_is_prime(self):
        input_data = [5,9,3,6,2]
        expected = [5,3]

        actual = get_sorted_primes(input_data)

        self.assertEqual(expected, actual)

    def test_replace_non_squares(self):
        input_data = [4, 7, 9, 10, 49, 6]
        expected = [4, -1, 9, -1, 49, -1]

        actual = replace_non_squares(input_data)

        self.assertEqual(expected, actual)

    def replace_negative_integers(self):

        input_data = [5, -9, 3, -6, 2, -1]
        expected = [5,0,3,0,2,0]
        actual = replace_negative_integers(input_data)
        
        self.assertEqual(expected, actual)


    def zeros_at_the_end(self):

        input_data = [5,0,3,0,2,0]
        expected = [5,3,2,0,0,0]
        actual = zeros_at_the_end(input_data)
        
        self.assertEqual(expected, actual)


    def its_palindrome(self):

        input_data = [45,0,8,0,45]
        expected = true
        actual = its_palindrome(input_data)
        
        self.assertEqual(expected, actual)
