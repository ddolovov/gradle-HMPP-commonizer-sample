pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.name == "multiplatform") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }

    repositories {
        maven("https://buildserver.labs.intellij.net/guestAuth/app/rest/builds/buildType:(id:Kotlin_KotlinDev_AggregateBranch),number:1.4.0-dev-2411,branch:(default:any)/artifacts/content/maven/")
        gradlePluginPortal()
    }
}
