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
        
        newoptions = list()
        for item in sorted:
            if sorted.get(item) == 1:
                newoptions.append(item)
        
        for item in newoptions:
            print(item)
        
        recurser(newoptions, sorted)

        for item in sorted:
            print(item + " : " + str(sorted.get(item)))
        
def recurser(lister, sorted):
    returnable = dict()
    random.shuffle(lister)
    i = 0
    while i < len(lister)-1:
        option1 = lister[i]
        option2 = lister[i + 1]
        answer = input("Which do you prefer? 1 for " + option1 + " or 2 for " + option2)
        if (answer == "1"):
            sorted.update({option1:sorted.get(option1) +1})
            returnable.update({option1:sorted.get(option1) +1})
        if (answer == "2"):
            sorted.update({option2:sorted.get(option2) +1})
            returnable.update({option2:sorted.get(option2) +1})
        i = i + 2
    if len(lister) % 2 != 0:
        returnable.update ({lister[len(lister) - 1]:sorted.get(lister[len(lister) - 1])})
    recurse = False
    for item in returnable:
        value = returnable.get(item)
        for item2 in returnable:
            if (returnable.get(item2) == value and item != item2):
                recurse = True
    if recurse == False:
        return sorted
    else:
        redo = list()
        for item in returnable:
            redo.append(item)
        recurser(redo, sorted)

def main():
    text = input('Enter filename: ')
    sorter(text)

main()