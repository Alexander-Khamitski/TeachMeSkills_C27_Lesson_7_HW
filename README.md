# TeachMeSkills_C27_Lesson_7_HW
Homework for the seventh lesson

1. **Task #1**

"IPosition" interface contains getPosition() and getPositionId methods.

"BaseEmployee" has been created to describe an entity of abstract employee. Class contains 4 fields, 
and implements 2 methods from "IPosition" interface.

Classes "Accountant", "Director", "Worker" have been created to describe an entity of each employee 
and extends "BaseEmployee" class.

"Runner" class contains:
- logic to create some employees;
- getPosition(BaseEmployee[] employees) method;
- getPositionById(BaseEmployee[] employees) method with some simple assertions.

2. **Task #2**

"ISquare" interface contains getPerimeter() and getSquare() methods.

"BaseFigure" has been created to describe an entity of abstract figure. Class contains 2 fields and implements 2 methods  
from "ISquare" interface.

Classes "Circle", "Rectangle", "Triangle" have been created to describe an entity of each figure. Constructor of each 
class contains simple assertions if figure exists or not. 

"Runner" class contains:
- logic to create some figures;
- getFigureInfo(BaseFigure[] baseFigures) method which provide perimeter and square of figure;
- getSumOfAllPerimeters(BaseFigure[] baseFigures) method which provide sum of all perimeters of figures;
