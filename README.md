Maven repository for
<ul>
<li><a href="https://cern.ch/hrivnac/Activities/Packages/Lomikel">https://cern.ch/hrivnac/Activities/Packages/Lomikel</a></li>
</ul>
To use:
<pre>
@GrabResolver(name='lomikel', root='https://raw.githubusercontent.com/hrivnac/Maven/main/')
@GrabResolver(name='central', root='https://repo1.maven.org/maven2/')
@Grab(group='com.hrivnac',              module='Lomikel', version='03.06.00')
@Grab(group='org.apache.logging.log4j', module='log4j-core', version='2.23.1')

import com.Lomikel.Utils.Init
Init.init("GrabTest")
</pre>
