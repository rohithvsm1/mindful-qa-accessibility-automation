# Mindful QA – Accessibility-First UI Automation

This project demonstrates an accessibility-first approach to UI automation, where WCAG compliance is treated as a release-quality signal rather than a post-release audit.

The goal is to show how accessibility checks can be embedded directly into regression workflows for user-sensitive applications such as mental wellness platforms.

---

## Business Context

In healthcare-adjacent and user-sensitive applications, accessibility failures are not cosmetic issues — they directly impact usability, trust, and compliance.

This project focuses on validating:
- Screen reader compatibility
- Keyboard navigation
- Color contrast and semantic structure

as part of automated regression, not manual review.

---

## Technical Approach

- Playwright-based UI automation
- Automated WCAG checks integrated into test flows
- Accessibility assertions executed alongside functional validations
- Tests designed to run deterministically in CI environments

Accessibility failures are treated as test failures, not informational warnings.

---

## Why This Matters

Most UI automation validates *what* is rendered.
This project validates *who can use it*.

By embedding accessibility into automation:
- Quality risks are surfaced earlier
- Accessibility becomes an engineering responsibility
- Teams avoid last-minute compliance surprises

---

## What This Project Is Not

- Not a demo app
- Not a checklist-style accessibility scan
- Not a replacement for manual audits

It is a practical example of making accessibility a first-class citizen in automated testing.

---

## Tools Used

- Playwright
- JavaScript / TypeScript
- WCAG accessibility principles
