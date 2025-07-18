pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "GroceryHub"
include(":app")
include(":data")
include(":domain")

include(":core:core-network", ":core:core-db", ":core:core-ui", ":core:core-utils")
include(":feature:product", ":feature:cart")

project(":core:core-network").projectDir = file("core/core-network")
project(":core:core-db").projectDir = file("core/core-db")
project(":core:core-ui").projectDir = file("core/core-ui")
project(":core:core-utils").projectDir = file("core/core-utils")

include(":di")
