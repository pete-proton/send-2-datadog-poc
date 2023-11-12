
import kamon.Kamon
import scala.concurrent.duration._
import scala.concurrent.Await

object Main extends App {
  Kamon.init()

  private val requestCounter = Kamon.counter("sharaku_web.counter.request").withoutTags()

  for(i <- 1 to 10) {
    println(s"i: $i")
    requestCounter.increment()
    Thread.sleep(100) // Wait for a second between increments
  }
  // Ensure that metrics are reported before the application exits

  val stopFuture = Kamon.stop()
  Await.result(stopFuture, 10.seconds)
  println("done")

}
