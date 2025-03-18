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

    versionCatalogs {
        create("kmpLibs") {
            from(files("kmp/gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "KMPIntegrationDemoAndroid"
include(":app", ":shared")
project(":shared").projectDir = File("kmp/shared")
 