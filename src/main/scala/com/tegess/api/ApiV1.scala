package com.tegess.api

import com.avsystem.commons.rest.DefaultRestApiCompanion
import com.tegess.pubs.PubsApi
import com.tegess.sales.SalesApi

trait ApiV1 {
  def pubs(): PubsApi
  def sales(): SalesApi
}
object ApiV1 extends DefaultRestApiCompanion[ApiV1]
