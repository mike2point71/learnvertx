vertx.createHttpServer().requestHandler { req ->
    def logger = container.logger

    logger.info "I am logging ${req.uri}"
    if(["/"].contains(req.uri)){
        req.response.sendFile "index.html"
    }else {

    }

}.listen(8080)
