plugins {
    kotlin("multiplatform") version "1.3.21"
}

kotlin {
    jvm()

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

        jvm().compilations["main"].defaultSourceSet {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        jvm().compilations["test"].defaultSourceSet {
            dependencies {
                //implementation("org.junit.jupiter:junit-jupiter:5.4.0")
               // implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }
    }
}