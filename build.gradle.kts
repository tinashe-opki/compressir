plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.apache.commons:commons-compress:1.28.0")

    implementation("commons-beanutils:commons-beanutils:1.11.0")
    implementation("org.apache.commons:commons-configuration2:2.13.0")
}

tasks.test {
    useJUnitPlatform()
}