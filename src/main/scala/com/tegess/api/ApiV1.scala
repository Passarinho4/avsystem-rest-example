package com.tegess.api

import com.avsystem.commons.rest.{DefaultRestApiCompanion, Prefix}
import com.tegess.pubs.PubsApi
import com.tegess.sales.SalesApi


trait ApiV1 {
  @Prefix("pubs") def pubs(): PubsApi
  @Prefix("sales") def sales(): SalesApi
}

object ApiV1 extends DefaultRestApiCompanion[ApiV1]
