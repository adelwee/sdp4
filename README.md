# Design Patterns Assignment 4

This project demonstrates the implementation of various design patterns through a series of tasks. Each task focuses on a different design pattern to solve a specific problem. The patterns covered in this project include Strategy, Observer, Command, State, Chain of Responsibility, Mediator, Memento, Visitor, Template Method, and Iterator.

## Table of Contents

1. [Task 1: Strategy Pattern - Payment Processing System](#task-1-strategy-pattern---payment-processing-system)
2. [Task 2: Observer Pattern - Weather Monitoring System](#task-2-observer-pattern---weather-monitoring-system)
3. [Task 3: Command Pattern - Remote Control for Smart Home Devices](#task-3-command-pattern---remote-control-for-smart-home-devices)
4. [Task 4: State Pattern - Order Processing System](#task-4-state-pattern---order-processing-system)
5. [Task 5: Chain of Responsibility - Expense Approval System](#task-5-chain-of-responsibility---expense-approval-system)
6. [Task 6: Mediator Pattern - Chat Room Application](#task-6-mediator-pattern---chat-room-application)
7. [Task 7: Memento Pattern - Document Version Control System](#task-7-memento-pattern---document-version-control-system)
8. [Task 8: Visitor Pattern - Shape Area Calculator](#task-8-visitor-pattern---shape-area-calculator)
9. [Task 9: Template Method Pattern - Report Generation System](#task-9-template-method-pattern---report-generation-system)
10. [Task 10: Iterator Pattern - Playlist Management System](#task-10-iterator-pattern---playlist-management-system)

## Task 1: Strategy Pattern - Payment Processing System

This task implements the Strategy pattern to design a payment processing system for an e-commerce platform. The system can handle multiple payment methods, such as credit cards, PayPal, and cryptocurrency.

### Key Concepts:
- `PaymentStrategy` interface defines the strategy for processing payments.
- Concrete classes (`CreditCardPayment`, `PayPalPayment`, `CryptoPayment`) implement different payment strategies.
- `ShoppingCart` class uses the payment strategies to perform payment actions.

## Task 2: Observer Pattern - Weather Monitoring System

The Observer pattern is used to create a weather monitoring system where multiple display devices update their information based on data from a weather station.

### Key Concepts:
- `WeatherStation` acts as the subject, managing weather data and notifying observers.
- `WeatherDisplay` interface represents observers that update their display based on weather changes.
- Various concrete display classes (e.g., `CurrentConditionsDisplay`, `StatisticsDisplay`) show weather information.

## Task 3: Command Pattern - Remote Control for Smart Home Devices

This task designs a universal remote control system using the Command pattern to operate various smart home devices.

### Key Concepts:
- `Command` interface includes methods for `execute()` and `undo()`.
- Concrete commands control smart home devices (e.g., `TurnTVOn`, `SetVolume`).
- `RemoteControl` allows multiple command slots and undo functionality.

## Task 4: State Pattern - Order Processing System

The State pattern is implemented to design an order processing system that changes its behavior based on the order's current state.

### Key Concepts:
- `State` interface defines actions that can change the order's state.
- Concrete state classes represent different order states (`New`, `Paid`, `Shipped`, `Delivered`, `Cancelled`).
- `Order` class manages state transitions and delegates actions to the current state.

## Task 5: Chain of Responsibility - Expense Approval System

This task creates an expense approval system using the Chain of Responsibility pattern, where requests are passed through a chain of approvers.

### Key Concepts:
- `Approver` class defines a handler for expense requests.
- Different levels of approvers (`TeamLead`, `Manager`, `Director`, `CEO`) process requests based on the amount.
- Requests are passed along the chain until they are approved.

## Task 6: Mediator Pattern - Chat Room Application

The Mediator pattern is used to design a chat room application where users communicate through a central mediator.

### Key Concepts:
- `ChatMediator` interface defines methods for message sending and user management.
- `ChatRoom` is a concrete mediator that handles message broadcasting.
- `User` class represents participants in the chat room.

## Task 7: Memento Pattern - Document Version Control System

This task implements a document version control system using the Memento pattern, allowing users to save and restore document states.

### Key Concepts:
- `DocumentVersion` (Memento) stores the state of a document.
- `Document` (Originator) manages content and creates/restores mementos.
- `VersionControl` (Caretaker) maintains saved versions.

## Task 8: Visitor Pattern - Shape Area Calculator

The Visitor pattern is applied to calculate the area of different shapes.

### Key Concepts:
- `Shape` interface includes an `accept()` method for visitors.
- Concrete shapes (`Circle`, `Rectangle`) implement the `Shape` interface.
- `AreaCalculator` (Visitor) calculates the area for each shape.

## Task 9: Template Method Pattern - Report Generation System

This task uses the Template Method pattern to design a report generation system that supports different report formats.

### Key Concepts:
- `ReportGenerator` abstract class outlines the report generation process.
- Concrete implementations (`PDFReportGenerator`, `HTMLReportGenerator`) provide specific formatting.

## Task 10: Iterator Pattern - Playlist Management System

The Iterator pattern is implemented to design a playlist management system for a music streaming service.

### Key Concepts:
- `Playlist` class stores a collection of `Song` objects.
- Different iterators (`SequentialIterator`, `ShuffleIterator`) allow traversal in various orders.
- Each iterator provides methods for sequential access.


