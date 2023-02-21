2. 
- Print "Enter employee salary"
- Input employeeSalary
- Print "Enter employee number of years with the company"
- Input employeeWorkingYears
- If employeeWorkingYears < 5 years 
  - Bonus value = employeeSalary x 2 / 100
  - Print "Congratulations ! Your bonus is" + $<bonus value>.
- Else
  - Bonus value = employeeSalary x 1 / 100
  - Print " Congratulations ! Your bonus is" + $<bonus value>.

4.
- Print "Enter how many sheets of paper is in the envelope"
- Input sheetsOfPaper
- If sheetsOfPaper > 0 and <= 5
  - Print "Please use 1 stamp for mailing"
- Else if sheetsOfPaper > 6 and <=10
  - Print "Please use 2 stamps for mailing"
- Else if sheetsOfPaper > 10 and <= 15
  - Print "Please use 3 stamps for mailing"
- Else
  - Print "Cannot mail the envelope"

5.
- Print "cell nucleus? (y/n)"
- Input cellNucleus
- If cellNucleus equals "n"
  - Print "Monera kingdom"
- Else
  - Print "single celled? (y/n)"
  - Input singleCelled
  - If singleCelled equals "y"
    - Print "Protoctista kingdom"
  - Else
    - Print "photosynthetic? (y/n)"
    - Input photosynthetic
    - If photosynthetic equals "y"
      - Print "Plantae kingdom"
    - Else
      - Print "nervous system? (y/n)"
      - Input nervousSystem
      - If nervousSystem equals "y"
        - Print "Animalia kingdom"
      - Else
        - Print "Fungi kingdom"
      
7.
- Print "Enter the material to calculate the speed of sound"
- Input material
- If material = "iron"
  - Print "the speed of sound is 5950 meters/sec"
- Else if material = "polystyrene"
  - Print "the speed of sound is 2350 meters/sec"
- Else if material = "water"
  - Print "the speed of sound is 1531 meters/sec"
- Else if material = "air"
  - Print "Enter the temperature in degree celsius"
  - Input temperatureCelsius
  - Print "The speed of sound is " + ( 331.5 + (0.6 x temperatureCelsius)) + " meters/sec"

9.
- Print "Enter the annual return value"
- Input annualReturn
- If annualReturn < -10
  - Print "The rate of return is indicative of a bear market (which occurs 10% of the time)."
- If annualReturn >= -10 and <= 10
  - Print "The rate of return is indicative of a stagnant market (which occurs 30% of the time)."
- If annualReturn > 10 to <= 30
  - Print "The rate of return is indicative of a bull market (which occurs 43% of the time)."
- If annualReturn > 30
  - Print "The rate of return is indicative of a boom market (which occurs 17% of the time)."

10.


