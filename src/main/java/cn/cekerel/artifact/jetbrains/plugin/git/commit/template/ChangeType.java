package cn.cekerel.artifact.jetbrains.plugin.git.commit.template;

/**
 * From https://github.com/commitizen/conventional-commit-types
 *
 * @author Damien Arrachequesne
 */
public enum ChangeType {

    FEAT("Features", "A new feature"),
    FIX("Bug Fixes", "A bug fix"),
    DOCS("Documentation", "Documentation only changes (markdown, plain text, etc)"),
    STYLE("Styles", "Changes that do not affect the meaning of the code (white-space, formatting, missing semicolons, etc)"),
    REFACTOR("Code Refactoring", "A code change that neither fixes a bug nor adds a feature but adjust the structure or the composition"),
    PERF("Performance Improvements", "A code change that improves performance (example scopes: cache-mechanism integration, using pooling strategy)"),
    TEST("Tests", "Adding missing tests or correcting existing tests"),
    BUILD("Builds", "Changes that affect the build system or external dependencies (example scopes: mvn, gradlew, gulp, broccoli, npm)"),
    CI("Continuous Integrations", "Changes to our CI configuration files and scripts (example scopes: Gitlab-CI, Travis, Circle, BrowserStack, SauceLabs)"),
    CONFIG("Configuration", "A code change that add or remove some configuration in the resourse directory (example scopes: yaml, properties, json, xml)"),
    CHORE("Chores", "Other changes that don't modify src or test files (example scope: media file addition, gitignore)"),
    REVERT("Reverts", "Reverts a previous commit"),
    ;

    public final String title;
    public final String description;

    ChangeType(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String label() {
        return this.name().toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.label(), this.description);
    }
}
