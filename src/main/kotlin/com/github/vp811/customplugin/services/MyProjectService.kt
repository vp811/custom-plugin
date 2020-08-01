package com.github.vp811.customplugin.services

import com.intellij.openapi.project.Project
import com.github.vp811.customplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
