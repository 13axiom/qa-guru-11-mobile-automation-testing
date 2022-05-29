# UI automation project for mobile application Wikipedia
<p align="center"></p><a href="https://github.com/wikimedia/apps-android-wikipedia/releases/tag/latest"><img width="30%" title="Wiki" src="images/logo/wiki_logo.png"></a>

## :bulb: Content:

- [Technology stack](#gear-Technology-stack)
- [Implemented manual checks](#hand-Implemented-manual-checks)
- [Tests launch from Jenkins](#-Tests-launch-from-Jenkins#)
- [Tests launch from Terminal](#Tests-launch-from-Terminal)
- [Example of test execution](#-Example-of-test-execution)
- <a href="#point_up_2-видео-пример-прохождения-теста">Видео пример прохождения теста</a>

## :gear: Technology stack
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/testops.png" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://telegram.org/?setln=en/"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
<a href="https://www.browserstack.com/app-live/"><img src="images/logo/browserstack.png" width="50" height="50"  alt="Browserstack"/></a>
<a href="https://appium.io/"><img src="images/logo/appium.png" width="80" height="50"  alt="Appium"/></a>
</p>


## :point_up_2: Проведенный автотест
- Проверка стартовых экранов и поиска в приложении

## :white_check_mark: Implemented automated checks
- [x] Search test
- [x] Validation of design of introduction 1st page
- [x] Validation of design of introduction 2nd page
- [x] Validation of design of introduction 3rd page
- [x] Validation of design of introduction 4th page

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Tests launch from [Jenkins](https://jenkins.autotests.cloud/job/c11-lifetesting-mobile-testing-diploma/)

*For launch remote tests it's necessary to click the option <code><strong>*Собрать с параметрами*</strong></code>, then to fill build settings and to click the button <code><strong>*Собрать*</strong></code>.*
<p align="center">
  <img src="images/screens/jenkins_mobile_1.png" alt="job" width="800">
</p>

*After tests execution, in the panel <code><strong>*История сборок*</strong></code> in the row with build number
icons <img width="2%" title="Allure Report" src="images/logo/Allure_Report.svg"><code><strong>*Allure Report*</strong></code>
and <img width="2%" title="Allure TestOps" src="images/logo/testops.png"><code><strong>*Allure TestOps*</strong></code> will appear.*

*Icon <img width="2%" title="Allure Report" src="images/logo/Allure_Report.svg"><code><strong>*Allure Report*</strong></code> opens
html-report in Allure Report.*

*Icon <img width="2%" title="Allure TestOps" src="images/logo/testops.png"><code><strong>*Allure TestOps*</strong></code> opens
html-report in Allure TestOps.*

<p align="center">
  <img src="images/screens/jenkins_mobile_2.png" alt="job" width="1000">
</p>

##  Tests launch from Terminal

```
gradle clean test -DdeviceHost=browserstack / emulation / real 
```

## <img width="4%" title="Allure TestOPS" src="images/logo/testops.png"> [Allure TestOps](https://allure.autotests.cloud/launch/13139) report
### :pushpin: Overview dashboard

<p align="center">
  <img src="images/screens/TestOpsMobileOverview.png" alt="dashboards" width="900">
</p>

### :pushpin: Test cases

<p align="center">
  <img src="images/screens/TestOpsMobileTC.png" alt="test cases" width="900">
</p>

### :pushpin: Test launch from Allure TestOPS -> [Test Plan](https://allure.autotests.cloud/testplan/316/)

<p align="center">
  <img src="images/screens/TestOpsMobileTestPlan.png" alt="test cases" width="900">
</p>


## :point_up_2: Example of test execution

> A video is attached to each test in the report.


https://user-images.githubusercontent.com/84909251/170564995-992b9b10-2493-4b67-9eb1-52c0ca4a2c84.mp4


