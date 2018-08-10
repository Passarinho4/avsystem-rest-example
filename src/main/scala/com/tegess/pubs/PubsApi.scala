package com.tegess.pubs

import com.avsystem.commons.rest.{DefaultRestApiCompanion, GET}
import com.avsystem.commons.serialization.{GenCodec, transientDefault, transparent}

import scala.concurrent.Future

trait PubsApi {
  @GET
  def all(): Future[Seq[PubResponse]]
}
object PubsApi extends DefaultRestApiCompanion[PubsApi]

@transparent
case class PubName(name: String)

case class PubResponse(name: PubName, @transientDefault size: Option[Int] = None)
object PubResponse {
  implicit val codec: GenCodec[PubResponse] = GenCodec.materializeRecursively[PubResponse]
}
