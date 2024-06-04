import csv

def main():
    with open('signs.csv') as numbers:
        with open('conversions.csv') as replacements:
            with open('outputs.csv', 'w') as outputs:
                replacementlist = []
                write = csv.writer(outputs)
                read = csv.reader(numbers)
                read2 = csv.reader(replacements)
                for row in read2:
                    character = row[0]
                    replacementlist.append(character)
                for row in read:
                    message = "[FOUR "
                    dic = dict()
                    for i in range(1, len(row)):
                        character = int(row[i])
                        dic[character] = i
                    for i in range(1, len(row)):
                        character2 = dic.get(i)
                        replacement = replacementlist[character2 - 1]
                        print(replacement)
                        message = message + replacement
                    message = message + "]"
                    print(message)
                    write.writerow((row[0], message))

main()