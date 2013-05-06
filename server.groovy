vertx.createHttpServer().requestHandler { req ->
    def logger = container.logger

    logger.info "I am logging ${req.uri}"
    if(["/", "/index", "/home", "/index.html"].contains(req.uri)){
        req.response.sendFile "index.html"
    }else {

    }

}.listen(8080)
