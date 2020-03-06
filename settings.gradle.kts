pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.name == "multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }

    repositories {
        maven("https://buildserver.labs.intellij.net/guestAuth/app/rest/builds/id:66293511/artifacts/content/maven")
        gradlePluginPortal()
    }
}
