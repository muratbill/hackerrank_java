Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, , of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

**Input Format**

The first line consists of a single integer, , denoting the number of integer strings.
Each line  of the  subsequent lines contains a real number denoting the value of .

**Constraints**

1 <= n <= 200
Each Si has at most 300 digits

**Sample Input**
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

**Sample Output:**
90
56.6
50
02.34
0.12
.12
0
000.000
-100

**Solution**

In the main method, we define an array numbers containing real number strings in the desired order.
We then use Arrays.sort() to sort the array numbers using a custom comparator BigDecimalComparator that we define later in the code.
Finally, we print the sorted array to the console.

We define a static nested class BigDecimalComparator that implements the Comparator<String> interface, indicating that it can compare strings.
The compare method is overridden to define the custom comparison logic.
We handle zero-padded strings as equivalent numerically by using regular expressions to remove leading zeros from the strings s1 and s2.
We then convert the modified strings to BigDecimal objects bd1 and bd2 for numerical comparison.
Finally, we compare the BigDecimal objects in descending order using compareTo() and return the result.
When the code is executed, it sorts the numbers array in descending order based on numerical values while preserving the original format of the strings, as specified in the requirements.
