apply plugin: 'java'
apply plugin: 'eclipse'
apply plugin: 'application'

mainClassName = 'hello.HelloWorld'

// tag::repositories[]
repositories { 
    mavenCentral() 
}
// end::repositories[]

dependencyLocking {
  lockAllConfigurations()
}

// tag::jar[]
jar {
    archiveBaseName = 'gs-gradle'
    archiveVersion =  '0.1.0'
}
// end::jar[]

// tag::dependencies[]
sourceCompatibility = 1.8
targetCompatibility = 1.8

dependencies {
    implementation "joda-time:joda-time:2.2"
    testImplementation "junit:junit:4.12"
    implementation 'org.springframework.boot:spring-boot-starter:2.3.4.RELEASE'
    testImplementation 'org.springframework.boot:spring-boot-starter-test:2.3.4.RELEASE'
}
// end::dependencies[]

// tag::wrapper[]
// end::wrapper[]
