Implement java (Java 1.6) application that reads the attached text data file line by line. The application should take 3 first characters (using substring() method) of every line and put all the 3-character lines to ArrayList.
Analyze memory consumption.
Collect heap dump (when the file has been read and ArrayList is fully populated but the application is still running).
Identify memory leak if any.
Fix memory leak if any.

Results of the task:

- Java source code (with/without memory leak)
- Leak suspect report (from Eclipse MAT)
- Your findings about the memory problem

# Conclusion

Although MAT report suspects a problem seems like it is ok, because it is exactly what the programm does - stores all values in main thread. So there are no issues with a memory in this case.
The only case to reproduces a memory leak in that primitive programm is to use Java 6 (as required in task). The known issue with substring method exists which can lead to leaks of memory was fixes in Java 7 update 6. I believe it's better to know about it rather than find and download so old school SDK. Regarding to that task and given data set as well a method intern() could save general memory consummation due to line are the same. But in general case it doesn't, so was not used.

As I understood it's not so easy to reproduce memory leak in modern Java version and especially in such simply application.
