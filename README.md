# Проект автоматизации тестирования поиска https://selenide.org/ в https://www.google.com/


# Используемые технологии
![Java](readme_files/Icons/Java.png)
![Gradle](readme_files/Icons/Gradle.png)
![JUnit5](readme_files/Icons/JUnit5.png)
![Selenide](readme_files/Icons/Selenide.png)
![Allure_Report](readme_files/Icons/Allure_Report.png)
![Jenkins](readme_files/Icons/Jenkins.png)
![Selenoid](readme_files/Icons/Selenoid.png)

- Java
- Gradle
- Junit5
- Selenide
- Allure Report
- Jenkins
- Selenoid


# Описание
Автоматизировано тестирование поиска целевого сайта в поисковой системе Google.

- Поиск запускается из CI системы Jenkins
- Для контейнеризации запусков использован Selenoid
- Для каждого запуска создается отчет Allure reports (автоматически добавляются скриншоты и видео прохождения тестов)

## Ссылки
### Jenkins
https://jenkins.autotests.cloud/job/AUTO-23/
### Allure report
https://jenkins.autotests.cloud/job/AUTO-23/2/allure/
