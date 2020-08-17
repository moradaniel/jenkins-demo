pipelineJob('pipelineJob'){

    definition{
        cps{
            script(readFileFRomWorksapace('pipelineJob.groovy'))
            sandbox()
        }
    }
}