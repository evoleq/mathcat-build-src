object Config {

    object Module {
        object MathcatCore {
            val group = "org.evoleq"
            val version = "1.0.0"
            val artefactId = "mathcat-core"
        }
        object MathcatResult {
            val group = "org.evoleq"
            val version = "1.0.0"
            val artefactId = "mathcat-result"
        }
        object MathcatStructure {
            val group = "org.evoleq"
            val version = "1.0.0"
            val artefactId = "mathcat-structure"
        }
    }
    
    object Versions {

        val kotlin = "1.3.70"
        val coroutines = "1.3.5"
     //   val kotlinReflect = "1.3.70"
     //   val kotlinSerialization = "0.20.0"//""0.14.0"
        val junit = "4.12"
    }

    object Dependencies {
        val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    //    val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlinReflect}"
    //    val kotlinSerializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinSerialization}"//${Versions.kotlin}"
    //    val kotlinSerializationRuntimeCommon = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.kotlinSerialization}"//
    //    val kotlinSerializationRuntimeNative = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.kotlinSerialization}"//

        val junit = "junit:junit:${Versions.junit}"
    }
}
