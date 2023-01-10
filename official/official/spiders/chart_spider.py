import scrapy

class ChartSpider (scrapy.Spider):
    name = "charts"

    def start_requests(self):
        urls = ""