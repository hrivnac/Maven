Maven repository for
<ul>
<li><a href="https://cern.ch/hrivnac/Activities/Packages/Lomikel">https://cern.ch/hrivnac/Activities/Packages/Lomikel</a></li>
<li><a href="https://cern.ch/hrivnac/Activities/Packages/Grapher">https://cern.ch/hrivnac/Activities/Packages/Grapher</a></li>
</ul>
<hr/>
To use Lomikel via Gradle, put following declaration into your Groovy code:
<pre>
@GrabResolver(name='hrivnac', root='https://raw.githubusercontent.com/hrivnac/Maven/main/')
@GrabResolver(name='central', root='https://repo1.maven.org/maven2/')
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.06.00')
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.06.00-ext')
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.06.00-HBase') // if HBase is needed
@Grab(group='com.hrivnac',              module='Lomikel',    version='03.06.00-Janus') // if JanusGraph and HBase is needed
@Grab(group='org.apache.logging.log4j', module='log4j-core', version='2.23.1')

import com.Lomikel.Apps.LUC
LUC.main()
</pre>
<hr/>
To use Grapher via Gradle, put following declaration into your Groovy code:
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
To install Lomikel and Grapher via Maven, put following declaration into your pom.xml file and install it with <code>mvn install</code>:
<pre>
<project>

  <modelVersion>4.0.0</modelVersion>
  <groupId>x.y.z</groupId>
  <artifactId>ABC</artifactId>
  <version>00.00.00</version>
  <packaging>jar</packaging>

  <repositories>
    <repository>
      <id>hrivnac</id>
      <url>https://raw.githubusercontent.com/hrivnac/Maven/main/</url>
      </repository>
    </repositories>

  <dependencies>
    <dependency>
      <groupId>com.hrivnac</groupId>
      <artifactId>Lomikel</artifactId>
      <version>03.06.00</version>
      </dependency>
    <dependency>
      <groupId>com.hrivnac</groupId>
      <artifactId>Lomikel</artifactId>
      <version>03.06.00-ext</version>
      </dependency>
    <dependency>
      <groupId>com.hrivnac</groupId>
      <artifactId>Lomikel</artifactId>
      <version>03.06.00-HBase</version>
      </dependency>
    <dependency>
      <groupId>com.hrivnac</groupId>
      <artifactId>Lomikel</artifactId>
      <version>03.06.00-Janus</version>
      </dependency>
    <dependency>
      <groupId>com.hrivnac</groupId>
      <artifactId>Grapher</artifactId>
      <version>01.02.00</version>
      </dependency>
    </dependencies>
    
</project>
</pre>
<hr/>
