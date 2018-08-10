package com.tegess

import com.tegess.api.ApiV1
import com.tegess.pubs.{PubName, PubResponse, PubsApi}
import com.tegess.sales.{SaleResponse, SalesApi}

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
