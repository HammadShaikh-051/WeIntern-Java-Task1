# Student Management System (Console-Based)

A professional, robust, and menu-driven console application built using **Core Java** and **Object-Oriented Programming (OOP) concepts**. This project delivers an efficient system to manage student records via an in-memory data architecture.

This project was developed as part of the **Week 1 Assignment** for the **Java Developer Internship** at **WeIntern**.

---

## 📋 Table of Contents
- [Project Overview](#-project-overview)
- [Key Features](#-key-features)
- [Tech Stack](#-tech-stack)
- [Architecture & Design](#-architecture--design)
- [How to Run the Application](#-how-to-run-the-application)
- [About WeIntern Internship](#-about-weintern-internship)
- [License](#-license)

---

## 🚀 Project Overview

The objective of this assignment is to demonstrate a solid foundation in Core Java fundamentals by constructing a fully functional command-line interface (CLI) application. The system handles structured student profiles, processing operations smoothly without the need for a database by utilizing advanced Java Collections.

### Core Objectives:
* **Object-Oriented Design:** Implement real-world entity models utilizing Classes, Objects, and strong Encapsulation.
* **Data Persistence:** Maintain dynamic, runtime data storage utilizing memory-managed array blocks (`ArrayList`).
* **Business Logic:** Build out complete CRUD operations coupled with a resilient command terminal loop.

---

## ✨ Key Features

The console system exposes a production-ready, interactive command-line interface providing the following features:

1.  **Add Student Record (Create):** Register a student with details such as Unique ID, Name, Age, and Course, featuring input capture and format handling.
2.  **Display All Records (Read):** Stream data and output an aligned tabular or text format of all student metadata registered in the current session.
3.  **Search Student by ID (Read):** Look up and retrieve specific profile items instantly using indexed matching patterns on unique IDs.
4.  **Update Student Info (Update):** Query target elements dynamically and rewrite editable details safely without corrupting the reference key pointer.
5.  **Remove Student Profile (Delete):** Dereference and strip records safely from collection lists using runtime target searching.
6.  **Graceful Session Termination (Exit):** Flush buffers and cleanly exit process memory stacks safely.

---

## 🛠️ Tech Stack

* **Language Environment:** Java Standard Edition (JDK 8 / 11 / 17 or higher)
* **Core paradigms:** Object-Oriented Programming (OOP), Data Structures, Stream/IO Manipulation
* **Collections Framework:** `java.util.ArrayList`, `java.util.Scanner`

---

## 📁 Architecture & Design

To keep codebase items isolated, clear, and cleanly separated, the system layout follows decoupled application tiers:
```text
src/
└── com/
    └── weintern/
        └── sms/
            ├── Main.java           # Main menu controller, terminal handler, loop scanner
            ├── Student.java        # Entity POJO model with hidden parameters & public accessors
            └── StudentManager.java # Business Service Engine executing collection CRUD computations
