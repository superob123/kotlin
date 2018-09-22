import org.jetbrains.kotlin.ir.backend.js.compile

buildscript {
    repositories{
       
        mavenCentral()
    }
    dependencies{
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.70")
    }
}

subprojects {

    apply{
        plugin("org.jetbrains.kotlin.jvm")
    }



    group = "cy"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }






}