'''
Formats Hot 100 text documents in various ways
'''
def format (filename): # puts Hot 100 entry onto a single line rather than across 4 lines
    with open(filename) as result:
        string=""
        i=0
        for row in result:
            row=row.strip()
            if i == 0:
                if string.isnumeric == False:
                    return "Dirty data!"
            if i == 7:
                i = 0
                string += "\n"
            if i == 0 or i == 2:
                string += row + "; "
            if i == 3:
                string += row
            i += 1
    return string

def remove_first_three_chars (filename): # removes first three characters from a row
    with open(filename) as result:
        string = ""
        for row in result:
            row=row.strip()
            string += row[3:] + "\n"
    return string

def main(): 
    output=format("hot100/9-3.txt") # changed week by week to represent the incoming file
    file = open("temp.txt", "w")
    file.write(output)





if __name__=="__main__":
    main()