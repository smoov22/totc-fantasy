import random
def sorter (filename):
    with open(filename) as result:
        options = list()
        for row in result:
            options.append(row)
        random.shuffle(options)
        sorted = dict()
        i = 0
        while i < len(options)-1:
            option1 = options[i]
            option2 = options[i + 1]
            answer = input("Which do you prefer? 1 for " + option1 + " or 2 for " + option2)
            if (answer == "1"):
                sorted.update({option1:1})
                sorted.update({option2:-1})
            if (answer == "2"):
                sorted.update({option1:-1})
                sorted.update({option2:1})
            i = i + 2
        if len(options) % 2 != 0:
            sorted.update ({options[len(options) - 1]:0})
        
        for item in sorted:
            print(item + " : " + str(sorted.get(item)))
        
        # recursive preference sort of all the -1's
         
        
        

def main():
    text = input('Enter filename: ')
    sorter(text)

main()