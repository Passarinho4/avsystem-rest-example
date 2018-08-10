package com.tegess.sales

import com.avsystem.commons.rest.{DefaultRestApiCompanion, GET}
import com.avsystem.commons.serialization.HasGenCodec

import scala.concurrent.Future

trait SalesApi {
  @GET
  def all(): Future[Seq[SaleResponse]]
}
object SalesApi extends DefaultRestApiCompanion[SalesApi]

case class SaleResponse(title: String)
object SaleResponse extends HasGenCodec[SaleResponse]
