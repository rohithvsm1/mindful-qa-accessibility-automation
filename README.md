# Mindful QA – Playwright UI Automation for Mental Health Web App

## Purpose

This repository contains **Playwright-based UI automation** for a web application
focused on **mental health check-ins**.

The automation validates **user-facing emotional input workflows**, such as:
- Selecting mood levels via emojis
- Capturing reflective statements
- Persisting and reloading user input

The goal is to demonstrate how **UI automation can be applied responsibly**
to sensitive, user-centric applications.

---

## What This Project Automates

The automated scenarios focus on **core user behavior**, not visual design.

### Key Flows Covered
- Emoji-based mood selection  
  (Low / Medium / High emotional states)
- Entry of short reflective statements
- Saving user responses
- Reloading the page and verifying persisted state

These flows represent **real user intent**, not synthetic test actions.

---

## Automation Approach

### Tooling
- **Playwright**
- **Java**
- **TestNG**
- Playwright recorder for baseline flows

---

### Test Design Principles

- **Behavior-first validation**  
  Tests validate what a user experiences, not internal implementation.

- **Minimal abstraction**  
  UI interactions are kept readable to preserve intent and clarity.

- **Stable locators**  
  Selectors prioritize accessibility roles and semantic attributes.

- **Deterministic assertions**  
  Assertions verify persisted state rather than transient UI animations.

---

## Example Test Flow

1. Launch mental health web application  
2. Select an emoji representing emotional state (Low / Medium / High)  
3. Enter a reflective statement  
4. Save the response  
5. Reload or revisit the page  
6. Assert that:
   - Selected emoji remains consistent
   - Statement content is preserved  

This mirrors a real user check-in session.

---

## Use of Playwright Recorder

Playwright’s recording capability is used intentionally:
- To capture **baseline user journeys**
- To compare **manual interaction vs automated execution**
- As a learning and debugging aid, not as final test code

Recorded flows are refined and cleaned before being committed.

---

## What This Automation Avoids

- Over-asserting on visual styling
- Fragile timing-based waits
- Excessive abstraction that hides user intent
- Treating emotional input flows like generic CRUD operations

These decisions are especially important for **mental health–related software**.

---

## Running the Tests

```bash
mvn clean test
