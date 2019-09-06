// vars/pipelineBuild.groovy

import com.hosvr.ci.PipelineBuild

def call(script, buildType) {
	PipelineBuild p = new PipelineBuild(script, env, scm, buildType)
	p.start()
}