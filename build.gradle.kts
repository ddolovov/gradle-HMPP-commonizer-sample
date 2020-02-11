plugins {
    kotlin("multiplatform") version "1.4.0-dev-2411"
}

repositories {
    maven("https://buildserver.labs.intellij.net/guestAuth/app/rest/builds/buildType:(id:Kotlin_KotlinDev_AggregateBranch),number:1.4.0-dev-2411,branch:(default:any)/artifacts/content/maven/")
    mavenCentral()
}

kotlin {
    ios {
        binaries {
            executable()
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}
