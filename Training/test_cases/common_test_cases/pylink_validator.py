from pylinkvalidator.api import crawl

crawled_site = crawl("http://www.google.com/")
print (crawled_site)

number_of_crawled_pages = len(crawled_site.pages)
number_of_errors = len(crawled_site.error_pages)

print (number_of_errors)
print(crawled_site)