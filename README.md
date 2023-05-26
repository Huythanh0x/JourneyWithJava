# A Journey to Java dev

### Background knowledge:

- Graduate student from UIT (Computer science)
- [Android Dev(mostly in Kotlin)](https://github.com/Huythanh0x/AndroidUdemyCoupon)
- [Android Dev(basic Java)](https://github.com/Huythanh0x/SimpleMathMultipleChoice)
- [6 months with Selenium (Python)](https://github.com/Huythanh0x/AutomateWithSeleniumStartProject)
- [Know basic JS/HTML/CSS (Chrome Extension](https://github.com/Huythanh0x/CamblyScheduleHelperChromeExtension)
- [Basic Ktor (back-end framework)](https://github.com/Huythanh0x/UdemyCouponKtorServer)
- [Crawl data from multiple websites](https://github.com/BlogBatDauLapTrinh/create_printable_flashcard_CamBridge)
- Additional Skills: Sqlite, Github, Linux

### First day & Second day

- Go through Java [cheat sheet](https://programmingwithmosh.com/wp-content/uploads/2019/07/Java-Cheat-Sheet.pdf)
- Completed 20 challenges
  from [30 days of code-hackerrank](https://www.hackerrank.com/domains/tutorials/30-days-of-code)
- Create [my first CRUD app](FirstCRUDSpringApp) following
  this [short tutorial](https://www.youtube.com/watch?v=IucFDX3RO9U)
- Short article, [REST hello world](https://spring.io/guides/gs/rest-service/)
- Short article, [start Spring boot with Kotlin](https://spring.io/guides/tutorials/spring-boot-kotlin/)
    - Maven/Gradle
    - Spring structure(Controller/Application)
    - Persist data with JPA(Entity/CrudRepository)
    - Junit5
- **Have to pay for pro lessons** Involve into the beginner
  course <https://spring.academy/courses/building-a-rest-api-with-spring-boot/lessons/introduction>
    - Spring and Spring boot
    - API contract & Json
    - Test first - TDD (Red, Green, Refactor)
    - Request and Response
    - Spring controller and mapping, path variable
    - TestRestTemplate & ResponseEntity -> test in local
    - CrudRepository and in-memory database(H2)
    - Spring Auto Configuration automatically starts configure H2 database -> base on CrudRepository
    - Create Repository from CrudRepository<Data,Id>
    - Can use function from interface repository to get the data
    - Automatically executed the sql in `test/resources` in run test
    - The test will run even the fact that CashCardController required a bean of type 'CashCardRepository' that could
      not be found.
    - Idempotent operation -> the responses are the same for any request
    - HTTP response (status code + header)
    - Pagination in API response & sorted order -> `PagingAndSortingRepository` `PageRequest` `Sort`
    - Spring Security and authentication with Filter chain
    - Authentication and Authorization -> Role-Based Access Control
    - Same Origin Policy -> scripts which are contained in a web page are allowed to send requests to the origin
    - Cross-Origin Request Sharing (CORS) -> explicitly allow a list of “allowed origins
    - Cross-Site Request Forgery -> CSRF Token (unique token is generated on each request)
    - Cross-Site Scripting (XSS) -> escape the special characters
    -
- Official course [Spring with Kotlin](https://spring.io/guides/tutorials/spring-boot-kotlin/)

- Go through [Spring start here](https://www.amazon.com/Spring-Start-Here-Learn-learn/dp/1617298697#customerReviews)