# SDET Assessment

**General Instructions**

1. Plan to spend about 2 hours completing this exercise.
2. Please document any assumptions made.
3. This is a real world exercise. You may use libraries and frameworks as you see fit. Solutions found by Google Search or on Stack Overflow are acceptable – as long as you understand them.
4. You do not need to connect to a real, online dictionary. The idea is to create a mock object to simulate this.
5. Please send your solution as a zip file or send a link to your private GitHub repository, so that we can evaluate your work.

**The Problem**

Using Java, find all of the English words in a given String. For example, if you are given the word WORKING, you can easily find WORK and KING, but ROW, RING and KNOW are also in there. You have access to a utility class called Dictionary, which has one method, isEnglishWord(String word). Dictionary.isEnglishWord(String word) connects to a (mocked) online dictionary and returns Boolean true if the String passed to it is an English word, return false otherwise.

Instructions
1. Use Maven to create a project to answer this problem.
2. You will need to create the Dictionary class.
3. You will need to mock Dictionary.isEnglishWord(String word) for your solution and tests.
4. The output of your primary method should be a collection of Strings without duplicates.
5. Create tests that exercise your class and methods.
6. Please complete the instructions to the best of your ability and understanding and come prepared to discuss the design decisions you chose.

**Assumptions**

Since letters are part of the mocked dictionary, they will also be part of the list with the possible combinations of a given string in case the string has them. A true value will be returned if a letter alone is evaluated against isEnglishWord method .
