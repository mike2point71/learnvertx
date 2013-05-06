vertx.createHttpServer().requestHandler { req ->
    def logger = container.logger

    logger.info "I am logging ${req.uri}"
    def file = req.uri == "/" ? "index.html" : req.uri
    req.response.sendFile "webroot/$file"
}.listen(8080)
