@GrabResolver(name='hrivnac', root='https://raw.githubusercontent.com/hrivnac/Maven/main/')
@GrabResolver(name='central', root='https://repo1.maven.org/maven2/')
@Grab(group='com.hrivnac',              module='Lomikel',       version='03.07.00')
@Grab(group='com.hrivnac',              module='Lomikel-ext',   version='03.07.00-ext')
@Grab(group='com.hrivnac',              module='Lomikel-HBase', version='03.07.00') // if HBase is needed
@Grab(group='com.hrivnac',              module='Lomikel-Janus', version='03.07.00') // if JanusGraph and HBase is needed
@Grab(group='com.hrivnac',              module='Lomikel-data',  version='03.07.00')  // if data (models,...) are needed
@Grab(group='org.apache.logging.log4j', module='log4j-core',    version='2.23.1')

import com.Lomikel.Apps.LUC
LUC.main()
