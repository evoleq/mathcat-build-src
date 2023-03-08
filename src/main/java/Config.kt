object Config {
    object Module {
        
        const val minVersion = "1.2.0"//"1.0.2"
        
        object Template {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-module-template"
        }
        object MathcatBundle {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-bundle"
        }
        object MathcatContinuation {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-continuation"
        }
        object MathcatCore {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-core"
        }
        object MathcatLazy {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-lazy"
        }
        object MathcatLens {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-lense"
        }
        object MathcatMorphism {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-morphism"
        }
        object MathcatParser {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-parser"
        }
        object MathcatPrism {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-prism"
        }
        object MathcatProfunctorOptics {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-profunctor-optics"
        }
        object MathcatReader {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-reader"
        }
        object MathcatResult {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-result"
        }
        object MathcatState {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-state"
        }
        object MathcatStorage {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-storage"
        }
        object MathcatStore {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-store"
        }
        object MathcatStructure {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-structure"
        }
        object MathcatYoneda {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-yoneda"
        }
        object MathcatOperatorTree {
            const val group = "org.evoleq"
            const val version = minVersion
            const val artefactId = "mathcat-operator-tree"
        }
    }
    
    object Versions {
        const val kotlin = "1.6.0"//"1.5.30"//"1.4.21"
        const val coroutines = "1.6.0"//"1.5.2"//"1.4.1"
        const val junit = "4.12"
    }

    object Dependencies {
        const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val junit = "junit:junit:${Versions.junit}"
    }
}
