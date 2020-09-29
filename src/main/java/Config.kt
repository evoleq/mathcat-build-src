object Config {

    object Module {
        object Template {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-module-template"
        }
        object MathcatBundle {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-bundle"
        }
        object MathcatContinuation {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-continuation"
        }
        object MathcatCore {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-core"
        }
        object MathcatLens {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-lense"
        }
        object MathcatMorphism {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-morphism"
        }
        object MathcatPrism {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-prism"
        }
        object MathcatProfunctorOptics {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-profunctor-optics"
        }
        object MathcatReader {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-reader"
        }
        object MathcatResult {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-result"
        }
        object MathcatState {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-state"
        }
        object MathcatStore {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-store"
        }
        object MathcatStructure {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-structure"
        }
        object MathcatYoneda {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-yoneda"
        }
        object MathcatOperatorTree {
            val group = "org.evoleq"
            val version = "1.0.1"
            val artefactId = "mathcat-operator-tree"
        }
        
    }
    
    object Versions {

        val kotlin = "1.4.0"//"1.3.70"
        val coroutines = "1.3.9"//"1.3.5"
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
