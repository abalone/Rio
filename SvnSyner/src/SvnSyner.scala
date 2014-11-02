import java.io.File

import scala.io.Source

/**
 * Created by dihuibao on 2/11/14.
 */
object SvnSyner extends App{
  val repository: String = "/Users/dihuibao/svn/testdir2";

  def walkTree(file: File): Iterable[File] = {
    val children = new Iterable[File] {
      def iterator = if (file.isDirectory) file.listFiles.iterator else Iterator.empty
    }
    Seq(file) ++: children.flatMap(walkTree(_))
  }

  for(f<-walkTree(new File(repository)) if f.getName.endsWith(".java")) {FileInfoCollector.getSvnInfo(f.getAbsolutePath)}
}


case class SvnInfo(val path: String, val revision: String)

object FileInfoCollector {
  val pattern = """@Version\("\$Revision:(.*)\$""".r
  def getSvnInfo(path: String) = {
    val content = Source.fromFile(path).getLines().mkString
    val ret = pattern.findFirstMatchIn(content)
    ret match {
      case Some(m) => println(m.group(1).trim)
      case None => println("No Match!")
    }
  }
}
