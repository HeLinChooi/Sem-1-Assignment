# Simple Search Engine
## UM Fundamental of Programming Course
## Project 2: Googol  
This search engine can only perform simple search based on certain keywords. 
>To try, go to GOOGOL.java file, run it and type "shop" into the search box 
> Below are copy of question, the program not necessarily works as below
#### Introduction
A search engine is a software system that is designed to carry out Internet search that craw the worldwide web and to allow users to search the index based on plain text query, i.e. textual web search keywords. For instance, Google, Bing, DuckDuckGo, Yandex and Baidu. Google itself, as one of the most popular search engines in the world, processes more than 5.6 billion queries per day on their search engine. Below are some example of information users ask Google everyday:

“Hey Google, what’s the weather like today?”
“1+1”
“Japanese restaurants nearby”
“Programming assignments to copy, Google”
“100USD in MYR”
“How to get a girlfriend?”
“y=x^2 graph”
“Roll a dice”
“Grab promo codes”
“Is Joker a good movie? imdb rating”

#### Problem Statement
You are required to develop a program that would imitate how Google works, and call it Googol. It should work without Internet.
The (minimum) specifications of Googol are as follows:
1.	Search engine
a.	Feature description: 
i.	Users should be able to perform search with keywords in the “search bar”. The search function of the program should return results in the form of a list of relevant websites (Based on Alexa’s Top 1 million sites).
ii.	Your program will need to perform web scrapping for the contents of at least the top 500 sites from the Alexa top 1 million sites to build up enough data, using the internet, for your search function to work later.
b.	You will be provided the csv file containing the Alexa’s top 1 million site.
2.	Calculator
a.	Feature description: Users should able to perform math calculations in the “search bar” and the program will return the result of the calculation.
3.	Currency Exchange
a.	Feature description: 
i.	Users should be able to convert the between different currencies. (i.e. 100 USD to MYR)
ii.	It should at least support all the currencies in South East Asia.
b.	The exchange rates can be static and stored in a separate file.
4.	Mini Game
a.	Feature description: 
i.	Users will be shown a mini game such as Tic Tac Toe when ‘Tic Tac Toe’ was searched. 
ii.	User will be able to play against the computer in the game of ‘Tic Tac Toe’.

#### Sample Input/Output
```
Welcome to Googol!
```
Input
```
s shopping
```
Output
```
Your Results: 
1. www.amazon.com
2. login.tmall.com
3. Aliexpress.com
```
Input
```
c 6-2(1 + (1*3))
```
Output
```
Your Results: 
6 – 2(1 + (1*3)) = -2
```
Input
```
x 100 USD to MYR
```
Output
```
Your Results: 
100 USD = 401.12 MYR
```

#### Additional Challenges
If you like some additional challenges for some additional bonus marks, maybe you can try…
1.	Having a GUI for the program?
1.	Have more games instead of ‘Tic Tac Toe’?
1.	New feature: Roll a dice
1.	New feature: Plotting polynomial graphs, e.g. y = x^2
1.	New feature: Binomial expansion?
1.	Smarter search? More powerful search (more than 500)? I’m feeling lucky! 
1.	Calculator UI?
1.	Any interesting features that is worth showing off in the public!!!

#### Credit to my teammates!
Thanks to Fahad, Yong Ming, Wei Hao and Srija for contributing to the project so we can have this wonderful search engine presented to our 
lecturer.  
There are calculator and translator built into this search engine.
The part I coded is the logic behind calculator and tic-tac-toc.    
Have Fun!

