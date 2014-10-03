HW2
========

#####In Step 2, which refactoring pattern did you use to address the duplicate code in MainActivity and GameActivity?



#####In Step 3, which two code smells (from the ones discussed in class) are exhibited by GameView via its use of separate ArrayLists to represent the x- and y-coordinates of the stroke points?
- Primitive type obssession

####In Step 6, where was the duplicate code that you refactored, and which refactoring pattern did you use?
- Constructor()
  - There are duplicate code for creating image. So I create a method to wrap these two statements. Instead of calling them twice, now only need to call the newly create method init().
- onTouchEvent()  
  - In the first two if(or if else), they are doing the same thing. Thus they could be merged into one.


#####In Step 10, which internal quality metric became better in the GameView class (or one of its methods)? Be sure to give "before" and "after" measurements.


#####In Step 10, which internal quality metric became worse in the GameView class (or one of its methods)? Be sure to give "before" and "after" measurements.
- reliability is lower
