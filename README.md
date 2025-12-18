## Design Patterns in Action

This project demonstrates commonly used design patterns in Java using
real-world e-commerce examples.

### Patterns Included
- Singleton
- Factory Method
- Builder
- Strategy
- Observer
- Adapter
- Decorator
- Facade
- Command

| SOLID Principle                 | Problem Solved                         | Typical Patterns Implementing It        | Example                                                                    |
| ------------------------------- | -------------------------------------- | --------------------------------------- | -------------------------------------------------------------------------- |
| **SRP** (Single Responsibility) | Classes doing too much                 | Facade, Observer                        | `OrderStatusService` only notifies observers                               |
| **OCP** (Open/Closed)           | Adding new features breaks old code    | Strategy, Template Method, Decorator    | `DiscountStrategy` allows new discounts without modifying `PricingService` |
| **LSP** (Liskov Substitution)   | Subclass breaks parent behavior        | Strategy, Factory                       | `CreditCardPayment` and `UpiPayment` can replace `Payment` safely          |
| **ISP** (Interface Segregation) | Fat interfaces force useless methods   | Adapter, Observer                       | `Workable` and `Eatable` instead of one `Worker` interface                 |
| **DIP** (Dependency Inversion)  | High-level modules depend on low-level | Factory, Dependency Injection, Strategy | `OrderService` depends on `Repository` interface, not `MySqlRepository`    |


### How to Run
```bash
mvn clean install
mvn exec:java
