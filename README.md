# web2.0CalculatorSelenium

Simple Selenium test suite of the calculator basic algorithmic functionality

#Tech Requirements:
 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test List

//basic arithmetic functions

1.	//Test 001 -> valid addition test with number input on numpad
2.	//Test 001a -> valid addition test with random number input
3.	//Test 002 -> valid subtraction test with number input on numpad
4.	//Test 002a -> valid subtraction test with random number input
5.	//Test 003 -> valid multiplication test with number input on numpad
6.	//Test 003a -> valid multiplication test with random number input
7.	//Test 004 -> valid division test with number input on numpad
8.	//Test 004a -> valid division test with random number input

//negative number test scenarios (add, subtract, multiply, divide)

1.	//Test 005 -> valid negative number addition test with number input on numpad
2.	//Test 005a -> valid negative number addition test with random number input
3.	//Test 006 -> valid negative number subtraction test with number input on numpad
4.	//Test 006a -> valid negative number subtraction test with random number input
5.	//Test 007 -> valid negative number multiplication test with number input on numpad
6.	//Test 007a -> valid negative number multiplication test with random number input
7.	//Test 008 -> valid negative number division test with number input on numpad
8.	//Test 008a -> valid negative number division test with random number input
9.	//Test 009 -> invalid division test (by zero) with number input on numpad

//Advanced arithmetic tests

1.	//Test 010 -> find logarithm (to base 10) of a set number test (with numpad input)
2.	//Test 010a -> find logarithm (to base 10) of a set number test (with random number)
3.	//Test 011 -> raise ten to the power of input number test (with numpad input)
4.	//Test 011a -> raise ten to the power of input number test (with random number)
5.	//Test 012 -> raise input number to the power of two test (with numpad input)
6.	//Test 012a -> raise input number to the power of two test (with random number)
7.	//Test 013 -> calculate square root of input number test (with numpad input)
8.	//Test 013a -> calculate square root of input number test (with random number)
9.	//Test 014 -> calculate cube root of input number test (with numpad input)
10.	//Test 014a -> calculate cube root of input number test (with random number)
11.	//Test 015 -> raise input number to the power of three test (with numpad input)
12.	//Test 015a -> raise input number to the power of three test (with random number)
13.	//Test 016 -> calculate y-th root of input number test (with numpad input)
14.	//Test 016a -> calculate y-th root of input number test (with random number)
15.	//Test 017 -> raise input number to the power of Y test (with numpad input)
16.	//Test 017a -> raise input number to the power of Y test (with random number)
17.	//Test 018 -> calculate logarithm input number to base e test (with numpad input)
18.	//Test 018a -> calculate logarithm input number to base e test (with random number)
19.	//Test 019 -> exponential function of the input number test (with numpad input)
20.	//Test 019a -> exponential function of the input number test (with random number)
21.	//Test 020 -> calculate logarithm of the input number to base two test (with numpad input)
22.	//Test 020a -> calculate logarithm input number to base e test (with random number)
23.	//Test 021 -> two to the power of the input number test (with numpad input)
24.	//Test 021a -> two to the power of the input number test (with random number)

//advanced arithmetic negative number input tests

1.	//Test 022 -> find logarithm (to base 10) of a set negative number test (with numpad input) (invalid test scenario)
2.	//Test 022a -> find logarithm (to base 10) of a set negative number test (with random number) (invalid test scenario)
3.	//Test 023 -> raise ten to the power of input negative number test (with numpad input)
4.	//Test 023a -> raise ten to the power of input negative number test (with random number)
5.	//Test 024 -> raise input negative number to the power of two test (with numpad input)
6.	//Test 024a -> raise input negative number to the power of two test (with random number)
7.	//Test 025 -> calculate square root of input negative number test (with numpad input) (imaginary-complex number)
8.	//Test 025a -> calculate square root of input negative number test (with random negative number) (imaginary-complex number)
9.	//Test 026 -> calculate cube root of input negative number test (with numpad input)
10.	//Test 026a -> calculate cube root of input negative number test (with random negative number)
11.	//Test 027 -> raise input negative number to the power of three test (with numpad input)
12.	//Test 027a -> raise input negative number to the power of three test (with random number)
13.	//Test 028 -> calculate y-th root of input negative number test (with numpad input) (invalid operation  -> y = 4)
14.	//Test 028a -> calculate y-th root of input negative number test (with random negative number) (invalid operation  -> y = 4)
15.	//Test 029 -> raise input negative number to the power of Y test (with numpad input)
16.	//Test 029a -> raise input negative number to the power of Y test (with random number)
17.	//Test 030 -> calculate logarithm input negative number to base e test (with numpad input) (invalid operation)
18.	//Test 030a -> calculate logarithm input negative number to base e test (with random number) (invalid operation)
19.	//Test 031 -> exponential function of the input negative number test (with numpad input)
20.	//Test 031a -> exponential function of the input negative number test (with random negative number)
21.	//Test 032 -> calculate logarithm of the input negative number to base two test (with numpad input) (invalid operation)
22.	//Test 032a -> calculate logarithm input number to base e test (with random negative number) (invalid operation)
23.	//Test 033 -> two to the power of the input negative number test (with numpad input)
24.	//Test 033a -> two to the power of the input negative number test (with random number)

//Trigonometric functions tests

1.	//Test 034 -> calculate sine of a set number test (with numpad input)
2.	//Test 034a -> calculate sine of a random generated input number test (with random number generated input)
3.	//Test 035 -> calculate hyperbolic sine of a set number test (with numpad input)
4.	//Test 035a -> calculate hyperbolic sine of a random generated input number test (with random number generated input)
5.	//Test 036 -> calculate cosine of a set number test (with numpad input)
6.	//Test 036a -> calculate cosine e of a random generated input number test (with random number generated input)
7.	//Test 037 -> calculate hyperbolic cosine of a set number test (with numpad input)
8.	//Test 037a -> calculate hyperbolic cosine of a random generated input number test (with random number generated input)
9.	//Test 038 -> calculate tangent of a set number test (with numpad input)
10.	//Test 038a -> calculate tangent of a random generated input number test (with random number generated input)
11.	//Test 039 -> calculate hyperbolic tangent of a set number test (with numpad input)
12.	//Test 039a -> calculate hyperbolic tangent of a random generated input number test (with random number generated input)
13.	//Test 040 -> calculate cotangent of a set number test (with numpad input)
14.	//Test 040a -> calculate cotangent of a random generated input number test (with random number generated input)
15.	//Test 041 -> calculate secant of a set number test (with numpad input)
16.	//Test 041a -> calculate secant of a random generated input number test (with random number generated input)
17.	//Test 042 -> calculate co secant of a set number test (with numpad input)
18.	//Test 043 -> calculate combination (nCr) of a set number test (with numpad input)
19.	//Test 043a -> calculate combination (nCr) of a random generated input number test (with random number generated input)
20.	//Test 044 -> calculate permutations (nPr) of a set number test (with numpad input)
21.	//Test 044a -> calculate permutations (nPr) of a random generated input number test (with random number generated input)
22.	//Test 045 -> calculate percentage equivalent of a set number test (with numpad input)
23.	//Test 045a -> calculate percentage equivalent of a random generated input number test (with random number generated input)
24.	//Test 046 -> calculate sine of a set negative number test (with numpad input)
25.	//Test 046a -> calculate sine of a random generated input negative number test (with random negative number generated input)
26.	//Test 047 -> calculate hyperbolic sine of a set negative number test (with numpad input)
27.	//Test 047a -> calculate hyperbolic sine of a random generated input negative number test (with random negative number generated input)
28.	//Test 048 -> calculate cosine of a set negative number test (with numpad input)
29.	//Test 048a -> calculate cosine e of a random generated input negative number test (with random number generated input)
30.	//Test 049 -> calculate hyperbolic cosine of a set negative number test (with numpad input)
31.	//Test 049a -> calculate hyperbolic cosine of a random generated negative input number test (with random negative number generated input)
32.	//Test 050 -> calculate tangent of a set negative number test (with numpad input)
33.	//Test 050a -> calculate tangent of a random generated negative input number test (with random negative number generated input)
34.	//Test 051 -> calculate hyperbolic tangent of a set negative number test (with numpad input)
35.	//Test 051a -> calculate hyperbolic tangent of a random generated input negative number test (with random negative number generated input)
36.	//Test 052 -> calculate cotangent of a set negative number test (with numpad input)
37.	//Test 052a -> calculate cotangent of a random generated input negative number test (with random negative number generated input)
38.	//Test 053 -> calculate secant of a set negative number test (with numpad input)
39.	//Test 053a -> calculate secant of a random generated input number test (with random number generated input)
40.	//Test 054 -> calculate co secant of a set negative number test (with numpad input)
41.	//Test 054a -> calculate co secant of a random generated input negative number test (with random negative number generated input)
42.	//Test 055 -> calculate combination (nCr) of a set negative numbers test (with numpad input) (invalid scenario)
43.	//Test 055a -> calculate combination (nCr) of a random generated input negative numbers test (with random numbers generated input) (invalid scenario)
44.	//Test 056 -> calculate permutations (nPr) of a set negative numbers test (with numpad input) (invalid operation)
45.	//Test 056a -> calculate permutations (nPr) of a random generated input negative numbers test (with random negative number generated input) (invalid operation)
46.	//Test 057 -> calculate percentage equivalent of a set negative number test (with numpad input)
47.	//Test 057a -> calculate percentage equivalent of a random generated negative input number test (with random negative generated number input)

// supplementrary functions test

1.	//Test 058 -> calculate variable equation of a set number test (with numpad input)
2.	//Test 058a -> calculate variable equation of a random generated input number test (with random generated number input)
3.	//Test 059 -> calculate Euler's number of a set number test (with numpad input)
4.	//Test 059a -> calculate Euler's number of a random generated input number test (with random generated number input)
5.	//Test 059b -> calculate input number multiplied by imaginary unit test (with numpad input)
6.	//Test 059c -> calculate random generated input number multiplied by imaginary unit test (with random generated number input)
7.	//Test 060 -> calculate pi constant multiplication by a set number test (with numpad input)
8.	//Test 060a -> calculate random generated input number division by pi constant test (with random generated number input)
9.	//Test 060b -> calculate Faraday constant multiplication by a set number test (with numpad input)
10.	//Test 060c -> calculate random generated input number division by Faraday constant test (with random generated number input)
11.	//Test 061 -> calculate scientific notation of a set number test (with numpad input)
12.	//Test 061a -> calculate scientific notation of a set input number test (with random generated number input)
13.	//Test 062 -> calculate variable equation of a set negative number test (with numpad input)
14.	//Test 062a -> calculate variable equation of a random generated input number test (with random generated number input)
15.	//Test 063 -> calculate Euler's number of a set negative number test (with numpad input)
16.	//Test 063a -> calculate Euler's number of a random generated input negative number test (with random generated number input)
17.	//Test 063b -> calculate set negative number division by imaginary unit test (with numpad input)
18.	//Test 063c -> calculate random generated input negative number multiplication by imaginary unit test (with random generated number input)
19.	//Test 064 -> calculate pi constant multiplication by a set negative number test (with numpad input)
20.	//Test 064a -> calculate random generated negative input number division by pi constant test (with random generated negative number input)
21.	//Test 064b -> calculate faraday constant multiplication by a set negative number test (with numpad input)
22.	//Test 064c -> calculate random generated negative input number division by Faraday constant test (with random generated negative number input)
23.	//Test 065 -> calculate scientific notation of a set number test (with numpad input)
24.	//Test 065a -> calculate scientific notation of a set negative input number est (with random generated negative number input)

// additional trigonometric functions test

1.	//Test 066 -> calculate arc sine of a set number test (with numpad input)
2.	//Test 066a -> calculate arc sine of a random generated input number test (with random number generated input)
3.	//Test 067 -> calculate arc hyperbolic sine of a set number test (with numpad input)
4.	//Test 067a -> calculate arc hyperbolic sine of a random generated input number test (with random number generated input)
5.	//Test 068 -> calculate arc cosine of a set number test (with numpad input)
6.	//Test 068a -> calculate arc cosine of a random generated input number test (with random number generated input)
7.	//Test 069 -> calculate arc hyperbolic cosine of a set number test (with numpad input)
8.	//Test 069a -> calculate arc hyperbolic cosine of a random generated input number test (with random number generated input) 
9.	//Test 070 -> calculate arc tangent of a set number test (with numpad input)
10.	//Test 070a -> calculate arc tangent of a random generated input number test (with random number generated input)
11.	//Test 071 -> calculate arc hyperbolic tangent of a set number test (with numpad input)
12.	//Test 071a -> calculate arc hyperbolic tangent of a random generated input number test (with random number generated input)
13.	//Test 072 -> calculate arc cotangent of a set number test (with numpad input)
14.	//Test 072a -> calculate arc cotangent of a random generated input number test (with random number generated input)
15.	//Test 073 -> calculate arc secant of a set number test (with numpad input) 
16.	//Test 073a -> calculate arc secant of a random generated input number test (with random number generated input)
17.	//Test 074 -> calculate arc co secant of a set number test (with numpad input)
18.	//Test 074a -> calculate arc co secant of a random generated input number test (with random number generated input)
19.	//Test 075 -> calculate arc sine of a set negative number test (with numpad input)
20.	//Test 075a -> calculate arc sine of a random generated input negative number test (with random negative number generated input)
21.	//Test 076 -> calculate arc hyperbolic sine of a set negative number test (with numpad input)
22.	//Test 076a -> calculate arc hyperbolic sine of a random generated negative input number test (with random negative number generated input)
23.	//Test 077 -> calculate arc cosine of a set negative number test (with numpad input)
24.	//Test 077a -> calculate arc cosine of a random generated input negative number test (with random number generated input)
25.	//Test 078 -> calculate arc hyperbolic cosine of a set negative number test (with numpad input) (invalid test scenario)
26.	//Test 078a -> calculate arc hyperbolic cosine of a random generated negative input number test (with random negative number generated input) (invalid test scenario)
27.	//Test 079 -> calculate arc tangent of a set negative number test (with numpad input)
28.	//Test 079a -> calculate arc tangent of a random generated negative input number test (with random negative generated number)
29.	//Test 080 -> calculate arc hyperbolic tangent of a set negative number test (with numpad input)
30.	//Test 080a -> calculate arc hyperbolic tangent of a random generated negative input number test (with random negative number generated input)
31.	//Test 081 -> calculate arc cotangent of a set negative number test (with numpad input)
32.	//Test 081a -> calculate arc cotangent of a random generated negative input number test (with random generated negative number)
33.	//Test 082 -> calculate arc secant of a set negative number test (with numpad input)
34.	//Test 082a -> calculate arc secant of a random generated negative input number test (with random negative number generated) 
35.	//Test 083 -> calculate arc co secant of a set negative number test (with numpad input)
36.	//Test 083a -> calculate arc co secant of a random generated negative input number test (with random generated negative number)









