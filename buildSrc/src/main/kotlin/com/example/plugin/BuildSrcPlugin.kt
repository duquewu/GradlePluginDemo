package com.example.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildSrcPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        println("hello from buildSrc plugin")
    }
}