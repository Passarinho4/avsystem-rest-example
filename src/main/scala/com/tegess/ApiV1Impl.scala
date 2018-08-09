package com.tegess

import com.tegess.api.ApiV1
import com.tegess.pubs.PubsApi
import com.tegess.pubs.PubsApi.{PubName, PubResponse}
import com.tegess.sales.SalesApi
import com.tegess.sales.SalesApi.SaleResponse

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class ApiV1Impl extends ApiV1 {
  override def pubs(): PubsApi = () => Future {
    Seq(PubResponse(PubName("Pub2"), Some(17)), PubResponse(PubName("Pub3")))
  }

  override def sales(): SalesApi = () => Future {
    Seq(SaleResponse("Title1"), SaleResponse("Title2"))
  }
}
