# Workflow

## Branching Strategy
- Use `main` for stable releases.
- Use `feature/*` for new features.
- Use `bugfix/*` for bug fixes.
- Pull requests must be reviewed before merging.

## CI/CD Pipeline
- Automated builds and tests via GitHub Actions.
- Build: On every push and pull request.
- Test: Unit and integration tests run automatically.
- Deploy: Manual or scheduled deployment workflows.

## Code Review Process
- All code changes require pull requests.
- At least one approval required before merging.
- Use comments for feedback and suggestions.

## Automation
- Scripts for build, test, and deployment in `scripts/`.
- Linting and formatting enforced via CI.
