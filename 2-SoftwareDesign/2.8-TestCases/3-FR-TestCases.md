| FR id | TC id | Опис кроків тестового сценарію                                                                                           | Опис очікуваних результатів |
|-------|-------|--------------------------------------------------------------------------------------------------------------------------|-----------------------------|
| FR3 | TC1.1 | Початкові умови: id запис існує<br><br>Кроки сценарію:<br>1) record_id = 1<br>2) volume = 1500, feeling = "добре", text = "Текст" |        Результат = 1        |
| FR3 | TC1.2 | Початкові умови: відсутні<br><br>Кроки сценарію:<br>1) record_id = -1<br>2) volume = 1500, feeling = "добре", text = "Текст" |        Результат = 5       |
| FR3 | TC1.3 | Початкові умови: відсутні<br><br>Кроки сценарію:<br>1) record_id = 1<br>2) volume = 10001, feeling = "добре", text = "Текст"  |        Результат = 2       |
| FR3 | TC1.4 | Початкові умови: відсутні<br><br>Кроки сценарію:<br>1) record_id = 1<br>2) volume = 1500, feeling = "добре...", text = "Текст"|        Результат = 3       |
| FR3 | TC1.5 | Початкові умови: відсутні<br><br>Кроки сценарію:<br>1) record_id = 1<br>2) volume = 1500, feeling = "добре", text = "Текст..."|        Результат = 4       |