# totc-fantasy

This repository is where I am hosting an updater for a "fantasy league" for music artists in the Discord server Talk of the Charts, which can be found here: https://discord.gg/2FyxhN7vuv

The league works as follows: At the beginning of the year, everyone involved picked 5 artists, and these artists are added to their roster. If 2 people have an artist on their roster, their points are divided in half for both players who picked them. This continues upwards as high as a 9-way split in this year in particular.

Each week the Billboard Hot 100 is released, a Python script (labeled year_end.py as I originally used it to format the Year End Hot 100) turns the manually filtered data - Placement, Song Title, Artist, and Past Placements, in that order - into a readable list, which is then taken in by the Java updater via Jython. (The data comes from a OCR browser extension scanning a PDF printout of the chart, and I remove any additional lines and mistakes in the process) A Map is created of every artist's points to be distributed for the week. Meanwhile, an export of every player involved is re-imported with their current points, with them each receiving their points for the week and seeing a message as to how many points they gained that week. The export is rereleased with the standings updated.

I may add functionality in the future, in essence allowing anyone to act as somewhat a "league manager" without manually importing every artist and player with multipliers. For now, the current way the league is run can be seen in the spreadsheet. 


NOTE: Songs and artists in the /hot100 folder and temp.txt may contain explicit language.
