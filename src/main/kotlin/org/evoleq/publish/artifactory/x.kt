package org.evoleq.publish.artifactory

import org.gradle.api.Project

/*

fun Project.artifactory() {

    plugins.apply("org.jfrog.artifactory")

    configure<org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention> {
        setContextUrl(jfrogEvoleqContextUrl)
        publish {
            repository {
                setRepoKey(jfrogReleaseLibs) // The Artifactory repository key to publish to
                setUsername(jfrogUser) // The publisher user name
                setPassword(jfrogMathcatPw) // The publisher password
            }
            defaults {
                // Reference to Gradle publications defined in the build script.
                // This is how we tell the Artifactory Plugin which artifacts should be
                // published to Artifactory.
                publications(publications.all)
                setPublishArtifacts(true)
                // Properties to be attached to the published artifacts.
                setProperties(mapOf("qa.level" to "basic", "dev.team" to "core"))
                // Publish generated POM files to Artifactory (true by default)
                setPublishPom(true)
            }
        }
    }
}*/