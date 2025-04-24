Maven repository for
<ul>
<li><a href="https://cern.ch/hrivnac/Activities/Packages/Lomikel">https://cern.ch/hrivnac/Activities/Packages/Lomikel</a></li>
</ul>
To use:
<pre>
@GrabResolver(name='lomikel', root='https://raw.githubusercontent.com/hrivnac/Maven/main/')
@Grab(group='com.hrivnac', module='Lomikel', version='03.06.00')
import com.Lomikel.Utils.Init
Init.init("GrabTest")
</pre>
