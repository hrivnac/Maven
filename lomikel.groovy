@GrabResolver(name='hrivnac', root='https://raw.githubusercontent.com/hrivnac/Maven/main/')
@GrabResolver(name='central', root='https://repo1.maven.org/maven2/')
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.07.00')
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.07.00-ext')
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.07.00-HBase') // if HBase is needed
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.07.00-Janus') // if JanusGraph and HBase is needed
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.07.00-data')  // if data (models,...) are needed
@Grab(group='org.apache.logging.log4j', module='log4j-core', version='2.23.1')

import com.Lomikel.Apps.LUC
LUC.main()
