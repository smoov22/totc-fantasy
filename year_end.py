from typing import Text


def format (filename):
    with open(filename) as result:
        string=""
        i=0
        for row in result:
            row=row.strip()
            if i == 4:
                i = 0
                string += "\n"
            if i != 3:
                string += row + " "
            i += 1
    return string

def remove_first_three_chars (filename):
    with open(filename) as result:
        string = ""
        for row in result:
            row=row.strip()
            string += row[3:] + "\n"
    return string

def main():
    output=format("3-8.txt")
    print(output)



if __name__=="__main__":
    main()