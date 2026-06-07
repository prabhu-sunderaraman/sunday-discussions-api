# AI Journal — Prompt Log

This file logs every prompt: **when** it was prompted, **what** was asked, **what the response was**, and whether the user **accepted / rejected / challenged** it.

| # | Date | Prompt (what was asked) | Response (what was done) | Outcome |
|---|------|-------------------------|--------------------------|---------|
| 1 | 2026-06-07 | List the coding convention rules from `.claude/rules/java-code-style.md` that will be followed when generating code. | Listed 7 conventions (naming, file/method size limits, no magic values, no boolean params, cyclomatic complexity < 4 / Strategy pattern, no early returns with exceptions, Optional over null). Noted the rules file was empty and offered to persist it. | Accepted |
| 2 | 2026-06-07 | Write those conventions into `.claude/rules/java-code-style.md`. | Wrote the rules file with sections: Naming, Size Limits, Design Decisions, Null Handling. | Accepted |
| 3 | 2026-06-07 | Add logging rules to `.claude/rules/logging.md` (no System.out.println, use SLF4J, no sensitive data, no string concat, required log context, bulk-op logging). | Wrote the logging rules file with 6 rules across Framework, Sensitive Information, Formatting, Required Context, Bulk Operations. | Accepted |
| 4 | 2026-06-07 | Add testing rules to `.claude/rules/testing.md` (JUnit standards, naming convention, JUnit asserts, unit + integration tests). | Wrote the testing rules file under Framework, Test Naming Conventions, Test Coverage. | Accepted |
| 5 | 2026-06-07 | Update `CLAUDE.md` to say the rules files are always referred to when generating anything, and that requirements.md holds the problem statement. | Wrote `CLAUDE.md` linking the three rules files and pointing to `.claude/context/requirements.md`. | Accepted |
| 6 | 2026-06-07 | Set up `.claude/context/ai-journal.md` as the prompt log (what/when prompted, response, accepted/rejected/challenged). | Created this journal with a structured table and backfilled entries 1–6. | Accepted |
