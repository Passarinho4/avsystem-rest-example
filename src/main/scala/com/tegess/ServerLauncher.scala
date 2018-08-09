package com.tegess

import com.avsystem.commons.jetty.rest.RestHandler
import com.tegess.api.ApiV1
import org.eclipse.jetty.server.Server

object ServerLauncher extends App {

  val server = new Server(8080)
  server.setHandler(RestHandler[ApiV1](new ApiV1Impl()))
  server.start()
  server.join()

}
