package com.github.vasabicz.inetlljilogitechplugin.services

import com.intellij.openapi.project.Project
import com.github.vasabicz.inetlljilogitechplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
