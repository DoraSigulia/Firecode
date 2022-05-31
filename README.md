# Проект по автоматизации тестирования для ![Firecode](https://hhcdn.ru/employer-logo/3065829.jpeg)

### 👉 [Вебсайт](https://firecode.ru/)


### 🔥 Содержание:
- [x] [Технологии и инструменты](#-технологии-и-инструменты)
- [x] [Реализованные проверки](#-реализованные-проверки)
- [x] [Сборка в Jenkins](#-сборка-в-jenkins)
- [x] [Параметры сборки в Jenkins](#-параметры-сборки-в-jenkins)
- [x] [Запуск из терминала](#-запуск-из-терминала)
- [x] [Allure отчет](#-allure-отчет)
- [x] [Видео примеры прохождения тестов](#-видео-примеры-прохождения-тестов)
- [x] [Уведомления в Telegram](#-уведомления-в-telegram)

***
### 🔥 Технологии и инструменты

<p align="center">
  <img src="src/main/resources/file_to_Readme/Intelij_IDEA.svg" width="50" title="IntelliJ IDEA">
  <img src="src/main/resources/file_to_Readme/Java.svg" width="50" alt="Java">
  <img src="src/main/resources/file_to_Readme/Selenide.svg" width="50" alt="Selenide">
  <img src="src/main/resources/file_to_Readme/Selenoid.svg" width="50" alt="Selenoid">
  <img src="src/main/resources/file_to_Readme/Allure_Report.svg" width="50" alt="Allure Report">
  <img src="src/main/resources/file_to_Readme/Gradle.svg" width="50" alt="Gradle">
  <img src="src/main/resources/file_to_Readme/JUnit5.svg" width="50" alt="JUnit5">
  <img src="src/main/resources/file_to_Readme/GitHub.svg" width="50" alt="GitHub">
  <img src="src/main/resources/file_to_Readme/Jenkins.svg" width="50" alt="Jenkins">
  <img src="src/main/resources/file_to_Readme/Telegram.svg" width="50" alt="Telegram">
</p>

***
### 🔥 Реализованные проверки:

- Прикрепить файл в заявку на сотрудничество
- Попытка отправить заявку без заполения обязательный полей
- Параметризированные тесты для отправки заявки на рзные услуги:
  - Тестирование
  - Аутстафф (аренда)
  - Заказная разработка
  
(В тестах закомментирован код отправки заявки, чтоб не грузить сайт лишними данными, но он есть)

***
### 🔥 Сборка в Jenkins

![Jenkins](src/main/resources/file_to_Readme/012-sigulia-FireCode.png)

***
### 🔥 Параметры сборки в Jenkins:

- BROWSER
  - chrome
  - firefox
  
- BROWSERSIZE
  - 1920x1080
  - 1024x768

***
### 🔥 Параметры сборки можно указать при запуске проекта:


![options](src/main/resources/file_to_Readme/options.png)

***
### 🔥 Запуск из терминала

Локальный запуск:

    gradle clean test


Удаленный запуск:

    clean
    test
    -Dbrowser=${BROWSER}
    -DbrowserSize=${BROWSERSIZE}

***
### 🔥 Allure отчет

- Главный экран

![AllureReport](src/main/resources/file_to_Readme/AllureReport.png)

- Описание тестов с добавленнием скриншотов, видео и логов 

![AllureReportSuit](src/main/resources/file_to_Readme/AllureReportSuit.png)

***
### 🔥 Видео примеры прохождения тестов


![video](src/main/resources/file_to_Readme/video.gif)

***
### 🔥 Уведомления в Telegram

    После каждого прохождения тестов отправляется уведомление в Telegram с информацией о проекте, 
    количестве пройденных и упавших тестов, временем прохождения тестов, ссылкой на отчет и др.

<p align="center">
  <img src="src/main/resources/file_to_Readme/TelegramReport.jpg" width="350" title="IntelliJ IDEA">
</p>

