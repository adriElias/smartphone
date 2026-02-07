# Smartphone with Multiple Functionalities

Educational Java project to practice **inheritance** and **interfaces**.

## Objective

- Combine class inheritance with interface implementation
- Understand how a class can inherit attributes/behaviors and add specific functionalities
- Model independent capabilities (calling, taking photos, alarm) using interfaces

## Statement

Create a system that represents a **smartphone** with the following capabilities:

- Inherits from `Phone`: brand, model, and method to make calls
- Implements `Camera` (take photo) and `Clock` (set alarm) interfaces

## Project Structure

```text
src/
├── Phone.java
├── Camera.java          # Interface
├── Clock.java           # Interface
├── Smartphone.java
└── Main.java
```
## Classes and Interfaces

| Nom          | Tipus      | Descripció                                              |
|--------------|------------|---------------------------------------------------------|
| Phone        | Class      | Attributes: brand, model. Method: `call(String number)` |
| Camera       | Interface  | Method: `takePhoto()`                                   |
| Clock        | Interface  | Method: `setAlarm()`                                    |
| Smartphone   | Class      | Extends `Phone` and implements `Camera` and `Clock`     |
| Main         | Executable | Create a `Smartphone` and tests call, photo, and alarm  |

## How to Run
```java
Bashjavac src/*.java
java -cp src Main
```
## Expected Output (example):
```text
Calling 123456789...
Taking a photo!
Alarm ringing!
```