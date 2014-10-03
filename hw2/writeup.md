HW2
========

#####In Step 2, which refactoring pattern did you use to address the duplicate code in MainActivity and GameActivity?
I used pull up mehthod refactoring pattern to address the problem.


#####In Step 3, which two code smells (from the ones discussed in class) are exhibited by GameView via its use of separate ArrayLists to represent the x- and y-coordinates of the stroke points?
- Primitive obssession  
- Duplicate code  

#####In Step 6, where was the duplicate code that you refactored, and which refactoring pattern did you use?
- Constructor()
  - There are duplicate code for creating image. So I create a method to wrap these two statements. Instead of calling them twice, now only need to call the newly create method init().
- onTouchEvent()  
  - In the first two if(or if else), they are doing the same thing. Thus they could be merged into one.  

I used extract method refactoring pattern.  

#####In Step 10, which internal quality metric became better in the GameView class (or one of its methods)? Be sure to give "before" and "after" measurements.
The cohesion, measured by LCOM, within a method is better than before. In detail:  
Before:  
m = 13  
A = 22 / 13 = 1.7
LCOM = 0.94

After:  
m = 7  
A = 12 / 3 = 4 
LCOM = 0.5

The structural complexity(MCC) is lower than before. In detail:  
Before:  
Average MCC: 8 / 4 = 2   

After:  
Average MCC: 6 / 5 = 1.2


So after refactoring, the LCOM decreased, which indicate a improvement in cohesion of the methods and fields. Thus the refactoring increases understandability of the code.
And the MCC also decreased, which indicate a decrease in structural complexity. This will help improve the understandability of the code.

#####In Step 10, which internal quality metric became worse in the GameView class (or one of its methods)? Be sure to give "before" and "after" measurements.
Before:  
fan-in: 1  
fan-out: 1  
Instability: 0.5  

After:  
fan-in: 2  
fan-out: 3   
Instabilitiy: 0.6

After refactoring, the instability of the code increased.
