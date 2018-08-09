package com.tegess.sales

import com.avsystem.commons.rest.{DefaultRestApiCompanion, GET}
import com.avsystem.commons.serialization.GenCodec

import scala.concurrent.Future

trait SalesApi {

  import SalesApi._

  @GET("all")
  def all(): Future[Seq[SaleResponse]]
}

object SalesApi extends DefaultRestApiCompanion[SalesApi] {
  case class SaleResponse(title: String)
  object SaleResponse {
    implicit val codec = GenCodec.materializeRecursively[SaleResponse]
  }
}