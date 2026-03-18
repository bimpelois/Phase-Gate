import unittest
from level_5_function import *
class Testnew_number(unittest.TestCase):
    def test_new_number(self):
        expected=[10,11,12,-1,-1]     
        actual= new_number()
        self.assertEqual(expected,actual)    

    def test_two_number(self):
        expected=[10,11]
        actual=two_number()
        self.assertEqual(expected,actual)

    def test_negative_numbers(self):
        expected = [-1,-1,-1,-1]
        actual = negative_numbers()
        self.assertEqual(expected,actual)

