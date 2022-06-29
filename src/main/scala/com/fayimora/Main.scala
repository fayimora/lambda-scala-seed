package com.fayimora

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.events.{APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse}

object Main:
  def handler(
      apiGatewayEvent: APIGatewayV2HTTPEvent,
      context: Context
  ): APIGatewayV2HTTPResponse =
    return APIGatewayV2HTTPResponse
      .builder()
      .withStatusCode(200)
      .withBody("Hello, world!")
      .build()
