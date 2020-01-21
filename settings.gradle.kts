pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.name == "multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }

    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}
