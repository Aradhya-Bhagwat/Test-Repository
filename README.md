# Git Branching Practice – Java Array Operations

This repository demonstrates a **feature-based Git workflow** using a simple **Java array program**.
Each array operation is implemented in a **separate Git branch**, following **standard Git practices**.

---

## 🚀 Objective

* Practice **Git branching and commits**
* Implement features in **isolated branches**
* Understand real terminal-level Git workflow

---

## 🔹 Step 1: Clone Repository (Main Branch)

```bash
C:\Users\aradhya\Desktop>git clone https://github.com/Aradhya-Bhagwat/Test-Repository.git
Cloning into 'Test-Repository'...
Receiving objects: 100% (6/6), done.
```

```bash
C:\Users\aradhya\Desktop\Test-Repository>git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  task2.java
```

---

## 🔹 Step 2: Add & Commit Base Java File (Main)

```bash
git add .
git commit -m "Added initial Java file"
git push origin main
```

```bash
git branch
* main
```

📌 **Main branch contains only base array setup**

---

## 🌿 Branch 1: `sort` — Bubble Sort Feature

### Create Branch

```bash
git checkout -b sort
```

```bash
git branch
  main
* sort
```

### Commit Sort Feature

```bash
git status
modified: task2.java
```

```bash
git add .
git commit -m "Implemented bubble sort for array"
```

📌 **Feature isolated and committed independently**

---

## 🌿 Branch 2: `insert` — Insert Element Feature

### Create Branch from Main

```bash
git checkout main
git checkout -b insert
```

```bash
git branch
  main
  sort
* insert
```

### Commit Insert Feature

```bash
git add .
git commit -m "Added element insertion operation"
```

📌 **Demonstrates array resizing and index handling**

---

## 🌿 Branch 3: `delete` — Delete Element Feature

### Create Branch from Main

```bash
git checkout main
git checkout -b delete
```

```bash
git branch
  main
  sort
  insert
* delete
```

### Commit Delete Feature

```bash
git add .
git commit -m "Added element deletion operation"
```

📌 **Includes boundary validation and safe deletion**

---

## 🔀 Merging All Features into Main

```bash
git checkout main
git merge sort
git merge insert
git merge delete
git push origin main
```

📌 **Final `main` branch contains all features**

---

## 📁 Branch Summary

| Branch   | Feature                        |
| -------- | ------------------------------ |
| `main`   | Base program + merged features |
| `sort`   | Bubble sort implementation     |
| `insert` | Insert element at position     |
| `delete` | Delete element from position   |

---

## 🛠️ Tech Stack

* **Language:** Java
* **Version Control:** Git
* **Platform:** GitHub
* **IDE:** VS Code

---

## 🎯Skills Demonstrated<br><br>

✔ Feature-based Git workflow<br>
✔ Clean commit history<br>
✔ Branch isolation<br>
✔ Java fundamentals<br>
✔ Real terminal usage (not GUI-only)<br>

---

## 👤 Author<br><br>

**Aradhya Bhagwat**<br>
B.Tech CSE<br>
Git Branching & Java Practice Repository<br>

---
