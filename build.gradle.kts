plugins {
    kotlin("multiplatform") version "1.4.0-dev-3804"
}

repositories {
    maven("https://buildserver.labs.intellij.net/guestAuth/app/rest/builds/id:66293511/artifacts/content/maven")
    mavenCentral()
}

kotlin {
    ios {
        binaries {
            executable()
        }
    }

//    watchos {
//        binaries {
//            executable()
//        }
//    }

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
