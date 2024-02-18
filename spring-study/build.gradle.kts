plugins {
    id("java")
}

group = "org.springframework"
version = "5.3.32-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.26")
	testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
	implementation(project(":spring-context"))
}

tasks.test {
    useJUnitPlatform()
}