object Config {
    object Module {
        object Template {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-module-template"
        }
        object MathcatBundle {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-bundle"
        }
        object MathcatContinuation {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-continuation"
        }
        object MathcatCore {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-core"
        }
        object MathcatLens {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-lense"
        }
        object MathcatMorphism {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-morphism"
        }
        object MathcatPrism {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-prism"
        }
        object MathcatProfunctorOptics {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-profunctor-optics"
        }
        object MathcatReader {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-reader"
        }
        object MathcatResult {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-result"
        }
        object MathcatState {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-state"
        }
        object MathcatStore {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-store"
        }
        object MathcatStructure {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-structure"
        }
        object MathcatYoneda {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-yoneda"
        }
        object MathcatOperatorTree {
            const val group = "org.evoleq"
            const val version = "1.0.2"
            const val artefactId = "mathcat-operator-tree"
        }
    }
    
    object Versions {
        val kotlin = "1.4.21"
        val coroutines = "1.4.1"
        val junit = "4.12"
    }

    object Dependencies {
        val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val junit = "junit:junit:${Versions.junit}"
    }
}
