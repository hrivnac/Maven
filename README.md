Maven repository for
<ul>
<li><a href="https://cern.ch/hrivnac/Activities/Packages/Lomikel">https://cern.ch/hrivnac/Activities/Packages/Lomikel</a></li>
<li><a href="https://cern.ch/hrivnac/Activities/Packages/Grapher">https://cern.ch/hrivnac/Activities/Packages/Grapher</a></li>
</ul>
<hr/>
To use Lomikel via <a href="https://gradle.com">Gradle</a>, put following declaration into your <a href="https://groovy-lang.org">Groovy</a> code (with appropriate version numbers):
<pre>
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
</pre>
<hr/>
To use Grapher via  <a href="https://gradle.com">Gradle</a>, put following declaration into your <a href="https://groovy-lang.org">Groovy</a> code (with appropriate version numbers):
<pre>
@GrabResolver(name='hrivnac', root='https://raw.githubusercontent.com/hrivnac/Maven/main/')
@GrabResolver(name='central', root='https://repo1.maven.org/maven2/')
@Grab(group='com.hrivnac',              module='Grapher',    version='01.02.00')
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.06.00')
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.06.00-ext')
@Grab(group='org.apache.logging.log4j', module='log4j-core', version='2.23.1')

import com.Lomikel.Apps.LUC
LUC.main()
</pre>
<hr/>
To install Lomikel and Grapher via <a href="https://maven.apache.org">Maven</a>, use example pom.xml file and install it with <code>mvn install</code>:
<hr/>
