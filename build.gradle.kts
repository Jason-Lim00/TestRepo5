// apply plugin: 'java'
// apply plugin: 'eclipse'
// apply plugin: 'application'

// mainClassName = 'hello.HelloWorld'

// // tag::repositories[]
// repositories { 
//     mavenCentral() 
// }
// // end::repositories[]

// dependencyLocking {
//   lockAllConfigurations()
// }

// // tag::jar[]
// jar {
//     archiveBaseName = 'gs-gradle'
//     archiveVersion =  '0.1.0'
// }
// // end::jar[]

// // tag::dependencies[]
// sourceCompatibility = 1.8
// targetCompatibility = 1.8

// dependencies {
//     implementation "joda-time:joda-time:2.2"
//     testImplementation "junit:junit:4.12"
//     implementation 'org.springframework.boot:spring-boot-starter:2.3.4.RELEASE'
//     testImplementation 'org.springframework.boot:spring-boot-starter-test:2.3.4.RELEASE'
// }
// // end::dependencies[]

// // tag::wrapper[]
// // end::wrapper[]

// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.1.3")
        classpath(kotlin("gradle-plugin", version = "1.3.70"))

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

configurations {
    compileClasspath {
        resolutionStrategy.activateDependencyLocking()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
