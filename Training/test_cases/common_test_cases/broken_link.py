import requests
from bs4 import BeautifulSoup



def check_broken_url(url):
    page = url
    r = requests.get(page)
    data = r.text
    #print(data)
    soup = BeautifulSoup(data, 'lxml')
    urls = []
    for a in soup.find_all('a'):
        urls.append(a.get('href'))

    print(len(urls))
    print (urls)
    url_responses = {}
    for i in range(0,100):
        url = urls[i]
        print(i)
        if url is not None:
            if not url.endswith('#'):
                print(urls[i])
                temp_r = requests.get(url)
                print(temp_r)
                url_responses[url] = temp_r.status_code
    return url_responses


dict_url=check_broken_url("https://google.com")
print(dict_url)
