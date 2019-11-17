import pytest
import requests
#from bs4 import BeautifulSoup
import os
import unittest
from .Calculator import Calculator
#from selenium import webdriver

os.environ['URL'] = "https://google.co.in"
url=os.environ['URL']

@pytest.fixture(scope = 'module')
def global_data():
    os.environ['URL'] = "https://google.co.in"
    url = os.environ['URL']
    return {'url_val': url}

def test_if_page_is_accessible(global_data):
    print(global_data['url_val'])
    url=global_data['url_val']
    t=requests.get(url)
    print(t.status_code)
    assert t.status_code == 200

def test_for_correct_headers(global_data):
    url = global_data['url_val']
    response = requests.get(url)
    content_type= response.headers.get('Content-Type')
    if 'text/html' not in content_type:
        assert False
    else:
        pass


def test_add():
    calculator = Calculator()
    assert 4 == calculator.add(2, 2)
    assert 3.2 == calculator.add(1, 2.2)


def test_minus():
    calculator = Calculator()
    assert 2== calculator.minus(3, 1)


def test_multiple():
    calculator = Calculator()
    assert 12 == calculator.multiple(3, 4)


def test_divide():
    calculator = Calculator()
    assert 4 == calculator.devide(9, 3)









