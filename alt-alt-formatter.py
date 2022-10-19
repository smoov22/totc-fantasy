import billboard

def main():
    chart = billboard.ChartData('hot-100')
    output = ""
    for number in range(100):
        song = chart[number]
        output+= str(number + 1) + "; " + song.title + "; " + song.artist + "\n"
    
    file = open("temp.txt", "w")
    file.write(output)

if __name__=="__main__":
    main()

