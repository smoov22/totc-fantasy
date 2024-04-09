import csv

def main():
    with open('signs.csv') as numbers:
        with open('conversions.csv') as replacements:
            leftside = []
            rightside = []
            i = 1
            for row in replacements:
                leftside.append(row[0])
                rightside.append(i)
                i = i + 1
            reader = csv.reader(numbers)
            for row in reader:
                i = 0
                for value in row:
                    row[i] = leftside[int(value) - 1]
                    i = i + 1
                print(row)

main()