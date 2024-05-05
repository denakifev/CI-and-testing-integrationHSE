# Тз 2 технологии программирования
[![Tests status](https://github.com/denakifev/CI-and-testing-integrationHSE/actions/workflows/ci.yaml/badge.svg?event=push)](https://github.com/denakifev/CI-and-testing-integrationHSE/actions/workflows/ci.yaml)
## 1. Чтение из файла и работа функций
Все функции устроены одинаково: Пусть к файлу передается аргументом для каждой функции (В репозитории есть конкретные обращения (в классе unit- и нагрузочного тестирования).
Там передаются ссылки на файлы тестов, которые лежат в директории *samples*. Там же лежат результаты всех тестов и информация о входных данных(*samples/res.txt*) и информация о скорости работы для тестов 4 - 10.(*samples/teststimeresult.txt*)
## 2. Тестирование функций
Unit тесты лежат в файле *src/test/java/operations/operationsTest.java* Для избежания переполнения типа при произведении чисел тесты были проведены для только для файлов, количества чисел в которых
не больше 10. Тестирование можно запустить как непросредственно из файла, так и из интерфейса github actions(см. инструкцию ниже)
## 3. Нагрузочное тестирования
Тестирование производилось для функции *_min*. Класс тестирование лежит в *src/main/java/Benchmarks.java*. Тесты были последовательно запущены для файлов */samples/test{4-10}.txt*, среднее время работы отражено в *samples/teststimeresult.txt*
## 4. Собственное тестирование
Я решил провести сценарное тестирование для сценария: *Посчитать оптимум для массива* (среднее между максимумом и минимумом). За данное сценарное тестирование отвечает 
метод *_optimum* в классе тестирования *src/test/java/operationsTest.java*. Подсчет оптимума был реализован для тестов 1 - 3.
## 5. График зависимости времени работы функции *_min* от количества чисел в файле
График был построен с помощью библеотеки matplotlib языка python. Используя результаты пункта 3 в файле *time_graph.png* отражена искомая зависимость. Как и ожидалось график представляет из себя прямую. Оси подписаны, обратите внимание что по оси *x* единицы измерения количества чисел - миллионы,
по оси *y* секунды 
## 6. СI integration 
Для CI системы был выбран github actions. Реализована возможность ручного прогона тестов для выбранного коммита. Для этого:
1. Перейти во вкладку actions
2. Выбрать интересующий коммит и кликнуть на него 
3. В левой части экрана будет список *jobs* где можно видеть сборку
4. Навести курсор на сборку, отобразится значок 
5. Нажать на него, затем нажать *re-run jobs*
6. Сборка будет пересобрана и запустится прогон тестов
7. Для просмотра лога сборки кликните на сборку(Находится в списке jobs)

## 7. Настройка СI
Реализована возможность автоматического прогона сборки и тестов при кажжом новом коммите и пулл реквесте. Чтобы увидеть статус после нового коммита или пул реквеста нужно: 
1. Нажать на флажок рядом с именем владельца репозитория и последнем коммитом
2. Для быстрого понимания статуса можно ориентироваться по значку
   - Синяя галочка - сборка прошла успешно, все тесты пройдены
   - Желтый кружочек - тестирование происходит в данный момент 
   - Красный крестик - ошибка при сборке
## 8. Бэйдж в Readme
Отражает текущее состояние коммита 