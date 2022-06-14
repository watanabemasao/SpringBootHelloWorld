# 課題 6

## 課題内容

SpringBootを使って画面にHelloWorldを表示してみる  

リクエストで受け取った国（japan、us、france、korea）ごとに出すメッセージをかえる  

現在時刻を表示する

## 依存関係

- **Project** Gradle  

- **Language** Java

- **SDK** 17

- **Spring Boot version** 2.70  

- **spring-boot-starter-test** 2.67  

- **spring-boot-starter-web** 2.67  

## 確認方法

![](displaytest/build.gradle.png)  

![](displaytest/cache.properties.png)  

## 追加機能  

**OffsetDateTime**にて**ZoneId**を使用したタイムゾーンの取得。  

"yyyy年MM月dd日(E)HH時mm分ss秒"形式にて出力。  

HelloControllerクラスにて  
@GetMapping("/hello/JPN")  
@GetMapping("/hello/CST")  
@GetMapping("/hello/UST")  
各種出力用のメソッドを用意。  

## 出力結果
![](displaytest/OffsetDataTime.png)