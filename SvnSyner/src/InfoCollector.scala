import java.io.File

/**
 * Created by dihuibao on 26/10/14.
 */
object InfoCollector {
  def main(args : Array[String]): Unit = {
    def clientManager = SVNClientManager.newInstance()


    clientManager.getWCClient().doInfo(new File("/Users/dihuibao/svn/testdir/test"), SVNRevision.WORKING, true, new InfoHandler)
  }
}
