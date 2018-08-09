package com.tegess.pubs

import com.avsystem.commons.rest.{DefaultRestApiCompanion, GET}
import com.avsystem.commons.serialization.{GenCodec, transientDefault, transparent}
import com.tegess.pubs.PubsApi.PubResponse

import scala.concurrent.Future

trait PubsApi {

  @GET("all")
  def all(): Future[Seq[PubResponse]]
}

object PubsApi extends DefaultRestApiCompanion[PubsApi] {
  case class PubResponse(name: PubName, @transientDefault size: Option[Int] = None)
  @transparent case class PubName(name: String)

  object PubResponse {
    implicit val codec = GenCodec.materializeRecursively[PubResponse]
  }
}
