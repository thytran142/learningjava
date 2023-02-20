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
  - numberOfStamps = 1 
  - Print "Please use 1 stamp for mailing"
- Else if sheetsOfPaper > 6 and <=10
  - numberOfStamps = 2
  - Print "Please use 2 stamps for mailing"
- Else if sheetsOfPaper > 10 and <= 15
  - numberOfStamps = 3
  - Print "Please use 3 stamps for mailing"
- Else
  - Print "Cannot mail the envelope"

5.
- Print "cell nucleus? (y/n)"
- input cellNucleus
- If cellNucleus equals "n"
  - print "Monera kingdom"
- Else
  - print "single celled? (y/n)"
  - input singleCelled
  - if singleCelled equals "y"
    - print "Protoctista kingdom"
  - Else
    - print "photosynthetic? (y/n)"
    - input photosynthetic
    - if photosynthetic equals "y"
      - print "Plantae kingdom"
    - Else
      - print "nervous system? (y/n)"
      - input nervousSystem
      - if nervousSystem equals "y"
        - print "Animalia kingdom"
      - Else
        - print "Fungi kingdom"
      



