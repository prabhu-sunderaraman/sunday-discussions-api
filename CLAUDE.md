# CLAUDE.md

## Rules — Always Apply

Whenever generating anything (code, tests, or otherwise), you MUST refer to and follow the rules files in [.claude/rules/](.claude/rules/):

- [.claude/rules/java-code-style.md](.claude/rules/java-code-style.md) — Java coding conventions, size limits, design decisions, null handling.
- [.claude/rules/logging.md](.claude/rules/logging.md) — logging framework, sensitive data, formatting, required context, bulk operations.
- [.claude/rules/testing.md](.claude/rules/testing.md) — JUnit practices, test naming conventions, test coverage.

These rules are the context for all generated output and apply every time.

## Requirements — Problem Statement

The problem statement lives in [.claude/context/requirements.md](.claude/context/requirements.md). Refer to it for the functional requirements of the project.
