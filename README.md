# Tests

---
**Задания:**
* Task1 <br>
  Круговой массив - массив из элементов, в котором по достижению конца массива следующим
  элементом будет снова первый. Mассив задается числом n, то есть представляет собой числа от 1
  до n.
* Task2 <br>
  Напишите программу, которая рассчитывает положение точки относительно окружности.
* Task3 <br>
  Напишите программу, которая формирует файл report.json с заполненными полями value для
  структуры tests.json на основании values.json.
* Task4 <br>
  Дан массив целых чисел nums. Напишите программу, выводящую минимальное количество ходов,
  требуемых для приведения всех элементов к одному числу. За один ход можно уменьшить или
  увеличить число массива на 1.
---
**Реализованно:**
* Task1 <br>
  Расположение `src\task_1\Circle.java` <br>
  Пример вывода для параментов n = 5, m = 4 <br>
  `14253`


* Task2 <br>
  Расположение `src\task_2\Centre.java` <br>
  Пример вывода для круга с цетром в точке 1 1 и радиусом 5 <br>
  `[0.0, 0.0] точка внутри` <br>
  `[1.0, 6.0] точка лежит на окружности` <br>
  `[6.0, 6.0] точка снаружи` 


* Task3 <br>
  Расположение `src\task_3\Report.java` <br>
  Пример вывода <br>
  `C:\Users\79775\IdeaProjects\Testingreport.json` <br>
  `report created` <br>
  Содержимое файла <br>
  `{"report":[{"id":2,"title":"Smoke test","value":"passed"},{"id":41,"title":"Debug test","value":"passed"},{"values":[{"values":[{"values":[{"id":234,"title":"200","value":"passed"},{"id":653,"title":"300","value":"passed"}],"id":230,"title":"Percent","value":""}],"id":345,"title":"Maxperf","value":"passed"},{"values":[{"values":[{"id":238,"title":"160","value":"passed"},{"id":690,"title":"240","value":"failed"}],"id":261,"title":"Percent","value":""}],"id":110,"title":"Stability test","value":"failed"}],"id":73,"title":"Performance test","value":"passed"},{"values":[{"id":5321,"title":"Confidentiality","value":"passed"},{"id":5322,"title":"Integrity","value":"failed"}],"id":122,"title":"Security test","value":"failed"}]}` <br>
  Примечание <br>
  "values"  данных ставится на первое место. <br>
  Содержание одной строкой, для преобразование можно иссользовать [https://jsonformatter.curiousconcept.com/](https://jsonformatter.curiousconcept.com/)


* Task4 <br>
  Расположение `src\task_4\Quantity.java` <br>
  Пример вывода для массива [1, 10, 2, 9] <br>
  `16`
---
  