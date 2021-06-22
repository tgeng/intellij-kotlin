// GENERATED build.gradle.kts
// GENERATED BY kotlin.project-wizard.idea.iml
// USE `./gradlew generateIdePluginGradleFiles` TO REGENERATE THIS FILE

plugins {
    kotlin("jvm")
    `java-library` // Add `compileOnlyApi` configuration
    id("jps-compatible")
}

repositories {
    maven { setUrl("https://cache-redirector.jetbrains.com/maven-central") }
    maven { setUrl("https://cache-redirector.jetbrains.com/intellij-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jcenter") }
    maven { setUrl("https://cache-redirector.jetbrains.com/dl.google.com/dl/android/maven2") }
    maven { setUrl("https://cache-redirector.jetbrains.com/repo.jenkins-ci.org/releases") }
    maven { setUrl("https://cache-redirector.jetbrains.com/www.myget.org/F/rd-snapshots/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/download.jetbrains.com/teamcity-repository") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
}

disableDependencyVerification()

dependencies {
    implementation(toolsJarApi())
    jpsLikeJarDependency(kotlinStdlib(), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-stdlib-jdk7"), JpsDepScope.COMPILE)
    jpsLikeJarDependency("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.1", JpsDepScope.COMPILE)
    jpsLikeJarDependency("org.jetbrains.intellij.deps:java-compatibility:1.0.1", JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-for-ide"), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-tests-for-ide"), JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.fir.frontend-independent", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jps-common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.formatter", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.project-wizard.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.project-wizard.cli", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-idea", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.tests-common", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.test-framework", JpsDepScope.TEST)
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-impl") }) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources_en") }) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency("org.apache.velocity:velocity:1.7", JpsDepScope.COMPILE) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-api") }) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.COMPILE) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("util") }) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("forms_rt") }) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("jps-model") }) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.COMPILE) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources") }) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency("org.jetbrains:annotations:20.1.0", JpsDepScope.COMPILE) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency("com.jgoodies:forms:1.1-preview", JpsDepScope.COMPILE) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.32", JpsDepScope.COMPILE) // 'intellij.platform.lang.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("intellij-dvcs") }) // 'intellij.platform.vcs.impl' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.COMPILE) // 'intellij.java' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:asm-all:9.1", JpsDepScope.COMPILE, { isTransitive = false }) // 'intellij.java.impl' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.maven", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijPluginDep("maven-model", forIde = true), JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijPluginDep("maven", forIde = true), JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(files(intellijCommunityDir.resolve("plugins/maven/maven-server-api/lib/lucene-core-2.4.1.jar").canonicalPath), JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:trove4j:1.0.20200330", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("external-system-rt") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("stats") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:ap-validation:0.0.5", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("dom-openapi") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("dom-impl") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("idea") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("cglib:cglib-nodep:3.2.4", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("intellij-xml") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains:annotations-java5:20.1.0", JpsDepScope.COMPILE) // 'intellij.maven' dependency
    jpsLikeJarDependency("junit:junit:4.12", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("testFramework-java") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:asm-all:9.1", JpsDepScope.TEST, { isTransitive = false }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-impl") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("resources_en") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-api") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.apache.velocity:velocity:1.7", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("jps-model") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("testFramework") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:log4j:1.2.17.2", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("idea_rt") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("testFramework.core") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("util") }) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("intellij-xml") }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains:jetCheck:0.2.2", JpsDepScope.TEST, { isTransitive = false }) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.32", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.5.11", JpsDepScope.TEST) // 'intellij.maven' dependency
    jpsLikeJarDependency(intellijPluginDep("gradle", forIde = true), JpsDepScope.COMPILE) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:gradle-api:6.8", JpsDepScope.COMPILE) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.slf4j:slf4j-log4j12:1.7.25", JpsDepScope.COMPILE) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.jetbrains.teamcity:serviceMessages:2019.1.4", JpsDepScope.COMPILE, { isTransitive = false }) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy-ant:2.4.17", JpsDepScope.PROVIDED) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.4.17", JpsDepScope.PROVIDED) // 'intellij.gradle.common' dependency
    jpsLikeModuleDependency(":kotlin-ide.kotlin.resources-fe10", JpsDepScope.TEST)
}

configurations.all {
    exclude(module = "tests-common") // Avoid classes with same FQN clashing
}

sourceSets {
    "main" {
        java.srcDir("src")
        resources.srcDir("resources")
    }
    "test" {
        java.srcDir("test")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile> {
    kotlinOptions.freeCompilerArgs = listOf("-version", "-Xstrict-java-nullability-assertions", "-Xjvm-default=enable", "-Xskip-prerelease-check")
    kotlinOptions.jdkHome = rootProject.extra["JDK_11"] as String
    kotlinOptions.useOldBackend = true // KT-45697
}

testsJar()