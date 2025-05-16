@GrabResolver(name='hrivnac', root='https://raw.githubusercontent.com/hrivnac/Maven/main/')
@GrabResolver(name='central', root='https://repo1.maven.org/maven2/')
@Grab(group='com.hrivnac',              module='Grapher', version='01.02.00')
@Grab(group='org.apache.logging.log4j', module='log4j-core', version='2.23.1')

import com.Grapher.Apps.CLI
CLI.main()
