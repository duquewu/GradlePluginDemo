package com.example.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class StandalonePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        println("hello from standalone plugin")
    }
}